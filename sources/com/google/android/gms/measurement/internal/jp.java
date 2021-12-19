package com.google.android.gms.measurement.internal;

import com.bytedance.covode.number.Covode;

/* access modifiers changed from: package-private */
public abstract class jp extends jm {

    /* renamed from: a  reason: collision with root package name */
    private boolean f51956a;

    static {
        Covode.recordClassIndex(32346);
    }

    /* access modifiers changed from: protected */
    public abstract boolean d();

    /* access modifiers changed from: package-private */
    public final boolean A() {
        if (this.f51956a) {
            return true;
        }
        return false;
    }

    /* access modifiers changed from: protected */
    public final void B() {
        if (!A()) {
            throw new IllegalStateException("Not initialized");
        }
    }

    public final void C() {
        if (!this.f51956a) {
            d();
            this.f51935j.f51943e++;
            this.f51956a = true;
            return;
        }
        throw new IllegalStateException("Can't initialize twice");
    }

    jp(jo joVar) {
        super(joVar);
        this.f51935j.f51942d++;
    }
}
