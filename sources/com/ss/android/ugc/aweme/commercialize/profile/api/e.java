package com.ss.android.ugc.aweme.commercialize.profile.api;

import android.content.Context;
import android.view.ViewStub;
import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.aweme.commercialize_ad_api.a.c;
import com.ss.android.ugc.aweme.feed.model.Aweme;

public final class e implements c {

    /* renamed from: a  reason: collision with root package name */
    public Context f75140a;

    /* renamed from: b  reason: collision with root package name */
    public Aweme f75141b;

    /* renamed from: c  reason: collision with root package name */
    public String f75142c;

    /* renamed from: d  reason: collision with root package name */
    public d f75143d;

    /* renamed from: e  reason: collision with root package name */
    public ViewStub f75144e;

    static {
        Covode.recordClassIndex(46351);
    }

    @Override // com.ss.android.ugc.aweme.commercialize_ad_api.a.c
    public final int a() {
        return 15;
    }

    public final e a(Context context, Aweme aweme, String str, d dVar) {
        this.f75140a = context;
        this.f75141b = aweme;
        this.f75142c = str;
        this.f75143d = dVar;
        return this;
    }
}
