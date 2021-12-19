package com.ss.bytertc.engine.mediaio;

import android.view.TextureView;
import com.bytedance.covode.number.Covode;

final /* synthetic */ class TextureEglRenderer$$Lambda$0 implements Runnable {
    private final TextureEglRenderer arg$1;
    private final TextureView arg$2;

    static {
        Covode.recordClassIndex(101018);
    }

    TextureEglRenderer$$Lambda$0(TextureEglRenderer textureEglRenderer, TextureView textureView) {
        this.arg$1 = textureEglRenderer;
        this.arg$2 = textureView;
    }

    public final void run() {
        this.arg$1.lambda$bind$0$TextureEglRenderer(this.arg$2);
    }
}
