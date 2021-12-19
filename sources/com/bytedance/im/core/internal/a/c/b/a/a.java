package com.bytedance.im.core.internal.a.c.b.a;

import android.database.Cursor;
import com.bytedance.covode.number.Covode;

public final class a implements com.bytedance.im.core.internal.a.c.a {

    /* renamed from: a  reason: collision with root package name */
    private Cursor f38208a;

    static {
        Covode.recordClassIndex(22885);
    }

    @Override // com.bytedance.im.core.internal.a.c.a
    public final int b() {
        return this.f38208a.getCount();
    }

    @Override // com.bytedance.im.core.internal.a.c.a
    public final boolean d() {
        return this.f38208a.moveToNext();
    }

    @Override // com.bytedance.im.core.internal.a.c.a
    public final boolean c() {
        return this.f38208a.moveToFirst();
    }

    @Override // com.bytedance.im.core.internal.a.c.a
    public final void a() {
        this.f38208a.close();
    }

    public a(Cursor cursor) {
        this.f38208a = cursor;
    }

    @Override // com.bytedance.im.core.internal.a.c.a
    public final int a(int i2) {
        return this.f38208a.getInt(i2);
    }

    @Override // com.bytedance.im.core.internal.a.c.a
    public final String c(int i2) {
        return this.f38208a.getString(i2);
    }

    @Override // com.bytedance.im.core.internal.a.c.a
    public final int a(String str) {
        return this.f38208a.getColumnIndex(str);
    }

    @Override // com.bytedance.im.core.internal.a.c.a
    public final long b(int i2) {
        return this.f38208a.getLong(i2);
    }
}
