package com.ss.android.ugc.aweme.services;

import android.app.Activity;
import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.aweme.IAccountService;

final /* synthetic */ class BindService$$Lambda$0 implements IAccountService.g {
    private final BindService arg$1;
    private final IAccountService.g arg$2;
    private final Activity arg$3;
    private final String arg$4;
    private final String arg$5;

    static {
        Covode.recordClassIndex(79433);
    }

    BindService$$Lambda$0(BindService bindService, IAccountService.g gVar, Activity activity, String str, String str2) {
        this.arg$1 = bindService;
        this.arg$2 = gVar;
        this.arg$3 = activity;
        this.arg$4 = str;
        this.arg$5 = str2;
    }

    @Override // com.ss.android.ugc.aweme.IAccountService.g
    public final void onResult(int i2, int i3, Object obj) {
        this.arg$1.lambda$bindMobileOrEmailAndSetPwd$0$BindService(this.arg$2, this.arg$3, this.arg$4, this.arg$5, i2, i3, obj);
    }
}
