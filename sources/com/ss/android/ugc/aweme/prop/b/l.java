package com.ss.android.ugc.aweme.prop.b;

import android.view.View;
import com.bytedance.apm.agent.v2.instrumentation.ClickAgent;
import com.bytedance.covode.number.Covode;

final /* synthetic */ class l implements View.OnClickListener {

    /* renamed from: a  reason: collision with root package name */
    private final j f118254a;

    static {
        Covode.recordClassIndex(76795);
    }

    l(j jVar) {
        this.f118254a = jVar;
    }

    public final void onClick(View view) {
        ClickAgent.onClick(view);
        j jVar = this.f118254a;
        if (jVar.ap != null) {
            jVar.ao = false;
            jVar.b();
            jVar.X.b();
        }
    }
}
