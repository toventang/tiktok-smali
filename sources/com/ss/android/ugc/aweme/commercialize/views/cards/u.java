package com.ss.android.ugc.aweme.commercialize.views.cards;

import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.aweme.commercialize.utils.i;

final /* synthetic */ class u implements Runnable {

    /* renamed from: a  reason: collision with root package name */
    private final p f76127a;

    static {
        Covode.recordClassIndex(46954);
    }

    u(p pVar) {
        this.f76127a = pVar;
    }

    public final void run() {
        p pVar = this.f76127a;
        pVar.f76109j.a("AD_ACTION_MOVE_IN_DESC", Boolean.valueOf(i.f(pVar.f76101b)));
    }
}
