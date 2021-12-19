package com.ss.android.ugc.aweme.services;

import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.aweme.IAccountService;

/* access modifiers changed from: package-private */
public final /* synthetic */ class BindService$$Lambda$1 implements IAccountService.g {
    private final IAccountService.g arg$1;

    static {
        Covode.recordClassIndex(79434);
    }

    BindService$$Lambda$1(IAccountService.g gVar) {
        this.arg$1 = gVar;
    }

    @Override // com.ss.android.ugc.aweme.IAccountService.g
    public final void onResult(int i2, int i3, Object obj) {
        BindService.lambda$setPassword$1$BindService(this.arg$1, i2, i3, obj);
    }
}
