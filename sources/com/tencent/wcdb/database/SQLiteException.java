package com.tencent.wcdb.database;

import com.bytedance.covode.number.Covode;
import com.tencent.wcdb.j;

public class SQLiteException extends j {
    static {
        Covode.recordClassIndex(103040);
    }

    public SQLiteException() {
    }

    public SQLiteException(String str) {
        super(str);
    }

    public SQLiteException(String str, Throwable th) {
        super(str, th);
    }
}
