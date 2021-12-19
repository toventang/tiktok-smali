package com.google.android.gms.c;

import com.bytedance.covode.number.Covode;
import java.util.concurrent.Callable;

/* access modifiers changed from: package-private */
public final class ad implements Runnable {

    /* renamed from: a  reason: collision with root package name */
    private final /* synthetic */ ac f49900a;

    /* renamed from: b  reason: collision with root package name */
    private final /* synthetic */ Callable f49901b;

    static {
        Covode.recordClassIndex(31147);
    }

    ad(ac acVar, Callable callable) {
        this.f49900a = acVar;
        this.f49901b = callable;
    }

    public final void run() {
        try {
            this.f49900a.a(this.f49901b.call());
        } catch (Exception e2) {
            this.f49900a.a(e2);
        }
    }
}
