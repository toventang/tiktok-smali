package com.ss.android.ugc.aweme.profile.ui;

import android.view.View;
import com.bytedance.apm.agent.v2.instrumentation.ClickAgent;
import com.bytedance.covode.number.Covode;

/* access modifiers changed from: package-private */
public final /* synthetic */ class ah implements View.OnClickListener {

    /* renamed from: a  reason: collision with root package name */
    private final HeaderDetailActivity f116861a;

    static {
        Covode.recordClassIndex(75471);
    }

    ah(HeaderDetailActivity headerDetailActivity) {
        this.f116861a = headerDetailActivity;
    }

    public final void onClick(View view) {
        ClickAgent.onClick(view);
        this.f116861a.e();
    }
}
