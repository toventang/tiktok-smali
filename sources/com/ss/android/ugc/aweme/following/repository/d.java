package com.ss.android.ugc.aweme.following.repository;

import com.bytedance.covode.number.Covode;
import com.bytedance.jedi.a.f.a;
import com.ss.android.ugc.aweme.following.a.b;
import com.ss.android.ugc.aweme.following.repository.FollowRelationApi;
import com.ss.android.ugc.aweme.profile.model.User;
import f.a.t;
import h.f.b.l;
import java.util.List;

public final class d extends a<a, List<? extends User>, a, b> {

    /* renamed from: a  reason: collision with root package name */
    private final FollowRelationApi f96367a = FollowRelationApi.a.a();

    static {
        Covode.recordClassIndex(61020);
    }

    @Override // com.bytedance.jedi.a.f.b
    public final /* synthetic */ Object b(Object obj) {
        l.d(obj, "");
        return obj;
    }

    /* Return type fixed from 'f.a.t' to match base method */
    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
    @Override // com.bytedance.jedi.a.f.a
    public final /* synthetic */ t<b> a(a aVar) {
        a aVar2 = aVar;
        l.d(aVar2, "");
        t<b> b2 = this.f96367a.queryFollowerList(aVar2.f96348a, aVar2.f96349b, aVar2.f96350c, aVar2.f96351d, aVar2.f96352e, aVar2.f96353f, aVar2.f96354g).b(f.a.h.a.b(f.a.k.a.f158006c));
        l.b(b2, "");
        return b2;
    }

    @Override // com.bytedance.jedi.a.f.b
    public final /* synthetic */ Object a(Object obj, Object obj2) {
        b bVar = (b) obj2;
        l.d(obj, "");
        l.d(bVar, "");
        return bVar.f96315a;
    }
}
