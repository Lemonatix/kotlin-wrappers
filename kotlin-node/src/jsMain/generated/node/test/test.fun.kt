// Generated by Karakum - do not modify it manually!

@file:JsModule("node:test")

package node.test

import js.promise.Promise

/**
 * The `test()` function is the value imported from the `test` module. Each
 * invocation of this function results in reporting the test to the `TestsStream`.
 *
 * The `TestContext` object passed to the `fn` argument can be used to perform
 * actions related to the current test. Examples include skipping the test, adding
 * additional diagnostic information, or creating subtests.
 *
 * `test()` returns a `Promise` that fulfills once the test completes.
 * if `test()` is called within a `describe()` block, it fulfills immediately.
 * The return value can usually be discarded for top level tests.
 * However, the return value from subtests should be used to prevent the parent
 * test from finishing first and cancelling the subtest
 * as shown in the following example.
 *
 * ```js
 * test('top level test', async (t) => {
 *   // The setTimeout() in the following subtest would cause it to outlive its
 *   // parent test if 'await' is removed on the next line. Once the parent test
 *   // completes, it will cancel any outstanding subtests.
 *   await t.test('longer running subtest', async (t) => {
 *     return new Promise((resolve, reject) => {
 *       setTimeout(resolve, 1000);
 *     });
 *   });
 * });
 * ```
 *
 * The `timeout` option can be used to fail the test if it takes longer than`timeout` milliseconds to complete. However, it is not a reliable mechanism for
 * canceling tests because a running test might block the application thread and
 * thus prevent the scheduled cancellation.
 * @since v18.0.0, v16.17.0
 * @param [name='The name'] The name of the test, which is displayed when reporting test results.
 * @param options Configuration options for the test. The following properties are supported:
 * @param [fn='A no-op function'] The function under test. The first argument to this function is a {@link TestContext} object. If the test uses callbacks, the callback function is passed as the
 * second argument.
 * @return Fulfilled with `undefined` once the test completes, or immediately if the test runs within {@link describe}.
 */

@JsName("test")
external fun testAsync(name: String = definedExternally, fn: TestFn = definedExternally): Promise<Unit>


@JsName("test")
external fun testAsync(
    name: String = definedExternally,
    options: TestOptions = definedExternally,
    fn: TestFn = definedExternally,
): Promise<Unit>


@JsName("test")
external fun testAsync(options: TestOptions = definedExternally, fn: TestFn = definedExternally): Promise<Unit>


@JsName("test")
external fun testAsync(fn: TestFn = definedExternally): Promise<Unit>


/**
 * The `node:test` module facilitates the creation of JavaScript tests.
 * To access it:
 *
 * ```js
 * import test from 'node:test';
 * ```
 *
 * This module is only available under the `node:` scheme. The following will not
 * work:
 *
 * ```js
 * import test from 'test';
 * ```
 *
 * Tests created via the `test` module consist of a single function that is
 * processed in one of three ways:
 *
 * 1. A synchronous function that is considered failing if it throws an exception,
 * and is considered passing otherwise.
 * 2. A function that returns a `Promise` that is considered failing if the`Promise` rejects, and is considered passing if the `Promise` fulfills.
 * 3. A function that receives a callback function. If the callback receives any
 * truthy value as its first argument, the test is considered failing. If a
 * falsy value is passed as the first argument to the callback, the test is
 * considered passing. If the test function receives a callback function and
 * also returns a `Promise`, the test will fail.
 *
 * The following example illustrates how tests are written using the`test` module.
 *
 * ```js
 * test('synchronous passing test', (t) => {
 *   // This test passes because it does not throw an exception.
 *   assert.strictEqual(1, 1);
 * });
 *
 * test('synchronous failing test', (t) => {
 *   // This test fails because it throws an exception.
 *   assert.strictEqual(1, 2);
 * });
 *
 * test('asynchronous passing test', async (t) => {
 *   // This test passes because the Promise returned by the async
 *   // function is settled and not rejected.
 *   assert.strictEqual(1, 1);
 * });
 *
 * test('asynchronous failing test', async (t) => {
 *   // This test fails because the Promise returned by the async
 *   // function is rejected.
 *   assert.strictEqual(1, 2);
 * });
 *
 * test('failing test using Promises', (t) => {
 *   // Promises can be used directly as well.
 *   return new Promise((resolve, reject) => {
 *     setImmediate(() => {
 *       reject(new Error('this will cause the test to fail'));
 *     });
 *   });
 * });
 *
 * test('callback passing test', (t, done) => {
 *   // done() is the callback function. When the setImmediate() runs, it invokes
 *   // done() with no arguments.
 *   setImmediate(done);
 * });
 *
 * test('callback failing test', (t, done) => {
 *   // When the setImmediate() runs, done() is invoked with an Error object and
 *   // the test fails.
 *   setImmediate(() => {
 *     done(new Error('callback failure'));
 *   });
 * });
 * ```
 *
 * If any tests fail, the process exit code is set to `1`.
 * @since v18.0.0, v16.17.0
 * @see [source](https://github.com/nodejs/node/blob/v20.4.0/lib/test.js)
 */


/**
 * The `node:test/reporters` module exposes the builtin-reporters for `node:test`.
 * To access it:
 *
 * ```js
 * import test from 'node:test/reporters';
 * ```
 *
 * This module is only available under the `node:` scheme. The following will not
 * work:
 *
 * ```js
 * import test from 'test/reporters';
 * ```
 * @since v19.9.0
 * @see [source](https://github.com/nodejs/node/blob/v20.2.0/lib/test/reporters.js)
 */
