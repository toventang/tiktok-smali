package com.ss.ttvideoengine.d;

import android.content.Context;
import android.database.SQLException;
import android.database.sqlite.SQLiteDatabase;
import android.text.TextUtils;
import com.a;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.ss.ttvideoengine.s.j;

public final class c {

    /* renamed from: a  reason: collision with root package name */
    public boolean f152395a;

    /* renamed from: b  reason: collision with root package name */
    private SQLiteDatabase f152396b;

    /* renamed from: c  reason: collision with root package name */
    private String f152397c;

    /* renamed from: d  reason: collision with root package name */
    private b f152398d;

    static {
        Covode.recordClassIndex(101550);
    }

    public final boolean a(String str) {
        MethodCollector.i(11350);
        if (this.f152396b == null || TextUtils.isEmpty(str)) {
            j.b("KVDBManager", "open db fail");
            MethodCollector.o(11350);
            return false;
        }
        this.f152396b.beginTransaction();
        try {
            this.f152396b.execSQL(a.a("DELETE FROM %s WHERE key='%s'", new Object[]{this.f152397c, str}));
            this.f152396b.setTransactionSuccessful();
        } catch (Exception unused) {
            this.f152396b.endTransaction();
            MethodCollector.o(11350);
            return false;
        } catch (Throwable unused2) {
        }
        this.f152396b.endTransaction();
        j.b("KVDBManager", "remove key ".concat(String.valueOf(str)));
        MethodCollector.o(11350);
        return true;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:16:0x0067, code lost:
        r3 = r2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:21:0x006c, code lost:
        com.bytedance.frameworks.apm.trace.MethodCollector.o(11516);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:23:0x006f, code lost:
        return null;
     */
    /* JADX WARNING: Failed to process nested try/catch */
    /* JADX WARNING: Removed duplicated region for block: B:22:? A[ExcHandler: Exception (unused java.lang.Exception), SYNTHETIC, Splitter:B:7:0x001e] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.String b(java.lang.String r8) {
        /*
        // Method dump skipped, instructions count: 112
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.ttvideoengine.d.c.b(java.lang.String):java.lang.String");
    }

    public c(Context context, String str) {
        MethodCollector.i(11034);
        if (context == null || TextUtils.isEmpty(str)) {
            j.e("KVDBManager", "context or name is invalid");
            MethodCollector.o(11034);
            return;
        }
        this.f152397c = str;
        b bVar = new b(context, this.f152397c);
        this.f152398d = bVar;
        boolean z = false;
        try {
            SQLiteDatabase writableDatabase = bVar.getWritableDatabase();
            this.f152396b = writableDatabase;
            if (writableDatabase != null) {
                this.f152396b.execSQL(a.a("CREATE TABLE IF NOT EXISTS %s(key TEXT PRIMARY KEY,value TEXT,time INTEGER)", new Object[]{this.f152397c}));
            }
            if (this.f152398d == null) {
                j.e("KVDBManager", "create db fail, mHelper == null, table name " + this.f152397c);
            }
            this.f152395a = this.f152398d != null ? true : z;
            MethodCollector.o(11034);
        } catch (Throwable unused) {
            j.e("KVDBManager", "create db fail, table name " + this.f152397c);
            if (this.f152398d == null) {
                j.e("KVDBManager", "create db fail, mHelper == null, table name " + this.f152397c);
            }
            this.f152395a = false;
            MethodCollector.o(11034);
        }
    }

    public final boolean a(String str, String str2) {
        MethodCollector.i(11193);
        if (this.f152396b == null || TextUtils.isEmpty(str) || TextUtils.isEmpty(str2)) {
            j.e("KVDBManager", "open db fail");
            MethodCollector.o(11193);
            return false;
        }
        j.a("KVDBManager", "save key: " + str + " value: " + str2);
        this.f152396b.beginTransaction();
        try {
            this.f152396b.execSQL(a.a("REPLACE INTO %s VALUES ('%s','%s',%d)", new Object[]{this.f152397c, str, str2, Long.valueOf(System.currentTimeMillis())}));
            this.f152396b.setTransactionSuccessful();
        } catch (SQLException unused) {
            this.f152396b.endTransaction();
            MethodCollector.o(11193);
            return false;
        } catch (IllegalStateException unused2) {
        }
        this.f152396b.endTransaction();
        MethodCollector.o(11193);
        return true;
    }
}
