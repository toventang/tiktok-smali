package com.bytedance.android.livesdk.feed.drawerfeed;

import com.bytedance.android.livesdk.feed.dislike.DislikeApi;
import com.bytedance.android.livesdk.feed.dislike.a;
import com.bytedance.android.livesdk.feed.h;
import com.bytedance.android.livesdk.feed.m;
import com.bytedance.android.livesdk.feed.services.d;
import com.bytedance.android.livesdk.feed.tab.b.g;
import com.bytedance.android.livesdkapi.g.k;
import com.bytedance.covode.number.Covode;

public final class e {

    /* renamed from: a  reason: collision with root package name */
    l f17387a;

    /* renamed from: b  reason: collision with root package name */
    h f17388b = d.a();

    /* renamed from: c  reason: collision with root package name */
    m f17389c = g.b();

    /* renamed from: d  reason: collision with root package name */
    com.bytedance.android.livesdkapi.g.g f17390d = k.f23204a;

    /* renamed from: e  reason: collision with root package name */
    com.bytedance.android.livesdkapi.depend.d.g f17391e;

    /* renamed from: f  reason: collision with root package name */
    a f17392f = new a((DislikeApi) com.bytedance.android.live.network.e.a().a(DislikeApi.class));

    static {
        Covode.recordClassIndex(9641);
    }

    public e(l lVar) {
        if (com.bytedance.android.live.t.a.a(com.bytedance.android.live.i.a.d.class) != null) {
            this.f17391e = ((com.bytedance.android.live.i.a.d) com.bytedance.android.live.t.a.a(com.bytedance.android.live.i.a.d.class)).getLivePlayController();
        }
        this.f17387a = lVar;
    }
}
