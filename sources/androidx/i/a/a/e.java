package androidx.i.a.a;

import android.database.sqlite.SQLiteStatement;
import androidx.i.a.f;
import com.bytedance.covode.number.Covode;

final class e extends d implements f {

    /* renamed from: a  reason: collision with root package name */
    private final SQLiteStatement f3207a;

    static {
        Covode.recordClassIndex(1149);
    }

    @Override // androidx.i.a.f
    public final int a() {
        return this.f3207a.executeUpdateDelete();
    }

    @Override // androidx.i.a.f
    public final long b() {
        return this.f3207a.executeInsert();
    }

    e(SQLiteStatement sQLiteStatement) {
        super(sQLiteStatement);
        this.f3207a = sQLiteStatement;
    }
}
