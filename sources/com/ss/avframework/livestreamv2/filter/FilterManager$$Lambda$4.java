package com.ss.avframework.livestreamv2.filter;

import com.bytedance.covode.number.Covode;
import com.ss.avframework.buffer.VideoFrame;

final /* synthetic */ class FilterManager$$Lambda$4 implements Runnable {
    private final FilterManager arg$1;
    private final VideoFrame.I420Buffer[] arg$2;
    private final VideoFrame.TextureBuffer arg$3;

    static {
        Covode.recordClassIndex(100313);
    }

    FilterManager$$Lambda$4(FilterManager filterManager, VideoFrame.I420Buffer[] i420BufferArr, VideoFrame.TextureBuffer textureBuffer) {
        this.arg$1 = filterManager;
        this.arg$2 = i420BufferArr;
        this.arg$3 = textureBuffer;
    }

    public final void run() {
        this.arg$1.lambda$toI420$4$FilterManager(this.arg$2, this.arg$3);
    }
}
