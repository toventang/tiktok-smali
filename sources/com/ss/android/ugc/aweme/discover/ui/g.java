package com.ss.android.ugc.aweme.discover.ui;

import android.view.View;
import com.bytedance.apm.agent.v2.instrumentation.ClickAgent;
import com.bytedance.covode.number.Covode;

/* access modifiers changed from: package-private */
public final /* synthetic */ class g implements View.OnClickListener {

    /* renamed from: a  reason: collision with root package name */
    private final b f82586a;

    static {
        Covode.recordClassIndex(51413);
    }

    g(b bVar) {
        this.f82586a = bVar;
    }

    public final void onClick(View view) {
        ClickAgent.onClick(view);
        this.f82586a.C();
    }
}
