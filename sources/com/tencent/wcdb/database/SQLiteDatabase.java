package com.tencent.wcdb.database;

import android.content.ContentValues;
import android.os.Build;
import android.os.Looper;
import android.text.TextUtils;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.tencent.wcdb.d;
import com.tencent.wcdb.g;
import com.tencent.wcdb.h;
import com.tencent.wcdb.i;
import com.tencent.wcdb.j;
import com.tencent.wcdb.support.Log;
import java.util.Set;
import java.util.WeakHashMap;

public final class SQLiteDatabase extends c {

    /* renamed from: d  reason: collision with root package name */
    static final /* synthetic */ boolean f154582d = true;

    /* renamed from: e  reason: collision with root package name */
    private static final WeakHashMap<SQLiteDatabase, Object> f154583e = new WeakHashMap<>();

    /* renamed from: j  reason: collision with root package name */
    private static final String[] f154584j = {"", " OR ROLLBACK ", " OR ABORT ", " OR FAIL ", " OR IGNORE ", " OR REPLACE "};

    /* renamed from: a  reason: collision with root package name */
    final Object f154585a = new Object();

    /* renamed from: b  reason: collision with root package name */
    final g f154586b;

    /* renamed from: c  reason: collision with root package name */
    d f154587c;

    /* renamed from: f  reason: collision with root package name */
    private final ThreadLocal<l> f154588f = new ThreadLocal<l>() {
        /* class com.tencent.wcdb.database.SQLiteDatabase.AnonymousClass1 */

        static {
            Covode.recordClassIndex(103027);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* access modifiers changed from: protected */
        @Override // java.lang.ThreadLocal
        public final /* synthetic */ l initialValue() {
            return SQLiteDatabase.this.f();
        }
    };

    /* renamed from: g  reason: collision with root package name */
    private final a f154589g;

    /* renamed from: h  reason: collision with root package name */
    private final g f154590h;

    /* renamed from: i  reason: collision with root package name */
    private boolean f154591i;

    public interface CustomFunction {
        static {
            Covode.recordClassIndex(103028);
        }
    }

    public interface a {
        static {
            Covode.recordClassIndex(103029);
        }

        d a(f fVar, String str, j jVar);

        j a(SQLiteDatabase sQLiteDatabase, String str, Object[] objArr, com.tencent.wcdb.support.a aVar);
    }

    public final void a(int i2) {
        b("PRAGMA user_version = ".concat(String.valueOf(i2)));
    }

    public final m a(String str) {
        d();
        try {
            return new m(this, str, null);
        } finally {
            e();
        }
    }

    public final d a(String str, Object[] objArr) {
        d();
        try {
            return new h(this, str).a(this.f154589g, objArr);
        } finally {
            e();
        }
    }

    public final long a(String str, boolean z) {
        int i2;
        if (z) {
            i2 = 1;
        } else {
            i2 = 2;
        }
        long a2 = b().a(i2).a(str);
        if (a2 != 0) {
            return a2;
        }
        throw new IllegalStateException("SQLiteConnection native handle not initialized.");
    }

    /* access modifiers changed from: package-private */
    public final void a() {
        this.f154590h.a(this);
    }

    /* access modifiers changed from: protected */
    @Override // com.tencent.wcdb.database.c
    public final void c() {
        c(false);
    }

    public final void r() {
        b().c();
    }

    public final l b() {
        return this.f154588f.get();
    }

    /* access modifiers changed from: protected */
    @Override // java.lang.Object
    public final void finalize() {
        try {
            c(true);
        } finally {
            super.finalize();
        }
    }

    public final int j() {
        return Long.valueOf(h.a(this, "PRAGMA user_version;")).intValue();
    }

    /* access modifiers changed from: package-private */
    public final boolean l() {
        if ((this.f154586b.f154636d & 1) == 1) {
            return true;
        }
        return false;
    }

    private String t() {
        String str;
        MethodCollector.i(3151);
        synchronized (this.f154585a) {
            try {
                str = this.f154586b.f154634b;
            } finally {
                MethodCollector.o(3151);
            }
        }
        return str;
    }

    /* access modifiers changed from: package-private */
    public final l f() {
        d dVar;
        MethodCollector.i(3215);
        synchronized (this.f154585a) {
            try {
                s();
                dVar = this.f154587c;
            } catch (Throwable th) {
                MethodCollector.o(3215);
                throw th;
            }
        }
        l lVar = new l(dVar);
        MethodCollector.o(3215);
        return lVar;
    }

    public final void g() {
        d();
        try {
            b().a((com.tencent.wcdb.support.a) null);
        } finally {
            e();
        }
    }

    public final void h() {
        d();
        try {
            b().a();
        } finally {
            e();
        }
    }

    public final boolean i() {
        boolean z;
        d();
        try {
            if (b().f154676b != null) {
                z = true;
            } else {
                z = false;
            }
            return z;
        } finally {
            e();
        }
    }

    public final boolean k() {
        boolean l2;
        MethodCollector.i(115);
        synchronized (this.f154585a) {
            try {
                l2 = l();
            } finally {
                MethodCollector.o(115);
            }
        }
        return l2;
    }

    public final boolean m() {
        boolean z;
        MethodCollector.i(116);
        synchronized (this.f154585a) {
            try {
                if (this.f154587c != null) {
                    z = true;
                } else {
                    z = false;
                }
            } finally {
                MethodCollector.o(116);
            }
        }
        return z;
    }

    public final String n() {
        String str;
        MethodCollector.i(117);
        synchronized (this.f154585a) {
            try {
                str = this.f154586b.f154633a;
            } finally {
                MethodCollector.o(117);
            }
        }
        return str;
    }

    public final o p() {
        o oVar;
        MethodCollector.i(120);
        synchronized (this.f154585a) {
            try {
                s();
                oVar = this.f154587c.f154602c;
            } finally {
                MethodCollector.o(120);
            }
        }
        return oVar;
    }

    public final String toString() {
        return "SQLiteDatabase: " + n();
    }

    static {
        Covode.recordClassIndex(103026);
        SQLiteGlobal.loadLib();
    }

    /* access modifiers changed from: package-private */
    public final void s() {
        if (this.f154587c == null) {
            throw new IllegalStateException("The database '" + this.f154586b.f154634b + "' is not open.");
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:18:?, code lost:
        r3 = a("pragma database_list;", (java.lang.Object[]) null);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:20:0x003c, code lost:
        if (r3.moveToNext() == false) goto L_0x0051;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:21:0x003e, code lost:
        r4.add(new android.util.Pair(r3.getString(1), r3.getString(2)));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:23:?, code lost:
        r3.close();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:25:0x005a, code lost:
        return r4;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:26:0x005b, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:27:0x005c, code lost:
        if (0 != 0) goto L_0x005e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:28:0x005e, code lost:
        r3.close();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:29:0x0061, code lost:
        com.bytedance.frameworks.apm.trace.MethodCollector.o(123);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:30:0x0064, code lost:
        throw r0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:31:0x0065, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:32:0x0066, code lost:
        e();
        com.bytedance.frameworks.apm.trace.MethodCollector.o(123);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:33:0x006c, code lost:
        throw r0;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.util.List<android.util.Pair<java.lang.String, java.lang.String>> q() {
        /*
        // Method dump skipped, instructions count: 115
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.wcdb.database.SQLiteDatabase.q():java.util.List");
    }

    public final boolean o() {
        MethodCollector.i(118);
        synchronized (this.f154585a) {
            try {
                s();
                if ((this.f154586b.f154636d & 536870912) != 0) {
                    return true;
                }
                if (l()) {
                    MethodCollector.o(118);
                    return false;
                } else if (this.f154586b.a()) {
                    Log.a(4, "WCDB.SQLiteDatabase", "can't enable WAL for memory databases.");
                    MethodCollector.o(118);
                    return false;
                } else if (this.f154591i) {
                    Log.a(4, "WCDB.SQLiteDatabase", "this database: " + this.f154586b.f154634b + " has attached databases. can't  enable WAL.");
                    MethodCollector.o(118);
                    return false;
                } else {
                    g gVar = this.f154586b;
                    gVar.f154636d = 536870912 | gVar.f154636d;
                    try {
                        this.f154587c.a(this.f154586b);
                        MethodCollector.o(118);
                        return true;
                    } catch (RuntimeException e2) {
                        this.f154586b.f154636d &= -536870913;
                        MethodCollector.o(118);
                        throw e2;
                    }
                }
            } finally {
                MethodCollector.o(118);
            }
        }
    }

    static int a(boolean z) {
        int i2;
        if (z) {
            i2 = 1;
        } else {
            i2 = 2;
        }
        Looper myLooper = Looper.myLooper();
        if (myLooper == null || myLooper != Looper.getMainLooper()) {
            return i2;
        }
        return i2 | 4;
    }

    public final void b(boolean z) {
        int i2;
        d();
        try {
            l b2 = b();
            if (z) {
                i2 = 2;
            } else {
                i2 = 1;
            }
            b2.a(i2, a(false), (com.tencent.wcdb.support.a) null);
        } finally {
            e();
        }
    }

    private static Set<String> a(ContentValues contentValues) {
        int i2 = Build.VERSION.SDK_INT;
        return contentValues.keySet();
    }

    private void c(boolean z) {
        d dVar;
        MethodCollector.i(3148);
        synchronized (this.f154585a) {
            try {
                dVar = this.f154587c;
                this.f154587c = null;
            } finally {
                MethodCollector.o(3148);
            }
        }
        if (!z) {
            WeakHashMap<SQLiteDatabase, Object> weakHashMap = f154583e;
            synchronized (weakHashMap) {
                try {
                    weakHashMap.remove(this);
                } finally {
                    MethodCollector.o(3148);
                }
            }
            if (dVar != null) {
                dVar.close();
            }
        }
    }

    public final int b(String str) {
        MethodCollector.i(114);
        d();
        try {
            if (h.b(str) == 3) {
                boolean z = false;
                synchronized (this.f154585a) {
                    try {
                        if (!this.f154591i) {
                            this.f154591i = true;
                            z = true;
                        }
                    } finally {
                        MethodCollector.o(114);
                    }
                }
                if (z) {
                    synchronized (this.f154585a) {
                        try {
                            s();
                            if ((this.f154586b.f154636d & 536870912) != 0) {
                                this.f154586b.f154636d &= -536870913;
                                try {
                                    this.f154587c.a(this.f154586b);
                                } catch (RuntimeException e2) {
                                    g gVar = this.f154586b;
                                    gVar.f154636d = 536870912 | gVar.f154636d;
                                    MethodCollector.o(114);
                                    throw e2;
                                }
                            }
                        } catch (Throwable th) {
                            throw th;
                        }
                    }
                }
            }
            m mVar = new m(this, str, null);
            try {
                int g2 = mVar.g();
                mVar.close();
                return g2;
            } catch (Throwable th2) {
                mVar.close();
                MethodCollector.o(114);
                throw th2;
            }
        } finally {
            e();
            MethodCollector.o(114);
        }
    }

    public final long b(String str, String str2, ContentValues contentValues) {
        try {
            return a(str, (String) null, contentValues, 5);
        } catch (SQLiteDatabaseCorruptException e2) {
            throw e2;
        } catch (j e3) {
            Log.a("WCDB.SQLiteDatabase", "Error inserting ".concat(String.valueOf(contentValues)), e3);
            return -1;
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:8:0x0034, code lost:
        return;
     */
    /* JADX WARNING: Failed to process nested try/catch */
    /* JADX WARNING: Missing exception handler attribute for start block: B:2:0x0004 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private void a(byte[] r5, com.tencent.wcdb.database.SQLiteCipherSpec r6, int r7) {
        /*
            r4 = this;
            r4.b(r5, r6, r7)     // Catch:{ SQLiteDatabaseCorruptException -> 0x0004 }
            goto L_0x0034
        L_0x0004:
            r4.a()     // Catch:{ SQLiteException -> 0x000b }
            r4.b(r5, r6, r7)     // Catch:{ SQLiteException -> 0x000b }
            return
        L_0x000b:
            r3 = move-exception
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            java.lang.String r0 = "Failed to open database '"
            r1.<init>(r0)
            java.lang.String r0 = r4.t()
            java.lang.StringBuilder r1 = r1.append(r0)
            java.lang.String r0 = "'."
            java.lang.StringBuilder r0 = r1.append(r0)
            java.lang.String r2 = r0.toString()
            r0 = 1
            java.lang.Object[] r1 = new java.lang.Object[r0]
            r0 = 0
            r1[r0] = r3
            java.lang.String r0 = "WCDB.SQLiteDatabase"
            com.tencent.wcdb.support.Log.a(r0, r2, r1)
            r4.close()
            throw r3
        L_0x0034:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.wcdb.database.SQLiteDatabase.a(byte[], com.tencent.wcdb.database.SQLiteCipherSpec, int):void");
    }

    private void b(byte[] bArr, SQLiteCipherSpec sQLiteCipherSpec, int i2) {
        SQLiteCipherSpec sQLiteCipherSpec2;
        MethodCollector.i(3356);
        synchronized (this.f154585a) {
            try {
                if (f154582d || this.f154587c == null) {
                    g gVar = this.f154586b;
                    if (gVar != null) {
                        d dVar = new d(this, gVar, i2);
                        dVar.f154604e = bArr;
                        if (sQLiteCipherSpec == null) {
                            sQLiteCipherSpec2 = null;
                        } else {
                            sQLiteCipherSpec2 = new SQLiteCipherSpec(sQLiteCipherSpec);
                        }
                        dVar.f154605f = sQLiteCipherSpec2;
                        dVar.f154611l = dVar.a(dVar.f154608i, true);
                        dVar.f154609j = true;
                        this.f154587c = dVar;
                    } else {
                        IllegalArgumentException illegalArgumentException = new IllegalArgumentException("configuration must not be null.");
                        MethodCollector.o(3356);
                        throw illegalArgumentException;
                    }
                } else {
                    AssertionError assertionError = new AssertionError();
                    MethodCollector.o(3356);
                    throw assertionError;
                }
            } finally {
                MethodCollector.o(3356);
            }
        }
        WeakHashMap<SQLiteDatabase, Object> weakHashMap = f154583e;
        synchronized (weakHashMap) {
            try {
                weakHashMap.put(this, null);
            } finally {
                MethodCollector.o(3356);
            }
        }
    }

    /* JADX INFO: finally extract failed */
    public final int a(String str, String str2, String[] strArr) {
        String str3;
        d();
        try {
            StringBuilder append = new StringBuilder("DELETE FROM ").append(str);
            if (!TextUtils.isEmpty(str2)) {
                str3 = " WHERE ".concat(String.valueOf(str2));
            } else {
                str3 = "";
            }
            m mVar = new m(this, append.append(str3).toString(), strArr);
            try {
                int g2 = mVar.g();
                mVar.close();
                return g2;
            } catch (Throwable th) {
                mVar.close();
                throw th;
            }
        } finally {
            e();
        }
    }

    public final long a(String str, String str2, ContentValues contentValues) {
        try {
            return a(str, (String) null, contentValues, 0);
        } catch (SQLiteDatabaseCorruptException e2) {
            throw e2;
        } catch (j e3) {
            Log.a("WCDB.SQLiteDatabase", "Error inserting %s: %s", contentValues, e3);
            return -1;
        }
    }

    private SQLiteDatabase(String str, int i2, a aVar, g gVar) {
        this.f154589g = aVar;
        this.f154590h = gVar == null ? new i((byte) 0) : gVar;
        this.f154586b = new g(str, i2);
    }

    /* JADX INFO: finally extract failed */
    public final int a(String str, ContentValues contentValues, String str2, String[] strArr) {
        int i2;
        String str3;
        if (contentValues == null || contentValues.size() == 0) {
            throw new IllegalArgumentException("Empty values");
        }
        d();
        try {
            StringBuilder sb = new StringBuilder(120);
            sb.append("UPDATE ");
            int i3 = 0;
            sb.append(f154584j[0]);
            sb.append(str);
            sb.append(" SET ");
            int size = contentValues.size();
            if (strArr == null) {
                i2 = size;
            } else {
                i2 = strArr.length + size;
            }
            Object[] objArr = new Object[i2];
            for (String str4 : a(contentValues)) {
                if (i3 > 0) {
                    str3 = ",";
                } else {
                    str3 = "";
                }
                sb.append(str3);
                sb.append(str4);
                objArr[i3] = contentValues.get(str4);
                sb.append("=?");
                i3++;
            }
            if (strArr != null) {
                for (int i4 = size; i4 < i2; i4++) {
                    objArr[i4] = strArr[i4 - size];
                }
            }
            if (!TextUtils.isEmpty(str2)) {
                sb.append(" WHERE ");
                sb.append(str2);
            }
            m mVar = new m(this, sb.toString(), objArr);
            try {
                int g2 = mVar.g();
                mVar.close();
                return g2;
            } catch (Throwable th) {
                mVar.close();
                throw th;
            }
        } finally {
            e();
        }
    }

    /* JADX INFO: finally extract failed */
    public final long a(String str, String str2, ContentValues contentValues, int i2) {
        int i3;
        String str3;
        d();
        try {
            StringBuilder sb = new StringBuilder();
            sb.append("INSERT");
            sb.append(f154584j[i2]);
            sb.append(" INTO ");
            sb.append(str);
            sb.append('(');
            Object[] objArr = null;
            int i4 = 0;
            if (contentValues == null || contentValues.size() <= 0) {
                i3 = 0;
            } else {
                i3 = contentValues.size();
            }
            if (i3 > 0) {
                objArr = new Object[i3];
                int i5 = 0;
                for (String str4 : a(contentValues)) {
                    if (i5 > 0) {
                        str3 = ",";
                    } else {
                        str3 = "";
                    }
                    sb.append(str3);
                    sb.append(str4);
                    objArr[i5] = contentValues.get(str4);
                    i5++;
                }
                sb.append(')');
                sb.append(" VALUES (");
                loop1:
                while (true) {
                    String str5 = "?";
                    while (true) {
                        sb.append(str5);
                        i4++;
                        if (i4 >= i3) {
                            break loop1;
                        } else if (i4 > 0) {
                            str5 = ",?";
                        }
                    }
                }
            } else {
                sb.append(str2 + ") VALUES (NULL");
            }
            sb.append(')');
            m mVar = new m(this, sb.toString(), objArr);
            try {
                long h2 = mVar.h();
                mVar.close();
                return h2;
            } catch (Throwable th) {
                mVar.close();
                throw th;
            }
        } finally {
            e();
        }
    }

    public static SQLiteDatabase a(String str, byte[] bArr, SQLiteCipherSpec sQLiteCipherSpec, a aVar, int i2, g gVar, int i3) {
        SQLiteDatabase sQLiteDatabase = new SQLiteDatabase(str, i2, aVar, gVar);
        sQLiteDatabase.a(bArr, sQLiteCipherSpec, i3);
        return sQLiteDatabase;
    }
}
