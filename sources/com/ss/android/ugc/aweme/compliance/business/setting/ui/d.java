package com.ss.android.ugc.aweme.compliance.business.setting.ui;

import android.view.View;
import com.bytedance.apm.agent.v2.instrumentation.ClickAgent;
import com.bytedance.covode.number.Covode;

final /* synthetic */ class d implements View.OnClickListener {

    /* renamed from: a  reason: collision with root package name */
    private final ChildrenModeSettingActivity f77199a;

    static {
        Covode.recordClassIndex(47730);
    }

    d(ChildrenModeSettingActivity childrenModeSettingActivity) {
        this.f77199a = childrenModeSettingActivity;
    }

    public final void onClick(View view) {
        ClickAgent.onClick(view);
        this.f77199a.onVersionClick(view);
    }
}
