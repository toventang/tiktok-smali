package com.google.android.gms.measurement.internal;

import android.content.ComponentName;
import com.bytedance.covode.number.Covode;

final class is implements Runnable {

    /* renamed from: a  reason: collision with root package name */
    private final /* synthetic */ ComponentName f51888a;

    /* renamed from: b  reason: collision with root package name */
    private final /* synthetic */ iq f51889b;

    static {
        Covode.recordClassIndex(32321);
    }

    public final void run() {
        hv.a(this.f51889b.f51885c, this.f51888a);
    }

    is(iq iqVar, ComponentName componentName) {
        this.f51889b = iqVar;
        this.f51888a = componentName;
    }
}
