package com.ss.android.ugc.aweme.prop.b;

import android.view.View;
import com.bytedance.apm.agent.v2.instrumentation.ClickAgent;
import com.bytedance.covode.number.Covode;

final /* synthetic */ class n implements View.OnClickListener {

    /* renamed from: a  reason: collision with root package name */
    private final j f118256a;

    static {
        Covode.recordClassIndex(76797);
    }

    n(j jVar) {
        this.f118256a = jVar;
    }

    public final void onClick(View view) {
        ClickAgent.onClick(view);
        j jVar = this.f118256a;
        jVar.ao = true;
        jVar.b();
        jVar.R.b();
    }
}
