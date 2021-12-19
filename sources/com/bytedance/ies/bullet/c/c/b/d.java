package com.bytedance.ies.bullet.c.c.b;

import com.bytedance.covode.number.Covode;
import h.f.b.l;

public final class d<T> implements b<T> {

    /* renamed from: a  reason: collision with root package name */
    private boolean f32039a;

    /* renamed from: b  reason: collision with root package name */
    private T f32040b;

    static {
        Covode.recordClassIndex(18765);
    }

    public d() {
        this(null, false, 3);
    }

    @Override // com.bytedance.ies.bullet.c.c.b.b
    public final boolean a() {
        return this.f32039a;
    }

    @Override // com.bytedance.ies.bullet.c.c.b.b
    public final T b() {
        return this.f32040b;
    }

    @Override // com.bytedance.ies.bullet.c.c.b.b
    public final void a(b<T> bVar) {
        l.c(bVar, "");
        if (this.f32039a) {
            if (!bVar.a()) {
            }
        } else if (bVar.a()) {
            T b2 = bVar.b();
            this.f32039a = true;
            this.f32040b = b2;
        }
    }

    private d(T t, boolean z) {
        boolean z2;
        if (!z || t != null) {
            z2 = true;
        } else {
            z2 = false;
        }
        this.f32039a = z2;
        this.f32040b = t;
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ d(Object obj, boolean z, int i2) {
        this((i2 & 1) != 0 ? null : obj, (i2 & 2) != 0 ? true : z);
    }
}
