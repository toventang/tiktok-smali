package com.ss.android.ugc.aweme.commercialize.feed;

import android.view.View;
import com.bytedance.apm.agent.v2.instrumentation.ClickAgent;
import com.bytedance.covode.number.Covode;
import com.bytedance.router.SmartRouter;
import com.ss.android.ugc.aweme.l.a.a;

final /* synthetic */ class p implements View.OnClickListener {

    /* renamed from: a  reason: collision with root package name */
    private final h f74259a;

    static {
        Covode.recordClassIndex(45824);
    }

    p(h hVar) {
        this.f74259a = hVar;
    }

    public final void onClick(View view) {
        ClickAgent.onClick(view);
        h hVar = this.f74259a;
        if (!a.a(view, 1200) && hVar.o.getAwemeRawAd().getLabel().byUid != 0) {
            SmartRouter.buildRoute(hVar.ae, "aweme://user/profile/").withParam("uid", String.valueOf(hVar.o.getAwemeRawAd().getLabel().byUid)).open();
        }
    }
}
