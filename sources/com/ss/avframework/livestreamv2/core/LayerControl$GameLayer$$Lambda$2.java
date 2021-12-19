package com.ss.avframework.livestreamv2.core;

import com.bytedance.covode.number.Covode;
import com.ss.avframework.livestreamv2.core.LayerControl;

final /* synthetic */ class LayerControl$GameLayer$$Lambda$2 implements Runnable {
    private final LayerControl.GameLayer arg$1;

    static {
        Covode.recordClassIndex(100078);
    }

    LayerControl$GameLayer$$Lambda$2(LayerControl.GameLayer gameLayer) {
        this.arg$1 = gameLayer;
    }

    public final void run() {
        this.arg$1.lambda$release$2$LayerControl$GameLayer();
    }
}
