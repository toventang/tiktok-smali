package com.facebook.imagepipeline.j;

import com.bytedance.covode.number.Covode;
import com.facebook.common.e.a;
import java.io.Closeable;

public abstract class c implements f, Closeable {
    static {
        Covode.recordClassIndex(29017);
    }

    public abstract boolean a();

    public abstract int b();

    public boolean c() {
        return false;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public abstract void close();

    public h e() {
        return g.f48000a;
    }

    /* access modifiers changed from: protected */
    @Override // java.lang.Object
    public void finalize() {
        if (!a()) {
            String simpleName = getClass().getSimpleName();
            Integer valueOf = Integer.valueOf(System.identityHashCode(this));
            if (a.f47081a.b(3)) {
                a.f47081a.b("CloseableImage", com.a.a(null, "finalize: %s %x still open.", new Object[]{simpleName, valueOf}));
            }
            try {
                close();
            } finally {
                super.finalize();
            }
        }
    }
}
