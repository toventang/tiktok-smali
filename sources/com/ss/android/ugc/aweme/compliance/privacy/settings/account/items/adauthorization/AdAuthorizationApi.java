package com.ss.android.ugc.aweme.compliance.privacy.settings.account.items.adauthorization;

import com.bytedance.covode.number.Covode;
import com.bytedance.ies.ugc.aweme.network.RetrofitFactory;
import com.bytedance.retrofit2.b;
import com.bytedance.retrofit2.b.f;
import com.bytedance.retrofit2.b.g;
import com.bytedance.retrofit2.b.t;
import h.f.b.l;
import java.util.Map;

public interface AdAuthorizationApi {

    /* renamed from: a  reason: collision with root package name */
    public static final a f77503a = a.f77505b;

    static {
        Covode.recordClassIndex(47963);
    }

    @t(a = "/aweme/v1/ad/authorization/update/")
    @g
    b<String> requestAdAuthorization(@f Map<String, Object> map);

    public static final class a {

        /* renamed from: a  reason: collision with root package name */
        static final AdAuthorizationApi f77504a;

        /* renamed from: b  reason: collision with root package name */
        static final /* synthetic */ a f77505b = new a();

        private a() {
        }

        static {
            Covode.recordClassIndex(47964);
            Object a2 = RetrofitFactory.a().a(com.ss.android.ugc.aweme.compliance.common.a.a.f77273a).a(AdAuthorizationApi.class);
            l.b(a2, "");
            f77504a = (AdAuthorizationApi) a2;
        }
    }
}
