package com.ss.android.ugc.aweme.ecommerce.semipdp.repository;

import com.bytedance.covode.number.Covode;
import com.bytedance.ies.ugc.aweme.network.RetrofitFactory;
import com.bytedance.ies.ugc.aweme.network.f;
import com.bytedance.retrofit2.u;
import f.a.t;
import h.f.b.l;
import java.util.HashMap;
import java.util.Map;
import l.b.o;

public interface SemiPdpApi {

    /* renamed from: a  reason: collision with root package name */
    public static final a f87320a = a.f87321a;

    static {
        Covode.recordClassIndex(54809);
    }

    @o(a = "/api/v1/shop/third_party_product_info/get")
    t<u<com.ss.android.ugc.aweme.ecommerce.api.model.a<com.ss.android.ugc.aweme.ecommerce.pdp.repository.dto.a>>> getProductInfo(@l.b.a Map<String, Object> map);

    public static final class a {

        /* renamed from: a  reason: collision with root package name */
        static final /* synthetic */ a f87321a = new a();

        /* renamed from: b  reason: collision with root package name */
        private static final f f87322b = RetrofitFactory.a().b("https://oec-api.tiktokv.com/").d();

        private a() {
        }

        static {
            Covode.recordClassIndex(54810);
        }

        public static t<u<com.ss.android.ugc.aweme.ecommerce.api.model.a<com.ss.android.ugc.aweme.ecommerce.pdp.repository.dto.a>>> a(HashMap<String, Object> hashMap) {
            l.d(hashMap, "");
            return ((SemiPdpApi) f87322b.a(SemiPdpApi.class)).getProductInfo(hashMap);
        }
    }
}
