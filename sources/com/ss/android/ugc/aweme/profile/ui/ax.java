package com.ss.android.ugc.aweme.profile.ui;

import android.view.View;
import com.bytedance.apm.agent.v2.instrumentation.ClickAgent;
import com.bytedance.covode.number.Covode;

final /* synthetic */ class ax implements View.OnClickListener {

    /* renamed from: a  reason: collision with root package name */
    private final au f116893a;

    static {
        Covode.recordClassIndex(75496);
    }

    ax(au auVar) {
        this.f116893a = auVar;
    }

    public final void onClick(View view) {
        ClickAgent.onClick(view);
        this.f116893a.k();
    }
}
