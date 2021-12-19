package com.bytedance.im.core.internal.a.c.a;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;
import com.bytedance.covode.number.Covode;
import com.bytedance.im.core.a.d;
import com.bytedance.im.core.c.f;
import com.bytedance.im.core.internal.a.a.a;
import com.bytedance.im.core.internal.a.c.b.a.b;

public final class c extends SQLiteOpenHelper implements a {

    /* renamed from: a  reason: collision with root package name */
    private b f38201a = new b();

    static {
        Covode.recordClassIndex(22879);
    }

    @Override // com.bytedance.im.core.internal.a.c.a.a
    public final com.bytedance.im.core.internal.a.c.b a() {
        b bVar = this.f38201a;
        bVar.f38209a = getWritableDatabase();
        return bVar;
    }

    @Override // com.bytedance.im.core.internal.a.c.a.a, java.lang.AutoCloseable
    public final void close() {
        f.b("imsdk", "LocalSQLiteOpenHelper close", (Throwable) null);
        super.close();
    }

    public final void setWriteAheadLoggingEnabled(boolean z) {
        super.setWriteAheadLoggingEnabled(z);
    }

    public final void onOpen(SQLiteDatabase sQLiteDatabase) {
        f.b("imsdk", "LocalSQLiteOpenHelper onOpen", (Throwable) null);
    }

    public final void onConfigure(SQLiteDatabase sQLiteDatabase) {
        f.b("imsdk", "LocalSQLiteOpenHelper onConfigure", (Throwable) null);
        if (d.a().b().ah) {
            sQLiteDatabase.enableWriteAheadLogging();
        }
    }

    public final void onCreate(SQLiteDatabase sQLiteDatabase) {
        f.b("imsdk", "LocalSQLiteOpenHelper onCreate", (Throwable) null);
        a.a();
        b bVar = this.f38201a;
        bVar.f38209a = sQLiteDatabase;
        a.a(bVar);
    }

    public c(Context context, String str) {
        super(context, str, (SQLiteDatabase.CursorFactory) null, 38);
        f.b("imsdk", "LocalSQLiteOpenHelper constructor", (Throwable) null);
    }

    public final void onDowngrade(SQLiteDatabase sQLiteDatabase, int i2, int i3) {
        f.b("imsdk", "LocalSQLiteOpenHelper onDowngrade", (Throwable) null);
        a a2 = a.a();
        this.f38201a.f38209a = sQLiteDatabase;
        a2.a(i2, i3);
    }

    public final void onUpgrade(SQLiteDatabase sQLiteDatabase, int i2, int i3) {
        f.b("imsdk", "LocalSQLiteOpenHelper onUpgrade", (Throwable) null);
        a.a();
        b bVar = this.f38201a;
        bVar.f38209a = sQLiteDatabase;
        a.a(bVar, i2, i3);
    }
}
