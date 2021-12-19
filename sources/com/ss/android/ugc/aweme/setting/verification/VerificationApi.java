package com.ss.android.ugc.aweme.setting.verification;

import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.aweme.framework.services.IRetrofitService;
import com.ss.android.ugc.aweme.services.RetrofitService;
import f.a.t;
import h.f.b.l;
import l.b.f;

public interface VerificationApi {

    /* renamed from: a  reason: collision with root package name */
    public static final a f123048a = a.f123049a;

    static {
        Covode.recordClassIndex(80810);
    }

    @f(a = "/aweme/v1/mtcert/status/")
    t<VerificationResponse> requestVerification(@l.b.t(a = "sec_uid") String str);

    public static final class a {

        /* renamed from: a  reason: collision with root package name */
        static final /* synthetic */ a f123049a = new a();

        /* renamed from: b  reason: collision with root package name */
        private static final IRetrofitService f123050b = RetrofitService.createIRetrofitServicebyMonsterPlugin(false);

        private a() {
        }

        static {
            Covode.recordClassIndex(80811);
        }

        public static VerificationApi a() {
            Object create = f123050b.createNewRetrofit(a.f123051a).create(VerificationApi.class);
            l.b(create, "");
            return (VerificationApi) create;
        }
    }
}
