package com.google.android.gms.measurement.internal;

import com.bytedance.covode.number.Covode;

/* access modifiers changed from: package-private */
public abstract class fy extends fz {

    /* renamed from: a  reason: collision with root package name */
    private boolean f51662a;

    static {
        Covode.recordClassIndex(32246);
    }

    /* access modifiers changed from: protected */
    public void M_() {
    }

    /* access modifiers changed from: protected */
    public abstract boolean d();

    /* access modifiers changed from: package-private */
    public final boolean w() {
        if (this.f51662a) {
            return true;
        }
        return false;
    }

    /* access modifiers changed from: protected */
    public final void x() {
        if (!w()) {
            throw new IllegalStateException("Not initialized");
        }
    }

    public final void y() {
        if (this.f51662a) {
            throw new IllegalStateException("Can't initialize twice");
        } else if (!d()) {
            this.z.v();
            this.f51662a = true;
        }
    }

    public final void z() {
        if (!this.f51662a) {
            M_();
            this.z.v();
            this.f51662a = true;
            return;
        }
        throw new IllegalStateException("Can't initialize twice");
    }

    fy(ff ffVar) {
        super(ffVar);
        this.z.f51605j++;
    }
}
