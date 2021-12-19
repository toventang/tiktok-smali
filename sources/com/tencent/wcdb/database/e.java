package com.tencent.wcdb.database;

import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.tencent.wcdb.b;
import com.tencent.wcdb.d;
import com.tencent.wcdb.database.SQLiteDatabase;
import com.tencent.wcdb.h;
import com.tencent.wcdb.support.Log;
import com.tencent.wcdb.support.a;
import java.util.HashMap;
import java.util.Map;

public final class e extends b {

    /* renamed from: j  reason: collision with root package name */
    public static final SQLiteDatabase.a f154629j = new SQLiteDatabase.a() {
        /* class com.tencent.wcdb.database.e.AnonymousClass1 */

        static {
            Covode.recordClassIndex(103056);
        }

        @Override // com.tencent.wcdb.database.SQLiteDatabase.a
        public final d a(f fVar, String str, j jVar) {
            return new e(fVar, str, (k) jVar);
        }

        @Override // com.tencent.wcdb.database.SQLiteDatabase.a
        public final j a(SQLiteDatabase sQLiteDatabase, String str, Object[] objArr, a aVar) {
            return new k(sQLiteDatabase, str, objArr, aVar);
        }
    };

    /* renamed from: k  reason: collision with root package name */
    private final String f154630k;

    /* renamed from: l  reason: collision with root package name */
    private final String[] f154631l;

    /* renamed from: m  reason: collision with root package name */
    private final k f154632m;
    private final f n;
    private int o = -1;
    private int p;
    private Map<String, Integer> q;
    private final Throwable r;

    @Override // com.tencent.wcdb.a
    public final void deactivate() {
        super.deactivate();
    }

    @Override // com.tencent.wcdb.a
    public final String[] getColumnNames() {
        return this.f154631l;
    }

    static {
        Covode.recordClassIndex(103055);
    }

    @Override // java.lang.Object, com.tencent.wcdb.a
    public final void finalize() {
        try {
            if (this.f154541i != null) {
                close();
            }
        } finally {
            super.finalize();
        }
    }

    @Override // com.tencent.wcdb.d, com.tencent.wcdb.a
    public final int getCount() {
        if (this.o == -1) {
            b(0);
        }
        return this.o;
    }

    @Override // java.io.Closeable, com.tencent.wcdb.d, java.lang.AutoCloseable, com.tencent.wcdb.a
    public final void close() {
        MethodCollector.i(1608);
        super.close();
        synchronized (this) {
            try {
                this.f154632m.close();
            } finally {
                MethodCollector.o(1608);
            }
        }
    }

    @Override // com.tencent.wcdb.a
    public final boolean requery() {
        MethodCollector.i(1695);
        if (isClosed()) {
            MethodCollector.o(1695);
            return false;
        }
        synchronized (this) {
            try {
                if (!((j) this.f154632m).f154665a.m()) {
                    return false;
                }
                if (this.f154541i != null) {
                    this.f154541i.a();
                }
                this.f154528b = -1;
                this.o = -1;
                try {
                    boolean requery = super.requery();
                    MethodCollector.o(1695);
                    return requery;
                } catch (IllegalStateException e2) {
                    Log.a(5, "WCDB.SQLiteCursor", com.a.a("requery() failed " + e2.getMessage(), new Object[]{e2}));
                    MethodCollector.o(1695);
                    return false;
                }
            } finally {
                MethodCollector.o(1695);
            }
        }
    }

    @Override // com.tencent.wcdb.a
    public final boolean a(int i2) {
        if (this.f154541i != null && i2 >= this.f154541i.f154525b && i2 < this.f154541i.f154525b + this.f154541i.b()) {
            return true;
        }
        b(i2);
        return true;
    }

    private void b(int i2) {
        a(((j) this.f154632m).f154665a.n());
        try {
            if (this.o == -1) {
                this.o = this.f154632m.a(this.f154541i, h.a(i2, 0), i2, true);
                this.p = this.f154541i.b();
                return;
            }
            this.f154632m.a(this.f154541i, h.a(i2, this.p), i2, false);
        } catch (RuntimeException e2) {
            c();
            throw e2;
        }
    }

    @Override // com.tencent.wcdb.d, com.tencent.wcdb.a
    public final int getColumnIndex(String str) {
        if (this.q == null) {
            String[] strArr = this.f154631l;
            int length = strArr.length;
            HashMap hashMap = new HashMap(length, 1.0f);
            for (int i2 = 0; i2 < length; i2++) {
                hashMap.put(strArr[i2], Integer.valueOf(i2));
            }
            this.q = hashMap;
        }
        int lastIndexOf = str.lastIndexOf(46);
        if (lastIndexOf != -1) {
            Exception exc = new Exception();
            Log.a("WCDB.SQLiteCursor", "requesting column name with table name -- ".concat(String.valueOf(str)), exc);
            str = str.substring(lastIndexOf + 1);
        }
        Integer num = this.q.get(str);
        if (num != null) {
            return num.intValue();
        }
        return -1;
    }

    public e(f fVar, String str, k kVar) {
        if (kVar != null) {
            this.r = null;
            this.n = fVar;
            this.f154630k = str;
            this.q = null;
            this.f154632m = kVar;
            String[] strArr = kVar.f154667c;
            this.f154631l = strArr;
            this.f154529c = h.a(strArr);
            return;
        }
        throw new IllegalArgumentException("query object cannot be null");
    }
}
