package com.ss.android.ugc.aweme.model.api.request;

import com.bytedance.covode.number.Covode;
import com.bytedance.ies.ugc.aweme.network.RetrofitFactory;
import com.bytedance.retrofit2.b.h;
import com.bytedance.retrofit2.b.z;
import com.ss.android.ugc.aweme.model.api.b.e;
import f.a.ab;
import h.f.b.l;

public final class ProfileNaviListRequest {

    /* renamed from: a  reason: collision with root package name */
    public static Api f110728a = ((Api) RetrofitFactory.a().b("https://api-va.tiktokv.com").d().a(Api.class));

    /* renamed from: b  reason: collision with root package name */
    public static final a f110729b = new a((byte) 0);

    /* renamed from: c  reason: collision with root package name */
    private static final String f110730c = "https://api-va.tiktokv.com";

    interface Api {
        static {
            Covode.recordClassIndex(71067);
        }

        @h(a = "tiktok/v1/navi/list")
        ab<e> getNaviList(@z(a = "offset") int i2, @z(a = "count") int i3);
    }

    public static final class a {
        static {
            Covode.recordClassIndex(71068);
        }

        private a() {
        }

        public /* synthetic */ a(byte b2) {
            this();
        }

        public static ab<e> a(c cVar) {
            l.d(cVar, "");
            return ProfileNaviListRequest.f110728a.getNaviList(cVar.f110748a, cVar.f110749b);
        }
    }

    static {
        Covode.recordClassIndex(71066);
    }
}
