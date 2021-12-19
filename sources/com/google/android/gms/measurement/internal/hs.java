package com.google.android.gms.measurement.internal;

import android.os.Bundle;
import com.bytedance.covode.number.Covode;

/* access modifiers changed from: package-private */
public final class hs implements Runnable {

    /* renamed from: a  reason: collision with root package name */
    private final /* synthetic */ hn f51796a;

    /* renamed from: b  reason: collision with root package name */
    private final /* synthetic */ hn f51797b;

    /* renamed from: c  reason: collision with root package name */
    private final /* synthetic */ long f51798c;

    /* renamed from: d  reason: collision with root package name */
    private final /* synthetic */ boolean f51799d;

    /* renamed from: e  reason: collision with root package name */
    private final /* synthetic */ hq f51800e;

    static {
        Covode.recordClassIndex(32294);
    }

    public final void run() {
        this.f51800e.a((hq) this.f51796a, this.f51797b, (hn) this.f51798c, (long) this.f51799d, (boolean) ((Bundle) null));
    }

    hs(hq hqVar, hn hnVar, hn hnVar2, long j2, boolean z) {
        this.f51800e = hqVar;
        this.f51796a = hnVar;
        this.f51797b = hnVar2;
        this.f51798c = j2;
        this.f51799d = z;
    }
}
