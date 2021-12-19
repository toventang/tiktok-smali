package com.ss.android.ugc.aweme.ecommerce.ordercenter.repository.api;

import com.bytedance.covode.number.Covode;
import com.bytedance.ies.ugc.aweme.network.RetrofitFactory;
import com.ss.android.ugc.aweme.ecommerce.ordercenter.repository.dto.ListOrderTabResponse;
import f.a.t;
import l.b.f;

public interface OrderTabDataApi {

    /* renamed from: a  reason: collision with root package name */
    public static final a f86247a = a.f86249b;

    static {
        Covode.recordClassIndex(53977);
    }

    @f(a = "/api/v1/trade/list_order_tab/get")
    t<ListOrderTabResponse> getOrderTabData();

    public static final class a {

        /* renamed from: a  reason: collision with root package name */
        public static final com.bytedance.ies.ugc.aweme.network.f f86248a = RetrofitFactory.a().b("https://oec-api.tiktokv.com/").d();

        /* renamed from: b  reason: collision with root package name */
        static final /* synthetic */ a f86249b = new a();

        private a() {
        }

        static {
            Covode.recordClassIndex(53978);
        }
    }
}
