package com.tencent.wcdb.database;

import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.tencent.wcdb.database.SQLiteDebug;
import com.tencent.wcdb.h;
import com.tencent.wcdb.support.Log;
import com.tencent.wcdb.support.a;
import java.lang.ref.WeakReference;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.regex.Pattern;

public final class SQLiteConnection implements a.AbstractC4112a {

    /* renamed from: a  reason: collision with root package name */
    public static final byte[] f154543a = new byte[0];

    /* renamed from: b  reason: collision with root package name */
    static final Pattern f154544b = Pattern.compile("[\\s]*\\n+[\\s]*");

    /* renamed from: i  reason: collision with root package name */
    private static final String[] f154545i = new String[0];

    /* renamed from: c  reason: collision with root package name */
    public final d f154546c;

    /* renamed from: d  reason: collision with root package name */
    public final int f154547d;

    /* renamed from: e  reason: collision with root package name */
    public final boolean f154548e;

    /* renamed from: f  reason: collision with root package name */
    public final b f154549f = new b(this, (byte) 0);

    /* renamed from: g  reason: collision with root package name */
    public int f154550g;

    /* renamed from: h  reason: collision with root package name */
    public boolean f154551h;

    /* renamed from: j  reason: collision with root package name */
    private final g f154552j;

    /* renamed from: k  reason: collision with root package name */
    private final boolean f154553k;

    /* renamed from: l  reason: collision with root package name */
    private final d f154554l;

    /* renamed from: m  reason: collision with root package name */
    private c f154555m;
    private Thread n;
    private long o;
    private int p;
    private byte[] q;
    private SQLiteCipherSpec r;
    private a s;
    private int t;

    private static native void nativeBindBlob(long j2, long j3, int i2, byte[] bArr);

    private static native void nativeBindDouble(long j2, long j3, int i2, double d2);

    private static native void nativeBindLong(long j2, long j3, int i2, long j4);

    private static native void nativeBindNull(long j2, long j3, int i2);

    private static native void nativeBindString(long j2, long j3, int i2, String str);

    private static native void nativeCancel(long j2);

    private static native void nativeClose(long j2);

    private static native void nativeExecute(long j2, long j3);

    private static native int nativeExecuteForChangedRowCount(long j2, long j3);

    private static native long nativeExecuteForCursorWindow(long j2, long j3, long j4, int i2, int i3, boolean z);

    private static native long nativeExecuteForLastInsertedRowId(long j2, long j3);

    private static native long nativeExecuteForLong(long j2, long j3);

    private static native String nativeExecuteForString(long j2, long j3);

    private static native void nativeFinalizeStatement(long j2, long j3);

    private static native int nativeGetColumnCount(long j2, long j3);

    private static native String nativeGetColumnName(long j2, long j3, int i2);

    private static native int nativeGetDbLookaside(long j2);

    private static native int nativeGetParameterCount(long j2, long j3);

    private static native boolean nativeIsReadOnly(long j2, long j3);

    private native long nativeOpen(String str, int i2, String str2);

    private static native long nativePrepareStatement(long j2, String str);

    private static native void nativeRegisterCustomFunction(long j2, SQLiteCustomFunction sQLiteCustomFunction);

    private static native void nativeRegisterLocalizedCollators(long j2, String str);

    private static native void nativeResetCancel(long j2, boolean z);

    private static native void nativeResetStatement(long j2, long j3, boolean z);

    private static native long nativeSQLiteHandle(long j2, boolean z);

    private static native void nativeSetKey(long j2, byte[] bArr);

    private static native void nativeSetUpdateNotification(long j2, boolean z, boolean z2);

    private static native void nativeSetWalHook(long j2);

    private static native long nativeWalCheckpoint(long j2, String str);

    /* access modifiers changed from: package-private */
    public static final class a {

        /* renamed from: k  reason: collision with root package name */
        private static final SimpleDateFormat f154556k = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss.SSS");

        /* renamed from: a  reason: collision with root package name */
        public long f154557a;

        /* renamed from: b  reason: collision with root package name */
        public long f154558b;

        /* renamed from: c  reason: collision with root package name */
        public String f154559c;

        /* renamed from: d  reason: collision with root package name */
        public String f154560d;

        /* renamed from: e  reason: collision with root package name */
        public ArrayList<Object> f154561e;

        /* renamed from: f  reason: collision with root package name */
        public boolean f154562f;

        /* renamed from: g  reason: collision with root package name */
        public Exception f154563g;

        /* renamed from: h  reason: collision with root package name */
        public int f154564h;

        /* renamed from: i  reason: collision with root package name */
        public int f154565i;

        /* renamed from: j  reason: collision with root package name */
        public int f154566j;

        private a() {
        }

        static {
            Covode.recordClassIndex(103020);
        }

        /* synthetic */ a(byte b2) {
            this();
        }

        public final void a(StringBuilder sb) {
            String str;
            sb.append(this.f154559c);
            if (this.f154562f) {
                sb.append(" took ").append(this.f154558b - this.f154557a).append("ms");
            } else {
                sb.append(" started ").append(System.currentTimeMillis() - this.f154557a).append("ms ago");
            }
            StringBuilder append = sb.append(" - ");
            if (!this.f154562f) {
                str = "running";
            } else if (this.f154563g != null) {
                str = "failed";
            } else {
                str = "succeeded";
            }
            append.append(str);
            if (this.f154560d != null) {
                sb.append(", sql=\"").append(SQLiteConnection.f154544b.matcher(this.f154560d).replaceAll(" ")).append("\"");
            }
            if (this.f154566j > 0) {
                sb.append(", tid=").append(this.f154566j);
            }
            Exception exc = this.f154563g;
            if (exc != null && exc.getMessage() != null) {
                sb.append(", exception=\"").append(this.f154563g.getMessage()).append("\"");
            }
        }
    }

