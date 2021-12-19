package com.ss.avframework.livestreamv2.core.interact;

import com.bytedance.covode.number.Covode;

/* access modifiers changed from: package-private */
public final /* synthetic */ class InteractVideoSink$$Lambda$0 implements Runnable {
    private final InteractVideoSink arg$1;

    static {
        Covode.recordClassIndex(100226);
    }

    InteractVideoSink$$Lambda$0(InteractVideoSink interactVideoSink) {
        this.arg$1 = interactVideoSink;
    }

    public final void run() {
        this.arg$1.lambda$release$0$InteractVideoSink();
    }
}
