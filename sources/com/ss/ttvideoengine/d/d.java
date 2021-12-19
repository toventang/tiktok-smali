package com.ss.ttvideoengine.d;

import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.text.TextUtils;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.ss.ttvideoengine.s.j;

public class d {

    /* renamed from: a  reason: collision with root package name */
    public static SQLiteDatabase f152414a;

    /* renamed from: b  reason: collision with root package name */
    public static int f152415b = 200;

    /* renamed from: c  reason: collision with root package name */
    private static d f152416c;

    public static class a {

        /* renamed from: a  reason: collision with root package name */
        public long f152419a;

        /* renamed from: b  reason: collision with root package name */
        public String f152420b;

        /* renamed from: c  reason: collision with root package name */
        public String f152421c;

        static {
            Covode.recordClassIndex(101552);
        }
    }

    static {
        Covode.recordClassIndex(101551);
    }

    public static int a() {
        MethodCollector.i(11032);
        if (f152414a == null) {
            MethodCollector.o(11032);
            return -1;
        }
        int i2 = 0;
        try {
            Cursor rawQuery = f152414a.rawQuery(com.a.a("SELECT COUNT(*) FROM %s", new Object[]{"videomodel"}), null);
            if (rawQuery.moveToFirst()) {
                i2 = (int) rawQuery.getLong(0);
            }
            rawQuery.close();
        } catch (Exception unused) {
        }
        j.b("VideoModelDBManager", "count:".concat(String.valueOf(i2)));
        MethodCollector.o(11032);
        return i2;
    }

    private d(Context context) {
        MethodCollector.i(10704);
        if (context == null) {
            MethodCollector.o(10704);
            return;
        }
        a a2 = a.a(context);
        if (a2 != null) {
            try {
                SQLiteDatabase writableDatabase = a2.getWritableDatabase();
                f152414a = writableDatabase;
                if (writableDatabase != null) {
                    f152414a.execSQL(com.a.a("CREATE TABLE IF NOT EXISTS %s(vid TEXT PRIMARY KEY,videomodel TEXT,time INTEGER)", new Object[]{"videomodel"}));
                }
                MethodCollector.o(10704);
                return;
            } catch (Throwable unused) {
            }
        }
        MethodCollector.o(10704);
    }

    public static d a(Context context) {
        MethodCollector.i(10703);
        if (f152416c == null) {
            synchronized (d.class) {
                try {
                    if (f152416c == null) {
                        f152416c = new d(context);
                    }
                } catch (Throwable th) {
                    MethodCollector.o(10703);
                    throw th;
                }
            }
        }
        d dVar = f152416c;
        MethodCollector.o(10703);
        return dVar;
    }

    public static a a(String str) {
        a aVar;
        MethodCollector.i(10856);
        a aVar2 = null;
        if (TextUtils.isEmpty(str) || f152414a == null) {
            MethodCollector.o(10856);
            return null;
        }
        try {
            Cursor rawQuery = f152414a.rawQuery(com.a.a("SELECT * FROM %s WHERE vid='%s'", new Object[]{"videomodel", str}), null);
            aVar = new a();
            try {
                aVar.f152421c = str;
                if (rawQuery.moveToFirst()) {
                    aVar.f152420b = rawQuery.getString(rawQuery.getColumnIndex("videomodel"));
                    aVar.f152419a = rawQuery.getLong(rawQuery.getColumnIndex("time"));
                }
                rawQuery.close();
                j.b("VideoModelDBManager", "query vid:" + str + " videomodel:" + aVar.f152420b);
            } catch (Exception unused) {
                aVar2 = aVar;
                aVar = aVar2;
                MethodCollector.o(10856);
                return aVar;
            }
        } catch (Exception unused2) {
            aVar = aVar2;
            MethodCollector.o(10856);
            return aVar;
        }
        MethodCollector.o(10856);
        return aVar;
    }
}
