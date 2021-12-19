package com.ss.avframework.livestreamv2.core.interact;

import com.bytedance.covode.number.Covode;

final /* synthetic */ class InteractVideoSink$$Lambda$3 implements Runnable {
    private final InteractVideoSink arg$1;
    private final int arg$2;
    private final int arg$3;

    static {
        Covode.recordClassIndex(100229);
    }

    InteractVideoSink$$Lambda$3(InteractVideoSink interactVideoSink, int i2, int i3) {
        this.arg$1 = interactVideoSink;
        this.arg$2 = i2;
        this.arg$3 = i3;
    }

    public final void run() {
        this.arg$1.lambda$createTexture$4$InteractVideoSink(this.arg$2, this.arg$3);
    }
}
