package com.tencent.wcdb.database;

import com.bytedance.covode.number.Covode;

public class SQLiteConstraintException extends SQLiteException {
    static {
        Covode.recordClassIndex(103024);
    }

    public SQLiteConstraintException() {
    }

    public SQLiteConstraintException(String str) {
        super(str);
    }
}
