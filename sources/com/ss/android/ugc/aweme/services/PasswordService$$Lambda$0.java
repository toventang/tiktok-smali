package com.ss.android.ugc.aweme.services;

import android.app.Activity;
import android.os.Bundle;
import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.aweme.IAccountService;

final /* synthetic */ class PasswordService$$Lambda$0 implements IAccountService.g {
    private final Bundle arg$1;
    private final Activity arg$2;
    private final IAccountService.g arg$3;

    static {
        Covode.recordClassIndex(79533);
    }

    PasswordService$$Lambda$0(Bundle bundle, Activity activity, IAccountService.g gVar) {
        this.arg$1 = bundle;
        this.arg$2 = activity;
        this.arg$3 = gVar;
    }

    @Override // com.ss.android.ugc.aweme.IAccountService.g
    public final void onResult(int i2, int i3, Object obj) {
        PasswordService.lambda$changePassword$0$PasswordService(this.arg$1, this.arg$2, this.arg$3, i2, i3, obj);
    }
}
