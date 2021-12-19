package com.bytedance.android.livesdk.util.rxutils.autodispose;

import com.bytedance.covode.number.Covode;
import f.a.c.a;
import java.util.concurrent.atomic.AtomicReference;

/* access modifiers changed from: package-private */
public final class c extends AtomicReference<Throwable> {
    private static final long serialVersionUID = 3949248817947090603L;

    static {
        Covode.recordClassIndex(13057);
    }

    c() {
    }

    public final Throwable a() {
        Throwable th = (Throwable) get();
        if (th != x.f22181a) {
            return (Throwable) getAndSet(x.f22181a);
        }
        return th;
    }

    /* JADX DEBUG: Multi-variable search result rejected for r0v2, resolved type: java.lang.Throwable[] */
    /* JADX WARN: Multi-variable type inference failed */
    public final boolean a(Throwable th) {
        Object obj;
        Throwable aVar;
        do {
            obj = get();
            if (obj == x.f22181a) {
                return false;
            }
            if (obj == null) {
                aVar = th;
            } else {
                aVar = new a(obj, th);
            }
        } while (!compareAndSet(obj, aVar));
        return true;
    }
}
