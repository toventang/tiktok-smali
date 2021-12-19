package com.bytedance.im.core.internal.a.a;

import android.content.ContentValues;
import android.text.TextUtils;
import com.bytedance.covode.number.Covode;
import com.bytedance.im.core.a.d;
import com.bytedance.im.core.c.e;
import com.bytedance.im.core.c.f;
import com.bytedance.im.core.g.c;
import com.bytedance.im.core.internal.a.c.a;

public final class b {
    static {
        Covode.recordClassIndex(22867);
    }

    public static boolean a(String str, String str2, String[] strArr) {
        if (TextUtils.isEmpty(str)) {
            return false;
        }
        c.a().b();
        com.bytedance.im.core.internal.a.c.b c2 = a.a().c();
        if (c2 == null) {
            c.a().a("delete", 0, (Throwable) null);
            return false;
        }
        try {
            int a2 = c2.a(str, str2, strArr);
            c.a();
            c.a("delete");
            if (a2 > 0) {
                return true;
            }
            return false;
        } catch (Exception e2) {
            f.b("imsdk", "IMDBProxy delete, table:" + str + ", whereClause:" + str2, e2);
            e.a(e2);
            c.a().a("delete", 1, e2);
            return false;
        }
    }

    public static boolean a() {
        com.bytedance.im.core.internal.a.c.b c2 = a.a().c();
        if (c2 == null || !c2.a()) {
            return false;
        }
        return true;
    }

    public static boolean b(String str) {
        c.a().b();
        com.bytedance.im.core.internal.a.c.b c2 = a.a().c();
        boolean z = false;
        if (c2 == null) {
            c.a().a("execSQL", 0, (Throwable) null);
            return false;
        }
        try {
            c2.a(str);
            c.a();
            c.a("execSQL");
            z = true;
            return true;
        } catch (Exception e2) {
            f.b("imsdk", "IMDBProxy execSQL:".concat(String.valueOf(str)), e2);
            e.a(e2);
            c.a().a("execSQL", 1, e2);
            return z;
        }
    }

    public static com.bytedance.im.core.internal.a.c.c c(String str) {
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        c.a().b();
        com.bytedance.im.core.internal.a.c.b c2 = a.a().c();
        if (c2 == null) {
            c.a().a("compile_statement", 0, (Throwable) null);
            return null;
        }
        try {
            com.bytedance.im.core.internal.a.c.c b2 = c2.b(str);
            c.a();
            c.a("compile_statement");
            return b2;
        } catch (Exception e2) {
            f.b("imsdk", "IMDBProxy compileStatement:".concat(String.valueOf(str)), e2);
            e.a(e2);
            c.a().a("compile_statement", 1, e2);
            return null;
        }
    }

    public static void a(String str) {
        c.a().b();
        com.bytedance.im.core.internal.a.c.b c2 = a.a().c();
        if (c2 == null) {
            f.b("imsdk", "IMDBProxy " + str + " startTransaction failed, db = null", (Throwable) null);
            c.a().a("startTransaction", 0, (Throwable) null);
        } else if (d.a().b().aB || !c2.a()) {
            try {
                if (d.a().b().ah) {
                    c2.e();
                } else {
                    c2.b();
                }
                c.a();
                c.a("startTransaction");
                f.b("imsdk", "IMDBProxy " + str + " startTransaction successfully", (Throwable) null);
            } catch (Exception e2) {
                f.b("imsdk", "IMDBProxy " + str + " startTransaction failed", e2);
                e.a(e2);
                c.a().a("startTransaction", 1, e2);
            }
        } else {
            f.b("imsdk", "IMDBProxy " + str + " startTransaction, already inTransaction, current tid=" + Thread.currentThread(), new RuntimeException());
        }
    }

    public static long b(String str, ContentValues contentValues) {
        if (TextUtils.isEmpty(str)) {
            return -1;
        }
        c.a().b();
        com.bytedance.im.core.internal.a.c.b c2 = a.a().c();
        if (c2 == null) {
            c.a().a("insertOrReplace", 0, (Throwable) null);
            return -1;
        }
        try {
            long b2 = c2.b(str, contentValues);
            f.b("imsdk", "CreateConversationHandler insertOrReplace id = " + b2 + " table = " + str, (Throwable) null);
            c.a();
            c.a("insert");
            return b2;
        } catch (Exception e2) {
            f.b("imsdk", "IMDBProxy insertOrReplace, table:" + str + ", nullColumnHack:" + ((String) null), e2);
            e.a(e2);
            c.a().a("insertOrReplace", 1, e2);
            return -1;
        }
    }

