package com.ss.android.ugc.aweme.comment.adapter;

import android.view.View;
import com.bytedance.apm.agent.v2.instrumentation.ClickAgent;
import com.bytedance.covode.number.Covode;

final /* synthetic */ class k implements View.OnClickListener {

    /* renamed from: a  reason: collision with root package name */
    private final h f71395a;

    static {
        Covode.recordClassIndex(43945);
    }

    k(h hVar) {
        this.f71395a = hVar;
    }

    public final void onClick(View view) {
        ClickAgent.onClick(view);
        h hVar = this.f71395a;
        if (hVar.x != null && hVar.y != null && hVar.y.getUser() != null && hVar.y.getCid() != null && !hVar.a()) {
            hVar.x.a(hVar.z, hVar.y);
        }
    }
}
