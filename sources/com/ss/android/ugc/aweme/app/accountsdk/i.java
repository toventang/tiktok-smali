package com.ss.android.ugc.aweme.app.accountsdk;

import com.bytedance.covode.number.Covode;
import com.bytedance.ies.ugc.appcontext.f;
import com.ss.android.ugc.aweme.video.v;

final /* synthetic */ class i implements Runnable {

    /* renamed from: a  reason: collision with root package name */
    private final g f66553a;

    static {
        Covode.recordClassIndex(40908);
    }

    i(g gVar) {
        this.f66553a = gVar;
    }

    public final void run() {
        g gVar = this.f66553a;
        if (gVar.f66550c == null || f.j() == gVar.f66550c) {
            v.O().y();
        }
    }
}
