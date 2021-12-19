package com.ss.android.ugc.aweme.prop.b;

import android.view.View;
import com.bytedance.apm.agent.v2.instrumentation.ClickAgent;
import com.bytedance.covode.number.Covode;

final /* synthetic */ class o implements View.OnClickListener {

    /* renamed from: a  reason: collision with root package name */
    private final j f118257a;

    static {
        Covode.recordClassIndex(76798);
    }

    o(j jVar) {
        this.f118257a = jVar;
    }

    public final void onClick(View view) {
        ClickAgent.onClick(view);
        this.f118257a.c();
    }
}
