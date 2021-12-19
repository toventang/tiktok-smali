package com.ss.android.ugc.aweme.setting.ui;

import android.view.View;
import com.bytedance.apm.agent.v2.instrumentation.ClickAgent;
import com.bytedance.covode.number.Covode;

/* access modifiers changed from: package-private */
public final /* synthetic */ class bh implements View.OnClickListener {

    /* renamed from: a  reason: collision with root package name */
    private final v f122866a;

    static {
        Covode.recordClassIndex(80652);
    }

    bh(v vVar) {
        this.f122866a = vVar;
    }

    public final void onClick(View view) {
        ClickAgent.onClick(view);
        this.f122866a.N();
    }
}
