package com.tencent.wcdb.database;

import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.tencent.wcdb.database.SQLiteConnection;
import com.tencent.wcdb.support.a;

public class SQLiteDirectQuery extends j {

    /* renamed from: g  reason: collision with root package name */
    private static final int[] f154595g = {3, 1, 2, 3, 4, 0};

    /* renamed from: f  reason: collision with root package name */
    private final a f154596f;

    private static native byte[] nativeGetBlob(long j2, int i2);

    private static native double nativeGetDouble(long j2, int i2);

    private static native long nativeGetLong(long j2, int i2);

    private static native String nativeGetString(long j2, int i2);

    private static native int nativeGetType(long j2, int i2);

    private static native int nativeStep(long j2, int i2);

    static {
        Covode.recordClassIndex(103037);
    }

    /* access modifiers changed from: protected */
    @Override // com.tencent.wcdb.database.j, com.tencent.wcdb.database.c
    public final void c() {
        SQLiteConnection sQLiteConnection;
        MethodCollector.i(3726);
        synchronized (this) {
            try {
                if (this.f154669e != null) {
                    SQLiteConnection.c cVar = this.f154669e;
                    a aVar = this.f154596f;
                    SQLiteConnection sQLiteConnection2 = cVar.f154571a.get();
                    if (sQLiteConnection2 != null) {
                        sQLiteConnection2.a(aVar);
                    }
                    SQLiteConnection.c cVar2 = this.f154669e;
                    if (!(cVar2.f154580j == null || (sQLiteConnection = cVar2.f154571a.get()) == null)) {
                        if (sQLiteConnection.f154549f.b(cVar2.f154580j.f154564h)) {
                            sQLiteConnection.f154549f.a(cVar2.f154580j.f154564h, (String) null);
                        }
                        cVar2.f154580j = null;
                    }
                }
            } catch (Throwable th) {
                MethodCollector.o(3726);
                throw th;
            }
        }
        super.c();
        MethodCollector.o(3726);
    }
}
