package com.ss.android.ugc.aweme.metrics;

import android.text.TextUtils;
import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.metrics.c;

public final class an extends h<an> {

    /* renamed from: a  reason: collision with root package name */
    public String f109503a;

    /* renamed from: b  reason: collision with root package name */
    private String f109504b;

    /* renamed from: c  reason: collision with root package name */
    private Aweme f109505c;

    /* renamed from: d  reason: collision with root package name */
    private String f109506d;

    static {
        Covode.recordClassIndex(70109);
    }

    public an() {
        super("tab_stay_time");
    }

    /* access modifiers changed from: protected */
    @Override // com.ss.android.ugc.aweme.metrics.c
    public final void a() {
        a("duration", this.f109503a, c.a.f109562a);
        a("enter_from", this.f109556h, c.a.f109562a);
        a("group_id", ac.e(this.f109505c), c.a.f109562a);
        a("author_id", ac.a(this.f109505c), c.a.f109562a);
        a("city_info", "", c.a.f109562a);
        a("enter_method", this.f109506d, c.a.f109562a);
        if (!TextUtils.isEmpty(this.f109504b)) {
            a("page_type", this.f109504b, c.a.f109562a);
        }
    }

    public final an a(String str) {
        this.f109556h = str;
        return this;
    }

    /* Return type fixed from 'com.ss.android.ugc.aweme.metrics.h' to match base method */
    @Override // com.ss.android.ugc.aweme.metrics.h
    public final /* bridge */ /* synthetic */ an g(Aweme aweme) {
        super.g(aweme);
        this.f109505c = aweme;
        return this;
    }
}
