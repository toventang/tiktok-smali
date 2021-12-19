package com.ss.avframework.livestreamv2.core;

import com.bytedance.covode.number.Covode;
import com.ss.avframework.livestreamv2.core.LayerControl;

/* access modifiers changed from: package-private */
public final /* synthetic */ class LayerControl$GameLayer$$Lambda$1 implements Runnable {
    private final LayerControl.GameLayer arg$1;
    private final int arg$2;
    private final int arg$3;

    static {
        Covode.recordClassIndex(100077);
    }

    LayerControl$GameLayer$$Lambda$1(LayerControl.GameLayer gameLayer, int i2, int i3) {
        this.arg$1 = gameLayer;
        this.arg$2 = i2;
        this.arg$3 = i3;
    }

    public final void run() {
        this.arg$1.lambda$createTexture$1$LayerControl$GameLayer(this.arg$2, this.arg$3);
    }
}
