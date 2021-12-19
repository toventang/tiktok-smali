package org.webrtc;

import com.bytedance.covode.number.Covode;
import java.util.concurrent.CountDownLatch;
import org.webrtc.EglRenderer;

/* access modifiers changed from: package-private */
public final /* synthetic */ class EglRenderer$$Lambda$4 implements Runnable {
    private final EglRenderer arg$1;
    private final CountDownLatch arg$2;
    private final EglRenderer.FrameListener arg$3;

    static {
        Covode.recordClassIndex(106570);
    }

    EglRenderer$$Lambda$4(EglRenderer eglRenderer, CountDownLatch countDownLatch, EglRenderer.FrameListener frameListener) {
        this.arg$1 = eglRenderer;
        this.arg$2 = countDownLatch;
        this.arg$3 = frameListener;
    }

    public final void run() {
        this.arg$1.lambda$removeFrameListener$4$EglRenderer(this.arg$2, this.arg$3);
    }
}
