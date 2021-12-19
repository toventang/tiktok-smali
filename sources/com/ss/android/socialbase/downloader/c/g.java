package com.ss.android.socialbase.downloader.c;

import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteStatement;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.ss.android.socialbase.downloader.k.j;

public final class g {

    /* renamed from: a  reason: collision with root package name */
    private final SQLiteDatabase f60360a;

    /* renamed from: b  reason: collision with root package name */
    private final String f60361b;

    /* renamed from: c  reason: collision with root package name */
    private final String[] f60362c;

    /* renamed from: d  reason: collision with root package name */
    private final String[] f60363d;

    /* renamed from: e  reason: collision with root package name */
    private SQLiteStatement f60364e;

    /* renamed from: f  reason: collision with root package name */
    private SQLiteStatement f60365f;

    /* renamed from: g  reason: collision with root package name */
    private SQLiteStatement f60366g;

    /* renamed from: h  reason: collision with root package name */
    private SQLiteStatement f60367h;

    static {
        Covode.recordClassIndex(37257);
    }

    public final SQLiteStatement a() {
        MethodCollector.i(12022);
        if (this.f60364e == null) {
            String str = this.f60361b;
            String[] strArr = this.f60362c;
            StringBuilder sb = new StringBuilder("INSERT INTO ");
            sb.append('\"').append(str).append('\"').append(" (");
            j.a(sb, strArr);
            sb.append(") VALUES (");
            j.a(sb, strArr.length);
            sb.append(')');
            SQLiteStatement compileStatement = this.f60360a.compileStatement(sb.toString());
            synchronized (this) {
                try {
                    if (this.f60364e == null) {
                        this.f60364e = compileStatement;
                    }
                } catch (Throwable th) {
                    MethodCollector.o(12022);
                    throw th;
                }
            }
            if (this.f60364e != compileStatement) {
                compileStatement.close();
            }
        }
        SQLiteStatement sQLiteStatement = this.f60364e;
        MethodCollector.o(12022);
        return sQLiteStatement;
    }

    public final SQLiteStatement b() {
        MethodCollector.i(12176);
        if (this.f60366g == null) {
            String str = this.f60361b;
            String[] strArr = this.f60363d;
            String str2 = "\"" + str + '\"';
            StringBuilder sb = new StringBuilder("DELETE FROM ");
            sb.append(str2);
            if (strArr != null && strArr.length > 0) {
                sb.append(" WHERE ");
                j.a(sb, str2, strArr);
            }
            SQLiteStatement compileStatement = this.f60360a.compileStatement(sb.toString());
            synchronized (this) {
                try {
                    if (this.f60366g == null) {
                        this.f60366g = compileStatement;
                    }
                } catch (Throwable th) {
                    MethodCollector.o(12176);
                    throw th;
                }
            }
            if (this.f60366g != compileStatement) {
                compileStatement.close();
            }
        }
        SQLiteStatement sQLiteStatement = this.f60366g;
        MethodCollector.o(12176);
        return sQLiteStatement;
    }

    public final SQLiteStatement c() {
        MethodCollector.i(12178);
        if (this.f60365f == null) {
            String str = this.f60361b;
            String[] strArr = this.f60362c;
            String[] strArr2 = this.f60363d;
            String str2 = "\"" + str + '\"';
            StringBuilder sb = new StringBuilder("UPDATE ");
            sb.append(str2).append(" SET ");
            j.b(sb, strArr);
            if (strArr2 != null && strArr2.length > 0) {
                sb.append(" WHERE ");
                j.a(sb, str2, strArr2);
            }
            SQLiteStatement compileStatement = this.f60360a.compileStatement(sb.toString());
            synchronized (this) {
                try {
                    if (this.f60365f == null) {
                        this.f60365f = compileStatement;
                    }
                } catch (Throwable th) {
                    MethodCollector.o(12178);
                    throw th;
                }
            }
            if (this.f60365f != compileStatement) {
                compileStatement.close();
            }
        }
        SQLiteStatement sQLiteStatement = this.f60365f;
        MethodCollector.o(12178);
        return sQLiteStatement;
    }

    public final SQLiteStatement d() {
        MethodCollector.i(12314);
        if (this.f60367h == null) {
            String str = this.f60361b;
            String[] strArr = this.f60362c;
            StringBuilder sb = new StringBuilder("INSERT OR REPLACE INTO ");
            sb.append("\"" + str + '\"').append(" (");
            j.a(sb, strArr);
            sb.append(") VALUES (");
            j.a(sb, strArr.length);
            sb.append(')');
            SQLiteStatement compileStatement = this.f60360a.compileStatement(sb.toString());
            synchronized (this) {
                try {
                    if (this.f60367h == null) {
                        this.f60367h = compileStatement;
                    }
                } catch (Throwable th) {
                    MethodCollector.o(12314);
                    throw th;
                }
            }
            if (this.f60367h != compileStatement) {
                compileStatement.close();
            }
        }
        SQLiteStatement sQLiteStatement = this.f60367h;
        MethodCollector.o(12314);
        return sQLiteStatement;
    }

    public g(SQLiteDatabase sQLiteDatabase, String str, String[] strArr, String[] strArr2) {
        this.f60360a = sQLiteDatabase;
        this.f60361b = str;
        this.f60362c = strArr;
        this.f60363d = strArr2;
    }
}
