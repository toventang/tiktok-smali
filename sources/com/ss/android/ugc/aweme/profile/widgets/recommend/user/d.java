package com.ss.android.ugc.aweme.profile.widgets.recommend.user;

import android.text.TextUtils;
import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.aweme.IAccountUserService;
import com.ss.android.ugc.aweme.account.b;
import com.ss.android.ugc.aweme.newfollow.c.e;
import com.ss.android.ugc.aweme.social.api.IRecommendUserApi;
import com.ss.android.ugc.aweme.social.api.RecommendUserApiService;
import h.f.b.l;

public final class d implements com.bytedance.assem.arch.a.a<c> {

    /* renamed from: a  reason: collision with root package name */
    public final IRecommendUserApi f118053a = RecommendUserApiService.f133669a;

    /* renamed from: b  reason: collision with root package name */
    public final c f118054b = new a(this);

    static {
        Covode.recordClassIndex(76633);
    }

    /* Return type fixed from 'com.bytedance.assem.arch.a.d' to match base method */
    @Override // com.bytedance.assem.arch.a.a
    public final /* bridge */ /* synthetic */ c a() {
        return this.f118054b;
    }

    public static final class a implements c {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ d f118055a;

        static {
            Covode.recordClassIndex(76634);
        }

        private static int a(int i2) {
            if (i2 == 4) {
                return 1;
            }
            if (i2 != 13) {
                return i2 != 21 ? 0 : 3;
            }
            return 2;
        }

        /* JADX WARN: Incorrect args count in method signature: ()V */
        a(d dVar) {
            this.f118055a = dVar;
        }

        @Override // com.ss.android.ugc.aweme.profile.widgets.recommend.user.c
        public final Object a(String str, int i2, int i3, String str2, String str3, String str4) {
            int i4;
            IAccountUserService g2 = b.g();
            l.b(g2, "");
            if (g2.isUidContactPermisioned()) {
                i4 = 1;
            } else {
                i4 = 2;
            }
            if (!TextUtils.isEmpty(str2)) {
                IRecommendUserApi iRecommendUserApi = this.f118055a.f118053a;
                Integer a2 = h.c.b.a.b.a(30);
                Integer a3 = h.c.b.a.b.a(0);
                Integer a4 = h.c.b.a.b.a(i3);
                Integer a5 = h.c.b.a.b.a(1);
                Integer a6 = h.c.b.a.b.a(i4);
                e eVar = e.a.f112592a;
                l.b(eVar, "");
                return iRecommendUserApi.recommendList(a2, a3, str, a4, a5, a6, eVar.a(), str2, str3, null);
            } else if (i3 != 1) {
                if (i3 != 4 && i3 != 13) {
                    return null;
                }
                IRecommendUserApi iRecommendUserApi2 = this.f118055a.f118053a;
                Integer a7 = h.c.b.a.b.a(30);
                Integer a8 = h.c.b.a.b.a(0);
                e eVar2 = e.a.f112592a;
                l.b(eVar2, "");
                return iRecommendUserApi2.recommendListMT(a7, a8, eVar2.a(), str3, h.c.b.a.b.a(a(i3)), false);
            } else if (str4.length() > 0) {
                IRecommendUserApi iRecommendUserApi3 = this.f118055a.f118053a;
                Integer a9 = h.c.b.a.b.a(30);
                Integer a10 = h.c.b.a.b.a(i2);
                e eVar3 = e.a.f112592a;
                l.b(eVar3, "");
                return iRecommendUserApi3.recommendListTask(a9, a10, eVar3.a(), str, h.c.b.a.b.a(a(i3)), str4, false);
            } else {
                IRecommendUserApi iRecommendUserApi4 = this.f118055a.f118053a;
                Integer a11 = h.c.b.a.b.a(30);
                Integer a12 = h.c.b.a.b.a(0);
                e eVar4 = e.a.f112592a;
                l.b(eVar4, "");
                return iRecommendUserApi4.recommendListMT(a11, a12, eVar4.a(), str, h.c.b.a.b.a(a(i3)), false);
            }
        }
    }
}
