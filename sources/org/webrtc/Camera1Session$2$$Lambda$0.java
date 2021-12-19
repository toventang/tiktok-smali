package org.webrtc;

import com.bytedance.covode.number.Covode;
import org.webrtc.Camera1Session;

final /* synthetic */ class Camera1Session$2$$Lambda$0 implements Runnable {
    private final Camera1Session.AnonymousClass2 arg$1;
    private final byte[] arg$2;

    static {
        Covode.recordClassIndex(106511);
    }

    Camera1Session$2$$Lambda$0(Camera1Session.AnonymousClass2 r1, byte[] bArr) {
        this.arg$1 = r1;
        this.arg$2 = bArr;
    }

    public final void run() {
        this.arg$1.lambda$onPreviewFrame$1$Camera1Session$2(this.arg$2);
    }
}
