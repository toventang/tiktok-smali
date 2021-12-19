package com.ss.android.ugc.aweme.commerce_challenge_impl.b;

import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.aweme.commerce_challenge_api.service.ICommerceChallengeOutService;
import com.ss.android.ugc.aweme.commercialize.service.CommerceChallengeOutService;
import com.ss.android.ugc.aweme.utils.dz;
import com.ss.android.ugc.aweme.utils.eb;
import com.ss.android.ugc.b;
import h.f.b.m;

public final class a {

    /* renamed from: a  reason: collision with root package name */
    public static final dz f73537a = eb.a(C1644a.f73539a);

    /* renamed from: b  reason: collision with root package name */
    public static final a f73538b = new a();

    private a() {
    }

    public static com.ss.android.ugc.aweme.commerce_challenge_api.a.a a() {
        return (com.ss.android.ugc.aweme.commerce_challenge_api.a.a) f73537a.a();
    }

    /* renamed from: com.ss.android.ugc.aweme.commerce_challenge_impl.b.a$a  reason: collision with other inner class name */
    static final class C1644a extends m implements h.f.a.a<com.ss.android.ugc.aweme.commerce_challenge_api.a.a> {

        /* renamed from: a  reason: collision with root package name */
        public static final C1644a f73539a = new C1644a();

        static {
            Covode.recordClassIndex(45261);
        }

        C1644a() {
            super(0);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // h.f.a.a
        public final /* synthetic */ com.ss.android.ugc.aweme.commerce_challenge_api.a.a invoke() {
            ICommerceChallengeOutService commerceChallengeOutService;
            Object a2 = b.a(ICommerceChallengeOutService.class, false);
            if (a2 != null) {
                commerceChallengeOutService = (ICommerceChallengeOutService) a2;
                if (commerceChallengeOutService == null) {
                    return null;
                }
            } else {
                commerceChallengeOutService = new CommerceChallengeOutService();
            }
            return commerceChallengeOutService.a();
        }
    }

    static {
        Covode.recordClassIndex(45260);
    }
}
