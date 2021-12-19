package com.tencent.wcdb.database;

import com.bytedance.covode.number.Covode;
import com.tencent.wcdb.database.SQLiteConnection;
import com.tencent.wcdb.database.SQLiteDebug;
import com.tencent.wcdb.h;
import com.tencent.wcdb.support.Log;
import com.tencent.wcdb.support.a;
import java.util.ArrayList;
import java.util.Arrays;

public abstract class j extends c {

    /* renamed from: f  reason: collision with root package name */
    private static final String[] f154664f = new String[0];

    /* renamed from: a  reason: collision with root package name */
    public final SQLiteDatabase f154665a;

    /* renamed from: b  reason: collision with root package name */
    public final String f154666b;

    /* renamed from: c  reason: collision with root package name */
    public final String[] f154667c;

    /* renamed from: d  reason: collision with root package name */
    public final Object[] f154668d;

    /* renamed from: e  reason: collision with root package name */
    protected SQLiteConnection.c f154669e;

    /* renamed from: g  reason: collision with root package name */
    private final boolean f154670g;

    /* renamed from: h  reason: collision with root package name */
    private final int f154671h;

    /* renamed from: i  reason: collision with root package name */
    private l f154672i;

    /* access modifiers changed from: protected */
    public final l a() {
        return this.f154665a.b();
    }

    /* access modifiers changed from: protected */
    public final int b() {
        return SQLiteDatabase.a(this.f154670g);
    }

    /* access modifiers changed from: protected */
    @Override // com.tencent.wcdb.database.c
    public void c() {
        g();
        f();
    }

    static {
        Covode.recordClassIndex(103061);
    }

    public final void f() {
        Object[] objArr = this.f154668d;
        if (objArr != null) {
            Arrays.fill(objArr, (Object) null);
        }
    }

    /* access modifiers changed from: protected */
    @Override // java.lang.Object
    public void finalize() {
        synchronized (this) {
            if (this.f154672i != null || this.f154669e != null) {
                throw new SQLiteMisuseException("Acquired prepared statement is not released.");
            }
        }
        super.finalize();
    }

    private synchronized void g() {
        l lVar = this.f154672i;
        if (lVar == null) {
            if (this.f154669e == null) {
                return;
            }
        } else if (this.f154669e != null) {
            if (lVar == this.f154665a.b()) {
                l lVar2 = this.f154672i;
                SQLiteConnection.c cVar = this.f154669e;
                if (lVar2.f154675a != null) {
                    lVar2.f154675a.a(cVar);
                    lVar2.b();
                }
                this.f154669e = null;
                this.f154672i = null;
                return;
            }
            throw new IllegalStateException("SQLiteProgram has bound to another thread.");
        }
        throw new IllegalStateException("Internal state error.");
    }

    /* access modifiers changed from: protected */
    public final void a(SQLiteException sQLiteException) {
        if ((sQLiteException instanceof SQLiteDatabaseCorruptException) || ((sQLiteException instanceof SQLiteFullException) && this.f154670g)) {
            SQLiteDatabase sQLiteDatabase = this.f154665a;
            try {
                SQLiteDebug.f154593a = SQLiteDebug.nativeGetLastErrorLine();
                ArrayList<SQLiteDebug.IOTraceStats> arrayList = new ArrayList<>();
                long a2 = sQLiteDatabase.a("collectIoStat", false);
                if (a2 != 0) {
                    SQLiteDebug.nativeGetIOTraceStats(a2, arrayList);
                }
                sQLiteDatabase.r();
                SQLiteDebug.f154594b = arrayList;
            } catch (RuntimeException e2) {
                Log.a(6, "WCDB.SQLiteDebug", "Cannot collect I/O trace statistics: " + e2.getMessage());
            }
            this.f154665a.a();
        }
    }

    public final void a(int i2, Object obj) {
        if (i2 <= 0 || i2 > this.f154671h) {
            throw new IllegalArgumentException("Cannot bind argument at index " + i2 + " because the index is out of range.  The statement has " + this.f154671h + " parameters.");
        }
        this.f154668d[i2 - 1] = obj;
    }

    /* JADX INFO: finally extract failed */
    protected j(SQLiteDatabase sQLiteDatabase, String str, Object[] objArr, a aVar) {
        this.f154665a = sQLiteDatabase;
        String trim = str.trim();
        this.f154666b = trim;
        int b2 = h.b(trim);
        if (b2 == 4 || b2 == 5 || b2 == 6) {
            this.f154670g = false;
            this.f154667c = f154664f;
            this.f154671h = 0;
        } else {
            boolean z = b2 != 1 ? false : true;
            n nVar = new n();
            l b3 = sQLiteDatabase.b();
            int a2 = SQLiteDatabase.a(z);
            if (trim != null) {
                if (aVar != null) {
                    aVar.a();
                }
                b3.a(trim, a2, aVar);
                try {
                    b3.f154675a.a(trim, nVar);
                    b3.b();
                    this.f154670g = nVar.f154688c;
                    this.f154667c = nVar.f154687b;
                    this.f154671h = nVar.f154686a;
                } catch (Throwable th) {
                    b3.b();
                    throw th;
                }
            } else {
                throw new IllegalArgumentException("sql must not be null.");
            }
        }
        if (objArr == null || objArr.length <= this.f154671h) {
            int i2 = this.f154671h;
            if (i2 != 0) {
                Object[] objArr2 = new Object[i2];
                this.f154668d = objArr2;
                if (objArr != null) {
                    System.arraycopy(objArr, 0, objArr2, 0, objArr.length);
                }
            } else {
                this.f154668d = null;
            }
            this.f154669e = null;
            this.f154672i = null;
            return;
        }
        throw new IllegalArgumentException("Too many bind arguments.  " + objArr.length + " arguments were provided but the statement needs " + this.f154671h + " arguments.");
    }
}
