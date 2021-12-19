package com.tencent.wcdb.database;

import android.database.sqlite.SQLiteTransactionListener;
import android.os.Process;
import com.bytedance.covode.number.Covode;
import com.tencent.wcdb.CursorWindow;
import com.tencent.wcdb.h;

public final class l {

    /* renamed from: c  reason: collision with root package name */
    static final /* synthetic */ boolean f154674c = true;

    /* renamed from: a  reason: collision with root package name */
    SQLiteConnection f154675a;

    /* renamed from: b  reason: collision with root package name */
    a f154676b;

    /* renamed from: d  reason: collision with root package name */
    private final d f154677d;

    /* renamed from: e  reason: collision with root package name */
    private int f154678e;

    /* renamed from: f  reason: collision with root package name */
    private int f154679f;

    /* renamed from: g  reason: collision with root package name */
    private a f154680g;

    /* access modifiers changed from: package-private */
    public static final class a {

        /* renamed from: a  reason: collision with root package name */
        public a f154681a;

        /* renamed from: b  reason: collision with root package name */
        public int f154682b;

        /* renamed from: c  reason: collision with root package name */
        public SQLiteTransactionListener f154683c;

        /* renamed from: d  reason: collision with root package name */
        public boolean f154684d;

        /* renamed from: e  reason: collision with root package name */
        public boolean f154685e;

        static {
            Covode.recordClassIndex(103064);
        }

        private a() {
        }

        /* synthetic */ a(byte b2) {
            this();
        }
    }

    public final void a(com.tencent.wcdb.support.a aVar) {
        d();
        if (f154674c || this.f154675a != null) {
            b(aVar);
            return;
        }
        throw new AssertionError();
    }

    /* access modifiers changed from: package-private */
    public final void a(String str, int i2, com.tencent.wcdb.support.a aVar) {
        if (this.f154675a == null) {
            SQLiteConnection a2 = this.f154677d.a(str, i2, aVar);
            this.f154675a = a2;
            this.f154678e = i2;
            a2.a(Thread.currentThread(), Process.myTid());
        }
        this.f154679f++;
    }

    static {
        Covode.recordClassIndex(103063);
    }

    private void d() {
        if (this.f154676b == null) {
            throw new IllegalStateException("Cannot perform this operation because there is no current transaction.");
        }
    }

    public final void c() {
        SQLiteConnection sQLiteConnection = this.f154675a;
        if (sQLiteConnection != null) {
            sQLiteConnection.a((Exception) null);
        }
        b();
    }

    private void e() {
        a aVar = this.f154676b;
        if (aVar != null && aVar.f154684d) {
            throw new IllegalStateException("Cannot perform this operation because the transaction has already been marked successful.  The only thing you can do now is call endTransaction().");
        }
    }

    /* access modifiers changed from: package-private */
    public final void b() {
        int i2 = this.f154679f - 1;
        this.f154679f = i2;
        if (i2 == 0) {
            try {
                this.f154675a.a((Thread) null, 0);
                this.f154677d.a(this.f154675a);
            } finally {
                this.f154675a = null;
            }
        }
    }

    public final void a() {
        d();
        e();
        this.f154676b.f154684d = true;
    }

    /* access modifiers changed from: package-private */
    public final SQLiteConnection a(int i2) {
        a((String) null, i2, (com.tencent.wcdb.support.a) null);
        return this.f154675a;
    }

    public l(d dVar) {
        if (dVar != null) {
            this.f154677d = dVar;
            return;
        }
        throw new IllegalArgumentException("connectionPool must not be null");
    }

    private void a(a aVar) {
        aVar.f154681a = this.f154680g;
        aVar.f154683c = null;
        this.f154680g = aVar;
    }

    private void b(com.tencent.wcdb.support.a aVar) {
        boolean z;
        RuntimeException e2;
        if (aVar != null) {
            aVar.a();
        }
        a aVar2 = this.f154676b;
        boolean z2 = false;
        if (!aVar2.f154684d || aVar2.f154685e) {
            z = false;
        } else {
            z = true;
        }
        SQLiteTransactionListener sQLiteTransactionListener = aVar2.f154683c;
        if (sQLiteTransactionListener != null) {
            if (z) {
                try {
                    sQLiteTransactionListener.onCommit();
                } catch (RuntimeException e3) {
                    e2 = e3;
                }
            } else {
                sQLiteTransactionListener.onRollback();
            }
        }
        z2 = z;
        e2 = null;
        this.f154676b = aVar2.f154681a;
        a(aVar2);
        a aVar3 = this.f154676b;
        if (aVar3 == null) {
            if (z2) {
                try {
                    this.f154675a.a("COMMIT;", null, aVar);
                } catch (Throwable th) {
                    b();
                    throw th;
                }
            } else {
                this.f154675a.a("ROLLBACK;", null, aVar);
            }
            b();
        } else if (!z2) {
            aVar3.f154685e = true;
        }
        if (e2 != null) {
            throw e2;
        }
    }

