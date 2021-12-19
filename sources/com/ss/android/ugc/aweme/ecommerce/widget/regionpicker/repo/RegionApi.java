package com.ss.android.ugc.aweme.ecommerce.widget.regionpicker.repo;

import com.bytedance.covode.number.Covode;
import com.bytedance.ies.ugc.aweme.network.RetrofitFactory;
import com.bytedance.ies.ugc.aweme.network.f;
import com.ss.android.ugc.aweme.ecommerce.delivery.repo.dto.OrderSKUDTO;
import com.ss.android.ugc.aweme.ecommerce.widget.regionpicker.model.DistrictData;
import f.a.t;
import h.a.n;
import java.util.List;
import l.b.o;

public interface RegionApi {

    /* renamed from: a  reason: collision with root package name */
    public static final a f87680a = a.f87681a;

    static {
        Covode.recordClassIndex(55148);
    }

    @o(a = "/api/v1/logistics/district/list")
    t<com.ss.android.ugc.aweme.ecommerce.api.model.a<DistrictData>> getDistricts(@l.b.a com.ss.android.ugc.aweme.ecommerce.widget.regionpicker.model.a aVar);

    public static final class a {

        /* renamed from: a  reason: collision with root package name */
        static final /* synthetic */ a f87681a = new a();

        /* renamed from: b  reason: collision with root package name */
        private static final f f87682b = RetrofitFactory.a().b("https://oec-api.tiktokv.com/").d();

        private a() {
        }

        static {
            Covode.recordClassIndex(55149);
        }

        public static t<com.ss.android.ugc.aweme.ecommerce.api.model.a<DistrictData>> a(String[] strArr, OrderSKUDTO orderSKUDTO) {
            List list;
            RegionApi regionApi = (RegionApi) f87682b.a(RegionApi.class);
            if (strArr == null) {
                strArr = new String[0];
            }
            if (orderSKUDTO != null) {
                list = n.a(orderSKUDTO);
            } else {
                list = null;
            }
            return regionApi.getDistricts(new com.ss.android.ugc.aweme.ecommerce.widget.regionpicker.model.a(strArr, list));
        }
    }
}
