package com.ss.android.ugc.aweme.prop.b;

import android.view.View;
import com.bytedance.apm.agent.v2.instrumentation.ClickAgent;
import com.bytedance.covode.number.Covode;

final /* synthetic */ class q implements View.OnClickListener {

    /* renamed from: a  reason: collision with root package name */
    private final j f118259a;

    static {
        Covode.recordClassIndex(76800);
    }

    q(j jVar) {
        this.f118259a = jVar;
    }

    public final void onClick(View view) {
        ClickAgent.onClick(view);
        j jVar = this.f118259a;
        jVar.y.scrollTo(0, -jVar.y.getCurScrollY());
    }
}
