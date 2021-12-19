package com.ss.android.ugc.aweme.commercialize.feed;

import android.view.View;
import com.bytedance.apm.agent.v2.instrumentation.ClickAgent;
import com.bytedance.covode.number.Covode;

/* access modifiers changed from: package-private */
public final /* synthetic */ class at implements View.OnClickListener {

    /* renamed from: a  reason: collision with root package name */
    private final h f74165a;

    static {
        Covode.recordClassIndex(45760);
    }

    at(h hVar) {
        this.f74165a = hVar;
    }

    public final void onClick(View view) {
        ClickAgent.onClick(view);
        this.f74165a.a(view);
    }
}
