package com.ss.android.ugc.aweme.im.sdk.chat.feature.input.gifsearch.giphy;

import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.aweme.im.sdk.chat.feature.input.gifsearch.giphy.a.c;
import f.a.ab;
import l.b.f;
import l.b.t;

public interface GiphyGifApi {
    static {
        Covode.recordClassIndex(64469);
    }

    @f(a = "im/resources/gifs/search/")
    ab<c> getSearchingGiphy(@t(a = "q") String str, @t(a = "offset") int i2);

    @f(a = "im/resources/gifs/trending/")
    ab<c> getTrendingGiphy(@t(a = "offset") int i2);
}
