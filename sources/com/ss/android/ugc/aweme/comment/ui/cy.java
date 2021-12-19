package com.ss.android.ugc.aweme.comment.ui;

import android.view.View;
import com.bytedance.apm.agent.v2.instrumentation.ClickAgent;
import com.bytedance.covode.number.Covode;

final /* synthetic */ class cy implements View.OnClickListener {

    /* renamed from: a  reason: collision with root package name */
    private final bz f72702a;

    static {
        Covode.recordClassIndex(44796);
    }

    cy(bz bzVar) {
        this.f72702a = bzVar;
    }

    public final void onClick(View view) {
        ClickAgent.onClick(view);
        bz bzVar = this.f72702a;
        bzVar.G.a(bzVar.X);
    }
}