    /* access modifiers changed from: package-private */
    public final void a() {
        c();
    }

    /* access modifiers changed from: package-private */
    public final void a(Exception exc) {
        MethodCollector.i(2671);
        int i2 = this.t - 1;
        this.t = i2;
        if (i2 == 0 && this.s != null) {
            nativeSQLiteHandle(this.o, false);
            this.f154549f.b(this.s.f154564h);
            this.s = null;
        }
        MethodCollector.o(2671);
    }

    public final void a(String str, n nVar) {
        d dVar;
        MethodCollector.i(2690);
        if (str != null) {
            a a2 = this.f154549f.a("prepare", str, null);
            int i2 = a2.f154564h;
            try {
                c d2 = d(str);
                a2.f154565i = d2.f154576f;
                try {
                    nVar.f154686a = d2.f154575e;
                    nVar.f154688c = d2.f154577g;
                    int nativeGetColumnCount = nativeGetColumnCount(this.o, d2.f154574d);
                    if (nativeGetColumnCount == 0) {
                        nVar.f154687b = f154545i;
                    } else {
                        nVar.f154687b = new String[nativeGetColumnCount];
                        for (int i3 = 0; i3 < nativeGetColumnCount; i3++) {
                            nVar.f154687b[i3] = nativeGetColumnName(this.o, d2.f154574d, i3);
                        }
                    }
                    a(d2);
                    this.f154549f.a(i2);
                    MethodCollector.o(2690);
                } catch (Throwable th) {
                    a(d2);
                    MethodCollector.o(2690);
                    throw th;
                }
            } catch (RuntimeException e2) {
                if (((e2 instanceof SQLiteDatabaseLockedException) || (e2 instanceof SQLiteTableLockedException)) && (dVar = this.f154546c) != null) {
                    dVar.a();
                }
                this.f154549f.a(i2, e2);
                MethodCollector.o(2690);
                throw e2;
            } catch (Throwable th2) {
                this.f154549f.a(i2);
                MethodCollector.o(2690);
                throw th2;
            }
        } else {
            IllegalArgumentException illegalArgumentException = new IllegalArgumentException("sql must not be null.");
            MethodCollector.o(2690);
            throw illegalArgumentException;
        }
    }

    public final void a(String str, Object[] objArr, com.tencent.wcdb.support.a aVar) {
        d dVar;
        MethodCollector.i(2692);
        if (str != null) {
            a a2 = this.f154549f.a("execute", str, objArr);
            int i2 = a2.f154564h;
            try {
                c d2 = d(str);
                a2.f154565i = d2.f154576f;
                try {
                    d(d2);
                    a(d2, objArr);
                    b(aVar);
                    try {
                        nativeExecute(this.o, d2.f154574d);
                        a(aVar);
                        a(d2);
                        this.f154549f.a(i2);
                        MethodCollector.o(2692);
                    } catch (Throwable th) {
                        a(aVar);
                        MethodCollector.o(2692);
                        throw th;
                    }
                } catch (Throwable th2) {
                    a(d2);
                    MethodCollector.o(2692);
                    throw th2;
                }
            } catch (RuntimeException e2) {
                if (((e2 instanceof SQLiteDatabaseLockedException) || (e2 instanceof SQLiteTableLockedException)) && (dVar = this.f154546c) != null) {
                    dVar.a();
                }
                this.f154549f.a(i2, e2);
                MethodCollector.o(2692);
                throw e2;
            } catch (Throwable th3) {
                this.f154549f.a(i2);
                MethodCollector.o(2692);
                throw th3;
            }
        } else {
            IllegalArgumentException illegalArgumentException = new IllegalArgumentException("sql must not be null.");
            MethodCollector.o(2692);
            throw illegalArgumentException;
        }
    }

    @Override // com.tencent.wcdb.support.a.AbstractC4112a
    public final void b() {
        MethodCollector.i(2709);
        nativeCancel(this.o);
        MethodCollector.o(2709);
    }

    static {
        Covode.recordClassIndex(103019);
    }

    private void f() {
        String str;
        if (!this.f154552j.a() && !this.f154553k) {
            if ((this.f154552j.f154636d & 536870912) != 0) {
                str = "WAL";
            } else {
                str = "PERSIST";
            }
            c(str);
        }
    }

    private void g() {
        a("PRAGMA synchronous=".concat(String.valueOf(this.f154552j.f154641i)), null, null);
    }

    private void i() {
        MethodCollector.i(2685);
        nativeSetUpdateNotification(this.o, this.f154552j.f154642j, this.f154552j.f154643k);
        MethodCollector.o(2685);
    }

    private void c() {
        MethodCollector.i(2677);
        if (this.o != 0) {
            int i2 = this.f154549f.a("close", null, null).f154564h;
            try {
                this.f154554l.a();
                nativeClose(this.o);
                this.o = 0;
            } finally {
                this.f154549f.a(i2);
                MethodCollector.o(2677);
            }
        } else {
            MethodCollector.o(2677);
        }
    }

