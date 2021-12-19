package com.bytedance.im.core.internal.a.c.b.b;

import com.bytedance.covode.number.Covode;
import com.tencent.wcdb.database.m;

public final class c implements com.bytedance.im.core.internal.a.c.c {

    /* renamed from: a  reason: collision with root package name */
    private m f38213a;

    static {
        Covode.recordClassIndex(22890);
    }

    @Override // com.bytedance.im.core.internal.a.c.c
    public final int a() {
        return this.f38213a.g();
    }

    @Override // com.bytedance.im.core.internal.a.c.c
    public final long b() {
        return this.f38213a.h();
    }

    @Override // com.bytedance.im.core.internal.a.c.c
    public final void c() {
        this.f38213a.close();
    }

    @Override // com.bytedance.im.core.internal.a.c.c
    public final void d() {
        this.f38213a.f();
    }

    public c(m mVar) {
        this.f38213a = mVar;
    }

    @Override // com.bytedance.im.core.internal.a.c.c
    public final void a(int i2, long j2) {
        this.f38213a.a(i2, Long.valueOf(j2));
    }

    @Override // com.bytedance.im.core.internal.a.c.c
    public final void a(int i2, String str) {
        m mVar = this.f38213a;
        if (str != null) {
            mVar.a(i2, str);
            return;
        }
        throw new IllegalArgumentException("the bind value at index " + i2 + " is null");
    }
}
