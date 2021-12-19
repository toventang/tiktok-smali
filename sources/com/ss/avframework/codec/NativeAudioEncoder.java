package com.ss.avframework.codec;

import android.util.AndroidRuntimeException;
import com.bytedance.covode.number.Covode;
import com.ss.avframework.engine.AudioEncoder;
import com.ss.avframework.utils.TEBundle;
import java.nio.ByteBuffer;

public class NativeAudioEncoder extends AudioEncoder {
    static {
        Covode.recordClassIndex(99766);
    }

    private static boolean isNativeAudioEncoderInstance(Object obj) {
        return obj instanceof NativeAudioEncoder;
    }

    private NativeAudioEncoder(long j2) {
        this.mNativeObj = j2;
    }

    @Override // com.ss.avframework.engine.AudioEncoder
    public boolean InitEncoder(TEBundle tEBundle) {
        throw new AndroidRuntimeException("Native direct mode");
    }

    @Override // com.ss.avframework.engine.AudioEncoder
    public int Encode(ByteBuffer byteBuffer, int i2, int i3, int i4, long j2) {
        throw new AndroidRuntimeException("Native direct mode");
    }
}
