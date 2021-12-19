package com.ss.android.ugc.aweme.share.silent;

import android.view.View;
import com.bytedance.apm.agent.v2.instrumentation.ClickAgent;
import com.bytedance.covode.number.Covode;

final /* synthetic */ class o implements View.OnClickListener {

    /* renamed from: a  reason: collision with root package name */
    private final j f124360a;

    static {
        Covode.recordClassIndex(81652);
    }

    o(j jVar) {
        this.f124360a = jVar;
    }

    public final void onClick(View view) {
        ClickAgent.onClick(view);
        this.f124360a.b();
    }
}
