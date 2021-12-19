package com.ss.android.ugc.aweme.feed.ui;

import android.view.View;
import com.bytedance.apm.agent.v2.instrumentation.ClickAgent;
import com.bytedance.covode.number.Covode;

final /* synthetic */ class q implements View.OnClickListener {

    /* renamed from: a  reason: collision with root package name */
    private final p f94993a;

    static {
        Covode.recordClassIndex(60243);
    }

    q(p pVar) {
        this.f94993a = pVar;
    }

    public final void onClick(View view) {
        ClickAgent.onClick(view);
        p pVar = this.f94993a;
        pVar.a(true, true);
        pVar.a(pVar.n, false, true);
        if (pVar.o != null && pVar.p && p.x()) {
            pVar.o.a("homepage_folllow_refresh");
        }
    }
}
