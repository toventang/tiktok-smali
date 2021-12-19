package com.ss.ttvideoengine.d;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;

public class a extends SQLiteOpenHelper {

    /* renamed from: a  reason: collision with root package name */
    private static a f152386a;

    static {
        Covode.recordClassIndex(101548);
    }

    public void onCreate(SQLiteDatabase sQLiteDatabase) {
    }

    public void onUpgrade(SQLiteDatabase sQLiteDatabase, int i2, int i3) {
    }

    private a(Context context) {
        super(context, "fangqing.db", (SQLiteDatabase.CursorFactory) null, 1);
    }

    public static a a(Context context) {
        MethodCollector.i(10538);
        if (f152386a == null) {
            synchronized (a.class) {
                try {
                    if (f152386a == null) {
                        f152386a = new a(context);
                    }
                } catch (Throwable th) {
                    MethodCollector.o(10538);
                    throw th;
                }
            }
        }
        a aVar = f152386a;
        MethodCollector.o(10538);
        return aVar;
    }
}
