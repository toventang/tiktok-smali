package com.ss.android.ugc.aweme.feed.p.a;

import com.bytedance.covode.number.Covode;
import h.f.b.l;

public final class d extends RuntimeException {
    private final Throwable realThrowable;

    static {
        Covode.recordClassIndex(59583);
    }

    public final Throwable getRealThrowable() {
        return this.realThrowable;
    }

    public d(Throwable th) {
        l.d(th, "");
        this.realThrowable = th;
    }
}
