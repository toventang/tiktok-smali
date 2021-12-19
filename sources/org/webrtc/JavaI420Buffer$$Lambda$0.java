package org.webrtc;

import com.bytedance.covode.number.Covode;
import java.nio.ByteBuffer;

/* access modifiers changed from: package-private */
public final /* synthetic */ class JavaI420Buffer$$Lambda$0 implements Runnable {
    private final ByteBuffer arg$1;

    static {
        Covode.recordClassIndex(106609);
    }

    JavaI420Buffer$$Lambda$0(ByteBuffer byteBuffer) {
        this.arg$1 = byteBuffer;
    }

    public final void run() {
        JavaI420Buffer.lambda$allocate$0$JavaI420Buffer(this.arg$1);
    }
}
