package com.ss.bytertc.engine.mediaio;

import com.bytedance.covode.number.Covode;
import org.webrtc.VideoFrame;

final /* synthetic */ class TextureEglRenderer$$Lambda$2 implements Runnable {
    private final TextureEglRenderer arg$1;
    private final VideoFrame arg$2;
    private final CountDownLatchI420Buffer arg$3;

    static {
        Covode.recordClassIndex(101020);
    }

    TextureEglRenderer$$Lambda$2(TextureEglRenderer textureEglRenderer, VideoFrame videoFrame, CountDownLatchI420Buffer countDownLatchI420Buffer) {
        this.arg$1 = textureEglRenderer;
        this.arg$2 = videoFrame;
        this.arg$3 = countDownLatchI420Buffer;
    }

    public final void run() {
        this.arg$1.lambda$onFrame$1$TextureEglRenderer(this.arg$2, this.arg$3);
    }
}
