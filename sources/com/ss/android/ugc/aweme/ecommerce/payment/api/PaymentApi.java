package com.ss.android.ugc.aweme.ecommerce.payment.api;

import com.bytedance.covode.number.Covode;
import com.bytedance.ies.ugc.aweme.network.RetrofitFactory;
import com.ss.android.ugc.aweme.ecommerce.payment.a.c;
import f.a.t;
import java.util.Map;
import l.b.f;
import l.b.o;

public interface PaymentApi {

    /* renamed from: a  reason: collision with root package name */
    public static final a f86288a = a.f86290b;

    static {
        Covode.recordClassIndex(53999);
    }

    @f(a = "/api/v1/pay/auth/get")
    t<com.ss.android.ugc.aweme.ecommerce.api.model.a<c>> getPaymentAuth();

    @o(a = "/api/v1/trade/order/pay")
    t<com.ss.android.ugc.aweme.ecommerce.api.model.a<c>> getPaymentInfo(@l.b.a Map<String, Object> map);

    public static final class a {

        /* renamed from: a  reason: collision with root package name */
        public static final com.bytedance.ies.ugc.aweme.network.f f86289a = RetrofitFactory.a().b("https://oec-api.tiktokv.com/").d();

        /* renamed from: b  reason: collision with root package name */
        static final /* synthetic */ a f86290b = new a();

        private a() {
        }

        public static t<com.ss.android.ugc.aweme.ecommerce.api.model.a<c>> a() {
            return ((PaymentApi) f86289a.a(PaymentApi.class)).getPaymentAuth();
        }

        static {
            Covode.recordClassIndex(54000);
        }
    }
}
