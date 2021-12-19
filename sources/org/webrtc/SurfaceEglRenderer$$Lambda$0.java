package org.webrtc;

import com.bytedance.covode.number.Covode;
import java.util.concurrent.CountDownLatch;

/* access modifiers changed from: package-private */
public final /* synthetic */ class SurfaceEglRenderer$$Lambda$0 implements Runnable {
    private final CountDownLatch arg$1;

    static {
        Covode.recordClassIndex(106663);
    }

    private SurfaceEglRenderer$$Lambda$0(CountDownLatch countDownLatch) {
        this.arg$1 = countDownLatch;
    }

    static Runnable get$Lambda(CountDownLatch countDownLatch) {
        return new SurfaceEglRenderer$$Lambda$0(countDownLatch);
    }

    public final void run() {
        this.arg$1.countDown();
    }
}
