package org.webrtc;

import com.bytedance.covode.number.Covode;

/* access modifiers changed from: package-private */
public final /* synthetic */ class EglRenderer$$Lambda$6 implements Runnable {
    private final EglRenderer arg$1;
    private final Runnable arg$2;

    static {
        Covode.recordClassIndex(106572);
    }

    EglRenderer$$Lambda$6(EglRenderer eglRenderer, Runnable runnable) {
        this.arg$1 = eglRenderer;
        this.arg$2 = runnable;
    }

    public final void run() {
        this.arg$1.lambda$releaseEglSurface$5$EglRenderer(this.arg$2);
    }
}
