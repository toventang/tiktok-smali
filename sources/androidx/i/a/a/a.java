package androidx.i.a.a;

import android.database.Cursor;
import android.database.sqlite.SQLiteCursor;
import android.database.sqlite.SQLiteCursorDriver;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteQuery;
import android.util.Pair;
import androidx.i.a.b;
import androidx.i.a.e;
import androidx.i.a.f;
import com.bytedance.covode.number.Covode;
import java.util.List;

final class a implements b {

    /* renamed from: a  reason: collision with root package name */
    private static final String[] f3195a = {"", " OR ROLLBACK ", " OR ABORT ", " OR FAIL ", " OR IGNORE ", " OR REPLACE "};

    /* renamed from: b  reason: collision with root package name */
    private static final String[] f3196b = new String[0];

    /* renamed from: c  reason: collision with root package name */
    private final SQLiteDatabase f3197c;

    @Override // androidx.i.a.b
    public final void a() {
        this.f3197c.beginTransaction();
    }

    @Override // androidx.i.a.b
    public final void b() {
        this.f3197c.endTransaction();
    }

    @Override // androidx.i.a.b
    public final void c() {
        this.f3197c.setTransactionSuccessful();
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        this.f3197c.close();
    }

    @Override // androidx.i.a.b
    public final boolean d() {
        return this.f3197c.inTransaction();
    }

    @Override // androidx.i.a.b
    public final boolean e() {
        return this.f3197c.isOpen();
    }

    @Override // androidx.i.a.b
    public final String f() {
        return this.f3197c.getPath();
    }

    @Override // androidx.i.a.b
    public final List<Pair<String, String>> g() {
        return this.f3197c.getAttachedDbs();
    }

    static {
        Covode.recordClassIndex(1142);
    }

    a(SQLiteDatabase sQLiteDatabase) {
        this.f3197c = sQLiteDatabase;
    }

    @Override // androidx.i.a.b
    public final f a(String str) {
        return new e(this.f3197c.compileStatement(str));
    }

    @Override // androidx.i.a.b
    public final Cursor b(String str) {
        return a(new androidx.i.a.a(str, (byte) 0));
    }

    @Override // androidx.i.a.b
    public final void c(String str) {
        this.f3197c.execSQL(str);
    }

    @Override // androidx.i.a.b
    public final Cursor a(final e eVar) {
        return this.f3197c.rawQueryWithFactory(new SQLiteDatabase.CursorFactory() {
            /* class androidx.i.a.a.a.AnonymousClass1 */

            static {
                Covode.recordClassIndex(1143);
            }

            public final Cursor newCursor(SQLiteDatabase sQLiteDatabase, SQLiteCursorDriver sQLiteCursorDriver, String str, SQLiteQuery sQLiteQuery) {
                eVar.a(new d(sQLiteQuery));
                return new SQLiteCursor(sQLiteCursorDriver, str, sQLiteQuery);
            }
        }, eVar.b(), f3196b, null);
    }
}
