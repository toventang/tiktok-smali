package com.ss.android.ugc.aweme.services;

import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.aweme.IAccountService;

/* access modifiers changed from: package-private */
public final /* synthetic */ class LoginService$$Lambda$0 implements IAccountService.g {
    static final IAccountService.g $instance = new LoginService$$Lambda$0();

    static {
        Covode.recordClassIndex(79515);
    }

    private LoginService$$Lambda$0() {
    }

    @Override // com.ss.android.ugc.aweme.IAccountService.g
    public final void onResult(int i2, int i3, Object obj) {
        LoginService.lambda$showLoginAndRegisterViewInner$1$LoginService(i2, i3, obj);
    }
}
