package com.ss.android.ugc.aweme.commercialize.feed;

import android.view.View;
import com.bytedance.apm.agent.v2.instrumentation.ClickAgent;
import com.bytedance.covode.number.Covode;

/* access modifiers changed from: package-private */
public final /* synthetic */ class as implements View.OnClickListener {

    /* renamed from: a  reason: collision with root package name */
    private final h f74080a;

    static {
        Covode.recordClassIndex(45631);
    }

    as(h hVar) {
        this.f74080a = hVar;
    }

    public final void onClick(View view) {
        ClickAgent.onClick(view);
        this.f74080a.a(view);
    }
}
