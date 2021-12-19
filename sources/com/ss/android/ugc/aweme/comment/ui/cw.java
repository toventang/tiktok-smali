package com.ss.android.ugc.aweme.comment.ui;

import android.view.View;
import com.bytedance.apm.agent.v2.instrumentation.ClickAgent;
import com.bytedance.covode.number.Covode;

final /* synthetic */ class cw implements View.OnClickListener {

    /* renamed from: a  reason: collision with root package name */
    private final bz f72700a;

    static {
        Covode.recordClassIndex(44794);
    }

    cw(bz bzVar) {
        this.f72700a = bzVar;
    }

    public final void onClick(View view) {
        ClickAgent.onClick(view);
        this.f72700a.m();
    }
}
