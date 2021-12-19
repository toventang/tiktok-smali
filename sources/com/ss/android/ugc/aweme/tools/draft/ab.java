package com.ss.android.ugc.aweme.tools.draft;

import android.view.View;
import com.bytedance.apm.agent.v2.instrumentation.ClickAgent;
import com.bytedance.covode.number.Covode;

final /* synthetic */ class ab implements View.OnClickListener {

    /* renamed from: a  reason: collision with root package name */
    private final z f139357a;

    static {
        Covode.recordClassIndex(91102);
    }

    ab(z zVar) {
        this.f139357a = zVar;
    }

    public final void onClick(View view) {
        ClickAgent.onClick(view);
        this.f139357a.f();
    }
}
