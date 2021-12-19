package com.ss.bytertc.engine.utils;

import com.bytedance.covode.number.Covode;
import java.nio.ByteBuffer;

public class ByteBufferUtils {
    static {
        Covode.recordClassIndex(101036);
    }

    public static native ByteBuffer nativeAllocateBuffer(int i2);

    public static native void nativeReleaseBuffer(ByteBuffer byteBuffer);
}
