package com.ss.android.ugc.aweme.profile.ui;

import android.view.View;
import com.bytedance.apm.agent.v2.instrumentation.ClickAgent;
import com.bytedance.covode.number.Covode;

final /* synthetic */ class bn implements View.OnClickListener {

    /* renamed from: a  reason: collision with root package name */
    private final bm f116997a;

    static {
        Covode.recordClassIndex(75548);
    }

    bn(bm bmVar) {
        this.f116997a = bmVar;
    }

    public final void onClick(View view) {
        ClickAgent.onClick(view);
        this.f116997a.b(view);
    }
}
