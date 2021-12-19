package com.ss.android.ugc.aweme.comment.adapter;

import android.view.View;
import com.bytedance.apm.agent.v2.instrumentation.ClickAgent;
import com.bytedance.covode.number.Covode;

/* access modifiers changed from: package-private */
public final /* synthetic */ class y implements View.OnClickListener {

    /* renamed from: a  reason: collision with root package name */
    private final x f71439a;

    static {
        Covode.recordClassIndex(43966);
    }

    y(x xVar) {
        this.f71439a = xVar;
    }

    public final void onClick(View view) {
        ClickAgent.onClick(view);
        this.f71439a.a(view);
    }
}
