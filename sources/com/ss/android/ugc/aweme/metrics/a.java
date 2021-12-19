package com.ss.android.ugc.aweme.metrics;

import android.content.Context;
import android.text.TextUtils;
import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.aweme.feed.param.FeedParamProvider;
import com.ss.android.ugc.aweme.feed.param.b;
import com.ss.android.ugc.aweme.metrics.a;
import com.ss.android.ugc.aweme.metrics.c;
import h.f.b.l;

public abstract class a<E extends a<E>> extends h<E> {

    /* renamed from: a  reason: collision with root package name */
    public String f109463a;

    /* renamed from: b  reason: collision with root package name */
    public boolean f109464b;

    /* renamed from: c  reason: collision with root package name */
    public String f109465c;

    /* renamed from: d  reason: collision with root package name */
    public int f109466d = -1;

    static {
        Covode.recordClassIndex(70093);
    }

    public final E b() {
        this.f109464b = true;
        return this;
    }

    public final E c() {
        this.f109466d = 0;
        return this;
    }

    /* access modifiers changed from: protected */
    @Override // com.ss.android.ugc.aweme.metrics.h, com.ss.android.ugc.aweme.metrics.c
    public final void d() {
        super.d();
        String str = this.f109556h;
        boolean z = this.f109464b;
        String str2 = this.f109465c;
        if (TextUtils.equals("general_search", str) && !z) {
            str2 = "click_search_result_video";
        }
        if (!TextUtils.isEmpty(this.f109463a)) {
            a("search_keyword", this.f109463a, c.a.f109562a);
        }
        a("enter_method", str2, c.a.f109562a);
        int i2 = this.f109466d;
        if (i2 != -1) {
            a("is_fullscreen", String.valueOf(i2), c.a.f109562a);
        }
    }

    public final E a(String str) {
        this.f109465c = str;
        return this;
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public a(String str) {
        super(str);
        l.d(str, "");
    }

    public final E b(String str) {
        l.d(str, "");
        this.n = str;
        return this;
    }

    public final E a(Context context) {
        String str;
        if (context == null) {
            return this;
        }
        b a2 = FeedParamProvider.a.a(context);
        if (a2 != null) {
            str = a2.getSearchKeyword();
        } else {
            str = null;
        }
        this.f109463a = str;
        return this;
    }
}
