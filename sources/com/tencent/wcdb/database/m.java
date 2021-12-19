package com.tencent.wcdb.database;

import com.bytedance.covode.number.Covode;
import com.tencent.wcdb.support.a;

public final class m extends j {
    static {
        Covode.recordClassIndex(103065);
    }

    public final String toString() {
        return "SQLiteProgram: " + this.f154666b;
    }

    public final int g() {
        d();
        try {
            int a2 = a().a(this.f154666b, this.f154668d, b(), (a) null);
            e();
            return a2;
        } catch (SQLiteDatabaseCorruptException e2) {
            a(e2);
            throw e2;
        } catch (Throwable th) {
            e();
            throw th;
        }
    }

    public final long h() {
        d();
        try {
            long c2 = a().c(this.f154666b, this.f154668d, b());
            e();
            return c2;
        } catch (SQLiteDatabaseCorruptException e2) {
            a(e2);
            throw e2;
        } catch (Throwable th) {
            e();
            throw th;
        }
    }

    public final long i() {
        d();
        try {
            long a2 = a().a(this.f154666b, this.f154668d, b());
            e();
            return a2;
        } catch (SQLiteDatabaseCorruptException e2) {
            a(e2);
            throw e2;
        } catch (Throwable th) {
            e();
            throw th;
        }
    }

    public final String j() {
        d();
        try {
            String b2 = a().b(this.f154666b, this.f154668d, b());
            e();
            return b2;
        } catch (SQLiteDatabaseCorruptException e2) {
            a(e2);
            throw e2;
        } catch (Throwable th) {
            e();
            throw th;
        }
    }

    m(SQLiteDatabase sQLiteDatabase, String str, Object[] objArr) {
        super(sQLiteDatabase, str, objArr, null);
    }
}
