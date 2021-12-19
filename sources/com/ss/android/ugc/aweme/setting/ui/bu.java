package com.ss.android.ugc.aweme.setting.ui;

import android.view.View;
import com.bytedance.apm.agent.v2.instrumentation.ClickAgent;
import com.bytedance.covode.number.Covode;

/* access modifiers changed from: package-private */
public final /* synthetic */ class bu implements View.OnClickListener {

    /* renamed from: a  reason: collision with root package name */
    private final v f122879a;

    static {
        Covode.recordClassIndex(80665);
    }

    bu(v vVar) {
        this.f122879a = vVar;
    }

    public final void onClick(View view) {
        ClickAgent.onClick(view);
        this.f122879a.v(view);
    }
}
