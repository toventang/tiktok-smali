package org.webrtc;

import com.bytedance.covode.number.Covode;
import java.nio.ByteBuffer;

final /* synthetic */ class JavaI420Buffer$$Lambda$1 implements Runnable {
    private final ByteBuffer arg$1;

    static {
        Covode.recordClassIndex(106610);
    }

    JavaI420Buffer$$Lambda$1(ByteBuffer byteBuffer) {
        this.arg$1 = byteBuffer;
    }

    public final void run() {
        JavaI420Buffer.lambda$allocate$1$JavaI420Buffer(this.arg$1);
    }
}
