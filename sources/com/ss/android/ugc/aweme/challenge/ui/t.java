package com.ss.android.ugc.aweme.challenge.ui;

import android.view.View;
import com.bytedance.apm.agent.v2.instrumentation.ClickAgent;
import com.bytedance.covode.number.Covode;

/* access modifiers changed from: package-private */
public final /* synthetic */ class t implements View.OnClickListener {

    /* renamed from: a  reason: collision with root package name */
    private final s f70222a;

    static {
        Covode.recordClassIndex(43312);
    }

    t(s sVar) {
        this.f70222a = sVar;
    }

    public final void onClick(View view) {
        ClickAgent.onClick(view);
        this.f70222a.j();
    }
}
