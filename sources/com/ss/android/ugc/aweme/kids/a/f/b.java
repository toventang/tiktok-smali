package com.ss.android.ugc.aweme.kids.a.f;

import com.bytedance.covode.number.Covode;
import h.f.b.l;

public final class b extends RuntimeException {
    private final Throwable realThrowable;

    static {
        Covode.recordClassIndex(67508);
    }

    public final Throwable getRealThrowable() {
        return this.realThrowable;
    }

    public b(Throwable th) {
        l.d(th, "");
        this.realThrowable = th;
    }
}
