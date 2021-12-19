package com.ss.android.ugc.aweme.commercialize.feed;

import android.view.View;
import com.bytedance.apm.agent.v2.instrumentation.ClickAgent;
import com.bytedance.covode.number.Covode;

/* access modifiers changed from: package-private */
public final /* synthetic */ class au implements View.OnClickListener {

    /* renamed from: a  reason: collision with root package name */
    private final h f74166a;

    static {
        Covode.recordClassIndex(45761);
    }

    au(h hVar) {
        this.f74166a = hVar;
    }

    public final void onClick(View view) {
        ClickAgent.onClick(view);
        this.f74166a.a(view);
    }
}
