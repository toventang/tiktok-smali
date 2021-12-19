package com.ss.android.ugc.aweme.profile.f;

import android.app.Activity;
import android.view.View;
import com.bytedance.apm.agent.v2.instrumentation.ClickAgent;
import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.aweme.profile.model.User;

/* access modifiers changed from: package-private */
public final /* synthetic */ class t implements View.OnClickListener {

    /* renamed from: a  reason: collision with root package name */
    private final p f116467a;

    /* renamed from: b  reason: collision with root package name */
    private final Activity f116468b;

    /* renamed from: c  reason: collision with root package name */
    private final View f116469c;

    /* renamed from: d  reason: collision with root package name */
    private final String f116470d;

    /* renamed from: e  reason: collision with root package name */
    private final User f116471e;

    static {
        Covode.recordClassIndex(75176);
    }

    t(p pVar, Activity activity, View view, String str, User user) {
        this.f116467a = pVar;
        this.f116468b = activity;
        this.f116469c = view;
        this.f116470d = str;
        this.f116471e = user;
    }

    public final void onClick(View view) {
        ClickAgent.onClick(view);
        this.f116467a.a(this.f116468b, this.f116469c, this.f116470d, this.f116471e);
    }
}
