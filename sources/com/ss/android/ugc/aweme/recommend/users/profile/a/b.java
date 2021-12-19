package com.ss.android.ugc.aweme.recommend.users.profile.a;

import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.aweme.newfollow.c.e;
import com.ss.android.ugc.aweme.social.api.IRecommendUserApi;
import com.ss.android.ugc.aweme.social.api.RecommendUserApiService;
import h.f.b.l;

public final class b implements com.bytedance.assem.arch.a.a<a> {

    /* renamed from: a  reason: collision with root package name */
    public final a f120124a = new a(this);

    static {
        Covode.recordClassIndex(78082);
    }

    /* Return type fixed from 'com.bytedance.assem.arch.a.d' to match base method */
    @Override // com.bytedance.assem.arch.a.a
    public final /* bridge */ /* synthetic */ a a() {
        return this.f120124a;
    }

    public static final class a implements a {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ b f120125a;

        static {
            Covode.recordClassIndex(78083);
        }

        /* JADX WARN: Incorrect args count in method signature: ()V */
        a(b bVar) {
            this.f120125a = bVar;
        }

        @Override // com.ss.android.ugc.aweme.recommend.users.profile.a.a
        public final Object a(int i2, int i3, String str, int i4, String str2) {
            int i5;
            RecommendUserApiService recommendUserApiService = RecommendUserApiService.f133669a;
            Integer a2 = h.c.b.a.b.a(i2);
            Integer a3 = h.c.b.a.b.a(i3);
            e eVar = e.a.f112592a;
            l.b(eVar, "");
            String a4 = eVar.a();
            if (i4 == 4) {
                i5 = 1;
            } else if (i4 == 13) {
                i5 = 2;
            } else if (i4 != 21) {
                i5 = 0;
            } else {
                i5 = 3;
            }
            return IRecommendUserApi.a.a(recommendUserApiService, a2, a3, a4, str, h.c.b.a.b.a(i5), str2, 64);
        }
    }
}
