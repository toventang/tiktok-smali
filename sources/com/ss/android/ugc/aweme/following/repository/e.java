package com.ss.android.ugc.aweme.following.repository;

import com.bytedance.covode.number.Covode;
import com.bytedance.jedi.a.f.a;
import com.ss.android.ugc.aweme.following.a.c;
import com.ss.android.ugc.aweme.following.repository.FollowRelationApi;
import com.ss.android.ugc.aweme.profile.model.User;
import f.a.t;
import h.f.b.l;
import java.util.List;

public final class e extends a<a, List<? extends User>, a, c> {

    /* renamed from: a  reason: collision with root package name */
    private final FollowRelationApi f96368a = FollowRelationApi.a.a();

    static {
        Covode.recordClassIndex(61021);
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
        t<c> b2 = this.f96368a.queryFollowingList(aVar2.f96348a, aVar2.f96349b, aVar2.f96350c, aVar2.f96351d, aVar2.f96352e, aVar2.f96353f, aVar2.f96354g).b(f.a.h.a.b(f.a.k.a.f158006c));
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
