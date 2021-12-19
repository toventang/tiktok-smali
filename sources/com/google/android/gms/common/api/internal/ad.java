package com.google.android.gms.common.api.internal;

import com.bytedance.covode.number.Covode;

final class ad implements Runnable {

    /* renamed from: a  reason: collision with root package name */
    private final /* synthetic */ ae f50022a;

    static {
        Covode.recordClassIndex(31220);
    }

    public final void run() {
        this.f50022a.f50026d.cancelAvailabilityErrorNotifications(this.f50022a.f50025c);
    }

    ad(ae aeVar) {
        this.f50022a = aeVar;
    }
}
