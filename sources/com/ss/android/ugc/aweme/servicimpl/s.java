package com.ss.android.ugc.aweme.servicimpl;

import com.bytedance.covode.number.Covode;
import com.bytedance.creativex.recorder.b.a.x;
import com.ss.android.ugc.aweme.shortvideo.w.g;
import h.f.a.b;
import h.z;

final /* synthetic */ class s implements b {

    /* renamed from: a  reason: collision with root package name */
    private final j f121927a;

    static {
        Covode.recordClassIndex(79939);
    }

    s(j jVar) {
        this.f121927a = jVar;
    }

    @Override // h.f.a.b
    public final Object invoke(Object obj) {
        j jVar = this.f121927a;
        Boolean bool = (Boolean) obj;
        if (jVar.f121913l != null && jVar.f121913l.isShowing()) {
            jVar.f121913l.dismiss();
        }
        jVar.f121903b.b(false);
        if (!bool.booleanValue()) {
            g gVar = jVar.f121909h;
            x xVar = new x("on photo token");
            xVar.f28214a = 3;
            gVar.a(xVar);
        }
        return z.f158842a;
    }
}
