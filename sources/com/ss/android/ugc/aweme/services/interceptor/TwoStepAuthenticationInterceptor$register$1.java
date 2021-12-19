package com.ss.android.ugc.aweme.services.interceptor;

import b.j;
import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.aweme.account.g.a;
import com.ss.android.ugc.aweme.account.g.b;

public final class TwoStepAuthenticationInterceptor$register$1 implements a {
    final /* synthetic */ j $tcs;

    static {
        Covode.recordClassIndex(79736);
    }

    public static int com_ss_android_ugc_aweme_services_interceptor_TwoStepAuthenticationInterceptor$register$1_com_ss_android_ugc_aweme_lancet_LogLancet_d(String str, String str2) {
        return 0;
    }

    TwoStepAuthenticationInterceptor$register$1(j jVar) {
        this.$tcs = jVar;
    }

    @Override // com.ss.android.ugc.aweme.account.g.a
    public final void onComplete(b bVar) {
        if (TwoStepAuthenticationInterceptorKt.DEBUG) {
            com_ss_android_ugc_aweme_services_interceptor_TwoStepAuthenticationInterceptor$register$1_com_ss_android_ugc_aweme_lancet_LogLancet_d("I18n.TwoStepInterceptor", "startTwoStepAuthentication, onComplete: ".concat(String.valueOf(bVar)));
        }
        this.$tcs.b(bVar);
    }
}
