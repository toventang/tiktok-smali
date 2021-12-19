package com.ss.android.ugc.aweme.compliance.protection.restrictmode.c.a;

import android.view.View;
import com.bytedance.apm.agent.v2.instrumentation.ClickAgent;
import com.bytedance.covode.number.Covode;

final /* synthetic */ class c implements View.OnClickListener {

    /* renamed from: a  reason: collision with root package name */
    private final b f78010a;

    static {
        Covode.recordClassIndex(48360);
    }

    c(b bVar) {
        this.f78010a = bVar;
    }

    public final void onClick(View view) {
        ClickAgent.onClick(view);
        this.f78010a.b();
    }
}
