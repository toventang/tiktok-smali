package com.ss.android.ugc.aweme.notificationlive.repository;

import com.bytedance.covode.number.Covode;
import com.bytedance.jedi.a.f.a;
import com.ss.android.ugc.aweme.app.api.Api;
import com.ss.android.ugc.aweme.following.a.c;
import com.ss.android.ugc.aweme.profile.model.User;
import com.ss.android.ugc.aweme.services.RetrofitService;
import f.a.t;
import h.f.b.l;
import java.util.List;

public final class b extends a<a, List<? extends User>, a, c> {

    /* renamed from: a  reason: collision with root package name */
    private final SettingFollowingListApi f114369a;

    static {
        Covode.recordClassIndex(73552);
    }

    public b() {
        Object create = RetrofitService.createIRetrofitServicebyMonsterPlugin(false).createNewRetrofit(Api.f66569d).create(SettingFollowingListApi.class);
        l.b(create, "");
        this.f114369a = (SettingFollowingListApi) create;
    }

    @Override // com.bytedance.jedi.a.f.b
    public final /* synthetic */ Object b(Object obj) {
        l.d(obj, "");
        return obj;
    }

    /* Return type fixed from 'f.a.t' to match base method */
    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
    @Override // com.bytedance.jedi.a.f.a
    public final /* synthetic */ t<c> a(a aVar) {
        a aVar2 = aVar;
        l.d(aVar2, "");
        t<c> b2 = this.f114369a.queryFollowingList(aVar2.f114360a, aVar2.f114361b, aVar2.f114363d, aVar2.f114364e, aVar2.f114365f).b(f.a.h.a.b(f.a.k.a.f158006c));
        l.b(b2, "");
        return b2;
    }

    @Override // com.bytedance.jedi.a.f.b
    public final /* synthetic */ Object a(Object obj, Object obj2) {
        c cVar = (c) obj2;
        l.d(obj, "");
        l.d(cVar, "");
        return cVar.f96327a;
    }
}
