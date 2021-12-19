package com.ss.android.ugc.aweme.share.silent;

import android.view.View;
import com.bytedance.apm.agent.v2.instrumentation.ClickAgent;
import com.bytedance.covode.number.Covode;

final /* synthetic */ class n implements View.OnClickListener {

    /* renamed from: a  reason: collision with root package name */
    private final j f124359a;

    static {
        Covode.recordClassIndex(81651);
    }

    n(j jVar) {
        this.f124359a = jVar;
    }

    public final void onClick(View view) {
        ClickAgent.onClick(view);
        this.f124359a.e();
    }
}
