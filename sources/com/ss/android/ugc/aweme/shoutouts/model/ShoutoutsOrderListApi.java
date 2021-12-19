package com.ss.android.ugc.aweme.shoutouts.model;

import com.bytedance.covode.number.Covode;
import com.bytedance.ies.ugc.aweme.network.RetrofitFactory;
import com.ss.android.ugc.aweme.app.api.Api;
import f.a.t;
import h.f.b.l;
import l.b.f;

public interface ShoutoutsOrderListApi {

    /* renamed from: a  reason: collision with root package name */
    public static final a f133191a = a.f133192a;

    static {
        Covode.recordClassIndex(87098);
    }

    @f(a = "/tiktok/shoutouts/order/list/v1")
    t<d> getOrderList(@l.b.t(a = "filter") int i2, @l.b.t(a = "product_id") String str, @l.b.t(a = "count") int i3);

    public static final class a {

        /* renamed from: a  reason: collision with root package name */
        static final /* synthetic */ a f133192a = new a();

        private a() {
        }

        static {
            Covode.recordClassIndex(87099);
        }

        public static ShoutoutsOrderListApi a() {
            Object a2 = RetrofitFactory.a().a(Api.f66569d).a(ShoutoutsOrderListApi.class);
            l.b(a2, "");
            return (ShoutoutsOrderListApi) a2;
        }
    }
}
