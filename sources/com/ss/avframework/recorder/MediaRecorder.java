package com.ss.avframework.recorder;

import android.media.MediaCodec;
import android.media.MediaFormat;
import com.bytedance.covode.number.Covode;
import java.nio.ByteBuffer;

public interface MediaRecorder {
    static {
        Covode.recordClassIndex(100555);
    }

    int addTrack(MediaFormat mediaFormat);

    void release();

    int start();

    int stop();

    int writeSampleData(int i2, ByteBuffer byteBuffer, MediaCodec.BufferInfo bufferInfo);
}
