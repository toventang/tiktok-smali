package com.ss.android.ugc.aweme.services;

import android.app.Activity;
import android.os.Bundle;
import com.bytedance.covode.number.Covode;
import com.bytedance.router.SmartRouter;
import com.ss.android.ugc.aweme.IAccountService;
import com.ss.android.ugc.aweme.account.login.v2.base.k;
import com.ss.android.ugc.aweme.bw;
import h.f.b.l;

public final class SetUserNameService implements bw {
    private IAccountService.g mResult;

    static {
        Covode.recordClassIndex(79563);
    }

    @Override // com.ss.android.ugc.aweme.bw
    public final void returnResult(int i2, int i3, Object obj) {
        IAccountService.g gVar = this.mResult;
        if (gVar != null) {
            gVar.onResult(i2, i3, obj);
            this.mResult = null;
        }
    }

    public final void setUserNameForThirdParty(Activity activity, Bundle bundle, IAccountService.g gVar) {
        l.d(activity, "");
        l.d(bundle, "");
        l.d(gVar, "");
        SmartRouter.buildRoute(activity, "//account/login/signup_or_login").withParam(bundle).withParam("next_page", k.CREATE_USERNAME.getValue()).open();
        this.mResult = gVar;
    }
}
