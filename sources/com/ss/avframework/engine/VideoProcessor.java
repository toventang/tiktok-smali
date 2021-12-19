package com.ss.avframework.engine;

import com.bytedance.covode.number.Covode;
import com.ss.avframework.buffer.VideoFrame;

public abstract class VideoProcessor extends NativeObject {
    static {
        Covode.recordClassIndex(99837);
    }

    /* access modifiers changed from: protected */
    public abstract VideoFrame process(VideoFrame videoFrame);
}
