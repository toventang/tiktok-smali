package com.facebook.common.g;

import com.bytedance.covode.number.Covode;
import java.io.Closeable;
import java.nio.ByteBuffer;

public interface h extends Closeable {
    static {
        Covode.recordClassIndex(28659);
    }

    byte a(int i2);

    int a();

    int a(int i2, byte[] bArr, int i3, int i4);

    long b();

    ByteBuffer c();

    boolean d();

    public static class a extends RuntimeException {
        static {
            Covode.recordClassIndex(28660);
        }

        public a() {
            super("Invalid bytebuf. Already closed");
        }
    }
}
