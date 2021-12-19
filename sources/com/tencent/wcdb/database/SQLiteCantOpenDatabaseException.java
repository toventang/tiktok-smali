package com.tencent.wcdb.database;

import com.bytedance.covode.number.Covode;

public class SQLiteCantOpenDatabaseException extends SQLiteException {
    static {
        Covode.recordClassIndex(103017);
    }

    public SQLiteCantOpenDatabaseException() {
    }

    public SQLiteCantOpenDatabaseException(String str) {
        super(str);
    }
}
