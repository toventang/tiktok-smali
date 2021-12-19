package com.google.android.gms.common.api.internal;

import android.os.Bundle;
import com.bytedance.covode.number.Covode;

final class cy implements Runnable {

    /* renamed from: a  reason: collision with root package name */
    private final /* synthetic */ LifecycleCallback f50213a;

    /* renamed from: b  reason: collision with root package name */
    private final /* synthetic */ String f50214b;

    /* renamed from: c  reason: collision with root package name */
    private final /* synthetic */ cz f50215c;

    static {
        Covode.recordClassIndex(31297);
    }

    public final void run() {
        Bundle bundle;
        if (this.f50215c.f50217a > 0) {
            LifecycleCallback lifecycleCallback = this.f50213a;
            if (this.f50215c.f50218b != null) {
                bundle = this.f50215c.f50218b.getBundle(this.f50214b);
            } else {
                bundle = null;
            }
            lifecycleCallback.a(bundle);
        }
        if (this.f50215c.f50217a >= 2) {
            this.f50213a.b();
        }
        if (this.f50215c.f50217a >= 3) {
            this.f50213a.c();
        }
        if (this.f50215c.f50217a >= 4) {
            this.f50213a.d();
        }
    }

    cy(cz czVar, LifecycleCallback lifecycleCallback, String str) {
        this.f50215c = czVar;
        this.f50213a = lifecycleCallback;
        this.f50214b = str;
    }
}
