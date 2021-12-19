package com.bytedance.im.core.internal.a.c.b.a;

import android.database.sqlite.SQLiteStatement;
import com.bytedance.covode.number.Covode;

public final class c implements com.bytedance.im.core.internal.a.c.c {

    /* renamed from: a  reason: collision with root package name */
    private SQLiteStatement f38210a;

    static {
        Covode.recordClassIndex(22887);
    }

    @Override // com.bytedance.im.core.internal.a.c.c
    public final int a() {
        return this.f38210a.executeUpdateDelete();
    }

    @Override // com.bytedance.im.core.internal.a.c.c
    public final long b() {
        return this.f38210a.executeInsert();
    }

    @Override // com.bytedance.im.core.internal.a.c.c
    public final void c() {
        this.f38210a.close();
    }

    @Override // com.bytedance.im.core.internal.a.c.c
    public final void d() {
        this.f38210a.clearBindings();
    }

    public c(SQLiteStatement sQLiteStatement) {
        this.f38210a = sQLiteStatement;
    }

    @Override // com.bytedance.im.core.internal.a.c.c
    public final void a(int i2, long j2) {
        this.f38210a.bindLong(i2, j2);
    }

    @Override // com.bytedance.im.core.internal.a.c.c
    public final void a(int i2, String str) {
        this.f38210a.bindString(i2, str);
    }
}
