package com.ss.android.ugc.aweme.setting.api;

import com.bytedance.covode.number.Covode;
import com.bytedance.ies.ugc.aweme.network.RetrofitFactory;
import com.google.c.h.a.q;
import com.ss.android.ugc.aweme.setting.model.b;
import f.a.t;
import h.f.b.l;
import l.b.f;

public interface AuthListApi {

    /* renamed from: a  reason: collision with root package name */
    public static final a f122041a = a.f122042a;

    static {
        Covode.recordClassIndex(80005);
    }

    @f(a = "/aweme/v1/openapi/authorized/app/count/")
    q<com.ss.android.ugc.aweme.setting.model.a> getAuthAppCount();

    @f(a = "/aweme/v1/openapi/authorized/app/list/")
    t<b> getAuthInfoList();

    public static final class a {

        /* renamed from: a  reason: collision with root package name */
        static final /* synthetic */ a f122042a = new a();

        private a() {
        }

        static {
            Covode.recordClassIndex(80006);
        }

        public static AuthListApi a() {
            Object a2 = RetrofitFactory.a().b(com.ss.android.c.b.f59141e).d().a(AuthListApi.class);
            l.b(a2, "");
            return (AuthListApi) a2;
        }
    }
}
