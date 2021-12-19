package com.tencent.wcdb.database;

import android.os.SystemClock;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.tencent.wcdb.support.Log;
import java.io.Closeable;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Map;
import java.util.WeakHashMap;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.locks.LockSupport;

public final class d implements Closeable {

    /* renamed from: m  reason: collision with root package name */
    static final /* synthetic */ boolean f154599m = true;

    /* renamed from: a  reason: collision with root package name */
    final WeakReference<SQLiteDatabase> f154600a;

    /* renamed from: b  reason: collision with root package name */
    public volatile a f154601b;

    /* renamed from: c  reason: collision with root package name */
    public volatile o f154602c;

    /* renamed from: d  reason: collision with root package name */
    public volatile b f154603d;

    /* renamed from: e  reason: collision with root package name */
    byte[] f154604e;

    /* renamed from: f  reason: collision with root package name */
    SQLiteCipherSpec f154605f;

    /* renamed from: g  reason: collision with root package name */
    public final Object f154606g = new Object();

    /* renamed from: h  reason: collision with root package name */
    final AtomicBoolean f154607h = new AtomicBoolean();

    /* renamed from: i  reason: collision with root package name */
    final g f154608i;

    /* renamed from: j  reason: collision with root package name */
    boolean f154609j;

    /* renamed from: k  reason: collision with root package name */
    b f154610k;

    /* renamed from: l  reason: collision with root package name */
    SQLiteConnection f154611l;
    private int n;
    private int o;
    private b p;
    private final ArrayList<SQLiteConnection> q = new ArrayList<>();
    private final WeakHashMap<SQLiteConnection, a> r = new WeakHashMap<>();

    /* access modifiers changed from: package-private */
    public static final class b {

        /* renamed from: a  reason: collision with root package name */
        public b f154619a;

        /* renamed from: b  reason: collision with root package name */
        public Thread f154620b;

        /* renamed from: c  reason: collision with root package name */
        public long f154621c;

        /* renamed from: d  reason: collision with root package name */
        public int f154622d;

        /* renamed from: e  reason: collision with root package name */
        public boolean f154623e;

        /* renamed from: f  reason: collision with root package name */
        public String f154624f;

        /* renamed from: g  reason: collision with root package name */
        public int f154625g;

        /* renamed from: h  reason: collision with root package name */
        public SQLiteConnection f154626h;

        /* renamed from: i  reason: collision with root package name */
        public RuntimeException f154627i;

        /* renamed from: j  reason: collision with root package name */
        public int f154628j;

        static {
            Covode.recordClassIndex(103054);
        }

        private b() {
        }

        /* synthetic */ b(byte b2) {
            this();
        }
    }

    public final void a(g gVar) {
        boolean z;
        String str;
        String str2;
        MethodCollector.i(1935);
        if (gVar != null) {
            synchronized (this.f154606g) {
                try {
                    h();
                    if (((gVar.f154636d ^ this.f154608i.f154636d) & 536870912) != 0) {
                        z = true;
                        if (this.r.isEmpty()) {
                            e();
                        } else {
                            IllegalStateException illegalStateException = new IllegalStateException("Write Ahead Logging (WAL) mode cannot be enabled or disabled while there are transactions in progress.  Finish all transactions and release all active database connections first.");
                            MethodCollector.o(1935);
                            throw illegalStateException;
                        }
                    } else {
                        z = false;
                    }
                    if (gVar.f154639g == this.f154608i.f154639g || this.r.isEmpty()) {
                        if (((this.f154608i.f154636d ^ gVar.f154636d) & 268435473) != 0 || ((str = this.f154608i.f154635c) != (str2 = gVar.f154635c) && (str == null || !str.equals(str2)))) {
                            if (z) {
                                d();
                            }
                            SQLiteConnection a2 = a(gVar, true);
                            d();
                            a(a.DISCARD);
                            this.f154611l = a2;
                            this.f154608i.a(gVar);
                            b(0);
                        } else {
                            this.f154608i.a(gVar);
                            b(0);
                            f();
                            g();
                        }
                        b();
                    } else {
                        IllegalStateException illegalStateException2 = new IllegalStateException("Foreign Key Constraints cannot be enabled or disabled while there are transactions in progress.  Finish all transactions and release all active database connections first.");
                        MethodCollector.o(1935);
                        throw illegalStateException2;
                    }
                } finally {
                    MethodCollector.o(1935);
                }
            }
            return;
        }
        IllegalArgumentException illegalArgumentException = new IllegalArgumentException("configuration must not be null.");
        MethodCollector.o(1935);
        throw illegalArgumentException;
    }

