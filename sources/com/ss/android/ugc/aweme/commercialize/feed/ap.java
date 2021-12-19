package com.ss.android.ugc.aweme.commercialize.feed;

import android.view.View;
import com.bytedance.apm.agent.v2.instrumentation.ClickAgent;
import com.bytedance.covode.number.Covode;

/* access modifiers changed from: package-private */
public final /* synthetic */ class ap implements View.OnClickListener {

    /* renamed from: a  reason: collision with root package name */
    private final h f74077a;

    static {
        Covode.recordClassIndex(45628);
    }

    ap(h hVar) {
        this.f74077a = hVar;
    }

    public final void onClick(View view) {
        ClickAgent.onClick(view);
        this.f74077a.a(view);
    }
}
