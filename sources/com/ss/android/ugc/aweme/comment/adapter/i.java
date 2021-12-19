package com.ss.android.ugc.aweme.comment.adapter;

import android.view.View;
import com.bytedance.apm.agent.v2.instrumentation.ClickAgent;
import com.bytedance.covode.number.Covode;

final /* synthetic */ class i implements View.OnClickListener {

    /* renamed from: a  reason: collision with root package name */
    private final h f71393a;

    static {
        Covode.recordClassIndex(43943);
    }

    i(h hVar) {
        this.f71393a = hVar;
    }

    public final void onClick(View view) {
        ClickAgent.onClick(view);
        this.f71393a.a(view);
    }
}
