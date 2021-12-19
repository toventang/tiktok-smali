package com.tencent.wcdb.database;

import com.bytedance.covode.number.Covode;

public class SQLiteDiskIOException extends SQLiteException {
    static {
        Covode.recordClassIndex(103038);
    }

    public SQLiteDiskIOException() {
    }

    public SQLiteDiskIOException(String str) {
        super(str);
    }
}
