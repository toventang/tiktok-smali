package com.ss.avframework.livestreamv2.core.interact;

import com.bytedance.covode.number.Covode;

final /* synthetic */ class ClientInternal$$Lambda$0 implements Runnable {
    private final ClientInternal arg$1;
    private final Runnable arg$2;

    static {
        Covode.recordClassIndex(100171);
    }

    ClientInternal$$Lambda$0(ClientInternal clientInternal, Runnable runnable) {
        this.arg$1 = clientInternal;
        this.arg$2 = runnable;
    }

    public final void run() {
        this.arg$1.lambda$start$1$ClientInternal(this.arg$2);
    }
}
