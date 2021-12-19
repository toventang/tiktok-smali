package com.ss.android.ugc.aweme.detail.h;

import android.view.View;
import com.bytedance.apm.agent.v2.instrumentation.ClickAgent;
import com.bytedance.covode.number.Covode;

final /* synthetic */ class z implements View.OnClickListener {

    /* renamed from: a  reason: collision with root package name */
    private final y f79763a;

    static {
        Covode.recordClassIndex(49571);
    }

    z(y yVar) {
        this.f79763a = yVar;
    }

    public final void onClick(View view) {
        ClickAgent.onClick(view);
        this.f79763a.n();
    }
}
