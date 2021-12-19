package com.ss.android.ugc.aweme.ecommerce.address.api;

import com.bytedance.covode.number.Covode;
import com.bytedance.ies.ugc.aweme.network.RetrofitFactory;
import com.bytedance.retrofit2.u;
import com.ss.android.ugc.aweme.ecommerce.address.dto.InputItemData;
import com.ss.android.ugc.aweme.ecommerce.address.dto.Region;
import com.ss.android.ugc.aweme.ecommerce.address.dto.b;
import com.ss.android.ugc.aweme.ecommerce.address.dto.c;
import com.ss.android.ugc.aweme.ecommerce.address.dto.e;
import com.ss.android.ugc.aweme.ecommerce.address.dto.f;
import com.ss.android.ugc.aweme.ecommerce.address.dto.h;
import com.ss.android.ugc.aweme.ecommerce.address.dto.j;
import com.ss.android.ugc.aweme.ecommerce.address.dto.k;
import com.ss.android.ugc.aweme.ecommerce.address.dto.l;
import f.a.t;
import l.b.o;

public interface AddressApi {

    /* renamed from: a  reason: collision with root package name */
    public static final a f84264a = a.f84266b;

    static {
        Covode.recordClassIndex(52544);
    }

    @o(a = "/api/v1/shop/shipping_address/delete")
    t<com.ss.android.ugc.aweme.ecommerce.api.model.a<Object>> deleteAddress(@l.b.a h hVar);

    @o(a = "/api/v1/shop/shipping_address/get")
    t<u<com.ss.android.ugc.aweme.ecommerce.api.model.a<com.ss.android.ugc.aweme.ecommerce.address.dto.a>>> getAddressList();

    @o(a = "/api/v1/shop/shipping_address/get_detail_place")
    t<u<com.ss.android.ugc.aweme.ecommerce.api.model.a<c>>> getCandDetailPlace(@l.b.a b bVar);

    @o(a = "/api/v1/shop/shipping_address/get_shipping_address_candidate_input")
    t<u<com.ss.android.ugc.aweme.ecommerce.api.model.a<e>>> getCandInput(@l.b.a f fVar);

    @o(a = "/api/v1/shop/shipping_address/input_item")
    t<u<com.ss.android.ugc.aweme.ecommerce.api.model.a<InputItemData>>> getInputItems(@l.b.a j jVar);

    @o(a = "/api/v1/shop/shipping_address/save")
    t<u<com.ss.android.ugc.aweme.ecommerce.api.model.a<k>>> saveAddress(@l.b.a l lVar);

    public static final class a {

        /* renamed from: a  reason: collision with root package name */
        public static final com.bytedance.ies.ugc.aweme.network.f f84265a = RetrofitFactory.a().b("https://oec-api.tiktokv.com/").d();

        /* renamed from: b  reason: collision with root package name */
        static final /* synthetic */ a f84266b = new a();

        private a() {
        }

        static {
            Covode.recordClassIndex(52545);
        }

        public static t<u<com.ss.android.ugc.aweme.ecommerce.api.model.a<InputItemData>>> a(Region region) {
            return ((AddressApi) f84265a.a(AddressApi.class)).getInputItems(new j(region));
        }
    }
}
