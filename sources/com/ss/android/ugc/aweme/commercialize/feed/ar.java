package com.ss.android.ugc.aweme.commercialize.feed;

import android.view.View;
import com.bytedance.apm.agent.v2.instrumentation.ClickAgent;
import com.bytedance.covode.number.Covode;

/* access modifiers changed from: package-private */
public final /* synthetic */ class ar implements View.OnClickListener {

    /* renamed from: a  reason: collision with root package name */
    private final h f74079a;

    static {
        Covode.recordClassIndex(45630);
    }

    ar(h hVar) {
        this.f74079a = hVar;
    }

    public final void onClick(View view) {
        ClickAgent.onClick(view);
        this.f74079a.a(view);
    }
}
