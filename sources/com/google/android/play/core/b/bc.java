package com.google.android.play.core.b;

import com.bytedance.covode.number.Covode;
import java.util.Objects;

final class bc extends az {

    /* renamed from: a  reason: collision with root package name */
    private final bb f53128a = new bb();

    static {
        Covode.recordClassIndex(32811);
    }

    bc() {
    }

    @Override // com.google.android.play.core.b.az
    public final void a(Throwable th, Throwable th2) {
        if (th2 != th) {
            Objects.requireNonNull(th2, "The suppressed exception cannot be null.");
            this.f53128a.a(th).add(th2);
            return;
        }
        throw new IllegalArgumentException("Self suppression is not allowed.", th2);
    }
}
