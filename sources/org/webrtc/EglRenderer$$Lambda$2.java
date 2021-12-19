package org.webrtc;

import android.os.Looper;
import com.bytedance.covode.number.Covode;

/* access modifiers changed from: package-private */
public final /* synthetic */ class EglRenderer$$Lambda$2 implements Runnable {
    private final EglRenderer arg$1;
    private final Looper arg$2;

    static {
        Covode.recordClassIndex(106568);
    }

    EglRenderer$$Lambda$2(EglRenderer eglRenderer, Looper looper) {
        this.arg$1 = eglRenderer;
        this.arg$2 = looper;
    }

    public final void run() {
        this.arg$1.lambda$release$2$EglRenderer(this.arg$2);
    }
}
