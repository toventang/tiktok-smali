package com.tencent.wcdb.database;

import com.bytedance.covode.number.Covode;

public class SQLiteDatabaseCorruptException extends SQLiteException {
    static {
        Covode.recordClassIndex(103030);
    }

    public SQLiteDatabaseCorruptException() {
    }

    public SQLiteDatabaseCorruptException(String str) {
        super(str);
    }
}
