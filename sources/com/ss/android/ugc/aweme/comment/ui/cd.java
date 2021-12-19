package com.ss.android.ugc.aweme.comment.ui;

import android.view.View;
import com.bytedance.apm.agent.v2.instrumentation.ClickAgent;
import com.bytedance.covode.number.Covode;

final /* synthetic */ class cd implements View.OnClickListener {

    /* renamed from: a  reason: collision with root package name */
    private final bz f72679a;

    static {
        Covode.recordClassIndex(44775);
    }

    cd(bz bzVar) {
        this.f72679a = bzVar;
    }

    public final void onClick(View view) {
        ClickAgent.onClick(view);
        this.f72679a.d();
    }
}
