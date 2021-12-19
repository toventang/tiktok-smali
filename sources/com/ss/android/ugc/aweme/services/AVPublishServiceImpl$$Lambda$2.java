package com.ss.android.ugc.aweme.services;

import com.bytedance.covode.number.Covode;

final /* synthetic */ class AVPublishServiceImpl$$Lambda$2 implements Runnable {
    private final AVPublishServiceImpl arg$1;
    private final boolean arg$2;

    static {
        Covode.recordClassIndex(79389);
    }

    AVPublishServiceImpl$$Lambda$2(AVPublishServiceImpl aVPublishServiceImpl, boolean z) {
        this.arg$1 = aVPublishServiceImpl;
        this.arg$2 = z;
    }

    public final void run() {
        this.arg$1.lambda$uploadRecoverPopViewSetVisibility$2$AVPublishServiceImpl(this.arg$2);
    }
}
