package org.webrtc;

import com.bytedance.covode.number.Covode;
import java.nio.ByteBuffer;

public class JniCommon {
    static {
        Covode.recordClassIndex(106612);
    }

    public static native void nativeAddRef(long j2);

    public static native ByteBuffer nativeAllocateByteBuffer(int i2);

    public static native void nativeFreeByteBuffer(ByteBuffer byteBuffer);

    public static native void nativeReleaseRef(long j2);
}
