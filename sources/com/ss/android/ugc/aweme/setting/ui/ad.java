package com.ss.android.ugc.aweme.setting.ui;

import android.view.View;
import com.bytedance.apm.agent.v2.instrumentation.ClickAgent;
import com.bytedance.covode.number.Covode;

/* access modifiers changed from: package-private */
public final /* synthetic */ class ad implements View.OnClickListener {

    /* renamed from: a  reason: collision with root package name */
    private final v f122809a;

    static {
        Covode.recordClassIndex(80618);
    }

    ad(v vVar) {
        this.f122809a = vVar;
    }

    public final void onClick(View view) {
        ClickAgent.onClick(view);
        this.f122809a.r(view);
    }
}
