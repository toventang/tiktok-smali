package com.ss.android.ugc.aweme.challenge.c;

import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.aweme.challenge.service.IChallengeDetailProviderOutService;
import com.ss.android.ugc.aweme.commercialize.service.ChallengeDetailProviderOutService;
import com.ss.android.ugc.aweme.utils.dz;
import com.ss.android.ugc.aweme.utils.eb;
import com.ss.android.ugc.b;
import h.f.b.m;

public final class a {

    /* renamed from: a  reason: collision with root package name */
    public static final dz f69915a = eb.a(C1583a.f69917a);

    /* renamed from: b  reason: collision with root package name */
    public static final a f69916b = new a();

    private a() {
    }

    /* renamed from: com.ss.android.ugc.aweme.challenge.c.a$a  reason: collision with other inner class name */
    static final class C1583a extends m implements h.f.a.a<b> {

        /* renamed from: a  reason: collision with root package name */
        public static final C1583a f69917a = new C1583a();

        static {
            Covode.recordClassIndex(43112);
        }

        C1583a() {
            super(0);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // h.f.a.a
        public final /* synthetic */ b invoke() {
            IChallengeDetailProviderOutService challengeDetailProviderOutService;
            Object a2 = b.a(IChallengeDetailProviderOutService.class, false);
            if (a2 != null) {
                challengeDetailProviderOutService = (IChallengeDetailProviderOutService) a2;
                if (challengeDetailProviderOutService == null) {
                    return null;
                }
            } else {
                challengeDetailProviderOutService = new ChallengeDetailProviderOutService();
            }
            return challengeDetailProviderOutService.a();
        }
    }

    static {
        Covode.recordClassIndex(43111);
    }
}
