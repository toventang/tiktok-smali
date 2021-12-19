package com.ss.android.ugc.aweme.ecommerce.ordercenter.repository.api;

import com.bytedance.covode.number.Covode;
import com.bytedance.ies.ugc.aweme.network.RetrofitFactory;
import com.ss.android.ugc.aweme.ecommerce.ordercenter.repository.dto.GetEntranceInfoResponse;
import f.a.t;
import l.b.f;

public interface OrderEntranceApi {

    /* renamed from: a  reason: collision with root package name */
    public static final a f86244a = a.f86246b;

    static {
        Covode.recordClassIndex(53975);
    }

    @f(a = "/api/v1/trade/entrance/get")
    t<GetEntranceInfoResponse> getEntranceInfo();

    public static final class a {

        /* renamed from: a  reason: collision with root package name */
        public static final com.bytedance.ies.ugc.aweme.network.f f86245a = RetrofitFactory.a().b("https://oec-api.tiktokv.com/").d();

        /* renamed from: b  reason: collision with root package name */
        static final /* synthetic */ a f86246b = new a();

        private a() {
        }

        static {
            Covode.recordClassIndex(53976);
        }
    }
}
