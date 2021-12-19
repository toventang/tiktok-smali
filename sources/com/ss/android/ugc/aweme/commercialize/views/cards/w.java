package com.ss.android.ugc.aweme.commercialize.views.cards;

import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.aweme.commercialize.utils.i;

final /* synthetic */ class w implements Runnable {

    /* renamed from: a  reason: collision with root package name */
    private final p f76129a;

    static {
        Covode.recordClassIndex(46956);
    }

    w(p pVar) {
        this.f76129a = pVar;
    }

    public final void run() {
        p pVar = this.f76129a;
        if (pVar.f76107h != null && !pVar.f76107h.k()) {
            pVar.f76109j.a("AD_ACTION_MOVE_IN_DESC", Boolean.valueOf(i.f(pVar.f76101b)));
        }
    }
}