    public final SQLiteConnection a(String str, int i2, com.tencent.wcdb.support.a aVar) {
        SystemClock.uptimeMillis();
        SQLiteConnection b2 = b(str, i2, aVar);
        if (this.f154602c != null) {
            SystemClock.uptimeMillis();
            this.f154600a.get();
        }
        return b2;
    }

    public final void a(SQLiteConnection sQLiteConnection) {
        MethodCollector.i(1939);
        synchronized (this.f154606g) {
            try {
                a remove = this.r.remove(sQLiteConnection);
                if (remove == null) {
                    IllegalStateException illegalStateException = new IllegalStateException("Cannot perform this operation because the specified connection was not acquired from this pool or has already been released.");
                    MethodCollector.o(1939);
                    throw illegalStateException;
                } else if (!this.f154609j) {
                    b(sQLiteConnection);
                } else if (sQLiteConnection.f154548e) {
                    if (a(sQLiteConnection, remove)) {
                        if (f154599m || this.f154611l == null) {
                            this.f154611l = sQLiteConnection;
                        } else {
                            AssertionError assertionError = new AssertionError();
                            MethodCollector.o(1939);
                            throw assertionError;
                        }
                    }
                    b();
                } else if (this.q.size() >= this.n - 1) {
                    b(sQLiteConnection);
                } else {
                    if (a(sQLiteConnection, remove)) {
                        this.q.add(sQLiteConnection);
                    }
                    b();
                }
            } finally {
                MethodCollector.o(1939);
            }
        }
    }

    private boolean a(SQLiteConnection sQLiteConnection, a aVar) {
        if (aVar == a.RECONFIGURE) {
            try {
                sQLiteConnection.a(this.f154608i);
            } catch (RuntimeException e2) {
                Log.a("WCDB.SQLiteConnectionPool", "Failed to reconfigure released connection, closing it: ".concat(String.valueOf(sQLiteConnection)), e2);
                aVar = a.DISCARD;
            }
        }
        if (aVar != a.DISCARD) {
            return true;
        }
        b(sQLiteConnection);
        return false;
    }

    public final void a() {
        MethodCollector.i(1957);
        synchronized (this.f154606g) {
            try {
                a(0, 0);
            } finally {
                MethodCollector.o(1957);
            }
        }
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        a(false);
    }

    static {
        Covode.recordClassIndex(103051);
    }

    private void d() {
        e();
        SQLiteConnection sQLiteConnection = this.f154611l;
        if (sQLiteConnection != null) {
            b(sQLiteConnection);
            this.f154611l = null;
        }
    }

    private void h() {
        if (!this.f154609j) {
            throw new IllegalStateException("Cannot perform this operation because the connection pool has been closed.");
        }
    }

    /* access modifiers changed from: package-private */
    public final void c() {
        this.f154600a.get();
        o oVar = this.f154602c;
    }

    /* access modifiers changed from: protected */
    @Override // java.lang.Object
    public final void finalize() {
        try {
            a(true);
        } finally {
            super.finalize();
        }
    }

    private void e() {
        int size = this.q.size();
        for (int i2 = 0; i2 < size; i2++) {
            b(this.q.get(i2));
        }
        this.q.clear();
    }

    private void f() {
        int size = this.q.size();
        while (true) {
            int i2 = size - 1;
            if (size > this.n - 1) {
                b(this.q.remove(i2));
                size = i2;
            } else {
                return;
            }
        }
    }

