package com.ss.android.ugc.aweme.ad.comment.d;

import android.view.View;
import com.bytedance.apm.agent.v2.instrumentation.ClickAgent;
import com.bytedance.covode.number.Covode;

final /* synthetic */ class i implements View.OnClickListener {

    /* renamed from: a  reason: collision with root package name */
    private final b f65655a;

    static {
        Covode.recordClassIndex(40404);
    }

    i(b bVar) {
        this.f65655a = bVar;
    }

    public final void onClick(View view) {
        ClickAgent.onClick(view);
        this.f65655a.d(view);
    }
}
