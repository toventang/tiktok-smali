package com.tencent.wcdb.database;

import com.bytedance.covode.number.Covode;

public class SQLiteOutOfMemoryException extends SQLiteException {
    static {
        Covode.recordClassIndex(103044);
    }

    public SQLiteOutOfMemoryException() {
    }

    public SQLiteOutOfMemoryException(String str) {
        super(str);
    }
}
