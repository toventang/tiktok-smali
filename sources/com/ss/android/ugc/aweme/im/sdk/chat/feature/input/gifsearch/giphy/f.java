package com.ss.android.ugc.aweme.im.sdk.chat.feature.input.gifsearch.giphy;

import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.aweme.im.sdk.chat.feature.input.gifsearch.giphy.a.c;
import f.a.ab;
import h.f.b.l;

public final class f implements a {

    /* renamed from: a  reason: collision with root package name */
    private final GiphyGifApi f100787a;

    static {
        Covode.recordClassIndex(64482);
    }

    @Override // com.ss.android.ugc.aweme.im.sdk.chat.feature.input.gifsearch.giphy.a
    public final ab<c> a(int i2) {
        return this.f100787a.getTrendingGiphy(i2);
    }

    public f(GiphyGifApi giphyGifApi) {
        l.d(giphyGifApi, "");
        this.f100787a = giphyGifApi;
    }
}
