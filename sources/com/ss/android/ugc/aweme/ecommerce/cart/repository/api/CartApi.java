package com.ss.android.ugc.aweme.ecommerce.cart.repository.api;

import com.bytedance.covode.number.Covode;
import com.bytedance.ies.ugc.aweme.network.RetrofitFactory;
import com.bytedance.ies.ugc.aweme.network.f;
import com.ss.android.ugc.aweme.ecommerce.cart.repository.a.b;
import com.ss.android.ugc.aweme.ecommerce.cart.repository.a.c;
import f.a.t;
import l.b.o;

public interface CartApi {

    /* renamed from: a  reason: collision with root package name */
    public static final a f84711a = a.f84713b;

    static {
        Covode.recordClassIndex(52887);
    }

    @o(a = "/api/v1/shop/cart/add_item_to_cart")
    t<c> addToCart(@l.b.a b bVar);

    public static final class a {

        /* renamed from: a  reason: collision with root package name */
        static final f f84712a = RetrofitFactory.a().b("https://oec-api.tiktokv.com/").d();

        /* renamed from: b  reason: collision with root package name */
        static final /* synthetic */ a f84713b = new a();

        private a() {
        }

        static {
            Covode.recordClassIndex(52888);
        }
    }
}
