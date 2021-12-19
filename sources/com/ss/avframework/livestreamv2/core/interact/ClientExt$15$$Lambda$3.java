package com.ss.avframework.livestreamv2.core.interact;

import com.bytedance.covode.number.Covode;
import com.ss.avframework.livestreamv2.core.interact.ClientExt;
import com.ss.bytertc.engine.data.RemoteStreamKey;
import com.ss.bytertc.engine.data.VideoFrameInfo;

final /* synthetic */ class ClientExt$15$$Lambda$3 implements Runnable {
    private final ClientExt.AnonymousClass15 arg$1;
    private final RemoteStreamKey arg$2;
    private final VideoFrameInfo arg$3;

    static {
        Covode.recordClassIndex(100147);
    }

    ClientExt$15$$Lambda$3(ClientExt.AnonymousClass15 r1, RemoteStreamKey remoteStreamKey, VideoFrameInfo videoFrameInfo) {
        this.arg$1 = r1;
        this.arg$2 = remoteStreamKey;
        this.arg$3 = videoFrameInfo;
    }

    public final void run() {
        this.arg$1.lambda$onFirstRemoteVideoFrameRendered$3$ClientExt$15(this.arg$2, this.arg$3);
    }
}
