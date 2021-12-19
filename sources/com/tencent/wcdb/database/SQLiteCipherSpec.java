package com.tencent.wcdb.database;

import com.bytedance.covode.number.Covode;

public class SQLiteCipherSpec {
    public String cipher;
    public boolean hmacEnabled = true;
    public int kdfIteration;
    public int pageSize = SQLiteGlobal.f154597a;

    static {
        Covode.recordClassIndex(103018);
    }

    public SQLiteCipherSpec() {
    }

    public SQLiteCipherSpec(SQLiteCipherSpec sQLiteCipherSpec) {
        this.cipher = sQLiteCipherSpec.cipher;
        this.kdfIteration = sQLiteCipherSpec.kdfIteration;
        this.hmacEnabled = sQLiteCipherSpec.hmacEnabled;
        this.pageSize = sQLiteCipherSpec.pageSize;
    }
}
