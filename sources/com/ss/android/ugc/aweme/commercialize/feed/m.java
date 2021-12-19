package com.ss.android.ugc.aweme.commercialize.feed;

import android.view.View;
import com.bytedance.apm.agent.v2.instrumentation.ClickAgent;
import com.bytedance.covode.number.Covode;

/* access modifiers changed from: package-private */
public final /* synthetic */ class m implements View.OnClickListener {

    /* renamed from: a  reason: collision with root package name */
    private final h f74256a;

    static {
        Covode.recordClassIndex(45821);
    }

    m(h hVar) {
        this.f74256a = hVar;
    }

    public final void onClick(View view) {
        ClickAgent.onClick(view);
        this.f74256a.a(view);
    }
}
