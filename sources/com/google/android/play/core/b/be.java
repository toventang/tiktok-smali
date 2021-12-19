package com.google.android.play.core.b;

import com.bytedance.covode.number.Covode;

final class be extends az {
    static {
        Covode.recordClassIndex(32813);
    }

    be() {
    }

    @Override // com.google.android.play.core.b.az
    public final void a(Throwable th, Throwable th2) {
        th.addSuppressed(th2);
    }
}
