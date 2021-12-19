package com.ss.android.ugc.aweme.main;

import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.aweme.main.ae;
import f.a.d.f;

final /* synthetic */ class ao implements f {

    /* renamed from: a  reason: collision with root package name */
    private final ae f109163a;

    static {
        Covode.recordClassIndex(69902);
    }

    ao(ae aeVar) {
        this.f109163a = aeVar;
    }

    @Override // f.a.d.f
    public final void accept(Object obj) {
        ae aeVar = this.f109163a;
        ae.a aVar = (ae.a) obj;
        if (aVar.f109151b && com.bytedance.ies.ugc.appcontext.f.f34637l) {
            aVar.f109150a.h();
        }
        if (aeVar.F != null) {
            aeVar.F.dispose();
        }
    }
}
