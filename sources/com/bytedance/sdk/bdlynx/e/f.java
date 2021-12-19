package com.bytedance.sdk.bdlynx.e;

import com.bytedance.covode.number.Covode;
import com.bytedance.sdk.bdlynx.e.b.a.a;
import h.f.b.l;

public abstract class f implements e {

    /* renamed from: b  reason: collision with root package name */
    public boolean f43758b;

    static {
        Covode.recordClassIndex(26769);
    }

    public abstract void a(a aVar);

    public void b(a aVar) {
        l.c(aVar, "");
    }

    @Override // com.bytedance.sdk.bdlynx.e.e
    public final void a_(a aVar) {
        l.c(aVar, "");
        a(aVar);
        this.f43758b = true;
    }

    @Override // com.bytedance.sdk.bdlynx.e.e
    public final void b_(a aVar) {
        l.c(aVar, "");
        if (this.f43758b) {
            b(aVar);
        } else {
            a(aVar);
        }
        this.f43758b = true;
    }

    @Override // com.bytedance.sdk.bdlynx.e.e
    public final void c(a aVar) {
        l.c(aVar, "");
        if (this.f43758b) {
            b(aVar);
        } else {
            a(aVar);
        }
    }
}
