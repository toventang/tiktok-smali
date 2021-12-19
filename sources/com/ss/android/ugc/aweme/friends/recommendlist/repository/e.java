package com.ss.android.ugc.aweme.friends.recommendlist.repository;

import com.bytedance.covode.number.Covode;
import com.bytedance.jedi.a.f.a;
import com.ss.android.ugc.aweme.friends.model.RecommendList;
import com.ss.android.ugc.aweme.profile.model.User;
import com.ss.android.ugc.aweme.social.api.RecommendUserApiService;
import com.ss.android.ugc.aweme.user.repository.b;
import f.a.t;
import h.f.b.l;
import java.util.ArrayList;
import java.util.List;

public final class e extends a<g, List<? extends b>, g, RecommendList> {
    static {
        Covode.recordClassIndex(61635);
    }

    @Override // com.bytedance.jedi.a.f.b
    public final /* synthetic */ Object b(Object obj) {
        l.d(obj, "");
        return obj;
    }

    /* Return type fixed from 'f.a.t' to match base method */
    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
    @Override // com.bytedance.jedi.a.f.a
    public final /* synthetic */ t<RecommendList> a(g gVar) {
        g gVar2 = gVar;
        l.d(gVar2, "");
        t<RecommendList> b2 = RecommendUserApiService.f133669a.recommendList(gVar2.f96998a, gVar2.f96999b, gVar2.f97000c, gVar2.f97001d, gVar2.f97002e, gVar2.f97003f, gVar2.f97004g, gVar2.f97005h, gVar2.f97007j).b(f.a.h.a.b(f.a.k.a.f158006c));
        l.b(b2, "");
        return b2;
    }

    @Override // com.bytedance.jedi.a.f.b
    public final /* synthetic */ Object a(Object obj, Object obj2) {
        List<User> userList;
        RecommendList recommendList = (RecommendList) obj2;
        l.d(obj, "");
        l.d(recommendList, "");
        ArrayList arrayList = null;
        if (recommendList.status_code == 0 && (userList = recommendList.getUserList()) != null) {
            arrayList = new ArrayList();
            for (T t : userList) {
                l.b(t, "");
                t.setRequestId(recommendList.getRid());
                String rid = recommendList.getRid();
                l.b(rid, "");
                arrayList.add(new b(t, rid, (byte) 0));
            }
        }
        return arrayList;
    }
}
