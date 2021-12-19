package com.tencent.wcdb;

import android.database.Cursor;
import com.bytedance.covode.number.Covode;

public interface d extends Cursor {
    static {
        Covode.recordClassIndex(103009);
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    void close();

    int getColumnIndex(String str);

    int getCount();

    int getInt(int i2);

    long getLong(int i2);

    String getString(int i2);

    boolean moveToFirst();

    boolean moveToNext();
}
