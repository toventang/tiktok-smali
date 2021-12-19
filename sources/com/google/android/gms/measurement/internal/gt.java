package com.google.android.gms.measurement.internal;

import android.os.Bundle;
import com.bytedance.covode.number.Covode;

/* access modifiers changed from: package-private */
public final class gt implements Runnable {

    /* renamed from: a  reason: collision with root package name */
    private final /* synthetic */ Bundle f51717a;

    /* renamed from: b  reason: collision with root package name */
    private final /* synthetic */ gk f51718b;

    static {
        Covode.recordClassIndex(32268);
    }

    public final void run() {
        gk.a(this.f51718b, this.f51717a);
    }

    gt(gk gkVar, Bundle bundle) {
        this.f51718b = gkVar;
        this.f51717a = bundle;
    }
}