    private void d() {
        MethodCollector.i(2680);
        if (!this.f154552j.a() && !this.f154553k) {
            if (this.f154552j.f154640h) {
                nativeSetWalHook(this.o);
                MethodCollector.o(2680);
                return;
            } else if (b("PRAGMA wal_autocheckpoint", null, null) != 100) {
                b("PRAGMA wal_autocheckpoint=100", null, null);
            }
        }
        MethodCollector.o(2680);
    }

    private void e() {
        long j2;
        if (!this.f154553k) {
            if (this.f154552j.f154639g) {
                j2 = 1;
            } else {
                j2 = 0;
            }
            if (b("PRAGMA foreign_keys", null, null) != j2) {
                a("PRAGMA foreign_keys=".concat(String.valueOf(j2)), null, null);
            }
        }
    }

    /* access modifiers changed from: protected */
    public final void finalize() {
        try {
            d dVar = this.f154546c;
            if (!(dVar == null || this.o == 0)) {
                Log.a(5, "WCDB.SQLiteConnectionPool", "A SQLiteConnection object for database '" + dVar.f154608i.f154634b + "' was leaked!  Please fix your application to end transactions in progress properly and to close the database when it is no longer needed.");
                dVar.f154607h.set(true);
            }
            c();
        } finally {
            super.finalize();
        }
    }

    public final String toString() {
        return "SQLiteConnection: " + this.f154552j.f154633a + " (" + this.f154547d + ")";
    }

    /* access modifiers changed from: package-private */
    public final class b {

        /* renamed from: b  reason: collision with root package name */
        private final a[] f154568b;

        /* renamed from: c  reason: collision with root package name */
        private int f154569c;

        /* renamed from: d  reason: collision with root package name */
        private int f154570d;

        static {
            Covode.recordClassIndex(103021);
        }

        public final String a() {
            MethodCollector.i(1701);
            synchronized (this.f154568b) {
                try {
                    a aVar = this.f154568b[this.f154569c];
                    if (aVar == null || aVar.f154562f) {
                        MethodCollector.o(1701);
                        return null;
                    }
                    StringBuilder sb = new StringBuilder();
                    aVar.a(sb);
                    return sb.toString();
                } finally {
                    MethodCollector.o(1701);
                }
            }
        }

        private b() {
            this.f154568b = new a[20];
        }

        private a c(int i2) {
            a aVar = this.f154568b[i2 & 255];
            if (aVar.f154564h == i2) {
                return aVar;
            }
            return null;
        }

        private static boolean a(a aVar) {
            if (aVar == null) {
                return false;
            }
            aVar.f154558b = System.currentTimeMillis();
            aVar.f154562f = true;
            if (aVar.f154563g == null || aVar.f154563g.getMessage() == null) {
                return SQLiteDebug.a(aVar.f154558b - aVar.f154557a);
            }
            return true;
        }

        /* JADX WARNING: Code restructure failed: missing block: B:12:0x0021, code lost:
            if ("prepare".equals(r1) != false) goto L_0x002a;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:13:0x0023, code lost:
            r5.f154567a.f154546c.c();
         */
        /* JADX WARNING: Code restructure failed: missing block: B:14:0x002a, code lost:
            com.bytedance.frameworks.apm.trace.MethodCollector.o(1598);
         */
        /* JADX WARNING: Code restructure failed: missing block: B:15:0x002d, code lost:
            return r2;
         */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final boolean b(int r6) {
            /*
                r5 = this;
                r4 = 1598(0x63e, float:2.239E-42)
                com.bytedance.frameworks.apm.trace.MethodCollector.i(r4)
                com.tencent.wcdb.database.SQLiteConnection$a[] r3 = r5.f154568b
                monitor-enter(r3)
                com.tencent.wcdb.database.SQLiteConnection$a r0 = r5.c(r6)     // Catch:{ all -> 0x002e }
                if (r0 != 0) goto L_0x0014
                r0 = 0
                monitor-exit(r3)     // Catch:{ all -> 0x002e }
                com.bytedance.frameworks.apm.trace.MethodCollector.o(r4)
                return r0
            L_0x0014:
                boolean r2 = a(r0)
                java.lang.String r1 = r0.f154559c
                monitor-exit(r3)
                java.lang.String r0 = "prepare"
                boolean r0 = r0.equals(r1)
                if (r0 != 0) goto L_0x002a
                com.tencent.wcdb.database.SQLiteConnection r0 = com.tencent.wcdb.database.SQLiteConnection.this
                com.tencent.wcdb.database.d r0 = r0.f154546c
                r0.c()
            L_0x002a:
                com.bytedance.frameworks.apm.trace.MethodCollector.o(r4)
                return r2
            L_0x002e:
                r0 = move-exception
                monitor-exit(r3)
                com.bytedance.frameworks.apm.trace.MethodCollector.o(r4)
                throw r0
            */
            throw new UnsupportedOperationException("Method not decompiled: com.tencent.wcdb.database.SQLiteConnection.b.b(int):boolean");
        }

