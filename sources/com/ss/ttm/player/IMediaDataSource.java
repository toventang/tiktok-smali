package com.ss.ttm.player;

import com.bytedance.covode.number.Covode;
import java.io.Closeable;

public interface IMediaDataSource extends Closeable {
    static {
        Covode.recordClassIndex(101301);
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    void close();

    long getSize();

    int readAt(long j2, byte[] bArr, int i2, int i3);
}
