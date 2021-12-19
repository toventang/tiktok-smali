package com.ss.android.ugc.aweme.comment.adapter;

import android.view.View;
import com.bytedance.apm.agent.v2.instrumentation.ClickAgent;
import com.bytedance.covode.number.Covode;

final /* synthetic */ class j implements View.OnClickListener {

    /* renamed from: a  reason: collision with root package name */
    private final h f71394a;

    static {
        Covode.recordClassIndex(43944);
    }

    j(h hVar) {
        this.f71394a = hVar;
    }

    public final void onClick(View view) {
        ClickAgent.onClick(view);
        this.f71394a.a(view);
    }
}
