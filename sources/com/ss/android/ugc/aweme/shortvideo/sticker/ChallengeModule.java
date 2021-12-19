package com.ss.android.ugc.aweme.shortvideo.sticker;

import com.bytedance.covode.number.Covode;
import com.google.c.h.a.q;
import com.ss.android.ugc.aweme.app.api.Api;
import com.ss.android.ugc.aweme.challenge.model.ChallengeDetail;
import com.ss.android.ugc.aweme.services.RetrofitService;
import l.b.f;
import l.b.t;

public final class ChallengeModule {

    /* renamed from: a  reason: collision with root package name */
    public final ChallengeDetailApi f130204a = ((ChallengeDetailApi) RetrofitService.createIRetrofitServicebyMonsterPlugin(false).createNewRetrofit(Api.f66569d).create(ChallengeDetailApi.class));

    public interface ChallengeDetailApi {
        static {
            Covode.recordClassIndex(85407);
        }

        @f(a = "/aweme/v1/challenge/detail/")
        q<ChallengeDetail> fetchChallengeDetail(@t(a = "ch_id") String str, @t(a = "hashtag_name") String str2, @t(a = "query_type") int i2, @t(a = "click_reason") int i3);

        @f(a = "/aweme/v1/commerce/challenge/detail/")
        q<ChallengeDetail> fetchCommerceChallengeDetail(@t(a = "ch_id") String str, @t(a = "hashtag_name") String str2, @t(a = "query_type") int i2, @t(a = "click_reason") int i3);
    }

    static {
        Covode.recordClassIndex(85405);
    }
}
