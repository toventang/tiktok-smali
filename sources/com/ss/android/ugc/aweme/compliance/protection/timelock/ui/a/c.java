package com.ss.android.ugc.aweme.compliance.protection.timelock.ui.a;

import android.view.View;
import com.bytedance.apm.agent.v2.instrumentation.ClickAgent;
import com.bytedance.covode.number.Covode;

/* access modifiers changed from: package-private */
public final /* synthetic */ class c implements View.OnClickListener {

    /* renamed from: a  reason: collision with root package name */
    private final a f78023a;

    static {
        Covode.recordClassIndex(48374);
    }

    c(a aVar) {
        this.f78023a = aVar;
    }

    public final void onClick(View view) {
        ClickAgent.onClick(view);
        this.f78023a.d();
    }
}
