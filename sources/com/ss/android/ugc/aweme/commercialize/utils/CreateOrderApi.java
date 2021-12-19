package com.ss.android.ugc.aweme.commercialize.utils;

import com.bytedance.covode.number.Covode;
import com.bytedance.ies.ugc.aweme.network.RetrofitFactory;
import com.google.c.h.a.q;
import com.ss.android.c.b;
import l.b.c;
import l.b.e;
import l.b.o;

public final class CreateOrderApi {

    /* renamed from: a  reason: collision with root package name */
    public static final CreateOrderApi f75505a = new CreateOrderApi();

    /* renamed from: b  reason: collision with root package name */
    private static final RealApi f75506b = ((RealApi) RetrofitFactory.a().b(b.f59141e).d().a(RealApi.class));

    interface RealApi {
        static {
            Covode.recordClassIndex(46588);
        }

        @o(a = "/aweme/v1/dypay/open/order/create/")
        @e
        q<Object> createOrder(@c(a = "prepay_order_id") String str);
    }

    private CreateOrderApi() {
    }

    static {
        Covode.recordClassIndex(46587);
    }
}
