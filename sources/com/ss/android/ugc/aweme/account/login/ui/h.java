package com.ss.android.ugc.aweme.account.login.ui;

import android.view.View;
import com.bytedance.apm.agent.v2.instrumentation.ClickAgent;
import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.aweme.account.login.model.a;

final /* synthetic */ class h implements View.OnClickListener {

    /* renamed from: a  reason: collision with root package name */
    private final g f64130a;

    /* renamed from: b  reason: collision with root package name */
    private final a f64131b;

    static {
        Covode.recordClassIndex(39515);
    }

    h(g gVar, a aVar) {
        this.f64130a = gVar;
        this.f64131b = aVar;
    }

    public final void onClick(View view) {
        ClickAgent.onClick(view);
        g gVar = this.f64130a;
        a aVar = this.f64131b;
        if (gVar.f64122a != null) {
            gVar.f64122a.a(aVar);
        }
    }
}
