package org.webrtc;

import com.bytedance.covode.number.Covode;
import org.webrtc.Camera1Session;

/* access modifiers changed from: package-private */
public final /* synthetic */ class Camera1Session$2$$Lambda$1 implements Runnable {
    private final Camera1Session.AnonymousClass2 arg$1;
    private final byte[] arg$2;

    static {
        Covode.recordClassIndex(106512);
    }

    Camera1Session$2$$Lambda$1(Camera1Session.AnonymousClass2 r1, byte[] bArr) {
        this.arg$1 = r1;
        this.arg$2 = bArr;
    }

    public final void run() {
        this.arg$1.lambda$null$0$Camera1Session$2(this.arg$2);
    }
}
