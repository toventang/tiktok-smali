package com.ss.ugc.effectplatform.e;

import com.bytedance.covode.number.Covode;
import com.ss.ugc.effectplatform.a.c.a;
import d.a.d.a.c;
import h.f.b.l;

public final class b extends c {

    /* renamed from: b  reason: collision with root package name */
    private final a f153577b;

    static {
        Covode.recordClassIndex(102383);
    }

    @Override // d.a.d.a.c, d.a.d.a.k
    public final void a() {
        this.f153577b.close();
    }

    public b(a aVar) {
        l.c(aVar, "");
        this.f153577b = aVar;
    }

    @Override // d.a.d.a.c
    public final int a(byte[] bArr, int i2) {
        l.c(bArr, "");
        return this.f153577b.read(bArr, 0, i2);
    }
}
