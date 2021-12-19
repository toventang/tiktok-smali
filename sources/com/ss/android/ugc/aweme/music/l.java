package com.ss.android.ugc.aweme.music;

import android.view.View;
import com.bytedance.apm.agent.v2.instrumentation.ClickAgent;
import com.bytedance.covode.number.Covode;

/* access modifiers changed from: package-private */
public final /* synthetic */ class l implements View.OnClickListener {

    /* renamed from: a  reason: collision with root package name */
    private final j f111557a;

    static {
        Covode.recordClassIndex(71652);
    }

    l(j jVar) {
        this.f111557a = jVar;
    }

    public final void onClick(View view) {
        ClickAgent.onClick(view);
        this.f111557a.a(view);
    }
}
