package com.ss.android.ugc.aweme.favorites.j;

import android.view.View;
import com.bytedance.apm.agent.v2.instrumentation.ClickAgent;
import com.bytedance.covode.number.Covode;

/* access modifiers changed from: package-private */
public final /* synthetic */ class g implements View.OnClickListener {

    /* renamed from: a  reason: collision with root package name */
    private final e f90698a;

    static {
        Covode.recordClassIndex(56966);
    }

    g(e eVar) {
        this.f90698a = eVar;
    }

    public final void onClick(View view) {
        ClickAgent.onClick(view);
        this.f90698a.onClick(view);
    }
}
