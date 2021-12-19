package com.ttnet.org.chromium.net;

import com.bytedance.covode.number.Covode;
import java.io.Closeable;
import java.nio.ByteBuffer;

public abstract class z implements Closeable {
    static {
        Covode.recordClassIndex(103577);
    }

    public abstract long a();

    public abstract void a(aa aaVar);

    public abstract void a(aa aaVar, ByteBuffer byteBuffer);

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() {
    }
}
