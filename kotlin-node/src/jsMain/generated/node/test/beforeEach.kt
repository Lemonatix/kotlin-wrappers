// Generated by Karakum - do not modify it manually!

@file:JsModule("node:test")

package node.test


/**
 * This function is used to create a hook running
 * before each subtest of the current suite.
 *
 * ```js
 * describe('tests', async () => {
 *   beforeEach(() => console.log('about to run a test'));
 *   it('is a subtest', () => {
 *     assert.ok('some relevant assertion here');
 *   });
 * });
 * ```
 * @since v18.8.0, v16.18.0
 * @param [fn='A no-op function'] The hook function. If the hook uses callbacks, the callback function is passed as the second argument.
 * @param options Configuration options for the hook. The following properties are supported:
 */
external fun beforeEach(fn: HookFn = definedExternally, options: HookOptions = definedExternally): Unit
