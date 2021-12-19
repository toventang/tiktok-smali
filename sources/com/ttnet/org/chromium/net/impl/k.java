package com.ttnet.org.chromium.net.impl;

import com.bytedance.covode.number.Covode;
import java.nio.ByteBuffer;

public final class k {
    static {
        Covode.recordClassIndex(103533);
    }

    static void a(ByteBuffer byteBuffer) {
        if (!byteBuffer.isDirect()) {
            throw new IllegalArgumentException("byteBuffer must be a direct ByteBuffer.");
        }
    }

    static void b(ByteBuffer byteBuffer) {
        if (!byteBuffer.hasRemaining()) {
            throw new IllegalArgumentException("ByteBuffer is already full.");
        }
    }
}
