package com.google.android.gms.common.api.internal;

import android.os.Bundle;
import com.bytedance.covode.number.Covode;

final class cx implements Runnable {

    /* renamed from: a  reason: collision with root package name */
    private final /* synthetic */ LifecycleCallback f50210a;

    /* renamed from: b  reason: collision with root package name */
    private final /* synthetic */ String f50211b;

    /* renamed from: c  reason: collision with root package name */
    private final /* synthetic */ cw f50212c;

    static {
        Covode.recordClassIndex(31296);
    }

    public final void run() {
        Bundle bundle;
        if (this.f50212c.f50207a > 0) {
            LifecycleCallback lifecycleCallback = this.f50210a;
            if (this.f50212c.f50208b != null) {
                bundle = this.f50212c.f50208b.getBundle(this.f50211b);
            } else {
                bundle = null;
            }
            lifecycleCallback.a(bundle);
        }
        if (this.f50212c.f50207a >= 2) {
            this.f50210a.b();
        }
        if (this.f50212c.f50207a >= 3) {
            this.f50210a.c();
        }
        if (this.f50212c.f50207a >= 4) {
            this.f50210a.d();
        }
    }

    cx(cw cwVar, LifecycleCallback lifecycleCallback, String str) {
        this.f50212c = cwVar;
        this.f50210a = lifecycleCallback;
        this.f50211b = str;
    }
}
