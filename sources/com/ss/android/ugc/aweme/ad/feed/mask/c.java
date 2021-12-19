package com.ss.android.ugc.aweme.ad.feed.mask;

import android.content.Context;
import android.view.ViewStub;
import android.widget.RelativeLayout;
import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.aweme.ad.feed.mask.a.a;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import h.f.b.l;

public final class c implements com.ss.android.ugc.aweme.commercialize_ad_api.a.c {

    /* renamed from: a  reason: collision with root package name */
    public Context f65970a;

    /* renamed from: b  reason: collision with root package name */
    public Aweme f65971b;

    /* renamed from: c  reason: collision with root package name */
    public a f65972c;

    /* renamed from: d  reason: collision with root package name */
    public String f65973d;

    /* renamed from: e  reason: collision with root package name */
    public RelativeLayout f65974e;

    /* renamed from: f  reason: collision with root package name */
    public ViewStub f65975f;

    static {
        Covode.recordClassIndex(40580);
    }

    @Override // com.ss.android.ugc.aweme.commercialize_ad_api.a.c
    public final int a() {
        return 3;
    }

    public final Context b() {
        Context context = this.f65970a;
        if (context == null) {
            l.a("context");
        }
        return context;
    }

    public final Aweme c() {
        Aweme aweme = this.f65971b;
        if (aweme == null) {
            l.a("aweme");
        }
        return aweme;
    }
}
