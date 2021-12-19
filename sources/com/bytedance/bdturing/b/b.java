package com.bytedance.bdturing.b;

import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteException;
import com.bytedance.bdturing.g;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;

public final class b {

    /* renamed from: a  reason: collision with root package name */
    public static a f26404a;

    /* renamed from: b  reason: collision with root package name */
    public static final b f26405b = new b();

    private b() {
    }

    static {
        Covode.recordClassIndex(15537);
    }

    private static SQLiteDatabase a() {
        try {
            a aVar = f26404a;
            if (aVar != null) {
                return aVar.getWritableDatabase();
            }
            return null;
        } catch (SQLiteException e2) {
            g.a(e2);
            return null;
        }
    }

    public final void a(String str) {
        if (str != null) {
            a("settings", str);
        }
    }

    public final String b(String str) {
        String str2;
        Cursor cursor;
        MethodCollector.i(11352);
        synchronized (this) {
            try {
                g.d("query");
                SQLiteDatabase a2 = a();
                str2 = null;
                if (a2 != null) {
                    cursor = a2.query("h5_storage", new String[]{"content"}, "primary_key=?", new String[]{str}, null, null, null, "1");
                } else {
                    cursor = null;
                }
                if (cursor != null && cursor.moveToFirst()) {
                    str2 = cursor.getString(0);
                }
                if (cursor != null) {
                    cursor.close();
                }
            } finally {
                MethodCollector.o(11352);
            }
        }
        return str2;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:21:0x0077, code lost:
        if (r3 == null) goto L_0x007d;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private final long a(java.lang.String r11, java.lang.String r12) {
        /*
        // Method dump skipped, instructions count: 136
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.bdturing.b.b.a(java.lang.String, java.lang.String):long");
    }
}
