package com.ss.avframework.livestreamv2.core.interact;

import com.bytedance.covode.number.Covode;
import com.ss.avframework.livestreamv2.core.interact.ClientExt;

final /* synthetic */ class ClientExt$VideoSinkWrapper$$Lambda$0 implements Runnable {
    private final ClientExt.VideoSinkWrapper arg$1;
    private final int arg$2;
    private final int arg$3;

    static {
        Covode.recordClassIndex(100168);
    }

    ClientExt$VideoSinkWrapper$$Lambda$0(ClientExt.VideoSinkWrapper videoSinkWrapper, int i2, int i3) {
        this.arg$1 = videoSinkWrapper;
        this.arg$2 = i2;
        this.arg$3 = i3;
    }

    public final void run() {
        this.arg$1.lambda$checkRemoteFrameRenderAndStatics$0$ClientExt$VideoSinkWrapper(this.arg$2, this.arg$3);
    }
}
