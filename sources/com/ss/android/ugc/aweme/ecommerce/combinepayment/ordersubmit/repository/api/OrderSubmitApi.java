package com.ss.android.ugc.aweme.ecommerce.combinepayment.ordersubmit.repository.api;

import com.bytedance.covode.number.Covode;
import com.bytedance.ies.ugc.aweme.network.RetrofitFactory;
import com.ss.android.ugc.aweme.ecommerce.combinepayment.ordersubmit.repository.dto.BillInfoRequest;
import com.ss.android.ugc.aweme.ecommerce.combinepayment.ordersubmit.repository.dto.BillInfoResponse;
import com.ss.android.ugc.aweme.ecommerce.combinepayment.ordersubmit.repository.dto.c;
import com.ss.android.ugc.aweme.ecommerce.combinepayment.ordersubmit.repository.dto.d;
import com.ss.android.ugc.aweme.ecommerce.combinepayment.ordersubmit.repository.dto.u;
import f.a.t;
import l.b.f;
import l.b.o;

public interface OrderSubmitApi {

    /* renamed from: a  reason: collision with root package name */
    public static final a f84923a = a.f84925b;

    static {
        Covode.recordClassIndex(53098);
    }

    @o(a = "/api/v1/trade/order/create")
    t<d> createOrder(@l.b.a c cVar);

    @o(a = "/api/v1/shop/bill_info/get")
    t<BillInfoResponse> getBillInfo(@l.b.a BillInfoRequest billInfoRequest);

    @f(a = "api/v1/shop/quit_reasons/get")
    t<com.ss.android.ugc.aweme.ecommerce.api.model.a<com.ss.android.ugc.aweme.ecommerce.combinepayment.ordersubmit.repository.dto.o>> getQuitReason(@l.b.t(a = "reason_show_type") int i2);

    @o(a = "/api/v1/shop/quit_reasons/save")
    t<com.ss.android.ugc.aweme.ecommerce.api.model.a<Object>> submitQuitReason(@l.b.a u uVar);

    public static final class a {

        /* renamed from: a  reason: collision with root package name */
        public static final com.bytedance.ies.ugc.aweme.network.f f84924a = RetrofitFactory.a().b("https://oec-api.tiktokv.com/").d();

        /* renamed from: b  reason: collision with root package name */
        static final /* synthetic */ a f84925b = new a();

        private a() {
        }

        static {
            Covode.recordClassIndex(53099);
        }
    }
}
