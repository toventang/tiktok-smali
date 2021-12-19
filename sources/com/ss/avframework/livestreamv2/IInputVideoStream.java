package com.ss.avframework.livestreamv2;

import com.bytedance.covode.number.Covode;
import com.ss.avframework.mixer.VideoMixer;
import java.nio.ByteBuffer;

public interface IInputVideoStream {
    static {
        Covode.recordClassIndex(99859);
    }

    int fps();

    int getHeight();

    VideoMixer.VideoMixerDescription getMixerDescription();

    int getWidth();

    String name();

    int pushVideoFrame(int i2, boolean z, int i3, int i4, int i5, float[] fArr, long j2);

    int pushVideoFrame(ByteBuffer byteBuffer, int i2, int i3, int i4, long j2);

    void release();

    void setMixerDescription(VideoMixer.VideoMixerDescription videoMixerDescription);

    int start();

    int stop();
}
