package org.webrtc;

import com.bytedance.covode.number.Covode;
import java.nio.ByteBuffer;

/* access modifiers changed from: package-private */
public final /* synthetic */ class YuvConverter$$Lambda$0 implements Runnable {
    private final ByteBuffer arg$1;

    static {
        Covode.recordClassIndex(106722);
    }

    YuvConverter$$Lambda$0(ByteBuffer byteBuffer) {
        this.arg$1 = byteBuffer;
    }

    public final void run() {
        YuvConverter.lambda$convert$0$YuvConverter(this.arg$1);
    }
}
