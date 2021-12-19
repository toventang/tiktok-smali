package com.ss.android.ugc.aweme.commercialize.views.cards;

import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.aweme.commercialize.utils.i;

/* access modifiers changed from: package-private */
public final /* synthetic */ class t implements Runnable {

    /* renamed from: a  reason: collision with root package name */
    private final p f76126a;

    static {
        Covode.recordClassIndex(46953);
    }

    t(p pVar) {
        this.f76126a = pVar;
    }

    public final void run() {
        p pVar = this.f76126a;
        pVar.f76109j.a("AD_ACTION_MOVE_IN_DESC", Boolean.valueOf(i.f(pVar.f76101b)));
    }
}
