package com.ss.android.ugc.aweme.share;

import com.bytedance.covode.number.Covode;
import com.bytedance.ies.ugc.aweme.network.RetrofitFactory;
import com.ss.android.ugc.aweme.share.model.ShortenModel;
import com.ss.android.ugc.aweme.share.model.b;
import f.a.n;
import l.b.c;
import l.b.e;
import l.b.f;
import l.b.o;
import l.b.t;

public final class ShortenUrlApi {

    /* renamed from: a  reason: collision with root package name */
    private static final String f123262a = "https://api-va.tiktokv.com/";

    /* renamed from: b  reason: collision with root package name */
    private static final RetrofitApi f123263b = ((RetrofitApi) RetrofitFactory.a().a("https://api-va.tiktokv.com/").a(RetrofitApi.class));

    interface RetrofitApi {
        static {
            Covode.recordClassIndex(80974);
        }

        @f(a = "/shorten/")
        n<ShortenModel> fetchShortenUrl(@t(a = "target") String str, @t(a = "belong") String str2, @t(a = "persist") String str3);

        @o(a = "/tiktok/v1/sharer/info/sign")
        @e
        n<b> getSharerInfoChecksum(@c(a = "item_id") String str);
    }

    static {
        Covode.recordClassIndex(80973);
    }

    public static n<b> a(String str) {
        return f123263b.getSharerInfoChecksum(str);
    }

    public static n<ShortenModel> a(String str, String str2) {
        return f123263b.fetchShortenUrl(str, str2, "1");
    }
}
