package com.tencent.wcdb.database;

import com.bytedance.covode.number.Covode;
import com.tencent.wcdb.d;
import com.tencent.wcdb.database.SQLiteDatabase;
import com.tencent.wcdb.support.a;

public final class h implements f {

    /* renamed from: f  reason: collision with root package name */
    private static SQLiteDatabase.a f154645f = e.f154629j;

    /* renamed from: a  reason: collision with root package name */
    private final SQLiteDatabase f154646a;

    /* renamed from: b  reason: collision with root package name */
    private final String f154647b = null;

    /* renamed from: c  reason: collision with root package name */
    private final String f154648c;

    /* renamed from: d  reason: collision with root package name */
    private final a f154649d;

    /* renamed from: e  reason: collision with root package name */
    private j f154650e;

    static {
        Covode.recordClassIndex(103059);
    }

    public final String toString() {
        return "SQLiteDirectCursorDriver: " + this.f154648c;
    }

    public h(SQLiteDatabase sQLiteDatabase, String str) {
        this.f154646a = sQLiteDatabase;
        this.f154648c = str;
        this.f154649d = null;
    }

    @Override // com.tencent.wcdb.database.f
    public final d a(SQLiteDatabase.a aVar, Object[] objArr) {
        if (aVar == null) {
            aVar = f154645f;
        }
        j jVar = null;
        try {
            jVar = aVar.a(this.f154646a, this.f154648c, objArr, this.f154649d);
            d a2 = aVar.a(this, this.f154647b, jVar);
            this.f154650e = jVar;
            return a2;
        } catch (RuntimeException e2) {
            if (jVar != null) {
                jVar.close();
            }
            throw e2;
        }
    }
}
