package com.ss.android.ugc.aweme.sticker.q;

import com.bytedance.bpea.basics.PrivacyCert;
import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.asve.recorder.a.b;
import com.ss.android.ugc.aweme.sticker.presenter.handler.p;
import h.f.b.l;

public final class f implements p {

    /* renamed from: a  reason: collision with root package name */
    private final b f135446a;

    static {
        Covode.recordClassIndex(88488);
    }

    public f(b bVar) {
        l.d(bVar, "");
        this.f135446a = bVar;
    }

    @Override // com.ss.android.ugc.aweme.sticker.presenter.handler.p
    public final void a(p.a aVar) {
        PrivacyCert privacyCert;
        b bVar = this.f135446a;
        if (aVar != null) {
            privacyCert = g.a(aVar);
        } else {
            privacyCert = null;
        }
        bVar.c(privacyCert);
    }

    @Override // com.ss.android.ugc.aweme.sticker.presenter.handler.p
    public final void b(p.a aVar) {
        PrivacyCert privacyCert;
        b bVar = this.f135446a;
        if (aVar != null) {
            privacyCert = g.a(aVar);
        } else {
            privacyCert = null;
        }
        bVar.d(privacyCert);
    }
}
