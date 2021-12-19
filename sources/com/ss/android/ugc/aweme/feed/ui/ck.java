package com.ss.android.ugc.aweme.feed.ui;

import android.view.View;
import com.bytedance.apm.agent.v2.instrumentation.ClickAgent;
import com.bytedance.covode.number.Covode;

final /* synthetic */ class ck implements View.OnClickListener {

    /* renamed from: a  reason: collision with root package name */
    private final cc f94494a;

    static {
        Covode.recordClassIndex(59999);
    }

    ck(cc ccVar) {
        this.f94494a = ccVar;
    }

    public final void onClick(View view) {
        ClickAgent.onClick(view);
        this.f94494a.b();
    }
}
