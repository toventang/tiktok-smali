package com.tencent.wcdb.database;

import com.bytedance.covode.number.Covode;

public class SQLiteDatatypeMismatchException extends SQLiteException {
    static {
        Covode.recordClassIndex(103032);
    }

    public SQLiteDatatypeMismatchException() {
    }

    public SQLiteDatatypeMismatchException(String str) {
        super(str);
    }
}
