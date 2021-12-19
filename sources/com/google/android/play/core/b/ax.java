package com.google.android.play.core.b;

import com.bytedance.covode.number.Covode;
import java.io.Closeable;
import java.io.InputStream;

public abstract class ax implements Closeable {
    static {
        Covode.recordClassIndex(32805);
    }

    public abstract long a();

    /* access modifiers changed from: protected */
    public abstract InputStream a(long j2, long j3);

    public final synchronized InputStream b() {
        return a(0, a());
    }
}
