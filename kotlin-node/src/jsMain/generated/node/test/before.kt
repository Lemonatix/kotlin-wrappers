// Generated by Karakum - do not modify it manually!

@file:JsModule("node:test")

package node.test

/**
 * This function creates a hook that runs before executing a suite.
 *
 * ```js
 * describe('tests', async () => {
 *   before(() => console.log('about to run some test'));
 *   it('is a subtest', () => {
 *     assert.ok('some relevant assertion here');
 *   });
 * });
 * ```
 * @since v18.8.0, v16.18.0
 * @param fn The hook function. If the hook uses callbacks, the callback function is passed as the second argument.
 * @param options Configuration options for the hook.
 */
external fun before(fn: HookFn = definedExternally, options: HookOptions = definedExternally): Unit
