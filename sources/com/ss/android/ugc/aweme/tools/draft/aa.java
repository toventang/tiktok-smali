package com.ss.android.ugc.aweme.tools.draft;

import android.view.View;
import com.bytedance.apm.agent.v2.instrumentation.ClickAgent;
import com.bytedance.covode.number.Covode;

final /* synthetic */ class aa implements View.OnClickListener {

    /* renamed from: a  reason: collision with root package name */
    private final z f139356a;

    static {
        Covode.recordClassIndex(91101);
    }

    aa(z zVar) {
        this.f139356a = zVar;
    }

    public final void onClick(View view) {
        ClickAgent.onClick(view);
        this.f139356a.f();
    }
}
