package com.ss.android.ugc.aweme.friends.recommendlist.repository;

import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.aweme.friends.model.RecommendList;
import com.ss.android.ugc.aweme.profile.model.User;
import com.ss.android.ugc.aweme.social.api.IRecommendUserApi;
import com.ss.android.ugc.aweme.social.api.RecommendUserApiService;
import com.ss.android.ugc.aweme.user.repository.b;
import f.a.t;
import h.f.b.l;
import java.util.ArrayList;
import java.util.List;

public final class h extends com.bytedance.jedi.a.f.a<i, List<? extends b>, i, RecommendList> {

    /* renamed from: a  reason: collision with root package name */
    public static final a f97008a = new a((byte) 0);

    static {
        Covode.recordClassIndex(61652);
    }

    public static final class a {
        static {
            Covode.recordClassIndex(61653);
        }

        private a() {
        }

        public /* synthetic */ a(byte b2) {
            this();
        }
    }

    @Override // com.bytedance.jedi.a.f.b
    public final /* synthetic */ Object b(Object obj) {
        l.d(obj, "");
        return obj;
    }

    /* Return type fixed from 'f.a.t' to match base method */
    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
    @Override // com.bytedance.jedi.a.f.a
    public final /* synthetic */ t<RecommendList> a(i iVar) {
        int i2;
        i iVar2 = iVar;
        l.d(iVar2, "");
        RecommendUserApiService recommendUserApiService = RecommendUserApiService.f133669a;
        Integer num = iVar2.f97009a;
        Integer num2 = iVar2.f97010b;
        String str = iVar2.f97015g;
        String str2 = iVar2.f97018j;
        Integer valueOf = Integer.valueOf(iVar2.f97012d);
        if (valueOf != null) {
            if (valueOf.intValue() == 4) {
                i2 = 1;
            } else if (valueOf.intValue() == 21) {
                i2 = 3;
            } else if (valueOf.intValue() == 13) {
                i2 = 2;
            }
            return IRecommendUserApi.a.a(recommendUserApiService, num, num2, str, str2, Integer.valueOf(i2), null, 96);
        }
        i2 = 0;
        return IRecommendUserApi.a.a(recommendUserApiService, num, num2, str, str2, Integer.valueOf(i2), null, 96);
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
