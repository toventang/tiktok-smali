package com.ss.bytertc.engine.video;

import com.bytedance.covode.number.Covode;

public interface ITextureBuffer {
    static {
        Covode.recordClassIndex(101076);
    }

    int getTextureId();

    int getTypeGlTarget();

    float[] nativeGetTransFormMatrix();

    void release();

    void retain();
}
