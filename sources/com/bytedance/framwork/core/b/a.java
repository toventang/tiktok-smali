package com.bytedance.framwork.core.b;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.bytedance.framwork.core.sdkmonitor.i;

public class a extends SQLiteOpenHelper {

    /* renamed from: a  reason: collision with root package name */
    private static a f29389a;

    static {
        Covode.recordClassIndex(17137);
    }

    public void onUpgrade(SQLiteDatabase sQLiteDatabase, int i2, int i3) {
    }

    public void onCreate(SQLiteDatabase sQLiteDatabase) {
        MethodCollector.i(13392);
        try {
            sQLiteDatabase.execSQL("CREATE TABLE monitor_log ( _id Integer PRIMARY KEY AUTOINCREMENT, aid Integer, type VARCHAR, type2 VARCHAR, time Integer, data TEXT, data2 TEXT, data3 TEXT  )");
            sQLiteDatabase.execSQL("CREATE TABLE queue ( _id INTEGER PRIMARY KEY AUTOINCREMENT, value BLOB, type TEXT, timestamp INTEGER, retry_count INTEGER, retry_time INTEGER )");
            MethodCollector.o(13392);
        } catch (Exception unused) {
            MethodCollector.o(13392);
        }
    }

    public static a a(Context context) {
        MethodCollector.i(13314);
        if (f29389a == null) {
            synchronized (a.class) {
                try {
                    if (f29389a == null) {
                        f29389a = new a(context, i.a(context) + "sdkmon_v2.db");
                    }
                } catch (Throwable th) {
                    MethodCollector.o(13314);
                    throw th;
                }
            }
        }
        a aVar = f29389a;
        MethodCollector.o(13314);
        return aVar;
    }

    private a(Context context, String str) {
        super(context, str, (SQLiteDatabase.CursorFactory) null, 1);
    }
}
