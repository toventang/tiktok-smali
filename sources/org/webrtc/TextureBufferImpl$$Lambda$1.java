package org.webrtc;

import com.bytedance.covode.number.Covode;

/* access modifiers changed from: package-private */
public final /* synthetic */ class TextureBufferImpl$$Lambda$1 implements Runnable {
    private final TextureBufferImpl arg$1;

    static {
        Covode.recordClassIndex(106680);
    }

    TextureBufferImpl$$Lambda$1(TextureBufferImpl textureBufferImpl) {
        this.arg$1 = textureBufferImpl;
    }

    public final void run() {
        this.arg$1.release();
    }
}
