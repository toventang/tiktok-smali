package com.ss.bytertc.engine.utils;

import com.bytedance.covode.number.Covode;

final /* synthetic */ class GLHepler$$Lambda$0 implements Runnable {
    private final GLHepler arg$1;
    private final int arg$2;
    private final int arg$3;
    private final int arg$4;
    private final int arg$5;

    static {
        Covode.recordClassIndex(101043);
    }

    GLHepler$$Lambda$0(GLHepler gLHepler, int i2, int i3, int i4, int i5) {
        this.arg$1 = gLHepler;
        this.arg$2 = i2;
        this.arg$3 = i3;
        this.arg$4 = i4;
        this.arg$5 = i5;
    }

    public final void run() {
        this.arg$1.lambda$deliverToTexture2D$0$GLHepler(this.arg$2, this.arg$3, this.arg$4, this.arg$5);
    }
}
