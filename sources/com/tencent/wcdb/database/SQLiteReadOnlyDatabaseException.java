package com.tencent.wcdb.database;

import com.bytedance.covode.number.Covode;

public class SQLiteReadOnlyDatabaseException extends SQLiteException {
    static {
        Covode.recordClassIndex(103045);
    }

    public SQLiteReadOnlyDatabaseException() {
    }

    public SQLiteReadOnlyDatabaseException(String str) {
        super(str);
    }
}
