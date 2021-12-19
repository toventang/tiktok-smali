package com.ss.android.ugc.aweme.ecommerce.combinepayment.payment.api;

import com.bytedance.covode.number.Covode;
import com.bytedance.ies.ugc.aweme.network.RetrofitFactory;
import com.bytedance.ies.ugc.aweme.network.f;
import com.bytedance.retrofit2.u;
import com.ss.android.ugc.aweme.ecommerce.combinepayment.payment.dto.BindInfoRequest;
import com.ss.android.ugc.aweme.ecommerce.combinepayment.payment.dto.BindInfoResponseData;
import com.ss.android.ugc.aweme.ecommerce.combinepayment.payment.dto.i;
import com.ss.android.ugc.aweme.ecommerce.combinepayment.payment.dto.j;
import f.a.t;
import l.b.o;

public interface PaymentApi {

    /* renamed from: a  reason: collision with root package name */
    public static final a f85241a = a.f85243b;

    static {
        Covode.recordClassIndex(53348);
    }

    @o(a = "/api/v1/trade/order/payment_method_bind_info")
    t<com.ss.android.ugc.aweme.ecommerce.api.model.a<BindInfoResponseData>> getBindInfo(@l.b.a BindInfoRequest bindInfoRequest);

    @o(a = "/api/v1/trade/order/pay")
    t<u<com.ss.android.ugc.aweme.ecommerce.api.model.a<j>>> pay(@l.b.a i iVar);

    public static final class a {

        /* renamed from: a  reason: collision with root package name */
        public static final f f85242a = RetrofitFactory.a().b("https://oec-api.tiktokv.com/").d();

        /* renamed from: b  reason: collision with root package name */
        static final /* synthetic */ a f85243b = new a();

        private a() {
        }

        static {
            Covode.recordClassIndex(53349);
        }
    }
}
