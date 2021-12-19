package com.google.android.gms.measurement.internal;

import com.bytedance.covode.number.Covode;
import java.util.concurrent.atomic.AtomicReference;

/* access modifiers changed from: package-private */
public final class gx implements Runnable {

    /* renamed from: a  reason: collision with root package name */
    private final /* synthetic */ AtomicReference f51728a;

    /* renamed from: b  reason: collision with root package name */
    private final /* synthetic */ String f51729b;

    /* renamed from: c  reason: collision with root package name */
    private final /* synthetic */ String f51730c;

    /* renamed from: d  reason: collision with root package name */
    private final /* synthetic */ String f51731d;

    /* renamed from: e  reason: collision with root package name */
    private final /* synthetic */ boolean f51732e;

    /* renamed from: f  reason: collision with root package name */
    private final /* synthetic */ gk f51733f;

    static {
        Covode.recordClassIndex(32272);
    }

    public final void run() {
        this.f51733f.z.i().a(this.f51728a, this.f51729b, this.f51730c, this.f51731d, this.f51732e);
    }

    gx(gk gkVar, AtomicReference atomicReference, String str, String str2, String str3, boolean z) {
        this.f51733f = gkVar;
        this.f51728a = atomicReference;
        this.f51729b = str;
        this.f51730c = str2;
        this.f51731d = str3;
        this.f51732e = z;
    }
}
