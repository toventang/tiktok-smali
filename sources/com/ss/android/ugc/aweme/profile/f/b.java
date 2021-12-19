package com.ss.android.ugc.aweme.profile.f;

import android.view.View;
import com.bytedance.apm.agent.v2.instrumentation.ClickAgent;
import com.bytedance.covode.number.Covode;

/* access modifiers changed from: package-private */
public final /* synthetic */ class b implements View.OnClickListener {

    /* renamed from: a  reason: collision with root package name */
    private final a f116404a;

    static {
        Covode.recordClassIndex(75151);
    }

    b(a aVar) {
        this.f116404a = aVar;
    }

    public final void onClick(View view) {
        ClickAgent.onClick(view);
        this.f116404a.d();
    }
}
