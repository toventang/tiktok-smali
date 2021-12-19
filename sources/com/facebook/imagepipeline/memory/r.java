package com.facebook.imagepipeline.memory;

import com.bytedance.covode.number.Covode;
import java.nio.ByteBuffer;

public interface r {
    static {
        Covode.recordClassIndex(29066);
    }

    void close();

    void copy(int i2, r rVar, int i3, int i4);

    ByteBuffer getByteBuffer();

    long getNativePtr();

    int getSize();

    long getUniqueId();

    boolean isClosed();

    byte read(int i2);

    int read(int i2, byte[] bArr, int i3, int i4);

    int write(int i2, byte[] bArr, int i3, int i4);
}
