package com.ss.android.ugc.aweme.comment.adapter;

import android.view.View;
import com.bytedance.apm.agent.v2.instrumentation.ClickAgent;
import com.bytedance.covode.number.Covode;

final /* synthetic */ class aa implements View.OnClickListener {

    /* renamed from: a  reason: collision with root package name */
    private final x f71331a;

    static {
        Covode.recordClassIndex(43915);
    }

    aa(x xVar) {
        this.f71331a = xVar;
    }

    public final void onClick(View view) {
        ClickAgent.onClick(view);
        this.f71331a.g();
    }
}
