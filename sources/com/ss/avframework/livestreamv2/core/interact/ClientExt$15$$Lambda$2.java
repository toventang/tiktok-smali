package com.ss.avframework.livestreamv2.core.interact;

import com.bytedance.covode.number.Covode;
import com.ss.avframework.livestreamv2.core.interact.ClientExt;

final /* synthetic */ class ClientExt$15$$Lambda$2 implements Runnable {
    private final ClientExt.AnonymousClass15 arg$1;
    private final String arg$2;
    private final int arg$3;

    static {
        Covode.recordClassIndex(100146);
    }

    ClientExt$15$$Lambda$2(ClientExt.AnonymousClass15 r1, String str, int i2) {
        this.arg$1 = r1;
        this.arg$2 = str;
        this.arg$3 = i2;
    }

    public final void run() {
        this.arg$1.lambda$onUserLeave$2$ClientExt$15(this.arg$2, this.arg$3);
    }
}
