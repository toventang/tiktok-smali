package com.google.android.gms.measurement.internal;

import android.os.Bundle;
import com.bytedance.covode.number.Covode;

/* access modifiers changed from: package-private */
public final class gs implements Runnable {

    /* renamed from: a  reason: collision with root package name */
    private final /* synthetic */ Bundle f51715a;

    /* renamed from: b  reason: collision with root package name */
    private final /* synthetic */ gk f51716b;

    static {
        Covode.recordClassIndex(32267);
    }

    public final void run() {
        gk.b(this.f51716b, this.f51715a);
    }

    gs(gk gkVar, Bundle bundle) {
        this.f51716b = gkVar;
        this.f51715a = bundle;
    }
}
