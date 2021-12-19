package com.ss.avframework.livestreamv2.core.interact.audio;

import com.bytedance.covode.number.Covode;
import java.nio.ByteBuffer;

public interface AudioSink {
    static {
        Covode.recordClassIndex(100236);
    }

    void onPlaybackAudioFrame(ByteBuffer byteBuffer, int i2, int i3, int i4, long j2);

    void setRenderAble(boolean z);
}
