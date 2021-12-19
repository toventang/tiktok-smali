package com.ss.android.ugc.aweme.compliance.protection.timelock.ui.a;

import android.view.View;
import com.bytedance.apm.agent.v2.instrumentation.ClickAgent;
import com.bytedance.covode.number.Covode;

final /* synthetic */ class r implements View.OnClickListener {

    /* renamed from: a  reason: collision with root package name */
    private final q f78072a;

    static {
        Covode.recordClassIndex(48401);
    }

    r(q qVar) {
        this.f78072a = qVar;
    }

    public final void onClick(View view) {
        ClickAgent.onClick(view);
        this.f78072a.b();
    }
}
