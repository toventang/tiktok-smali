package com.ss.bytertc.engine.mediaio;

import android.opengl.EGLContext;
import com.bytedance.covode.number.Covode;

public interface IVideoSink {
    static {
        Covode.recordClassIndex(101008);
    }

    void consumeVideoFrame(RTCVideoFrame rTCVideoFrame);

    int getBufferType();

    EGLContext getEGLContextHandle();

    int getPixelFormat();

    void onDispose();

    boolean onInitialize();

    boolean onStart();

    void onStop();
}
