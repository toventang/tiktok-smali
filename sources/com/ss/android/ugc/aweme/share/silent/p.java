package com.ss.android.ugc.aweme.share.silent;

import android.view.View;
import com.bytedance.apm.agent.v2.instrumentation.ClickAgent;
import com.bytedance.covode.number.Covode;

final /* synthetic */ class p implements View.OnClickListener {

    /* renamed from: a  reason: collision with root package name */
    private final j f124361a;

    static {
        Covode.recordClassIndex(81653);
    }

    p(j jVar) {
        this.f124361a = jVar;
    }

    public final void onClick(View view) {
        ClickAgent.onClick(view);
        this.f124361a.a();
    }
}
