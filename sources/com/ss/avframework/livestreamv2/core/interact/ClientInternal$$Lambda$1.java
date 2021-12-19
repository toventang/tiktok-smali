package com.ss.avframework.livestreamv2.core.interact;

import com.bytedance.covode.number.Covode;
import java.util.List;

final /* synthetic */ class ClientInternal$$Lambda$1 implements Runnable {
    private final ClientInternal arg$1;
    private final List arg$2;
    private final String arg$3;
    private final boolean arg$4;

    static {
        Covode.recordClassIndex(100172);
    }

    ClientInternal$$Lambda$1(ClientInternal clientInternal, List list, String str, boolean z) {
        this.arg$1 = clientInternal;
        this.arg$2 = list;
        this.arg$3 = str;
        this.arg$4 = z;
    }

    public final void run() {
        this.arg$1.lambda$mixStream$2$ClientInternal(this.arg$2, this.arg$3, this.arg$4);
    }
}
