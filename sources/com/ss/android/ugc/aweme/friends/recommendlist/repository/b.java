package com.ss.android.ugc.aweme.friends.recommendlist.repository;

import com.bytedance.covode.number.Covode;
import com.bytedance.ies.ugc.aweme.network.RetrofitFactory;
import com.ss.android.ugc.aweme.friends.model.MutualUserList;
import com.ss.android.ugc.aweme.profile.model.User;
import f.a.t;
import h.a.z;
import h.f.b.l;
import java.util.List;

public final class b extends com.bytedance.jedi.a.f.a<c, List<? extends User>, c, MutualUserList> {

    /* renamed from: a  reason: collision with root package name */
    public static final a f96987a = new a((byte) 0);

    /* renamed from: b  reason: collision with root package name */
    private final RecommendApi f96988b;

    static {
        Covode.recordClassIndex(61631);
    }

    public static final class a {
        static {
            Covode.recordClassIndex(61632);
        }

        private a() {
        }

        public /* synthetic */ a(byte b2) {
            this();
        }
    }

    public b() {
        Object a2 = RetrofitFactory.a().b(com.ss.android.c.b.f59141e).d().a(RecommendApi.class);
        l.b(a2, "");
        this.f96988b = (RecommendApi) a2;
    }

    @Override // com.bytedance.jedi.a.f.b
    public final /* synthetic */ Object b(Object obj) {
        l.d(obj, "");
        return obj;
    }

    /* Return type fixed from 'f.a.t' to match base method */
    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
    @Override // com.bytedance.jedi.a.f.a
    public final /* synthetic */ t<MutualUserList> a(c cVar) {
        c cVar2 = cVar;
        l.d(cVar2, "");
        return this.f96988b.getMutualList(cVar2.f96989a, 20, cVar2.f96990b, cVar2.f96991c);
    }

    @Override // com.bytedance.jedi.a.f.b
    public final /* synthetic */ Object a(Object obj, Object obj2) {
        MutualUserList mutualUserList = (MutualUserList) obj2;
        l.d(obj, "");
        l.d(mutualUserList, "");
        if (mutualUserList.status_code != 0) {
            return z.INSTANCE;
        }
        List<User> list = mutualUserList.userList;
        if (list == null) {
            return z.INSTANCE;
        }
        return list;
    }
}
