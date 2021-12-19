package com.bytedance.ies.bullet.c.c.a;

import com.bytedance.covode.number.Covode;
import com.bytedance.ies.bullet.c.c.a.k;
import com.bytedance.ies.bullet.c.e.a.b;
import h.f.b.l;

public abstract class e implements k {

    /* renamed from: a  reason: collision with root package name */
    public final b f32005a;

    /* renamed from: b  reason: collision with root package name */
    private k.a f32006b = k.a.PRIVATE;

    /* renamed from: c  reason: collision with root package name */
    private boolean f32007c;

    static {
        Covode.recordClassIndex(18728);
    }

    @Override // com.bytedance.ies.bullet.c.e.a
    public void a() {
    }

    @Override // com.bytedance.ies.bullet.c.c.a.q
    public boolean aY_() {
        return this.f32007c;
    }

    @Override // com.bytedance.ies.bullet.c.c.a.q
    public k.a b() {
        return this.f32006b;
    }

    public void a(k.a aVar) {
        l.c(aVar, "");
        this.f32006b = aVar;
    }

    public e(b bVar) {
        l.c(bVar, "");
        this.f32005a = bVar;
    }
}
