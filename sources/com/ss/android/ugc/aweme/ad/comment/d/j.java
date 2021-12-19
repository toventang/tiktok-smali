package com.ss.android.ugc.aweme.ad.comment.d;

import android.view.View;
import com.bytedance.apm.agent.v2.instrumentation.ClickAgent;
import com.bytedance.covode.number.Covode;

final /* synthetic */ class j implements View.OnClickListener {

    /* renamed from: a  reason: collision with root package name */
    private final b f65656a;

    static {
        Covode.recordClassIndex(40405);
    }

    j(b bVar) {
        this.f65656a = bVar;
    }

    public final void onClick(View view) {
        ClickAgent.onClick(view);
        this.f65656a.c(view);
    }
}
