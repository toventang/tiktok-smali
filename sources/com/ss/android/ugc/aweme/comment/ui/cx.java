package com.ss.android.ugc.aweme.comment.ui;

import android.view.View;
import com.bytedance.apm.agent.v2.instrumentation.ClickAgent;
import com.bytedance.covode.number.Covode;

final /* synthetic */ class cx implements View.OnClickListener {

    /* renamed from: a  reason: collision with root package name */
    private final bz f72701a;

    static {
        Covode.recordClassIndex(44795);
    }

    cx(bz bzVar) {
        this.f72701a = bzVar;
    }

    public final void onClick(View view) {
        ClickAgent.onClick(view);
        this.f72701a.l();
    }
}
