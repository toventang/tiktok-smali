package com.ss.android.ugc.aweme.profile.f;

import android.view.View;
import com.bytedance.apm.agent.v2.instrumentation.ClickAgent;
import com.bytedance.covode.number.Covode;

/* access modifiers changed from: package-private */
public final /* synthetic */ class s implements View.OnClickListener {

    /* renamed from: a  reason: collision with root package name */
    private final p f116465a;

    /* renamed from: b  reason: collision with root package name */
    private final int f116466b = 0;

    static {
        Covode.recordClassIndex(75175);
    }

    s(p pVar, int i2) {
        this.f116465a = pVar;
    }

    public final void onClick(View view) {
        ClickAgent.onClick(view);
        this.f116465a.f(this.f116466b);
    }
}
