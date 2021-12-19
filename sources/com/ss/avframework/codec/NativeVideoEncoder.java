package com.ss.avframework.codec;

import android.util.AndroidRuntimeException;
import com.bytedance.covode.number.Covode;
import com.ss.avframework.buffer.VideoFrame;
import com.ss.avframework.engine.VideoEncoder;
import com.ss.avframework.utils.TEBundle;

public class NativeVideoEncoder extends VideoEncoder {
    static {
        Covode.recordClassIndex(99767);
    }

    @Override // com.ss.avframework.engine.VideoEncoder
    public void RequestIDRFrame() {
        throw new AndroidRuntimeException("RequestIDRFrame");
    }

    private static boolean isNativeVideoEncoderInstence(Object obj) {
        return obj instanceof NativeVideoEncoder;
    }

    private NativeVideoEncoder(long j2) {
        this.mNativeObj = j2;
    }

    @Override // com.ss.avframework.engine.VideoEncoder
    public int Encode(VideoFrame videoFrame) {
        throw new AndroidRuntimeException("Native direct mode");
    }

    @Override // com.ss.avframework.engine.VideoEncoder
    public boolean InitEncoder(TEBundle tEBundle) {
        throw new AndroidRuntimeException("Native direct mode");
    }

    @Override // com.ss.avframework.engine.VideoEncoder
    public void SetBitrate(int i2) {
        throw new AndroidRuntimeException("SetBitrate");
    }
}
