package com.google.android.gms.measurement.internal;

import com.bytedance.covode.number.Covode;
import java.util.ArrayList;

/* access modifiers changed from: package-private */
public final class ix implements Runnable {

    /* renamed from: a  reason: collision with root package name */
    private final /* synthetic */ jo f51897a;

    /* renamed from: b  reason: collision with root package name */
    private final /* synthetic */ Runnable f51898b;

    static {
        Covode.recordClassIndex(32326);
    }

    public final void run() {
        this.f51897a.k();
        jo joVar = this.f51897a;
        Runnable runnable = this.f51898b;
        joVar.g();
        if (joVar.f51941c == null) {
            joVar.f51941c = new ArrayList();
        }
        joVar.f51941c.add(runnable);
        this.f51897a.i();
    }

    ix(jo joVar, Runnable runnable) {
        this.f51897a = joVar;
        this.f51898b = runnable;
    }
}
