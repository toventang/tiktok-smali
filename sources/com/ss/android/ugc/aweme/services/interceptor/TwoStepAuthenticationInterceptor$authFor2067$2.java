package com.ss.android.ugc.aweme.services.interceptor;

import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.aweme.account.g.b;
import com.ss.android.ugc.aweme.account.login.twostep.m;
import com.ss.android.ugc.aweme.account.login.twostep.w;
import f.a.d.f;

/* access modifiers changed from: package-private */
public final class TwoStepAuthenticationInterceptor$authFor2067$2<T> implements f {
    final /* synthetic */ w $twoStepVerificationData;

    static {
        Covode.recordClassIndex(79735);
    }

    TwoStepAuthenticationInterceptor$authFor2067$2(w wVar) {
        this.$twoStepVerificationData = wVar;
    }

    public final void accept(Throwable th) {
        m a2 = m.a();
        String message = th.getMessage();
        if (message == null) {
            message = "server error";
        }
        a2.a(new b(null, null, 0, message, this.$twoStepVerificationData.getSms_code_key()));
    }
}
