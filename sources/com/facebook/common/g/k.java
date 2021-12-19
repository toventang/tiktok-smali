package com.facebook.common.g;

import com.bytedance.covode.number.Covode;
import com.facebook.common.d.m;
import java.io.IOException;
import java.io.OutputStream;

public abstract class k extends OutputStream {
    static {
        Covode.recordClassIndex(28663);
    }

    public abstract h a();

    public abstract int b();

    @Override // java.io.OutputStream, java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        try {
            super.close();
        } catch (IOException e2) {
            m.b(e2);
        }
    }
}
