package com.tencent.wcdb.database;

import com.bytedance.covode.number.Covode;

public class SQLiteBlobTooBigException extends SQLiteException {
    static {
        Covode.recordClassIndex(103016);
    }

    public SQLiteBlobTooBigException() {
    }

    public SQLiteBlobTooBigException(String str) {
        super(str);
    }
}
