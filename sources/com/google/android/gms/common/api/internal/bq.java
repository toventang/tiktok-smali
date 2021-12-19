package com.google.android.gms.common.api.internal;

import com.bytedance.covode.number.Covode;
import com.google.android.gms.common.ConnectionResult;

/* access modifiers changed from: package-private */
public final class bq implements Runnable {

    /* renamed from: a  reason: collision with root package name */
    private final /* synthetic */ br f50106a;

    static {
        Covode.recordClassIndex(31260);
    }

    public final void run() {
        this.f50106a.f50110c.b(new ConnectionResult(4));
    }

    bq(br brVar) {
        this.f50106a = brVar;
    }
}
