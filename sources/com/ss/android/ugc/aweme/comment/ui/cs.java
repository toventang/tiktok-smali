package com.ss.android.ugc.aweme.comment.ui;

import android.view.View;
import com.bytedance.apm.agent.v2.instrumentation.ClickAgent;
import com.bytedance.covode.number.Covode;

final /* synthetic */ class cs implements View.OnClickListener {

    /* renamed from: a  reason: collision with root package name */
    private final bz f72696a;

    static {
        Covode.recordClassIndex(44790);
    }

    cs(bz bzVar) {
        this.f72696a = bzVar;
    }

    public final void onClick(View view) {
        ClickAgent.onClick(view);
        this.f72696a.Z.b().setValue(null);
    }
}
