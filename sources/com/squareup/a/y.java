package com.squareup.a;

import com.bytedance.covode.number.Covode;
import java.io.Closeable;
import java.io.InputStream;
import k.h;

public abstract class y implements Closeable {
    static {
        Covode.recordClassIndex(36028);
    }

    public abstract long a();

    public abstract h b();

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        b().close();
    }

    public final InputStream c() {
        return b().f();
    }
}
