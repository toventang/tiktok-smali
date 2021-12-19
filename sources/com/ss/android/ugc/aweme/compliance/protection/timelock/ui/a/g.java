package com.ss.android.ugc.aweme.compliance.protection.timelock.ui.a;

import android.view.View;
import com.bytedance.apm.agent.v2.instrumentation.ClickAgent;
import com.bytedance.covode.number.Covode;

/* access modifiers changed from: package-private */
public final /* synthetic */ class g implements View.OnClickListener {

    /* renamed from: a  reason: collision with root package name */
    private final f f78031a;

    static {
        Covode.recordClassIndex(48380);
    }

    g(f fVar) {
        this.f78031a = fVar;
    }

    public final void onClick(View view) {
        ClickAgent.onClick(view);
        this.f78031a.e();
    }
}
