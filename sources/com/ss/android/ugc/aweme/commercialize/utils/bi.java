package com.ss.android.ugc.aweme.commercialize.utils;

import android.app.Activity;
import android.content.Context;
import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.aweme.crossplatform.activity.m;
import com.ss.android.ugc.aweme.crossplatform.business.g;
import com.ss.android.ugc.aweme.crossplatform.platform.webview.e;
import com.ss.android.ugc.aweme.crossplatform.view.a;

public class bi implements m {

    /* renamed from: c  reason: collision with root package name */
    protected final Activity f75666c;

    /* renamed from: d  reason: collision with root package name */
    protected a f75667d;

    /* renamed from: e  reason: collision with root package name */
    protected e f75668e;

    /* renamed from: f  reason: collision with root package name */
    protected final com.ss.android.ugc.aweme.crossplatform.d.a.a f75669f;

    /* renamed from: g  reason: collision with root package name */
    protected final g f75670g = g.a.a(this);

    static {
        Covode.recordClassIndex(46671);
    }

    @Override // com.ss.android.ugc.aweme.crossplatform.activity.m
    public final void a(CharSequence charSequence, boolean z) {
    }

    @Override // com.ss.android.ugc.aweme.web.g
    public final void a(String str) {
    }

    @Override // com.ss.android.ugc.aweme.crossplatform.activity.m
    public final void c() {
    }

    @Override // com.ss.android.ugc.aweme.crossplatform.activity.m
    public final void d() {
    }

    @Override // com.ss.android.ugc.aweme.crossplatform.activity.m
    public final e e() {
        return this.f75668e;
    }

    @Override // com.ss.android.ugc.aweme.crossplatform.activity.m
    public final a f() {
        return this.f75667d;
    }

    @Override // com.ss.android.ugc.aweme.crossplatform.a.c
    public Context getContext() {
        return this.f75666c;
    }

    @Override // com.ss.android.ugc.aweme.crossplatform.a.c
    public g getCrossPlatformBusiness() {
        return this.f75670g;
    }

    @Override // com.ss.android.ugc.aweme.crossplatform.a.c
    public com.ss.android.ugc.aweme.crossplatform.d.a.a getCrossPlatformParams() {
        return this.f75669f;
    }

    @Override // com.ss.android.ugc.aweme.crossplatform.a.c
    public final void g() {
        this.f75667d.g();
    }

    @Override // com.ss.android.ugc.aweme.crossplatform.a.c
    public final boolean h() {
        return this.f75667d.h();
    }

    public bi(Activity activity, a aVar, e eVar, com.ss.android.ugc.aweme.crossplatform.d.a.a aVar2) {
        this.f75666c = activity;
        this.f75667d = aVar;
        this.f75668e = eVar;
        this.f75669f = aVar2;
    }
}
