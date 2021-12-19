package com.ss.android.ugc.aweme.share;

import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.aweme.share.model.ShortenModel;
import f.a.n;
import l.b.c;
import l.b.e;
import l.b.o;

public interface IShortenUrlApi {
    static {
        Covode.recordClassIndex(80947);
    }

    @o(a = "/tiktok/share/link/shorten/v1/")
    @e
    n<ShortenModel> getShareLinkShortenUel(@c(a = "scene") int i2, @c(a = "platform_id") String str, @c(a = "share_url") String str2);
}
