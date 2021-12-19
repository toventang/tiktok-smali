package com.google.android.gms.measurement.internal;

import com.bytedance.covode.number.Covode;

/* access modifiers changed from: package-private */
public abstract class fb extends cb {

    /* renamed from: a  reason: collision with root package name */
    private boolean f51585a;

    static {
        Covode.recordClassIndex(32223);
    }

    /* access modifiers changed from: protected */
    public abstract boolean u();

    /* access modifiers changed from: protected */
    public void v() {
    }

    /* access modifiers changed from: package-private */
    public final boolean C() {
        if (this.f51585a) {
            return true;
        }
        return false;
    }

    /* access modifiers changed from: protected */
    public final void D() {
        if (!C()) {
            throw new IllegalStateException("Not initialized");
        }
    }

    public final void E() {
        if (this.f51585a) {
            throw new IllegalStateException("Can't initialize twice");
        } else if (!u()) {
            this.z.v();
            this.f51585a = true;
        }
    }

    public final void F() {
        if (!this.f51585a) {
            v();
            this.z.v();
            this.f51585a = true;
            return;
        }
        throw new IllegalStateException("Can't initialize twice");
    }

    fb(ff ffVar) {
        super(ffVar);
        this.z.f51605j++;
    }
}
