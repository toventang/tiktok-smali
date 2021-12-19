package com.google.android.gms.measurement.internal;

import com.bytedance.covode.number.Covode;

/* access modifiers changed from: package-private */
public final class fh implements Runnable {

    /* renamed from: a  reason: collision with root package name */
    private final /* synthetic */ gh f51611a;

    /* renamed from: b  reason: collision with root package name */
    private final /* synthetic */ ff f51612b;

    static {
        Covode.recordClassIndex(32229);
    }

    public final void run() {
        ff.a(this.f51612b, this.f51611a);
        this.f51612b.a();
    }

    fh(ff ffVar, gh ghVar) {
        this.f51612b = ffVar;
        this.f51611a = ghVar;
    }
}
