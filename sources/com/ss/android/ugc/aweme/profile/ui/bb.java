package com.ss.android.ugc.aweme.profile.ui;

import android.view.View;
import com.bytedance.apm.agent.v2.instrumentation.ClickAgent;
import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.aweme.compliance.api.a;

/* access modifiers changed from: package-private */
public final /* synthetic */ class bb implements View.OnClickListener {

    /* renamed from: a  reason: collision with root package name */
    private final az f116922a;

    static {
        Covode.recordClassIndex(75507);
    }

    bb(az azVar) {
        this.f116922a = azVar;
    }

    public final void onClick(View view) {
        ClickAgent.onClick(view);
        a.c().a(this.f116922a.getActivity(), "float_profile");
    }
}