    public final String toString() {
        return "SQLiteConnectionPool: " + this.f154608i.f154633a;
    }

    /* access modifiers changed from: package-private */
    public enum a {
        NORMAL,
        RECONFIGURE,
        DISCARD;

        static {
            Covode.recordClassIndex(103053);
        }
    }

    private void g() {
        SQLiteConnection sQLiteConnection = this.f154611l;
        if (sQLiteConnection != null) {
            try {
                sQLiteConnection.a(this.f154608i);
            } catch (RuntimeException e2) {
                Log.a("WCDB.SQLiteConnectionPool", "Failed to reconfigure available primary connection, closing it: " + this.f154611l, e2);
                b(this.f154611l);
                this.f154611l = null;
            }
        }
        int size = this.q.size();
        int i2 = 0;
        while (i2 < size) {
            SQLiteConnection sQLiteConnection2 = this.q.get(i2);
            try {
                sQLiteConnection2.a(this.f154608i);
            } catch (RuntimeException e3) {
                Log.a("WCDB.SQLiteConnectionPool", "Failed to reconfigure available non-primary connection, closing it: ".concat(String.valueOf(sQLiteConnection2)), e3);
                b(sQLiteConnection2);
                this.q.remove(i2);
                size--;
                i2--;
            }
            i2++;
        }
        a(a.RECONFIGURE);
    }

    /* access modifiers changed from: package-private */
    public final void b() {
        SQLiteConnection sQLiteConnection;
        b bVar = this.f154610k;
        b bVar2 = null;
        boolean z = false;
        boolean z2 = false;
        while (bVar != null) {
            boolean z3 = true;
            if (this.f154609j) {
                try {
                    if (!bVar.f154623e && !z) {
                        sQLiteConnection = a(bVar.f154624f, bVar.f154625g);
                        if (sQLiteConnection == null) {
                            z = true;
                        }
                        bVar.f154626h = sQLiteConnection;
                    }
                    if (!z2) {
                        sQLiteConnection = a(bVar.f154625g);
                        if (sQLiteConnection == null) {
                            z2 = true;
                        }
                        bVar.f154626h = sQLiteConnection;
                    }
                    if (!z || !z2) {
                        z3 = false;
                    } else {
                        return;
                    }
                } catch (RuntimeException e2) {
                    bVar.f154627i = e2;
                }
            }
            b bVar3 = bVar.f154619a;
            if (z3) {
                if (bVar2 != null) {
                    bVar2.f154619a = bVar3;
                } else {
                    this.f154610k = bVar3;
                }
                bVar.f154619a = null;
                LockSupport.unpark(bVar.f154620b);
            } else {
                bVar2 = bVar;
            }
            bVar = bVar3;
        }
    }

    private SQLiteConnection a(int i2) {
        SQLiteConnection sQLiteConnection = this.f154611l;
        if (sQLiteConnection != null) {
            this.f154611l = null;
            a(sQLiteConnection, i2);
            return sQLiteConnection;
        }
        for (SQLiteConnection sQLiteConnection2 : this.r.keySet()) {
            if (sQLiteConnection2.f154548e) {
                return null;
            }
        }
        SQLiteConnection a2 = a(this.f154608i, true);
        a(a2, i2);
        return a2;
    }

    private void b(int i2) {
        if (i2 <= 0) {
            if ((this.f154608i.f154636d & 536870912) != 0) {
                i2 = 4;
            } else {
                i2 = 1;
            }
        }
        this.n = i2;
        Log.b("WCDB.SQLiteConnectionPool", "Max connection pool size is %d.", Integer.valueOf(i2));
    }

    private static void b(SQLiteConnection sQLiteConnection) {
        try {
            sQLiteConnection.a();
        } catch (RuntimeException e2) {
            Log.a(6, "WCDB.SQLiteConnectionPool", "Failed to close connection, its fate is now in the hands of the merciful GC: " + sQLiteConnection + e2.getMessage());
        }
    }

