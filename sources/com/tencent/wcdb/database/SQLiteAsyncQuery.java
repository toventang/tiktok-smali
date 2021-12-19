package com.tencent.wcdb.database;

import com.bytedance.covode.number.Covode;

public class SQLiteAsyncQuery extends j {
    static {
        Covode.recordClassIndex(103014);
    }

    private static native int nativeCount(long j2);

    private static native int nativeFillRows(long j2, long j3, int i2, int i3);
}
