package com.ss.bytertc.engine.video;

import com.bytedance.covode.number.Covode;
import com.ss.bytertc.engine.mediaio.RTCVideoFrame;
import java.nio.ByteBuffer;
import org.webrtc.VideoFrame;

public class InternalRtcVideoFrame extends RTCVideoFrame {
    public final VideoFrame.Buffer buffer;
    public final ByteBuffer extendedData;
    public boolean isFlip = false;
    public final int rotation;
    public final long timestampNs;

    static {
        Covode.recordClassIndex(101079);
    }

    public InternalRtcVideoFrame(VideoFrame.Buffer buffer2, ByteBuffer byteBuffer, int i2, long j2, boolean z) {
        super(null, byteBuffer, null, buffer2.getWidth(), buffer2.getHeight(), i2, j2, null);
        if (buffer2 == null) {
            throw new IllegalArgumentException("buffer not allowed to be null");
        } else if (i2 % 90 == 0) {
            this.buffer_type = 2;
            this.buffer = buffer2;
            this.rotation = i2;
            this.timestampNs = j2;
            this.extendedData = byteBuffer;
            this.isFlip = z;
        } else {
            throw new IllegalArgumentException("rotation must be a multiple of 90");
        }
    }
}
