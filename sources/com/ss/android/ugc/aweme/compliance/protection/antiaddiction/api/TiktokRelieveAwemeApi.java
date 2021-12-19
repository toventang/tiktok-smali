package com.ss.android.ugc.aweme.compliance.protection.antiaddiction.api;

import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.aweme.app.api.Api;
import com.ss.android.ugc.aweme.services.RetrofitService;
import f.a.t;
import h.f.b.l;
import l.b.f;

public final class TiktokRelieveAwemeApi {

    /* renamed from: a  reason: collision with root package name */
    public static final RealApi f77908a;

    /* renamed from: b  reason: collision with root package name */
    public static final TiktokRelieveAwemeApi f77909b = new TiktokRelieveAwemeApi();

    public interface RealApi {
        static {
            Covode.recordClassIndex(48296);
        }

        @f(a = "/aweme/v1/addiction/aweme/")
        t<TiktokRelieveAweme> getTiktokRelieveAweme(@l.b.t(a = "type") int i2);
    }

    private TiktokRelieveAwemeApi() {
    }

    static {
        Covode.recordClassIndex(48295);
        Object create = RetrofitService.createIRetrofitServicebyMonsterPlugin(false).createNewRetrofit(Api.f66569d).create(RealApi.class);
        l.b(create, "");
        f77908a = (RealApi) create;
    }
}