    private a a(int i2, SQLiteTransactionListener sQLiteTransactionListener) {
        a aVar = this.f154680g;
        if (aVar != null) {
            this.f154680g = aVar.f154681a;
            aVar.f154681a = null;
            aVar.f154684d = false;
            aVar.f154685e = false;
        } else {
            aVar = new a((byte) 0);
        }
        aVar.f154682b = i2;
        aVar.f154683c = sQLiteTransactionListener;
        return aVar;
    }

    private boolean b(String str, int i2, com.tencent.wcdb.support.a aVar) {
        if (aVar != null) {
            aVar.a();
        }
        int b2 = h.b(str);
        if (b2 == 4) {
            a(2, i2, aVar);
            return true;
        } else if (b2 == 5) {
            a();
            a(aVar);
            return true;
        } else if (b2 != 6) {
            return false;
        } else {
            a(aVar);
            return true;
        }
    }

    public final long c(String str, Object[] objArr, int i2) {
        if (str == null) {
            throw new IllegalArgumentException("sql must not be null.");
        } else if (b(str, i2, (com.tencent.wcdb.support.a) null)) {
            return 0;
        } else {
            a(str, i2, (com.tencent.wcdb.support.a) null);
            try {
                return this.f154675a.e(str, objArr, null);
            } finally {
                b();
            }
        }
    }

    public final String b(String str, Object[] objArr, int i2) {
        if (str == null) {
            throw new IllegalArgumentException("sql must not be null.");
        } else if (b(str, i2, (com.tencent.wcdb.support.a) null)) {
            return null;
        } else {
            a(str, i2, (com.tencent.wcdb.support.a) null);
            try {
                return this.f154675a.c(str, objArr, null);
            } finally {
                b();
            }
        }
    }

    public final long a(String str, Object[] objArr, int i2) {
        if (str == null) {
            throw new IllegalArgumentException("sql must not be null.");
        } else if (b(str, i2, (com.tencent.wcdb.support.a) null)) {
            return 0;
        } else {
            a(str, i2, (com.tencent.wcdb.support.a) null);
            try {
                return this.f154675a.b(str, objArr, null);
            } finally {
                b();
            }
        }
    }

    public final void a(int i2, int i3, com.tencent.wcdb.support.a aVar) {
        e();
        a(i2, (SQLiteTransactionListener) null, i3, aVar);
    }

    public final int a(String str, Object[] objArr, int i2, com.tencent.wcdb.support.a aVar) {
        if (str == null) {
            throw new IllegalArgumentException("sql must not be null.");
        } else if (b(str, i2, (com.tencent.wcdb.support.a) null)) {
            return 0;
        } else {
            a(str, i2, (com.tencent.wcdb.support.a) null);
            try {
                return this.f154675a.d(str, objArr, null);
            } finally {
                b();
            }
        }
    }

    /* JADX INFO: finally extract failed */
    private void a(int i2, SQLiteTransactionListener sQLiteTransactionListener, int i3, com.tencent.wcdb.support.a aVar) {
        if (aVar != null) {
            aVar.a();
        }
        if (this.f154676b == null) {
            a((String) null, i3, aVar);
        }
        try {
            if (this.f154676b == null) {
                if (i2 == 1) {
                    this.f154675a.a("BEGIN IMMEDIATE;", null, aVar);
                } else if (i2 != 2) {
                    this.f154675a.a("BEGIN;", null, aVar);
                } else {
                    this.f154675a.a("BEGIN EXCLUSIVE;", null, aVar);
                }
            }
            a a2 = a(i2, null);
            a2.f154681a = this.f154676b;
            this.f154676b = a2;
        } catch (Throwable th) {
            if (this.f154676b == null) {
                b();
            }
            throw th;
        }
    }

    public final int a(String str, Object[] objArr, CursorWindow cursorWindow, int i2, int i3, boolean z, int i4, com.tencent.wcdb.support.a aVar) {
        if (str == null) {
            throw new IllegalArgumentException("sql must not be null.");
        } else if (cursorWindow == null) {
            throw new IllegalArgumentException("window must not be null.");
        } else if (b(str, i4, aVar)) {
            cursorWindow.a();
            return 0;
        } else {
            a(str, i4, aVar);
            try {
                return this.f154675a.a(str, objArr, cursorWindow, i2, i3, z, aVar);
            } finally {
                b();
            }
        }
    }
}
