package com.ss.bytertc.engine.mediaio;

import com.bytedance.covode.number.Covode;
import java.util.concurrent.CountDownLatch;

final /* synthetic */ class TextureEglRenderer$$Lambda$1 implements Runnable {
    private final CountDownLatch arg$1;

    static {
        Covode.recordClassIndex(101019);
    }

    private TextureEglRenderer$$Lambda$1(CountDownLatch countDownLatch) {
        this.arg$1 = countDownLatch;
    }

    static Runnable get$Lambda(CountDownLatch countDownLatch) {
        return new TextureEglRenderer$$Lambda$1(countDownLatch);
    }

    public final void run() {
        this.arg$1.countDown();
    }
}
