package com.ss.android.ugc.aweme.share.silent;

import android.view.View;
import com.bytedance.apm.agent.v2.instrumentation.ClickAgent;
import com.bytedance.covode.number.Covode;

final /* synthetic */ class k implements View.OnClickListener {

    /* renamed from: a  reason: collision with root package name */
    private final j f124356a;

    static {
        Covode.recordClassIndex(81648);
    }

    k(j jVar) {
        this.f124356a = jVar;
    }

    public final void onClick(View view) {
        ClickAgent.onClick(view);
        this.f124356a.b(view);
    }
}
