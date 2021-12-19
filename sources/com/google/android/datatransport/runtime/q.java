package com.google.android.datatransport.runtime;

import android.content.Context;
import com.bytedance.covode.number.Covode;
import com.google.android.datatransport.runtime.scheduling.a.c;
import java.io.Closeable;

/* access modifiers changed from: package-private */
public abstract class q implements Closeable {

    interface a {
        static {
            Covode.recordClassIndex(30956);
        }

        a a(Context context);

        q a();
    }

    static {
        Covode.recordClassIndex(30955);
    }

    /* access modifiers changed from: package-private */
    public abstract p a();

    /* access modifiers changed from: package-private */
    public abstract c b();

    q() {
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        b().close();
    }
}
