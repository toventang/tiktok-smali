package com.google.android.play.core.a;

import android.app.PendingIntent;
import com.bytedance.covode.number.Covode;

public abstract class a {
    static {
        Covode.recordClassIndex(32632);
    }

    private final boolean b(d dVar) {
        return dVar.b() && i() <= j();
    }

    public final PendingIntent a(d dVar) {
        if (dVar.a() != 0) {
            if (dVar.a() == 1) {
                if (k() != null) {
                    return k();
                }
                if (b(dVar)) {
                    return m();
                }
            }
            return null;
        } else if (l() != null) {
            return l();
        } else {
            if (b(dVar)) {
                return n();
            }
            return null;
        }
    }

    public abstract String a();

    public abstract int b();

    public abstract int c();

    public abstract int d();

    public abstract Integer e();

    public abstract int f();

    public abstract long g();

    public abstract long h();

    /* access modifiers changed from: package-private */
    public abstract long i();

    /* access modifiers changed from: package-private */
    public abstract long j();

    /* access modifiers changed from: package-private */
    public abstract PendingIntent k();

    /* access modifiers changed from: package-private */
    public abstract PendingIntent l();

    /* access modifiers changed from: package-private */
    public abstract PendingIntent m();

    /* access modifiers changed from: package-private */
    public abstract PendingIntent n();
}
