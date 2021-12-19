package com.ss.android.ugc.aweme.feed.ui;

import android.view.View;
import com.bytedance.apm.agent.v2.instrumentation.ClickAgent;
import com.bytedance.covode.number.Covode;

final /* synthetic */ class al implements View.OnClickListener {

    /* renamed from: a  reason: collision with root package name */
    private final af f94235a;

    static {
        Covode.recordClassIndex(59873);
    }

    al(af afVar) {
        this.f94235a = afVar;
    }

    public final void onClick(View view) {
        ClickAgent.onClick(view);
        this.f94235a.a(false);
    }
}