        public final void a(int i2) {
            String str;
            MethodCollector.i(1597);
            synchronized (this.f154568b) {
                try {
                    a c2 = c(i2);
                    if (a(c2)) {
                        a(c2, (String) null);
                    }
                    str = c2.f154559c;
                } finally {
                    MethodCollector.o(1597);
                }
            }
            if (!"prepare".equals(str)) {
                SQLiteConnection.this.f154546c.c();
            }
        }

        /* synthetic */ b(SQLiteConnection sQLiteConnection, byte b2) {
            this();
        }

        private static void a(a aVar, String str) {
            StringBuilder sb = new StringBuilder();
            aVar.a(sb);
            if (str != null) {
                sb.append(", ").append(str);
            }
            Log.a(4, "WCDB.SQLiteConnection", sb.toString());
        }

        public final void a(int i2, Exception exc) {
            MethodCollector.i(1595);
            synchronized (this.f154568b) {
                try {
                    a c2 = c(i2);
                    if (c2 != null) {
                        c2.f154563g = exc;
                    }
                } finally {
                    MethodCollector.o(1595);
                }
            }
        }

        public final void a(int i2, String str) {
            MethodCollector.i(1610);
            synchronized (this.f154568b) {
                try {
                    a c2 = c(i2);
                    if (c2 != null) {
                        a(c2, str);
                    }
                } finally {
                    MethodCollector.o(1610);
                }
            }
        }

        public final a a(String str, String str2, Object[] objArr) {
            a aVar;
            MethodCollector.i(1590);
            synchronized (this.f154568b) {
                try {
                    int i2 = (this.f154569c + 1) % 20;
                    aVar = this.f154568b[i2];
                    if (aVar == null) {
                        aVar = new a((byte) 0);
                        this.f154568b[i2] = aVar;
                    } else {
                        aVar.f154562f = false;
                        aVar.f154563g = null;
                        if (aVar.f154561e != null) {
                            aVar.f154561e.clear();
                        }
                    }
                    aVar.f154557a = System.currentTimeMillis();
                    aVar.f154559c = str;
                    aVar.f154560d = str2;
                    if (objArr != null) {
                        if (aVar.f154561e == null) {
                            aVar.f154561e = new ArrayList<>();
                        } else {
                            aVar.f154561e.clear();
                        }
                        for (Object obj : objArr) {
                            if (obj == null || !(obj instanceof byte[])) {
                                aVar.f154561e.add(obj);
                            } else {
                                aVar.f154561e.add(SQLiteConnection.f154543a);
                            }
                        }
                    }
                    int i3 = this.f154570d;
                    this.f154570d = i3 + 1;
                    aVar.f154564h = (i3 << 8) | i2;
                    aVar.f154566j = SQLiteConnection.this.f154550g;
                    this.f154569c = i2;
                } finally {
                    MethodCollector.o(1590);
                }
            }
            return aVar;
        }
    }

    private void h() {
        MethodCollector.i(2683);
        this.f154552j.f154636d |= 16;
        if ((this.f154552j.f154636d & 16) != 0) {
            MethodCollector.o(2683);
            return;
        }
        String locale = this.f154552j.f154638f.toString();
        nativeRegisterLocalizedCollators(this.o, locale);
        if (this.f154553k) {
            MethodCollector.o(2683);
            return;
        }
        try {
            a("CREATE TABLE IF NOT EXISTS android_metadata (locale TEXT)", null, null);
            String c2 = c("SELECT locale FROM android_metadata UNION SELECT NULL ORDER BY locale DESC LIMIT 1", null, null);
            if (c2 == null || !c2.equals(locale)) {
                a("BEGIN", null, null);
                try {
                    a("DELETE FROM android_metadata", null, null);
                    a("INSERT INTO android_metadata (locale) VALUES(?)", new Object[]{locale}, null);
                    a("REINDEX LOCALIZED", null, null);
                    a("COMMIT", null, null);
                    MethodCollector.o(2683);
                } catch (Throwable th) {
                    a("ROLLBACK", null, null);
                    MethodCollector.o(2683);
                    throw th;
                }
            } else {
                MethodCollector.o(2683);
            }
        } catch (RuntimeException e2) {
            SQLiteException sQLiteException = new SQLiteException("Failed to change locale for db '" + this.f154552j.f154634b + "' to '" + locale + "'.", e2);
            MethodCollector.o(2683);
            throw sQLiteException;
        }
    }

    /* access modifiers changed from: package-private */
    public static final class c {

        /* renamed from: a  reason: collision with root package name */
        WeakReference<SQLiteConnection> f154571a;

        /* renamed from: b  reason: collision with root package name */
        public c f154572b;

        /* renamed from: c  reason: collision with root package name */
        public String f154573c;

        /* renamed from: d  reason: collision with root package name */
        public long f154574d;

        /* renamed from: e  reason: collision with root package name */
        public int f154575e;

        /* renamed from: f  reason: collision with root package name */
        public int f154576f;

        /* renamed from: g  reason: collision with root package name */
        public boolean f154577g;

        /* renamed from: h  reason: collision with root package name */
        public boolean f154578h;

        /* renamed from: i  reason: collision with root package name */
        public boolean f154579i;

        /* renamed from: j  reason: collision with root package name */
        a f154580j;

        static {
            Covode.recordClassIndex(103022);
        }

        c(SQLiteConnection sQLiteConnection) {
            this.f154571a = new WeakReference<>(sQLiteConnection);
        }
    }

