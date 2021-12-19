package com.ss.android.ugc.aweme.profile.ui;

import android.view.View;
import com.bytedance.apm.agent.v2.instrumentation.ClickAgent;
import com.bytedance.covode.number.Covode;

/* access modifiers changed from: package-private */
public final /* synthetic */ class d implements View.OnClickListener {

    /* renamed from: a  reason: collision with root package name */
    private final c f117118a;

    static {
        Covode.recordClassIndex(75631);
    }

    d(c cVar) {
        this.f117118a = cVar;
    }

    public final void onClick(View view) {
        ClickAgent.onClick(view);
        this.f117118a.k();
    }
}
