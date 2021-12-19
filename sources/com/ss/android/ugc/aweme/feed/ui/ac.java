package com.ss.android.ugc.aweme.feed.ui;

import android.view.View;
import com.bytedance.apm.agent.v2.instrumentation.ClickAgent;
import com.bytedance.covode.number.Covode;

final /* synthetic */ class ac implements View.OnClickListener {

    /* renamed from: a  reason: collision with root package name */
    private final ab f94218a;

    static {
        Covode.recordClassIndex(59860);
    }

    ac(ab abVar) {
        this.f94218a = abVar;
    }

    public final void onClick(View view) {
        ClickAgent.onClick(view);
        this.f94218a.d();
    }
}
