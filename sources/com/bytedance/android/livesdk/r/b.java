package com.bytedance.android.livesdk.r;

import com.bytedance.covode.number.Covode;
import h.z;

final /* synthetic */ class b implements h.f.a.b {

    /* renamed from: a  reason: collision with root package name */
    private final a f20558a;

    static {
        Covode.recordClassIndex(12138);
    }

    b(a aVar) {
        this.f20558a = aVar;
    }

    @Override // h.f.a.b
    public final Object invoke(Object obj) {
        a aVar = this.f20558a;
        aVar.f20550b.setVisibility(0);
        if (aVar.f20551c && aVar.f20552d != null) {
            aVar.f20552d.setVisibility(8);
        }
        aVar.f20550b.a(new f(aVar));
        return z.f158842a;
    }
}
