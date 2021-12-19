package com.ss.android.ugc.aweme.comment.adapter;

import android.view.View;
import com.bytedance.apm.agent.v2.instrumentation.ClickAgent;
import com.bytedance.covode.number.Covode;

final /* synthetic */ class m implements View.OnClickListener {

    /* renamed from: a  reason: collision with root package name */
    private final h f71397a;

    static {
        Covode.recordClassIndex(43947);
    }

    m(h hVar) {
        this.f71397a = hVar;
    }

    public final void onClick(View view) {
        ClickAgent.onClick(view);
        h hVar = this.f71397a;
        if (hVar.x != null && com.ss.android.ugc.aweme.comment.m.b(hVar.y)) {
            hVar.x.d(hVar.y);
        }
    }
}
