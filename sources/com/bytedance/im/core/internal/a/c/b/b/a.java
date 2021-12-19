package com.bytedance.im.core.internal.a.c.b.b;

import com.bytedance.covode.number.Covode;
import com.tencent.wcdb.d;

public final class a implements com.bytedance.im.core.internal.a.c.a {

    /* renamed from: a  reason: collision with root package name */
    private d f38211a;

    static {
        Covode.recordClassIndex(22888);
    }

    @Override // com.bytedance.im.core.internal.a.c.a
    public final int b() {
        return this.f38211a.getCount();
    }

    @Override // com.bytedance.im.core.internal.a.c.a
    public final boolean d() {
        return this.f38211a.moveToNext();
    }

    @Override // com.bytedance.im.core.internal.a.c.a
    public final boolean c() {
        return this.f38211a.moveToFirst();
    }

    @Override // com.bytedance.im.core.internal.a.c.a
    public final void a() {
        this.f38211a.close();
    }

    public a(d dVar) {
        this.f38211a = dVar;
    }

    @Override // com.bytedance.im.core.internal.a.c.a
    public final int a(int i2) {
        return this.f38211a.getInt(i2);
    }

    @Override // com.bytedance.im.core.internal.a.c.a
    public final String c(int i2) {
        return this.f38211a.getString(i2);
    }

    @Override // com.bytedance.im.core.internal.a.c.a
    public final int a(String str) {
        return this.f38211a.getColumnIndex(str);
    }

    @Override // com.bytedance.im.core.internal.a.c.a
    public final long b(int i2) {
        return this.f38211a.getLong(i2);
    }
}
