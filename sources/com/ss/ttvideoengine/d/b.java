package com.ss.ttvideoengine.d;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;
import com.bytedance.covode.number.Covode;

public final class b extends SQLiteOpenHelper {

    /* renamed from: a  reason: collision with root package name */
    private static Integer f152387a = 1;

    public final void onCreate(SQLiteDatabase sQLiteDatabase) {
    }

    public final void onUpgrade(SQLiteDatabase sQLiteDatabase, int i2, int i3) {
    }

    static {
        Covode.recordClassIndex(101549);
    }

    public b(Context context, String str) {
        this(context, str, f152387a.intValue(), (byte) 0);
    }

    private b(Context context, String str, int i2) {
        super(context, str, (SQLiteDatabase.CursorFactory) null, i2);
    }

    private b(Context context, String str, int i2, byte b2) {
        this(context, str, i2);
    }
}
