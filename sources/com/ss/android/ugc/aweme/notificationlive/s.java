package com.ss.android.ugc.aweme.notificationlive;

import com.bytedance.covode.number.Covode;
import com.bytedance.ies.ugc.aweme.network.RetrofitFactory;
import com.bytedance.jedi.a.f.a;
import f.a.t;
import h.f.b.l;

public final class s extends a<String, w, v, w> {

    /* renamed from: a  reason: collision with root package name */
    public final NotificationLiveApi f114373a;

    static {
        Covode.recordClassIndex(73563);
    }

    public s() {
        Object a2 = RetrofitFactory.a().a("https://webcast16-normal-c-useast1a.tiktokv.com/").a(NotificationLiveApi.class);
        l.b(a2, "");
        this.f114373a = (NotificationLiveApi) a2;
    }

    @Override // com.bytedance.jedi.a.f.b
    public final /* synthetic */ Object b(Object obj) {
        v vVar = (v) obj;
        l.d(vVar, "");
        return vVar.f114474b;
    }

    /* Return type fixed from 'f.a.t' to match base method */
    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
    @Override // com.bytedance.jedi.a.f.a
    public final /* synthetic */ t<w> a(v vVar) {
        v vVar2 = vVar;
        l.d(vVar2, "");
        return this.f114373a.changeOptions(vVar2.f114473a, vVar2.f114474b);
    }

    @Override // com.bytedance.jedi.a.f.b
    public final /* synthetic */ Object a(Object obj, Object obj2) {
        l.d(obj, "");
        l.d(obj2, "");
        return obj2;
    }
}
