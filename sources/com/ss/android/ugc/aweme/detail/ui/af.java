package com.ss.android.ugc.aweme.detail.ui;

import android.view.View;
import com.bytedance.apm.agent.v2.instrumentation.ClickAgent;
import com.bytedance.covode.number.Covode;

/* access modifiers changed from: package-private */
public final /* synthetic */ class af implements View.OnClickListener {

    /* renamed from: a  reason: collision with root package name */
    private final z f79919a;

    static {
        Covode.recordClassIndex(49715);
    }

    af(z zVar) {
        this.f79919a = zVar;
    }

    public final void onClick(View view) {
        ClickAgent.onClick(view);
        this.f79919a.s();
    }
}
