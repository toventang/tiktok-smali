package com.ss.bytertc.engine.ui;

import com.bytedance.covode.number.Covode;
import java.nio.ByteBuffer;

final /* synthetic */ class VideoFrameRender$$Lambda$3 implements Runnable {
    private final ByteBuffer arg$1;
    private final ByteBuffer arg$2;
    private final ByteBuffer arg$3;

    static {
        Covode.recordClassIndex(101026);
    }

    VideoFrameRender$$Lambda$3(ByteBuffer byteBuffer, ByteBuffer byteBuffer2, ByteBuffer byteBuffer3) {
        this.arg$1 = byteBuffer;
        this.arg$2 = byteBuffer2;
        this.arg$3 = byteBuffer3;
    }

    public final void run() {
        VideoFrameRender.lambda$createYUV$3$VideoFrameRender(this.arg$1, this.arg$2, this.arg$3);
    }
}
