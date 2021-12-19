package com.ss.android.ugc.aweme.im.sdk.chat.feature.input.gifsearch.giphy;

import com.bytedance.covode.number.Covode;
import com.bytedance.ies.ugc.aweme.network.RetrofitFactory;
import com.ss.android.ugc.aweme.im.sdk.common.controller.d.a;
import h.f.b.l;

public final class b {

    /* renamed from: a  reason: collision with root package name */
    static final GiphyGifApi f100783a;

    /* renamed from: b  reason: collision with root package name */
    public static final b f100784b = new b();

    private b() {
    }

    static {
        Covode.recordClassIndex(64478);
        Object a2 = RetrofitFactory.a().b(a.f102220b).d().a(GiphyGifApi.class);
        l.b(a2, "");
        f100783a = (GiphyGifApi) a2;
    }

    public static a a(f fVar) {
        l.d(fVar, "");
        return new g(fVar);
    }

    public static f a(GiphyGifApi giphyGifApi) {
        l.d(giphyGifApi, "");
        return new f(giphyGifApi);
    }
}
