// Generated by Karakum - do not modify it manually!

package node.test

sealed external interface TestStdout {
    /**
     * The path of the test file.
     */
    var file: String

    /**
     * The message written to `stdout`.
     */
    var message: String
}
