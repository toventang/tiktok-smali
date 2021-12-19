package com.ss.avframework.engine;

import com.bytedance.covode.number.Covode;
import com.ss.avframework.buffer.VideoFrame;
import com.ss.avframework.utils.TEBundle;
import java.nio.ByteBuffer;

public abstract class VideoEncoder extends NativeObject {
    static {
        Covode.recordClassIndex(99834);
    }

    public abstract int Encode(VideoFrame videoFrame);

    public abstract boolean InitEncoder(TEBundle tEBundle);

    public abstract void RequestIDRFrame();

    public abstract void SetBitrate(int i2);

    /* access modifiers changed from: protected */
    public native void nativeEncoded(ByteBuffer byteBuffer, int i2, int i3, int i4, long j2, long j3);

    @Override // com.ss.avframework.engine.NativeObject
    public void release() {
    }
}
