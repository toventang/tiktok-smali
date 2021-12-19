package com.ss.avframework.engine;

import com.bytedance.covode.number.Covode;
import com.ss.avframework.buffer.VideoFrame;

public abstract class VideoSink extends NativeObject {
    static {
        Covode.recordClassIndex(99838);
    }

    /* access modifiers changed from: protected */
    public abstract void OnDiscardedFrame();

    /* access modifiers changed from: protected */
    public abstract void onFrame(VideoFrame videoFrame);

    public void onFrameOnJava(VideoFrame videoFrame) {
        onFrame(videoFrame);
    }
}
