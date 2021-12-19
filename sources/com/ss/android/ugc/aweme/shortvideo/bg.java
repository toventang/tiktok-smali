package com.ss.android.ugc.aweme.shortvideo;

import android.view.View;
import com.bytedance.apm.agent.v2.instrumentation.ClickAgent;
import com.bytedance.covode.number.Covode;

public final /* synthetic */ class bg implements View.OnClickListener {

    /* renamed from: a  reason: collision with root package name */
    private final bf f125033a;

    static {
        Covode.recordClassIndex(82140);
    }

    public bg(bf bfVar) {
        this.f125033a = bfVar;
    }

    public final void onClick(View view) {
        ClickAgent.onClick(view);
        bf bfVar = this.f125033a;
        bfVar.a(bfVar.f125024g.substring(bfVar.f125024g.lastIndexOf(35) + 1));
    }
}
