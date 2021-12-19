package com.ss.avframework.livestreamv2.core.interact;

import com.bytedance.covode.number.Covode;
import com.ss.avframework.livestreamv2.core.interact.model.Config;
import java.nio.ByteBuffer;
import java.util.concurrent.atomic.AtomicBoolean;

final /* synthetic */ class InteractVideoSink$$Lambda$2 implements Runnable {
    private final InteractVideoSink arg$1;
    private final ByteBuffer arg$2;
    private final int arg$3;
    private final int arg$4;
    private final Config.VideoOutputFormat arg$5;
    private final int arg$6;
    private final AtomicBoolean arg$7;

    static {
        Covode.recordClassIndex(100228);
    }

    InteractVideoSink$$Lambda$2(InteractVideoSink interactVideoSink, ByteBuffer byteBuffer, int i2, int i3, Config.VideoOutputFormat videoOutputFormat, int i4, AtomicBoolean atomicBoolean) {
        this.arg$1 = interactVideoSink;
        this.arg$2 = byteBuffer;
        this.arg$3 = i2;
        this.arg$4 = i3;
        this.arg$5 = videoOutputFormat;
        this.arg$6 = i4;
        this.arg$7 = atomicBoolean;
    }

    public final void run() {
        this.arg$1.lambda$loadYuvAndDraw$3$InteractVideoSink(this.arg$2, this.arg$3, this.arg$4, this.arg$5, this.arg$6, this.arg$7);
    }
}
