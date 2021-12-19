package com.bytedance.android.livesdk.feed.tab.b;

import com.bytedance.android.live.network.response.a;
import com.bytedance.android.livesdk.feed.feed.f;
import com.bytedance.android.livesdk.feed.tab.api.FeedTabApi;
import com.bytedance.android.livesdk.model.ah;
import com.bytedance.covode.number.Covode;
import f.a.t;

public final class k implements i {

    /* renamed from: a  reason: collision with root package name */
    private FeedTabApi f17686a;

    static {
        Covode.recordClassIndex(9812);
    }

    @Override // com.bytedance.android.livesdk.feed.tab.b.i
    public final t<a<ah, f>> a() {
        try {
            return this.f17686a.queryTab(0).b(f.a.h.a.b(f.a.k.a.f158006c));
        } catch (Throwable th) {
            com.bytedance.android.live.core.c.a.b("RemoteFeedTabDataSource", "loadFeedTabWithExtra", th);
            return null;
        }
    }

    @Override // com.bytedance.android.livesdk.feed.tab.b.i
    public final t<a<ah, f>> b() {
        return this.f17686a.queryTab(2).b(f.a.h.a.b(f.a.k.a.f158006c)).a(f.a.a.a.a.a(f.a.a.b.a.f157156a));
    }

    public k(FeedTabApi feedTabApi) {
        this.f17686a = feedTabApi;
    }
}
