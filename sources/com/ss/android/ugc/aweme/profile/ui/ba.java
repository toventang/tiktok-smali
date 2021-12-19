package com.ss.android.ugc.aweme.profile.ui;

import android.view.View;
import com.bytedance.apm.agent.v2.instrumentation.ClickAgent;
import com.bytedance.covode.number.Covode;

final /* synthetic */ class ba implements View.OnClickListener {

    /* renamed from: a  reason: collision with root package name */
    private final az f116921a;

    static {
        Covode.recordClassIndex(75506);
    }

    ba(az azVar) {
        this.f116921a = azVar;
    }

    public final void onClick(View view) {
        ClickAgent.onClick(view);
        this.f116921a.d();
    }
}
