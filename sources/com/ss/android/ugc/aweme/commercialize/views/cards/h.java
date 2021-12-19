package com.ss.android.ugc.aweme.commercialize.views.cards;

import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.aweme.base.utils.o;

final /* synthetic */ class h implements Runnable {

    /* renamed from: a  reason: collision with root package name */
    private final e f76092a;

    static {
        Covode.recordClassIndex(46934);
    }

    h(e eVar) {
        this.f76092a = eVar;
    }

    public final void run() {
        boolean z;
        e eVar = this.f76092a;
        if (!eVar.s) {
            eVar.q = -1;
            eVar.p = -1;
            boolean z2 = eVar.f76071f != null && eVar.f76071f.i();
            if (eVar.f76073h == null || !eVar.f76073h.i()) {
                z = false;
            } else {
                z = true;
            }
            if (!z2 && !z && o.b(eVar.f76068c)) {
                eVar.f76078m.a("ACTION_HALF_WEB_PAGE_HIDE", (Object) null);
            }
        }
    }
}
