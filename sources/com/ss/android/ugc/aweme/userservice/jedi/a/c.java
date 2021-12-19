package com.ss.android.ugc.aweme.userservice.jedi.a;

import com.bytedance.covode.number.Covode;
import com.bytedance.jedi.a.f.a;
import com.ss.android.ugc.aweme.base.api.BaseResponse;
import com.ss.android.ugc.aweme.userservice.CommonFollowApi;
import f.a.t;
import h.f.b.l;

public final class c extends a<String, Integer, d, BaseResponse> {
    static {
        Covode.recordClassIndex(93173);
    }

    @Override // com.bytedance.jedi.a.f.b
    public final /* synthetic */ Object b(Object obj) {
        d dVar = (d) obj;
        l.d(dVar, "");
        return dVar.f142463a;
    }

    /* Return type fixed from 'f.a.t' to match base method */
    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
    @Override // com.bytedance.jedi.a.f.a
    public final /* synthetic */ t<BaseResponse> a(d dVar) {
        d dVar2 = dVar;
        l.d(dVar2, "");
        t<BaseResponse> remove = CommonFollowApi.f142436a.remove(dVar2.f142463a, dVar2.f142464b);
        l.b(remove, "");
        return remove;
    }

    @Override // com.bytedance.jedi.a.f.b
    public final /* synthetic */ Object a(Object obj, Object obj2) {
        BaseResponse baseResponse = (BaseResponse) obj2;
        l.d(obj, "");
        l.d(baseResponse, "");
        return Integer.valueOf(baseResponse.status_code);
    }
}
