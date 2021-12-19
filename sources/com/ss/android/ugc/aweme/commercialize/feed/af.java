package com.ss.android.ugc.aweme.commercialize.feed;

import android.view.View;
import com.bytedance.apm.agent.v2.instrumentation.ClickAgent;
import com.bytedance.covode.number.Covode;

/* access modifiers changed from: package-private */
public final /* synthetic */ class af implements View.OnClickListener {

    /* renamed from: a  reason: collision with root package name */
    private final h f74065a;

    static {
        Covode.recordClassIndex(45618);
    }

    af(h hVar) {
        this.f74065a = hVar;
    }

    public final void onClick(View view) {
        ClickAgent.onClick(view);
        this.f74065a.a(view);
    }
}