    /* JADX DEBUG: Multi-variable search result rejected for r1v0, resolved type: java.util.WeakHashMap<com.tencent.wcdb.database.SQLiteConnection, com.tencent.wcdb.database.d$a> */
    /* JADX WARN: Multi-variable type inference failed */
    private void a(a aVar) {
        if (!this.r.isEmpty()) {
            ArrayList arrayList = new ArrayList(this.r.size());
            for (Map.Entry<SQLiteConnection, a> entry : this.r.entrySet()) {
                a value = entry.getValue();
                if (!(aVar == value || value == a.DISCARD)) {
                    arrayList.add(entry.getKey());
                }
            }
            int size = arrayList.size();
            for (int i2 = 0; i2 < size; i2++) {
                this.r.put(arrayList.get(i2), aVar);
            }
        }
    }

    private void a(boolean z) {
        MethodCollector.i(1922);
        if (!z) {
            synchronized (this.f154606g) {
                try {
                    h();
                    this.f154609j = false;
                    d();
                    int size = this.r.size();
                    if (size != 0) {
                        Log.a(4, "WCDB.SQLiteConnectionPool", "The connection pool for " + this.f154608i.f154634b + " has been closed but there are still " + size + " connections in use.  They will be closed as they are released back to the pool.");
                    }
                    b();
                } finally {
                    MethodCollector.o(1922);
                }
            }
            return;
        }
        MethodCollector.o(1922);
    }

    /* access modifiers changed from: package-private */
    public final SQLiteConnection a(g gVar, boolean z) {
        int i2 = this.o;
        this.o = i2 + 1;
        return SQLiteConnection.a(this, gVar, i2, z, this.f154604e, this.f154605f);
    }

    private SQLiteConnection a(String str, int i2) {
        int size = this.q.size();
        if (size > 1 && str != null) {
            for (int i3 = 0; i3 < size; i3++) {
                SQLiteConnection sQLiteConnection = this.q.get(i3);
                if (sQLiteConnection.b(str)) {
                    this.q.remove(i3);
                    a(sQLiteConnection, i2);
                    return sQLiteConnection;
                }
            }
        }
        if (size > 0) {
            SQLiteConnection remove = this.q.remove(size - 1);
            a(remove, i2);
            return remove;
        }
        int size2 = this.r.size();
        if (this.f154611l != null) {
            size2++;
        }
        if (size2 >= this.n) {
            return null;
        }
        SQLiteConnection a2 = a(this.f154608i, false);
        a(a2, i2);
        return a2;
    }

    private void a(SQLiteConnection sQLiteConnection, int i2) {
        boolean z;
        if ((i2 & 1) != 0) {
            z = true;
        } else {
            z = false;
        }
        try {
            sQLiteConnection.f154551h = z;
            this.r.put(sQLiteConnection, a.NORMAL);
        } catch (RuntimeException e2) {
            Log.a(6, "WCDB.SQLiteConnectionPool", "Failed to prepare acquired connection for session, closing it: " + sQLiteConnection + ", connectionFlags=" + i2);
            b(sQLiteConnection);
            throw e2;
        }
    }

