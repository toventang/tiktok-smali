package com.ss.android.ugc.aweme.challenge.service;

import b.i;
import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.aweme.challenge.api.ChallengeApi;
import com.ss.android.ugc.aweme.challenge.model.ChallengeDetail;
import com.ss.android.ugc.aweme.challenge.service.IChallengeService;
import com.ss.android.ugc.aweme.commerce_challenge_impl.service.CommerceChallengeServiceImpl;
import com.ss.android.ugc.aweme.music.model.Music;
import com.ss.android.ugc.aweme.utils.in;

public final class a implements IChallengeService {
    static {
        Covode.recordClassIndex(43188);
    }

    /* renamed from: com.ss.android.ugc.aweme.challenge.service.a$a  reason: collision with other inner class name */
    static class C1586a {

        /* renamed from: a  reason: collision with root package name */
        public static final a f70014a = new a();

        static {
            Covode.recordClassIndex(43189);
        }
    }

    @Override // com.ss.android.ugc.aweme.challenge.service.IChallengeService
    public final void a(String str, String str2, String str3, Music music, IChallengeService.a aVar) {
        i<ChallengeDetail> fetchChallengeDetail;
        boolean z = false;
        if (!CommerceChallengeServiceImpl.e().b(str2) || in.d()) {
            fetchChallengeDetail = ChallengeApi.f69894g.fetchChallengeDetail(str2, null, 0, 0);
            z = true;
        } else {
            fetchChallengeDetail = ChallengeApi.a(str2, null);
        }
        fetchChallengeDetail.b(new b(z, str2), i.f4824a).a(new c(str, str3, music, aVar), i.f4826c, null);
    }
}
