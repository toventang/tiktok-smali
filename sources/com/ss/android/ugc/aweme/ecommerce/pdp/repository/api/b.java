package com.ss.android.ugc.aweme.ecommerce.pdp.repository.api;

import com.bytedance.covode.number.Covode;
import com.bytedance.jedi.a.f.a;
import com.ss.android.ugc.aweme.ecommerce.pdp.IPdpStarter;
import com.ss.android.ugc.aweme.ecommerce.pdp.repository.api.PdpApi;
import f.a.t;
import h.f.b.l;

public final class b extends a<IPdpStarter.PdpEnterParam, com.ss.android.ugc.aweme.ecommerce.pdp.repository.dto.b, IPdpStarter.PdpEnterParam, com.ss.android.ugc.aweme.ecommerce.pdp.repository.dto.b> {
    static {
        Covode.recordClassIndex(54220);
    }

    @Override // com.bytedance.jedi.a.f.b
    public final /* synthetic */ Object b(Object obj) {
        l.d(obj, "");
        return obj;
    }

    /* Return type fixed from 'f.a.t' to match base method */
    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
    @Override // com.bytedance.jedi.a.f.a
    public final /* synthetic */ t<com.ss.android.ugc.aweme.ecommerce.pdp.repository.dto.b> a(IPdpStarter.PdpEnterParam pdpEnterParam) {
        IPdpStarter.PdpEnterParam pdpEnterParam2 = pdpEnterParam;
        l.d(pdpEnterParam2, "");
        l.d(pdpEnterParam2, "");
        t<com.ss.android.ugc.aweme.ecommerce.pdp.repository.dto.b> b2 = ((PdpApi) PdpApi.a.f86538a.a(PdpApi.class)).getProductInfo(pdpEnterParam2.getRequestParams()).b(f.a.h.a.b(f.a.k.a.f158006c));
        l.b(b2, "");
        return b2;
    }

    @Override // com.bytedance.jedi.a.f.b
    public final /* synthetic */ Object a(Object obj, Object obj2) {
        l.d(obj, "");
        l.d(obj2, "");
        return obj2;
    }
}