    /* access modifiers changed from: package-private */
    public final class d extends com.tencent.wcdb.support.b<String, c> {
        static {
            Covode.recordClassIndex(103023);
        }

        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // com.tencent.wcdb.support.b
        public final /* synthetic */ void a(c cVar) {
            c cVar2 = cVar;
            cVar2.f154578h = false;
            if (!cVar2.f154579i) {
                SQLiteConnection.this.b(cVar2);
            }
        }

        public d(int i2) {
            super(i2);
        }
    }

    private void e(c cVar) {
        cVar.f154573c = null;
        cVar.f154572b = this.f154555m;
        this.f154555m = cVar;
    }

    private void b(com.tencent.wcdb.support.a aVar) {
        MethodCollector.i(2707);
        if (aVar != null) {
            aVar.a();
            int i2 = this.p + 1;
            this.p = i2;
            if (i2 == 1) {
                nativeResetCancel(this.o, true);
                aVar.a(this);
            }
        }
        MethodCollector.o(2707);
    }

    private void c(c cVar) {
        MethodCollector.i(3236);
        nativeResetStatement(this.o, cVar.f154574d, true);
        MethodCollector.o(3236);
    }

    private void d(c cVar) {
        if (this.f154551h && !cVar.f154577g) {
            throw new SQLiteException("Cannot execute this statement because it might modify the database but the connection is read-only.");
        }
    }

    /* access modifiers changed from: package-private */
    public final void a(c cVar) {
        cVar.f154579i = false;
        if (cVar.f154578h) {
            try {
                c(cVar);
            } catch (SQLiteException unused) {
                this.f154554l.c(cVar.f154573c);
            }
        } else {
            b(cVar);
        }
    }

    /* access modifiers changed from: package-private */
    public final long a(String str) {
        MethodCollector.i(2670);
        if (this.o == 0) {
            MethodCollector.o(2670);
            return 0;
        }
        if (str != null && this.s == null) {
            a a2 = this.f154549f.a(str, null, null);
            this.s = a2;
            a2.f154565i = 99;
        }
        this.t++;
        long nativeSQLiteHandle = nativeSQLiteHandle(this.o, true);
        MethodCollector.o(2670);
        return nativeSQLiteHandle;
    }

    public final void b(c cVar) {
        MethodCollector.i(2706);
        nativeFinalizeStatement(this.o, cVar.f154574d);
        e(cVar);
        MethodCollector.o(2706);
    }

