package com.ss.android.ugc.aweme.profile.f;

import android.app.Activity;
import android.view.View;
import com.bytedance.apm.agent.v2.instrumentation.ClickAgent;
import com.bytedance.covode.number.Covode;

/* access modifiers changed from: package-private */
public final /* synthetic */ class r implements View.OnClickListener {

    /* renamed from: a  reason: collision with root package name */
    private final p f116462a;

    /* renamed from: b  reason: collision with root package name */
    private final Activity f116463b;

    /* renamed from: c  reason: collision with root package name */
    private final int f116464c = 0;

    static {
        Covode.recordClassIndex(75174);
    }

    r(p pVar, Activity activity, int i2) {
        this.f116462a = pVar;
        this.f116463b = activity;
    }

    public final void onClick(View view) {
        ClickAgent.onClick(view);
        this.f116462a.a(this.f116463b, this.f116464c);
    }
}
