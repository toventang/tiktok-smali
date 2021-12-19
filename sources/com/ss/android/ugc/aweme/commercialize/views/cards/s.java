package com.ss.android.ugc.aweme.commercialize.views.cards;

import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.aweme.base.utils.o;

final /* synthetic */ class s implements Runnable {

    /* renamed from: a  reason: collision with root package name */
    private final p f76125a;

    static {
        Covode.recordClassIndex(46952);
    }

    s(p pVar) {
        this.f76125a = pVar;
    }

    public final void run() {
        boolean z;
        p pVar = this.f76125a;
        if (!pVar.s) {
            pVar.n = -1;
            pVar.f76112m = -1;
            boolean z2 = pVar.f76105f != null && pVar.f76105f.i();
            if (pVar.f76107h == null || !pVar.f76107h.i()) {
                z = false;
            } else {
                z = true;
            }
            if (!z2 && !z && o.b(pVar.f76102c)) {
                pVar.f76109j.a("ACTION_HALF_WEB_PAGE_HIDE", (Object) null);
            }
        }
    }
}
