package com.tencent.wcdb.database;

import com.bytedance.covode.number.Covode;
import com.tencent.wcdb.CursorWindow;
import com.tencent.wcdb.support.Log;
import com.tencent.wcdb.support.a;

public final class k extends j {

    /* renamed from: f  reason: collision with root package name */
    private final a f154673f;

    static {
        Covode.recordClassIndex(103062);
    }

    public final String toString() {
        return "SQLiteQuery: " + this.f154666b;
    }

    k(SQLiteDatabase sQLiteDatabase, String str, Object[] objArr, a aVar) {
        super(sQLiteDatabase, str, objArr, aVar);
        this.f154673f = aVar;
    }

    /* access modifiers changed from: package-private */
    public final int a(CursorWindow cursorWindow, int i2, int i3, boolean z) {
        d();
        try {
            cursorWindow.d();
            try {
                int a2 = a().a(this.f154666b, this.f154668d, cursorWindow, i2, i3, z, b(), this.f154673f);
                cursorWindow.e();
                return a2;
            } catch (SQLiteException e2) {
                Log.a(6, "WCDB.SQLiteQuery", "exception: " + e2.getMessage() + "; query: " + this.f154666b);
                a(e2);
                throw e2;
            } catch (Throwable th) {
                cursorWindow.e();
                throw th;
            }
        } finally {
            e();
        }
    }
}
