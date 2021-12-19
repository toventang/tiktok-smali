package com.ss.android.ugc.aweme.profile.ui;

import android.view.View;
import com.bytedance.apm.agent.v2.instrumentation.ClickAgent;
import com.bytedance.covode.number.Covode;

/* access modifiers changed from: package-private */
public final /* synthetic */ class af implements View.OnClickListener {

    /* renamed from: a  reason: collision with root package name */
    private final HeaderDetailActivity f116859a;

    static {
        Covode.recordClassIndex(75469);
    }

    af(HeaderDetailActivity headerDetailActivity) {
        this.f116859a = headerDetailActivity;
    }

    public final void onClick(View view) {
        ClickAgent.onClick(view);
        this.f116859a.onBackPressed();
    }
}
