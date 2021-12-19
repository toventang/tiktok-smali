package com.ss.android.ugc.aweme.im.sdk.common.data.b.a;

import android.content.ContentValues;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.text.TextUtils;
import android.util.Log;
import com.bytedance.common.utility.n;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.bytedance.ies.ugc.appcontext.d;
import com.ss.android.ugc.aweme.im.sdk.common.controller.utils.c;
import com.ss.android.ugc.aweme.im.service.m.a;
import com.ss.android.ugc.aweme.video.e;
import com.zhiliaoapp.musically.R;
import java.util.HashMap;

public class b {

    /* renamed from: a  reason: collision with root package name */
    private static b f102482a;

    /* renamed from: b  reason: collision with root package name */
    private a f102483b;

    /* renamed from: c  reason: collision with root package name */
    private SQLiteDatabase f102484c = e();

    /* renamed from: d  reason: collision with root package name */
    private String f102485d;

    static {
        Covode.recordClassIndex(65620);
    }

    private b() {
    }

    private boolean d() {
        SQLiteDatabase sQLiteDatabase = this.f102484c;
        if (sQLiteDatabase == null || !sQLiteDatabase.isOpen()) {
            this.f102484c = e();
        }
        if (this.f102484c == null) {
            return true;
        }
        return false;
    }

    public static b a() {
        MethodCollector.i(7149);
        if (f102482a == null) {
            synchronized (b.class) {
                try {
                    if (f102482a == null) {
                        f102482a = new b();
                    }
                } catch (Throwable th) {
                    MethodCollector.o(7149);
                    throw th;
                }
            }
        }
        b bVar = f102482a;
        MethodCollector.o(7149);
        return bVar;
    }

    public final void c() {
        MethodCollector.i(7577);
        if (d()) {
            MethodCollector.o(7577);
        } else if (this.f102484c.inTransaction()) {
            try {
                this.f102484c.setTransactionSuccessful();
                this.f102484c.endTransaction();
                MethodCollector.o(7577);
            } catch (Exception e2) {
                e2.printStackTrace();
                a.a(e2);
                MethodCollector.o(7577);
            }
        } else {
            Thread.currentThread();
            new RuntimeException();
            MethodCollector.o(7577);
        }
    }

    private SQLiteDatabase e() {
        MethodCollector.i(7222);
        try {
            if (this.f102484c == null || !TextUtils.equals("db_im_xx", this.f102485d) || !this.f102484c.isOpen()) {
                SQLiteDatabase sQLiteDatabase = this.f102484c;
                if (sQLiteDatabase != null) {
                    try {
                        sQLiteDatabase.close();
                    } catch (Exception e2) {
                        e2.printStackTrace();
                        a.a(e2);
                    }
                }
                if (this.f102483b == null) {
                    this.f102483b = new a(d.a(), "db_im_xx");
                }
                this.f102485d = "db_im_xx";
                this.f102484c = this.f102483b.getWritableDatabase();
                SQLiteDatabase sQLiteDatabase2 = this.f102484c;
                MethodCollector.o(7222);
                return sQLiteDatabase2;
            }
            SQLiteDatabase sQLiteDatabase3 = this.f102484c;
            MethodCollector.o(7222);
            return sQLiteDatabase3;
        } catch (Exception e3) {
            if (e.f() < 20971520) {
                n.a(d.a(), (int) R.string.chp);
            }
            e3.printStackTrace();
            a.a(e3);
        }
    }

    public final void b() {
        MethodCollector.i(7573);
        if (d()) {
            MethodCollector.o(7573);
        } else if (this.f102484c.inTransaction()) {
            Thread.currentThread();
            new RuntimeException();
            MethodCollector.o(7573);
        } else {
            try {
                this.f102484c.beginTransaction();
                MethodCollector.o(7573);
            } catch (Exception e2) {
                e2.printStackTrace();
                a.a(e2);
                MethodCollector.o(7573);
            }
        }
    }

    public final Cursor b(String str) {
        MethodCollector.i(7555);
        Cursor cursor = null;
        if (d()) {
            MethodCollector.o(7555);
            return null;
        }
        try {
            cursor = this.f102484c.rawQuery(str, null);
        } catch (Exception e2) {
            e2.printStackTrace();
            a.a(e2);
            HashMap hashMap = new HashMap();
            hashMap.put("error", e2.toString());
            hashMap.put("error_stack", Log.getStackTraceString(e2));
            c.a("db_query_failed", hashMap);
        }
        MethodCollector.o(7555);
        return cursor;
    }

    public final boolean c(String str) {
        MethodCollector.i(7568);
        if (d()) {
            MethodCollector.o(7568);
            return false;
        } else if (TextUtils.isEmpty(str)) {
            MethodCollector.o(7568);
            return false;
        } else {
            try {
                if (this.f102484c.delete(str, null, null) > 0) {
                    MethodCollector.o(7568);
                    return true;
                }
                MethodCollector.o(7568);
                return false;
            } catch (Exception e2) {
                e2.printStackTrace();
                a.a(e2);
                HashMap hashMap = new HashMap();
                hashMap.put("error", e2.toString());
                hashMap.put("error_stack", Log.getStackTraceString(e2));
                c.a("db_delete_failed", hashMap);
                MethodCollector.o(7568);
                return false;
            }
        }
    }

    public final boolean a(String str) {
        MethodCollector.i(7336);
        boolean z = false;
        if (d()) {
            MethodCollector.o(7336);
            return false;
        }
        try {
            this.f102484c.execSQL(str);
            z = true;
        } catch (Exception e2) {
            e2.printStackTrace();
            a.a(e2);
            HashMap hashMap = new HashMap();
            hashMap.put("error", e2.toString());
            hashMap.put("error_stack", Log.getStackTraceString(e2));
            c.a("db_exec_failed", hashMap);
        }
        MethodCollector.o(7336);
        return z;
    }

    public final long a(String str, ContentValues contentValues) {
        MethodCollector.i(7502);
        if (d()) {
            MethodCollector.o(7502);
            return -1;
        } else if (TextUtils.isEmpty(str)) {
            MethodCollector.o(7502);
            return -1;
        } else {
            try {
                long replace = this.f102484c.replace(str, null, contentValues);
                MethodCollector.o(7502);
                return replace;
            } catch (Exception e2) {
                e2.printStackTrace();
                a.a(e2);
                HashMap hashMap = new HashMap();
                hashMap.put("error", e2.toString());
                hashMap.put("error_stack", Log.getStackTraceString(e2));
                c.a("db_replace_failed", hashMap);
                MethodCollector.o(7502);
                return -1;
            }
        }
    }

    public final int a(String str, ContentValues contentValues, String str2, String[] strArr) {
        MethodCollector.i(7412);
        if (d()) {
            MethodCollector.o(7412);
            return -1;
        } else if (TextUtils.isEmpty(str)) {
            MethodCollector.o(7412);
            return -1;
        } else {
            try {
                int update = this.f102484c.update(str, contentValues, str2, strArr);
                MethodCollector.o(7412);
                return update;
            } catch (Exception e2) {
                e2.printStackTrace();
                a.a(e2);
                HashMap hashMap = new HashMap();
                hashMap.put("error", e2.toString());
                hashMap.put("error_stack", Log.getStackTraceString(e2));
                c.a("db_update_failed", hashMap);
                MethodCollector.o(7412);
                return -1;
            }
        }
    }
}
