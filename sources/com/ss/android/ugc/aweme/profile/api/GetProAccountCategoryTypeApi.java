package com.ss.android.ugc.aweme.profile.api;

import com.bytedance.covode.number.Covode;
import com.bytedance.ies.ugc.aweme.network.RetrofitFactory;
import com.bytedance.retrofit2.b.h;
import com.google.c.h.a.q;
import com.ss.android.c.b;

public final class GetProAccountCategoryTypeApi {

    /* renamed from: a  reason: collision with root package name */
    public static final GetProAccountCategoryTypeApi f115982a = new GetProAccountCategoryTypeApi();

    /* renamed from: b  reason: collision with root package name */
    private static final RealApi f115983b = ((RealApi) RetrofitFactory.a().b(b.f59141e).d().a(RealApi.class));

    interface RealApi {
        static {
            Covode.recordClassIndex(74797);
        }

        @h(a = "/aweme/v1/user/proaccount/categorytype/")
        q<Object> getProAccountCategoryType();
    }

    private GetProAccountCategoryTypeApi() {
    }

    static {
        Covode.recordClassIndex(74796);
    }
}
