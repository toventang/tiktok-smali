package com.tencent.wcdb.database;

import com.bytedance.covode.number.Covode;

public class SQLiteBindOrColumnIndexOutOfRangeException extends SQLiteException {
    static {
        Covode.recordClassIndex(103015);
    }

    public SQLiteBindOrColumnIndexOutOfRangeException() {
    }

    public SQLiteBindOrColumnIndexOutOfRangeException(String str) {
        super(str);
    }
}
