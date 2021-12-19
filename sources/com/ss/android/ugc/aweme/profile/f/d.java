package com.ss.android.ugc.aweme.profile.f;

import android.view.View;
import com.bytedance.apm.agent.v2.instrumentation.ClickAgent;
import com.bytedance.covode.number.Covode;

/* access modifiers changed from: package-private */
public final /* synthetic */ class d implements View.OnClickListener {

    /* renamed from: a  reason: collision with root package name */
    private final a f116406a;

    /* renamed from: b  reason: collision with root package name */
    private final View f116407b;

    static {
        Covode.recordClassIndex(75153);
    }

    d(a aVar, View view) {
        this.f116406a = aVar;
        this.f116407b = view;
    }

    public final void onClick(View view) {
        ClickAgent.onClick(view);
        this.f116406a.b(this.f116407b);
    }
}
