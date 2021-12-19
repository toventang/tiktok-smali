package com.ss.android.ugc.aweme.feed.ui;

import android.view.View;
import com.bytedance.apm.agent.v2.instrumentation.ClickAgent;
import com.bytedance.covode.number.Covode;

final /* synthetic */ class am implements View.OnClickListener {

    /* renamed from: a  reason: collision with root package name */
    private final af f94236a;

    static {
        Covode.recordClassIndex(59874);
    }

    am(af afVar) {
        this.f94236a = afVar;
    }

    public final void onClick(View view) {
        ClickAgent.onClick(view);
        this.f94236a.a(false);
    }
}
