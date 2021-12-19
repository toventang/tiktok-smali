package androidx.i.a.a;

import android.database.sqlite.SQLiteProgram;
import com.bytedance.covode.number.Covode;

class d implements androidx.i.a.d {

    /* renamed from: a  reason: collision with root package name */
    private final SQLiteProgram f3206a;

    static {
        Covode.recordClassIndex(1148);
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        this.f3206a.close();
    }

    d(SQLiteProgram sQLiteProgram) {
        this.f3206a = sQLiteProgram;
    }

    @Override // androidx.i.a.d
    public final void a(int i2) {
        this.f3206a.bindNull(i2);
    }

    @Override // androidx.i.a.d
    public final void a(int i2, double d2) {
        this.f3206a.bindDouble(i2, d2);
    }

    @Override // androidx.i.a.d
    public final void a(int i2, long j2) {
        this.f3206a.bindLong(i2, j2);
    }

    @Override // androidx.i.a.d
    public final void a(int i2, String str) {
        this.f3206a.bindString(i2, str);
    }

    @Override // androidx.i.a.d
    public final void a(int i2, byte[] bArr) {
        this.f3206a.bindBlob(i2, bArr);
    }
}
