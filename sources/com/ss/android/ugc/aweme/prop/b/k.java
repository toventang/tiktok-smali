package com.ss.android.ugc.aweme.prop.b;

import android.view.View;
import com.bytedance.apm.agent.v2.instrumentation.ClickAgent;
import com.bytedance.covode.number.Covode;

final /* synthetic */ class k implements View.OnClickListener {

    /* renamed from: a  reason: collision with root package name */
    private final j f118253a;

    static {
        Covode.recordClassIndex(76794);
    }

    k(j jVar) {
        this.f118253a = jVar;
    }

    public final void onClick(View view) {
        ClickAgent.onClick(view);
        this.f118253a.e();
    }
}
