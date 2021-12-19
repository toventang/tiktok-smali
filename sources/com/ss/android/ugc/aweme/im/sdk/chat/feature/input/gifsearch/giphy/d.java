package com.ss.android.ugc.aweme.im.sdk.chat.feature.input.gifsearch.giphy;

import com.bytedance.covode.number.Covode;
import dagger.a.c;
import dagger.a.f;
import javax.a.a;

public final class d implements c<f> {

    /* renamed from: a  reason: collision with root package name */
    private final a<GiphyGifApi> f100785a;

    static {
        Covode.recordClassIndex(64480);
    }

    @Override // javax.a.a
    public final /* synthetic */ Object get() {
        return a(this.f100785a.get());
    }

    public static f a(GiphyGifApi giphyGifApi) {
        return (f) f.a(b.a(giphyGifApi), "Cannot return null from a non-@Nullable @Provides method");
    }
}
