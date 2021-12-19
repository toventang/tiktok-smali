package com.tencent.wcdb.database;

import com.bytedance.covode.number.Covode;

public class SQLiteAbortException extends SQLiteException {
    static {
        Covode.recordClassIndex(103012);
    }

    public SQLiteAbortException() {
    }

    public SQLiteAbortException(String str) {
        super(str);
    }
}
