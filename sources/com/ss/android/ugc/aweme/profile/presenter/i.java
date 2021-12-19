package com.ss.android.ugc.aweme.profile.presenter;

import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.aweme.feed.model.FeedItemList;
import f.a.v;
import f.a.w;

/* access modifiers changed from: package-private */
public final /* synthetic */ class i implements w {

    /* renamed from: a  reason: collision with root package name */
    private final b f116578a;

    /* renamed from: b  reason: collision with root package name */
    private final String f116579b;

    static {
        Covode.recordClassIndex(75317);
    }

    i(b bVar, String str) {
        this.f116578a = bVar;
        this.f116579b = str;
    }

    @Override // f.a.w
    public final void subscribe(v vVar) {
        FeedItemList c2 = this.f116578a.c(this.f116579b);
        if (c2 == null) {
            c2 = new FeedItemList();
        }
        c2.hasMore = 0;
        vVar.a(c2);
    }
}