    public static long c(String str, ContentValues contentValues) {
        if (TextUtils.isEmpty(str)) {
            return -1;
        }
        c.a().b();
        com.bytedance.im.core.internal.a.c.b c2 = a.a().c();
        if (c2 == null) {
            c.a().a("replace", 0, (Throwable) null);
            return -1;
        }
        try {
            long c3 = c2.c(str, contentValues);
            c.a();
            c.a("replace");
            return c3;
        } catch (Exception e2) {
            f.b("imsdk", "IMDBProxy replace, table:" + str + ", nullColumnHack:" + ((String) null), e2);
            e.a(e2);
            c.a().a("replace", 1, e2);
            return -1;
        }
    }

    public static long a(String str, ContentValues contentValues) {
        if (TextUtils.isEmpty(str)) {
            return -1;
        }
        c.a().b();
        com.bytedance.im.core.internal.a.c.b c2 = a.a().c();
        if (c2 == null) {
            c.a().a("insert", 0, (Throwable) null);
            return -1;
        }
        try {
            long a2 = c2.a(str, contentValues);
            c.a();
            c.a("insert");
            return a2;
        } catch (Exception e2) {
            f.b("imsdk", "IMDBProxy insert, table:" + str + ", nullColumnHack:" + ((String) null), e2);
            e.a(e2);
            c.a().a("insert", 1, e2);
            return -1;
        }
    }

    public static a a(String str, String[] strArr) {
        c.a().b();
        com.bytedance.im.core.internal.a.c.b c2 = a.a().c();
        a aVar = null;
        if (c2 == null) {
            c.a().a("rawQuery", 0, (Throwable) null);
            return null;
        }
        try {
            aVar = c2.a(str, strArr);
            c.a();
            c.a("rawQuery");
            return aVar;
        } catch (Exception e2) {
            f.b("imsdk", "IMDBProxy rawQuery:".concat(String.valueOf(str)), e2);
            e.a(e2);
            c.a().a("rawQuery", 1, e2);
            return aVar;
        }
    }

    public static void a(String str, boolean z) {
        c.a().b();
        com.bytedance.im.core.internal.a.c.b c2 = a.a().c();
        if (c2 == null) {
            f.b("imsdk", "IMDBProxy " + str + " endTransaction failed, db = null", (Throwable) null);
            c.a().a("endTransaction", 0, (Throwable) null);
        } else if (c2.a()) {
            if (z) {
                try {
                    c2.c();
                } catch (Exception e2) {
                    f.b("imsdk", "IMDBProxy " + str + " endTransaction failed", e2);
                    e.a(e2);
                    c.a().a("endTransaction", 1, e2);
                    return;
                }
            }
            c2.d();
            f.b("imsdk", "IMDBProxy " + str + " endTransaction, successful:" + z, (Throwable) null);
            c.a();
            c.a("endTransaction");
        } else {
            f.b("imsdk", "IMDBProxy " + str + " endTransaction, no transaction, current tid=" + Thread.currentThread(), new RuntimeException());
        }
    }

    public static int a(String str, ContentValues contentValues, String str2, String[] strArr) {
        if (TextUtils.isEmpty(str)) {
            return -1;
        }
        c.a().b();
        com.bytedance.im.core.internal.a.c.b c2 = a.a().c();
        if (c2 == null) {
            c.a().a("update", 0, (Throwable) null);
            return -1;
        }
        try {
            int a2 = c2.a(str, contentValues, str2, strArr);
            c.a();
            c.a("update");
            return a2;
        } catch (Exception e2) {
            f.b("imsdk", "IMDBProxy update, table:" + str + ", whereClause:" + str2, e2);
            e.a(e2);
            c.a().a("update", 1, e2);
            return -1;
        }
    }
}
