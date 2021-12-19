package org.webrtc;

import com.bytedance.covode.number.Covode;
import org.webrtc.EglRenderer;
import org.webrtc.RendererCommon;

/* access modifiers changed from: package-private */
public final /* synthetic */ class EglRenderer$$Lambda$3 implements Runnable {
    private final EglRenderer arg$1;
    private final RendererCommon.GlDrawer arg$2;
    private final EglRenderer.FrameListener arg$3;
    private final float arg$4;
    private final boolean arg$5;

    static {
        Covode.recordClassIndex(106569);
    }

    EglRenderer$$Lambda$3(EglRenderer eglRenderer, RendererCommon.GlDrawer glDrawer, EglRenderer.FrameListener frameListener, float f2, boolean z) {
        this.arg$1 = eglRenderer;
        this.arg$2 = glDrawer;
        this.arg$3 = frameListener;
        this.arg$4 = f2;
        this.arg$5 = z;
    }

    public final void run() {
        this.arg$1.lambda$addFrameListener$3$EglRenderer(this.arg$2, this.arg$3, this.arg$4, this.arg$5);
    }
}
