package com.ss.android.ugc.aweme.setting.api;

import b.i;
import com.bytedance.covode.number.Covode;
import com.bytedance.ies.ugc.aweme.network.RetrofitFactory;
import com.ss.android.c.b;
import l.b.c;
import l.b.e;
import l.b.o;

public interface IChangePhoneHelperApi {

    /* renamed from: a  reason: collision with root package name */
    public static final a f122050a = a.f122052b;

    static {
        Covode.recordClassIndex(80013);
    }

    @o(a = "passport/auth/available_ways/")
    i<a> availableVerifyWays();

    @o(a = "passport/safe/two_step_verification/get_verification_list/")
    i<com.ss.android.ugc.aweme.account.login.twostep.a> check2sv();

    @o(a = "/passport/shark/safe_verify/")
    @e
    i<b> safeEnv(@c(a = "scene") String str, @c(a = "target") String str2);

    public static final class a {

        /* renamed from: a  reason: collision with root package name */
        public static final IChangePhoneHelperApi f122051a = ((IChangePhoneHelperApi) RetrofitFactory.a().b(b.f59141e).d().a(IChangePhoneHelperApi.class));

        /* renamed from: b  reason: collision with root package name */
        static final /* synthetic */ a f122052b = new a();

        private a() {
        }

        static {
            Covode.recordClassIndex(80014);
        }
    }
}
