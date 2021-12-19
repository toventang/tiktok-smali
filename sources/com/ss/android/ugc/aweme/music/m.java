package com.ss.android.ugc.aweme.music;

import android.view.View;
import com.bytedance.apm.agent.v2.instrumentation.ClickAgent;
import com.bytedance.covode.number.Covode;

/* access modifiers changed from: package-private */
public final /* synthetic */ class m implements View.OnClickListener {

    /* renamed from: a  reason: collision with root package name */
    private final j f111559a;

    static {
        Covode.recordClassIndex(71654);
    }

    m(j jVar) {
        this.f111559a = jVar;
    }

    public final void onClick(View view) {
        ClickAgent.onClick(view);
        this.f111559a.a(view);
    }
}
