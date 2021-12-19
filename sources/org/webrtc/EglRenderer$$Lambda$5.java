package org.webrtc;

import com.bytedance.covode.number.Covode;

/* access modifiers changed from: package-private */
public final /* synthetic */ class EglRenderer$$Lambda$5 implements Runnable {
    private final EglRenderer arg$1;

    static {
        Covode.recordClassIndex(106571);
    }

    EglRenderer$$Lambda$5(EglRenderer eglRenderer) {
        this.arg$1 = eglRenderer;
    }

    public final void run() {
        this.arg$1.bridge$lambda$0$EglRenderer();
    }
}
