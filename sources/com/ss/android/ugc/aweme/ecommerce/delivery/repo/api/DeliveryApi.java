package com.ss.android.ugc.aweme.ecommerce.delivery.repo.api;

import com.bytedance.covode.number.Covode;
import com.bytedance.ies.ugc.aweme.network.RetrofitFactory;
import com.bytedance.ies.ugc.aweme.network.f;
import com.ss.android.ugc.aweme.ecommerce.delivery.repo.dto.b;
import f.a.t;
import l.b.o;

public interface DeliveryApi {

    /* renamed from: a  reason: collision with root package name */
    public static final a f85886a = a.f85888b;

    static {
        Covode.recordClassIndex(53779);
    }

    @o(a = "/api/v1/shop/logistic/list")
    t<com.ss.android.ugc.aweme.ecommerce.api.model.a<com.ss.android.ugc.aweme.ecommerce.delivery.repo.dto.a>> getLogistics(@l.b.a b bVar);

    public static final class a {

        /* renamed from: a  reason: collision with root package name */
        public static final f f85887a = RetrofitFactory.a().b("https://oec-api.tiktokv.com/").d();

        /* renamed from: b  reason: collision with root package name */
        static final /* synthetic */ a f85888b = new a();

        private a() {
        }

        static {
            Covode.recordClassIndex(53780);
        }
    }
}