    private void a(long j2, int i2) {
        int i3;
        StringBuilder sb = new StringBuilder();
        if (j2 != 0) {
            Thread currentThread = Thread.currentThread();
            sb.append("The connection pool for database '").append(this.f154608i.f154634b);
            sb.append("' has been unable to grant a connection to thread ");
            sb.append(currentThread.getId()).append(" (").append(currentThread.getName()).append(") ");
            sb.append("with flags 0x").append(Integer.toHexString(i2));
            sb.append(" for ").append(((float) j2) * 0.001f).append(" seconds.\n");
        }
        ArrayList arrayList = new ArrayList();
        int i4 = 0;
        if (!this.r.isEmpty()) {
            i3 = 0;
            for (SQLiteConnection sQLiteConnection : this.r.keySet()) {
                String a2 = sQLiteConnection.f154549f.a();
                if (a2 != null) {
                    arrayList.add(a2);
                    i4++;
                } else {
                    i3++;
                }
            }
        } else {
            i3 = 0;
        }
        int size = this.q.size();
        if (this.f154611l != null) {
            size++;
        }
        sb.append("Connections: ").append(i4).append(" active, ");
        sb.append(i3).append(" idle, ");
        sb.append(size).append(" available.\n");
        if (!arrayList.isEmpty()) {
            sb.append("\nRequests in progress:\n");
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                sb.append("  ").append((String) it.next()).append("\n");
            }
        }
        Log.a(5, "WCDB.SQLiteConnectionPool", sb.toString());
        if (this.f154600a.get() != null) {
            o oVar = this.f154602c;
        }
    }

    d(SQLiteDatabase sQLiteDatabase, g gVar, int i2) {
        this.f154600a = new WeakReference<>(sQLiteDatabase);
        this.f154608i = new g(gVar);
        b(i2);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:38:0x007e, code lost:
        if (r20 == null) goto L_0x0088;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:39:0x0080, code lost:
        r20.a(new com.tencent.wcdb.database.d.AnonymousClass1(r17));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:41:?, code lost:
        r0 = r5.f154621c + 3000;
        r12 = 3000;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:43:0x0095, code lost:
        if (r17.f154607h.compareAndSet(true, false) == false) goto L_0x009e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:44:0x0097, code lost:
        r2 = r17.f154606g;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:45:0x0099, code lost:
        monitor-enter(r2);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:47:?, code lost:
        b();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:48:0x009d, code lost:
        monitor-exit(r2);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:49:0x009e, code lost:
        java.util.concurrent.locks.LockSupport.parkNanos(r12 * 1000000);
        java.lang.Thread.interrupted();
        r4 = r17.f154606g;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:50:0x00aa, code lost:
        monitor-enter(r4);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:52:?, code lost:
        h();
        r3 = r5.f154626h;
        r2 = r5.f154627i;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:53:0x00b2, code lost:
        if (r3 != null) goto L_0x00d4;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:54:0x00b4, code lost:
        if (r2 == null) goto L_0x00b7;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:56:0x00b7, code lost:
        r12 = android.os.SystemClock.uptimeMillis();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:57:0x00bd, code lost:
        if (r12 >= r0) goto L_0x00c1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:58:0x00bf, code lost:
        r12 = r12 - r0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:59:0x00c1, code lost:
        a(r12 - r5.f154621c, r19);
        r0 = r12 + 3000;
        r12 = 3000;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:60:0x00cc, code lost:
        monitor-exit(r4);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:62:0x00ce, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:64:0x00d0, code lost:
        com.bytedance.frameworks.apm.trace.MethodCollector.o(1956);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:65:0x00d3, code lost:
        throw r0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:66:0x00d4, code lost:
        r5.f154619a = r17.p;
        r5.f154620b = null;
        r5.f154624f = null;
        r5.f154626h = null;
        r5.f154627i = null;
        r5.f154628j++;
        r17.p = r5;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:67:0x00e7, code lost:
        if (r3 == null) goto L_0x00f3;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:68:0x00e9, code lost:
        monitor-exit(r4);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:72:0x00f2, code lost:
        return r3;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:73:0x00f3, code lost:
        com.bytedance.frameworks.apm.trace.MethodCollector.o(1956);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:74:0x00f6, code lost:
        throw r2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:75:0x00f7, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:77:0x00f9, code lost:
        com.bytedance.frameworks.apm.trace.MethodCollector.o(1956);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:78:0x00fc, code lost:
        throw r0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:79:0x00fd, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:80:0x00fe, code lost:
        if (r20 != null) goto L_0x0100;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:81:0x0100, code lost:
        r20.a(null);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:82:0x0103, code lost:
        com.bytedance.frameworks.apm.trace.MethodCollector.o(1956);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:83:0x0106, code lost:
        throw r0;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private com.tencent.wcdb.database.SQLiteConnection b(java.lang.String r18, int r19, com.tencent.wcdb.support.a r20) {
        /*
        // Method dump skipped, instructions count: 269
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.wcdb.database.d.b(java.lang.String, int, com.tencent.wcdb.support.a):com.tencent.wcdb.database.SQLiteConnection");
    }
}
