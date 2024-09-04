package wrappers.example.header

import js.import.importAsync
import wrappers.example.lazy.lazyComponent

// TODO: must be generated by plugin
internal val LazyHeader = lazyComponent("Header") {
    importAsync("./header.mjs")
}
