package com.ss.android.ugc.aweme.music;

import android.view.View;
import com.bytedance.apm.agent.v2.instrumentation.ClickAgent;
import com.bytedance.covode.number.Covode;

final /* synthetic */ class i implements View.OnClickListener {

    /* renamed from: a  reason: collision with root package name */
    private final g f111506a;

    static {
        Covode.recordClassIndex(71624);
    }

    i(g gVar) {
        this.f111506a = gVar;
    }

    public final void onClick(View view) {
        ClickAgent.onClick(view);
        this.f111506a.c();
    }
}
