package com.ss.android.ugc.aweme.commercialize.views.cards;

import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.aweme.commercialize.utils.i;

final /* synthetic */ class k implements Runnable {

    /* renamed from: a  reason: collision with root package name */
    private final e f76095a;

    static {
        Covode.recordClassIndex(46937);
    }

    k(e eVar) {
        this.f76095a = eVar;
    }

    public final void run() {
        e eVar = this.f76095a;
        if (eVar.f76073h != null && !eVar.f76073h.k()) {
            eVar.f76078m.a("AD_ACTION_MOVE_IN_DESC", Boolean.valueOf(i.f(eVar.f76067b)));
        }
    }
}
