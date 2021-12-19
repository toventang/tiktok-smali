package org.webrtc;

import android.media.MediaCodec;
import android.media.MediaCrypto;
import android.media.MediaFormat;
import android.os.Bundle;
import android.view.Surface;
import com.bytedance.covode.number.Covode;
import java.nio.ByteBuffer;

interface MediaCodecWrapper {
    static {
        Covode.recordClassIndex(106622);
    }

    void configure(MediaFormat mediaFormat, Surface surface, MediaCrypto mediaCrypto, int i2);

    Surface createInputSurface();

    int dequeueInputBuffer(long j2);

    int dequeueOutputBuffer(MediaCodec.BufferInfo bufferInfo, long j2);

    void flush();

    ByteBuffer[] getInputBuffers();

    ByteBuffer[] getOutputBuffers();

    MediaFormat getOutputFormat();

    void queueInputBuffer(int i2, int i3, int i4, long j2, int i5);

    void release();

    void releaseOutputBuffer(int i2, boolean z);

    void setParameters(Bundle bundle);

    void start();

    void stop();
}
