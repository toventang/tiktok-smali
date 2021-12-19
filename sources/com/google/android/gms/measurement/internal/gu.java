package com.google.android.gms.measurement.internal;

import com.bytedance.covode.number.Covode;
import java.util.concurrent.atomic.AtomicReference;

/* access modifiers changed from: package-private */
public final class gu implements Runnable {

    /* renamed from: a  reason: collision with root package name */
    private final /* synthetic */ AtomicReference f51719a;

    /* renamed from: b  reason: collision with root package name */
    private final /* synthetic */ String f51720b;

    /* renamed from: c  reason: collision with root package name */
    private final /* synthetic */ String f51721c;

    /* renamed from: d  reason: collision with root package name */
    private final /* synthetic */ String f51722d;

    /* renamed from: e  reason: collision with root package name */
    private final /* synthetic */ gk f51723e;

    static {
        Covode.recordClassIndex(32269);
    }

    public final void run() {
        this.f51723e.z.i().a(this.f51719a, this.f51720b, this.f51721c, this.f51722d);
    }

    gu(gk gkVar, AtomicReference atomicReference, String str, String str2, String str3) {
        this.f51723e = gkVar;
        this.f51719a = atomicReference;
        this.f51720b = str;
        this.f51721c = str2;
        this.f51722d = str3;
    }
}
