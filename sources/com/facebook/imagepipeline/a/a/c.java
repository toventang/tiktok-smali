package com.facebook.imagepipeline.a.a;

import com.bytedance.covode.number.Covode;

public interface c {
    static {
        Covode.recordClassIndex(28885);
    }

    boolean doesRenderSupportScaling();

    int getDuration();

    d getFrame(int i2);

    int getFrameCount();

    int[] getFrameDurations();

    b getFrameInfo(int i2);

    int getHeight();

    int getLoopCount();

    int getSizeInBytes();

    int getWidth();
}
