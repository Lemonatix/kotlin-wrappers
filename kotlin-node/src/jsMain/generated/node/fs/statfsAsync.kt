// Generated by Karakum - do not modify it manually!

@file:JsModule("node:fs/promises")

package node.fs

import js.promise.Promise

/**
 * @since v19.6.0, v18.15.0
 * @return Fulfills with the {fs.StatFs} object for the given `path`.
 */

@JsName("statfs")
external fun statfsAsync(path: PathLike, opts: StatfsOpts = definedExternally): Promise<StatsFs>


@JsName("statfs")
external fun statfsAsync(path: PathLike, opts: StatfsBigIntOpts): Promise<BigIntStatsFs>


@JsName("statfs")
external fun statfsAsync(
    path: PathLike,
    opts: StatFsOptions = definedExternally,
): Promise<Any /* StatsFs | BigIntStatsFs */>
