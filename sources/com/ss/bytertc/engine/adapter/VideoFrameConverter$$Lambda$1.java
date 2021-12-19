package com.ss.bytertc.engine.adapter;

import com.bytedance.covode.number.Covode;
import com.ss.bytertc.engine.adapter.VideoFrameConverter;

final /* synthetic */ class VideoFrameConverter$$Lambda$1 implements Runnable {
    private final VideoFrameConverter.ByteBufferHolder arg$1;

    static {
        Covode.recordClassIndex(100828);
    }

    VideoFrameConverter$$Lambda$1(VideoFrameConverter.ByteBufferHolder byteBufferHolder) {
        this.arg$1 = byteBufferHolder;
    }

    public final void run() {
        VideoFrameConverter.lambda$convertToJavaI420Buffer$1$VideoFrameConverter(this.arg$1);
    }
}