    private void c(String str) {
        String c2 = c("PRAGMA journal_mode", null, null);
        if (!c2.equalsIgnoreCase(str)) {
            try {
                if (c("PRAGMA journal_mode=".concat(String.valueOf(str)), null, null).equalsIgnoreCase(str)) {
                    return;
                }
            } catch (SQLiteDatabaseLockedException unused) {
            }
            Log.a(5, "WCDB.SQLiteConnection", "Could not change the database journal mode of '" + this.f154552j.f154634b + "' from '" + c2 + "' to '" + str + "' because the database is locked.  This usually means that there are other open connections to the database which prevents the database from enabling or disabling write-ahead logging mode.  Proceeding without changing the journal mode.");
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:26:0x006b, code lost:
        if (r5 == null) goto L_0x0071;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:28:0x006f, code lost:
        if (r5.f154578h == false) goto L_0x0071;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:29:0x0071, code lost:
        nativeFinalizeStatement(r12.o, r2);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:30:0x0076, code lost:
        com.bytedance.frameworks.apm.trace.MethodCollector.o(2705);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:31:0x0079, code lost:
        throw r4;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private com.tencent.wcdb.database.SQLiteConnection.c d(java.lang.String r13) {
        /*
        // Method dump skipped, instructions count: 122
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.wcdb.database.SQLiteConnection.d(java.lang.String):com.tencent.wcdb.database.SQLiteConnection$c");
    }

    public final void a(com.tencent.wcdb.support.a aVar) {
        MethodCollector.i(2708);
        if (aVar != null) {
            int i2 = this.p - 1;
            this.p = i2;
            if (i2 == 0) {
                aVar.a(null);
                nativeResetCancel(this.o, false);
            }
        }
        MethodCollector.o(2708);
    }

    /* access modifiers changed from: package-private */
    public final boolean b(String str) {
        if (this.f154554l.b(str) != null) {
            return true;
        }
        return false;
    }

    /* access modifiers changed from: package-private */
    public final void a(g gVar) {
        boolean z;
        boolean z2;
        boolean z3;
        boolean z4;
        MethodCollector.i(2688);
        boolean z5 = false;
        this.f154551h = false;
        int size = gVar.f154644l.size();
        for (int i2 = 0; i2 < size; i2++) {
            SQLiteCustomFunction sQLiteCustomFunction = gVar.f154644l.get(i2);
            if (!this.f154552j.f154644l.contains(sQLiteCustomFunction)) {
                nativeRegisterCustomFunction(this.o, sQLiteCustomFunction);
            }
        }
        if (((gVar.f154636d ^ this.f154552j.f154636d) & 536870912) != 0) {
            z = true;
        } else {
            z = false;
        }
        if (gVar.f154639g != this.f154552j.f154639g) {
            z2 = true;
        } else {
            z2 = false;
        }
        boolean z6 = !gVar.f154638f.equals(this.f154552j.f154638f);
        if (gVar.f154640h != this.f154552j.f154640h) {
            z3 = true;
        } else {
            z3 = false;
        }
        if (gVar.f154641i != this.f154552j.f154641i) {
            z4 = true;
        } else {
            z4 = false;
        }
        if (!(gVar.f154642j == this.f154552j.f154642j && gVar.f154643k == this.f154552j.f154643k)) {
            z5 = true;
        }
        this.f154552j.a(gVar);
        d dVar = this.f154554l;
        int i3 = gVar.f154637e;
        if (i3 > 0) {
            synchronized (dVar) {
                try {
                    dVar.f154706b = i3;
                } finally {
                    MethodCollector.o(2688);
                }
            }
            dVar.a(i3);
            if (z2) {
                e();
            }
            if (z) {
                f();
            }
            if (z4) {
                g();
            }
            if (z3) {
                d();
            }
            if (z6) {
                h();
            }
            if (z5) {
                i();
            }
            return;
        }
        IllegalArgumentException illegalArgumentException = new IllegalArgumentException("maxSize <= 0");
        MethodCollector.o(2688);
        throw illegalArgumentException;
    }

    /* access modifiers changed from: package-private */
    public final void a(Thread thread, int i2) {
        this.n = thread;
        this.f154550g = i2;
    }

    private void notifyCheckpoint(String str, int i2) {
        d dVar = this.f154546c;
        dVar.f154600a.get();
        b bVar = dVar.f154603d;
    }

    private void a(c cVar, Object[] objArr) {
        int i2;
        long j2;
        MethodCollector.i(3233);
        if (objArr != null) {
            i2 = objArr.length;
        } else {
            i2 = 0;
        }
        if (i2 != cVar.f154575e) {
            SQLiteBindOrColumnIndexOutOfRangeException sQLiteBindOrColumnIndexOutOfRangeException = new SQLiteBindOrColumnIndexOutOfRangeException("Expected " + cVar.f154575e + " bind arguments but " + i2 + " were provided.");
            MethodCollector.o(3233);
            throw sQLiteBindOrColumnIndexOutOfRangeException;
        } else if (i2 == 0) {
            MethodCollector.o(3233);
        } else {
            long j3 = cVar.f154574d;
            int i3 = 0;
            do {
                Object obj = objArr[i3];
                if (obj == null) {
                    nativeBindNull(this.o, j3, i3 + 1);
                } else if (obj instanceof byte[]) {
                    nativeBindBlob(this.o, j3, i3 + 1, (byte[]) obj);
                } else if ((obj instanceof Float) || (obj instanceof Double)) {
                    nativeBindDouble(this.o, j3, i3 + 1, ((Number) obj).doubleValue());
                } else if ((obj instanceof Long) || (obj instanceof Integer) || (obj instanceof Short) || (obj instanceof Byte)) {
                    nativeBindLong(this.o, j3, i3 + 1, ((Number) obj).longValue());
                } else if (obj instanceof Boolean) {
                    long j4 = this.o;
                    int i4 = i3 + 1;
                    if (((Boolean) obj).booleanValue()) {
                        j2 = 1;
                    } else {
                        j2 = 0;
                    }
                    nativeBindLong(j4, j3, i4, j2);
                } else {
                    nativeBindString(this.o, j3, i3 + 1, obj.toString());
                }
                i3++;
            } while (i3 < i2);
            MethodCollector.o(3233);
        }
    }

    public final long b(String str, Object[] objArr, com.tencent.wcdb.support.a aVar) {
        d dVar;
        MethodCollector.i(2696);
        if (str != null) {
            a a2 = this.f154549f.a("executeForLong", str, objArr);
            int i2 = a2.f154564h;
            try {
                c d2 = d(str);
                a2.f154565i = d2.f154576f;
                try {
                    d(d2);
                    a(d2, objArr);
                    b((com.tencent.wcdb.support.a) null);
                    try {
                        long nativeExecuteForLong = nativeExecuteForLong(this.o, d2.f154574d);
                        a((com.tencent.wcdb.support.a) null);
                        a(d2);
                        this.f154549f.a(i2);
                        MethodCollector.o(2696);
                        return nativeExecuteForLong;
                    } catch (Throwable th) {
                        a((com.tencent.wcdb.support.a) null);
                        MethodCollector.o(2696);
                        throw th;
                    }
                } catch (Throwable th2) {
                    a(d2);
                    MethodCollector.o(2696);
                    throw th2;
                }
            } catch (RuntimeException e2) {
                if (((e2 instanceof SQLiteDatabaseLockedException) || (e2 instanceof SQLiteTableLockedException)) && (dVar = this.f154546c) != null) {
                    dVar.a();
                }
                this.f154549f.a(i2, e2);
                MethodCollector.o(2696);
                throw e2;
            } catch (Throwable th3) {
                this.f154549f.a(i2);
                MethodCollector.o(2696);
                throw th3;
            }
        } else {
            IllegalArgumentException illegalArgumentException = new IllegalArgumentException("sql must not be null.");
            MethodCollector.o(2696);
            throw illegalArgumentException;
        }
    }

    public final long e(String str, Object[] objArr, com.tencent.wcdb.support.a aVar) {
        d dVar;
        MethodCollector.i(2702);
        if (str != null) {
            a a2 = this.f154549f.a("executeForLastInsertedRowId", str, objArr);
            int i2 = a2.f154564h;
            try {
                c d2 = d(str);
                a2.f154565i = d2.f154576f;
                try {
                    d(d2);
                    a(d2, objArr);
                    b((com.tencent.wcdb.support.a) null);
                    try {
                        long nativeExecuteForLastInsertedRowId = nativeExecuteForLastInsertedRowId(this.o, d2.f154574d);
                        a((com.tencent.wcdb.support.a) null);
                        a(d2);
                        this.f154549f.a(i2);
                        MethodCollector.o(2702);
                        return nativeExecuteForLastInsertedRowId;
                    } catch (Throwable th) {
                        a((com.tencent.wcdb.support.a) null);
                        MethodCollector.o(2702);
                        throw th;
                    }
                } catch (Throwable th2) {
                    a(d2);
                    MethodCollector.o(2702);
                    throw th2;
                }
            } catch (RuntimeException e2) {
                if (((e2 instanceof SQLiteDatabaseLockedException) || (e2 instanceof SQLiteTableLockedException)) && (dVar = this.f154546c) != null) {
                    dVar.a();
                }
                this.f154549f.a(i2, e2);
                MethodCollector.o(2702);
                throw e2;
            } catch (Throwable th3) {
                this.f154549f.a(i2);
                MethodCollector.o(2702);
                throw th3;
            }
        } else {
            IllegalArgumentException illegalArgumentException = new IllegalArgumentException("sql must not be null.");
            MethodCollector.o(2702);
            throw illegalArgumentException;
        }
    }

    public final String c(String str, Object[] objArr, com.tencent.wcdb.support.a aVar) {
        d dVar;
        MethodCollector.i(2699);
        if (str != null) {
            a a2 = this.f154549f.a("executeForString", str, objArr);
            int i2 = a2.f154564h;
            try {
                c d2 = d(str);
                a2.f154565i = d2.f154576f;
                try {
                    d(d2);
                    a(d2, objArr);
                    b((com.tencent.wcdb.support.a) null);
                    try {
                        String nativeExecuteForString = nativeExecuteForString(this.o, d2.f154574d);
                        a((com.tencent.wcdb.support.a) null);
                        a(d2);
                        this.f154549f.a(i2);
                        MethodCollector.o(2699);
                        return nativeExecuteForString;
                    } catch (Throwable th) {
                        a((com.tencent.wcdb.support.a) null);
                        MethodCollector.o(2699);
                        throw th;
                    }
                } catch (Throwable th2) {
                    a(d2);
                    MethodCollector.o(2699);
                    throw th2;
                }
            } catch (RuntimeException e2) {
                if (((e2 instanceof SQLiteDatabaseLockedException) || (e2 instanceof SQLiteTableLockedException)) && (dVar = this.f154546c) != null) {
                    dVar.a();
                }
                this.f154549f.a(i2, e2);
                MethodCollector.o(2699);
                throw e2;
            } catch (Throwable th3) {
                this.f154549f.a(i2);
                MethodCollector.o(2699);
                throw th3;
            }
        } else {
            IllegalArgumentException illegalArgumentException = new IllegalArgumentException("sql must not be null.");
            MethodCollector.o(2699);
            throw illegalArgumentException;
        }
    }

    public final int d(String str, Object[] objArr, com.tencent.wcdb.support.a aVar) {
        d dVar;
        MethodCollector.i(2700);
        if (str != null) {
            a a2 = this.f154549f.a("executeForChangedRowCount", str, objArr);
            int i2 = a2.f154564h;
            try {
                c d2 = d(str);
                a2.f154565i = d2.f154576f;
                try {
                    d(d2);
                    a(d2, objArr);
                    b(aVar);
                    try {
                        int nativeExecuteForChangedRowCount = nativeExecuteForChangedRowCount(this.o, d2.f154574d);
                        a(aVar);
                        a(d2);
                        if (this.f154549f.b(i2)) {
                            this.f154549f.a(i2, "changedRows=".concat(String.valueOf(nativeExecuteForChangedRowCount)));
                        }
                        MethodCollector.o(2700);
                        return nativeExecuteForChangedRowCount;
                    } catch (Throwable th) {
                        a(aVar);
                        MethodCollector.o(2700);
                        throw th;
                    }
                } catch (Throwable th2) {
                    a(d2);
                    MethodCollector.o(2700);
                    throw th2;
                }
            } catch (RuntimeException e2) {
                if (((e2 instanceof SQLiteDatabaseLockedException) || (e2 instanceof SQLiteTableLockedException)) && (dVar = this.f154546c) != null) {
                    dVar.a();
                }
                this.f154549f.a(i2, e2);
                MethodCollector.o(2700);
                throw e2;
            } catch (Throwable th3) {
                if (this.f154549f.b(i2)) {
                    this.f154549f.a(i2, "changedRows=".concat(String.valueOf(0)));
                }
                MethodCollector.o(2700);
                throw th3;
            }
        } else {
            IllegalArgumentException illegalArgumentException = new IllegalArgumentException("sql must not be null.");
            MethodCollector.o(2700);
            throw illegalArgumentException;
        }
    }

    private void notifyChange(String str, String str2, long[] jArr, long[] jArr2, long[] jArr3) {
        d dVar = this.f154546c;
        dVar.f154600a.get();
        a aVar = dVar.f154601b;
    }

    private SQLiteConnection(d dVar, g gVar, int i2, boolean z, byte[] bArr, SQLiteCipherSpec sQLiteCipherSpec) {
        SQLiteCipherSpec sQLiteCipherSpec2;
        boolean z2 = false;
        this.q = bArr;
        if (sQLiteCipherSpec == null) {
            sQLiteCipherSpec2 = null;
        } else {
            sQLiteCipherSpec2 = new SQLiteCipherSpec(sQLiteCipherSpec);
        }
        this.r = sQLiteCipherSpec2;
        this.f154546c = dVar;
        g gVar2 = new g(gVar);
        this.f154552j = gVar2;
        this.f154547d = i2;
        this.f154548e = z;
        this.f154553k = (gVar.f154636d & 1) != 0 ? true : z2;
        this.f154554l = new d(gVar2.f154637e);
    }

    static SQLiteConnection a(d dVar, g gVar, int i2, boolean z, byte[] bArr, SQLiteCipherSpec sQLiteCipherSpec) {
        String str;
        int i3;
        MethodCollector.i(2676);
        SQLiteConnection sQLiteConnection = new SQLiteConnection(dVar, gVar, i2, z, bArr, sQLiteCipherSpec);
        try {
            long nativeOpen = sQLiteConnection.nativeOpen(sQLiteConnection.f154552j.f154633a, sQLiteConnection.f154552j.f154636d, sQLiteConnection.f154552j.f154635c);
            sQLiteConnection.o = nativeOpen;
            byte[] bArr2 = sQLiteConnection.q;
            if (bArr2 != null && bArr2.length == 0) {
                sQLiteConnection.q = null;
            }
            byte[] bArr3 = sQLiteConnection.q;
            if (bArr3 != null) {
                nativeSetKey(nativeOpen, bArr3);
                SQLiteCipherSpec sQLiteCipherSpec2 = sQLiteConnection.r;
                if (sQLiteCipherSpec2 != null) {
                    if (sQLiteCipherSpec2.cipher != null) {
                        sQLiteConnection.a("PRAGMA cipher=" + h.a(sQLiteConnection.r.cipher), null, null);
                    }
                    if (sQLiteConnection.r.kdfIteration != 0) {
                        sQLiteConnection.a("PRAGMA kdf_iter=" + sQLiteConnection.r.kdfIteration, null, null);
                    }
                    sQLiteConnection.a("PRAGMA cipher_use_hmac=" + sQLiteConnection.r.hmacEnabled, null, null);
                }
            }
            if (!sQLiteConnection.f154552j.a()) {
                if (sQLiteConnection.q != null) {
                    str = "PRAGMA cipher_page_size";
                    SQLiteCipherSpec sQLiteCipherSpec3 = sQLiteConnection.r;
                    if (sQLiteCipherSpec3 == null || sQLiteCipherSpec3.pageSize <= 0) {
                        i3 = SQLiteGlobal.f154597a;
                    } else {
                        i3 = sQLiteConnection.r.pageSize;
                    }
                } else {
                    str = "PRAGMA page_size";
                    i3 = SQLiteGlobal.f154597a;
                }
                long j2 = (long) i3;
                if (sQLiteConnection.b(str, null, null) != j2) {
                    sQLiteConnection.a(str + "=" + j2, null, null);
                }
            }
            if (sQLiteConnection.f154553k) {
                sQLiteConnection.a("PRAGMA query_only = 1", null, null);
            }
            sQLiteConnection.e();
            sQLiteConnection.f();
            sQLiteConnection.g();
            if (!sQLiteConnection.f154552j.a() && !sQLiteConnection.f154553k && sQLiteConnection.b("PRAGMA journal_size_limit", null, null) != 524288) {
                sQLiteConnection.b("PRAGMA journal_size_limit=524288", null, null);
            }
            sQLiteConnection.d();
            sQLiteConnection.h();
            sQLiteConnection.i();
            int size = sQLiteConnection.f154552j.f154644l.size();
            for (int i4 = 0; i4 < size; i4++) {
                nativeRegisterCustomFunction(sQLiteConnection.o, sQLiteConnection.f154552j.f154644l.get(i4));
            }
            MethodCollector.o(2676);
            return sQLiteConnection;
        } catch (SQLiteException e2) {
            try {
                SQLiteDebug.f154593a = SQLiteDebug.nativeGetLastErrorLine();
                ArrayList<SQLiteDebug.IOTraceStats> arrayList = new ArrayList<>();
                long a2 = sQLiteConnection.a((String) null);
                if (a2 != 0) {
                    SQLiteDebug.nativeGetIOTraceStats(a2, arrayList);
                    sQLiteConnection.a((Exception) null);
                }
                SQLiteDebug.f154594b = arrayList;
            } catch (RuntimeException e3) {
                Log.a(6, "WCDB.SQLiteDebug", "Cannot collect I/O trace statistics: " + e3.getMessage());
            }
            sQLiteConnection.c();
            MethodCollector.o(2676);
            throw e2;
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:72:0x00fc  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final int a(java.lang.String r29, java.lang.Object[] r30, com.tencent.wcdb.CursorWindow r31, int r32, int r33, boolean r34, com.tencent.wcdb.support.a r35) {
        /*
        // Method dump skipped, instructions count: 336
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.wcdb.database.SQLiteConnection.a(java.lang.String, java.lang.Object[], com.tencent.wcdb.CursorWindow, int, int, boolean, com.tencent.wcdb.support.a):int");
    }
}
