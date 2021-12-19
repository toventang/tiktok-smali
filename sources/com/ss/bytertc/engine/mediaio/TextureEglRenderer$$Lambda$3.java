package com.ss.bytertc.engine.mediaio;

import com.bytedance.covode.number.Covode;
import java.util.concurrent.CountDownLatch;

final /* synthetic */ class TextureEglRenderer$$Lambda$3 implements Runnable {
    private final Runnable arg$1;
    private final CountDownLatch arg$2;

    static {
        Covode.recordClassIndex(101021);
    }

    TextureEglRenderer$$Lambda$3(Runnable runnable, CountDownLatch countDownLatch) {
        this.arg$1 = runnable;
        this.arg$2 = countDownLatch;
    }

    public final void run() {
        TextureEglRenderer.lambda$postOnMainThreadAndLock$2$TextureEglRenderer(this.arg$1, this.arg$2);
    }
}
