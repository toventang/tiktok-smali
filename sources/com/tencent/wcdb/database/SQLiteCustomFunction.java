package com.tencent.wcdb.database;

import com.bytedance.covode.number.Covode;
import com.tencent.wcdb.database.SQLiteDatabase;

public final class SQLiteCustomFunction {
    public final SQLiteDatabase.CustomFunction callback;
    public final String name;
    public final int numArgs;

    static {
        Covode.recordClassIndex(103025);
    }

    private void dispatchCallback(String[] strArr) {
    }

    public SQLiteCustomFunction(String str, int i2, SQLiteDatabase.CustomFunction customFunction) {
        if (str != null) {
            this.name = str;
            this.numArgs = i2;
            this.callback = customFunction;
            return;
        }
        throw new IllegalArgumentException("name must not be null.");
    }
}
