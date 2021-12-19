package com.ss.android.ugc.aweme.friends.recommendlist.repository;

import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.aweme.feed.i;
import com.ss.android.ugc.aweme.friends.model.DislikeRecommendParams;
import com.ss.android.ugc.aweme.social.api.RecommendUserApiService;
import f.a.d.g;
import f.a.t;
import h.f.b.l;

public final class a extends com.bytedance.jedi.a.f.a<String, String, DislikeRecommendParams, String> {
    static {
        Covode.recordClassIndex(61629);
    }

    /* renamed from: com.ss.android.ugc.aweme.friends.recommendlist.repository.a$a  reason: collision with other inner class name */
    static final class C2339a<T, R> implements g {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ DislikeRecommendParams f96986a;

        static {
            Covode.recordClassIndex(61630);
        }

        C2339a(DislikeRecommendParams dislikeRecommendParams) {
            this.f96986a = dislikeRecommendParams;
        }

        @Override // f.a.d.g
        public final /* synthetic */ Object apply(Object obj) {
            l.d(obj, "");
            return this.f96986a.uid;
        }
    }

    @Override // com.bytedance.jedi.a.f.b
    public final /* synthetic */ Object b(Object obj) {
        DislikeRecommendParams dislikeRecommendParams = (DislikeRecommendParams) obj;
        l.d(dislikeRecommendParams, "");
        return dislikeRecommendParams.uid;
    }

    /* Return type fixed from 'f.a.t' to match base method */
    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
    @Override // com.bytedance.jedi.a.f.a
    public final /* synthetic */ t<String> a(DislikeRecommendParams dislikeRecommendParams) {
        DislikeRecommendParams dislikeRecommendParams2 = dislikeRecommendParams;
        l.d(dislikeRecommendParams2, "");
        t<R> d2 = RecommendUserApiService.f133669a.dislikeRecommend(dislikeRecommendParams2.uid, dislikeRecommendParams2.secUid, Integer.valueOf(i.SCENE_CARD.getValue())).b(f.a.h.a.b(f.a.k.a.f158006c)).a(f.a.a.a.a.a(f.a.a.b.a.f157156a)).d(new C2339a(dislikeRecommendParams2));
        l.b(d2, "");
        return d2;
    }

    @Override // com.bytedance.jedi.a.f.b
    public final /* synthetic */ Object a(Object obj, Object obj2) {
        l.d(obj, "");
        l.d(obj2, "");
        return obj2;
    }
}
