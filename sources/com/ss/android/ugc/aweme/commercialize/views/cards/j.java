package com.ss.android.ugc.aweme.commercialize.views.cards;

import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.aweme.commercialize.utils.i;

final /* synthetic */ class j implements Runnable {

    /* renamed from: a  reason: collision with root package name */
    private final e f76094a;

    static {
        Covode.recordClassIndex(46936);
    }

    j(e eVar) {
        this.f76094a = eVar;
    }

    public final void run() {
        e eVar = this.f76094a;
        eVar.f76078m.a("AD_ACTION_MOVE_IN_DESC", Boolean.valueOf(i.f(eVar.f76067b)));
    }
}
