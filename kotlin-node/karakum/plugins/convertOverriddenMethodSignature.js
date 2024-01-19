import ts from "typescript";
import * as karakum from "karakum";

const overriddenProps = {
    // stream
    "ReadableBase": {
        "read": "readOrNull"
    }
}

export default function (node, context, render) {
    if (
        ts.isMethodDeclaration(node)
        && ts.isClassDeclaration(node.parent)
        && node.parent.name
        && node.parent.name.text in overriddenProps
        && ts.isIdentifier(node.name)
        && node.name.text in overriddenProps[node.parent.name.text]
    ) {
        const name = karakum.escapeIdentifier(render(node.name))

        const typeParameters = node.typeParameters
            ?.map(typeParameter => render(typeParameter))
            ?.join(", ")

        const returnType = node.type && render(node.type)

        const overrideConfig = overriddenProps[node.parent.name.text][node.name.text]

        const hasAlias = overrideConfig !== null

        if (hasAlias) {
            let alias
            let test = () => true

            if (Array.isArray(overrideConfig)) {
                [alias, test] = overrideConfig
            } else {
                alias = overrideConfig
            }

            const jsName = `@JsName("${name}")`

            return karakum.convertParameterDeclarations(node, context, render, {
                strategy: "function",
                template: (parameters, signature) => {
                    if (!test(signature, node)) {
                        return `fun ${karakum.ifPresent(typeParameters, it => `<${it}> `)}${name}(${parameters})${karakum.ifPresent(returnType, it => `: ${it}`)}`
                    }

                    return `
${jsName}
fun ${karakum.ifPresent(typeParameters, it => `<${it}> `)}${alias}(${parameters})${karakum.ifPresent(returnType, it => `: ${it}`)}
                    `
                }
            })
        }

        return karakum.convertParameterDeclarations(node, context, render, {
            strategy: "function",
            template: parameters => {
                return `override fun ${karakum.ifPresent(typeParameters, it => `<${it}> `)}${name}(${parameters})${karakum.ifPresent(returnType, it => `: ${it}`)}`
            }
        })
    }
    return null
}
