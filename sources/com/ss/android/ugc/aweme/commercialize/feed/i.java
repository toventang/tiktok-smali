package com.ss.android.ugc.aweme.commercialize.feed;

import android.view.View;
import com.bytedance.apm.agent.v2.instrumentation.ClickAgent;
import com.bytedance.covode.number.Covode;

/* access modifiers changed from: package-private */
public final /* synthetic */ class i implements View.OnClickListener {

    /* renamed from: a  reason: collision with root package name */
    private final h f74252a;

    static {
        Covode.recordClassIndex(45817);
    }

    i(h hVar) {
        this.f74252a = hVar;
    }

    public final void onClick(View view) {
        ClickAgent.onClick(view);
        this.f74252a.a(view);
    }
}
