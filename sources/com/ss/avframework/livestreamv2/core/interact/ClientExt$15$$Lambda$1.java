package com.ss.avframework.livestreamv2.core.interact;

import com.bytedance.covode.number.Covode;
import com.ss.avframework.livestreamv2.core.interact.ClientExt;
import com.ss.bytertc.engine.UserInfo;

final /* synthetic */ class ClientExt$15$$Lambda$1 implements Runnable {
    private final ClientExt.AnonymousClass15 arg$1;
    private final UserInfo arg$2;

    static {
        Covode.recordClassIndex(100145);
    }

    ClientExt$15$$Lambda$1(ClientExt.AnonymousClass15 r1, UserInfo userInfo) {
        this.arg$1 = r1;
        this.arg$2 = userInfo;
    }

    public final void run() {
        this.arg$1.lambda$onUserJoined$1$ClientExt$15(this.arg$2);
    }
}
