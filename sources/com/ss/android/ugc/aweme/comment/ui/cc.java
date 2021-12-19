package com.ss.android.ugc.aweme.comment.ui;

import android.view.View;
import com.bytedance.apm.agent.v2.instrumentation.ClickAgent;
import com.bytedance.covode.number.Covode;

final /* synthetic */ class cc implements View.OnClickListener {

    /* renamed from: a  reason: collision with root package name */
    private final bz f72678a;

    static {
        Covode.recordClassIndex(44774);
    }

    cc(bz bzVar) {
        this.f72678a = bzVar;
    }

    public final void onClick(View view) {
        ClickAgent.onClick(view);
        this.f72678a.j();
    }
}
