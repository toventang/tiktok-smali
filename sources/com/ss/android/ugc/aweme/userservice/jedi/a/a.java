package com.ss.android.ugc.aweme.userservice.jedi.a;

import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.aweme.framework.services.IRetrofitService;
import com.ss.android.ugc.aweme.profile.model.FollowStatus;
import com.ss.android.ugc.aweme.services.IMainService;
import com.ss.android.ugc.aweme.services.MainServiceImpl;
import com.ss.android.ugc.aweme.services.RetrofitService;
import com.ss.android.ugc.aweme.userservice.jedi.model.JediFollowApi;
import f.a.t;
import h.f.b.l;

public final class a extends com.bytedance.jedi.a.f.a<String, Integer, com.ss.android.ugc.aweme.userservice.api.a, FollowStatus> {

    /* renamed from: a  reason: collision with root package name */
    public final JediFollowApi f142453a;

    static {
        Covode.recordClassIndex(93166);
    }

    public a() {
        IRetrofitService createIRetrofitServicebyMonsterPlugin = RetrofitService.createIRetrofitServicebyMonsterPlugin(false);
        IMainService createIMainServicebyMonsterPlugin = MainServiceImpl.createIMainServicebyMonsterPlugin(false);
        l.b(createIMainServicebyMonsterPlugin, "");
        Object create = createIRetrofitServicebyMonsterPlugin.createNewRetrofit(createIMainServicebyMonsterPlugin.getApiUrlPrefix()).create(JediFollowApi.class);
        l.b(create, "");
        this.f142453a = (JediFollowApi) create;
    }

    @Override // com.bytedance.jedi.a.f.b
    public final /* synthetic */ Object b(Object obj) {
        com.ss.android.ugc.aweme.userservice.api.a aVar = (com.ss.android.ugc.aweme.userservice.api.a) obj;
        l.d(aVar, "");
        return aVar.f142439a;
    }

    /* Return type fixed from 'f.a.t' to match base method */
    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
    @Override // com.bytedance.jedi.a.f.a
    public final /* synthetic */ t<FollowStatus> a(com.ss.android.ugc.aweme.userservice.api.a aVar) {
        com.ss.android.ugc.aweme.userservice.api.a aVar2 = aVar;
        l.d(aVar2, "");
        if (aVar2.f142443e == -1) {
            t<FollowStatus> b2 = this.f142453a.follow(aVar2.f142439a, aVar2.f142440b, aVar2.f142441c, aVar2.f142442d, null, aVar2.f142444f, null, aVar2.f142446h, aVar2.f142447i, aVar2.f142448j).b(f.a.h.a.b(f.a.k.a.f158006c));
            l.b(b2, "");
            return b2;
        }
        t<FollowStatus> b3 = this.f142453a.follow(aVar2.f142439a, aVar2.f142440b, aVar2.f142441c, aVar2.f142442d, Integer.valueOf(aVar2.f142443e), aVar2.f142444f, Integer.valueOf(aVar2.f142445g), aVar2.f142446h, aVar2.f142447i, aVar2.f142448j).b(f.a.h.a.b(f.a.k.a.f158006c));
        l.b(b3, "");
        return b3;
    }

    @Override // com.bytedance.jedi.a.f.b
    public final /* synthetic */ Object a(Object obj, Object obj2) {
        FollowStatus followStatus = (FollowStatus) obj2;
        l.d(obj, "");
        l.d(followStatus, "");
        if (followStatus.status_code == 0) {
            return Integer.valueOf(followStatus.followStatus);
        }
        return null;
    }
}
