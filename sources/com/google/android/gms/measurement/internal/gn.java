package com.google.android.gms.measurement.internal;

import android.os.Bundle;
import com.bytedance.covode.number.Covode;

/* access modifiers changed from: package-private */
public final class gn implements Runnable {

    /* renamed from: a  reason: collision with root package name */
    private final /* synthetic */ String f51695a;

    /* renamed from: b  reason: collision with root package name */
    private final /* synthetic */ String f51696b;

    /* renamed from: c  reason: collision with root package name */
    private final /* synthetic */ long f51697c;

    /* renamed from: d  reason: collision with root package name */
    private final /* synthetic */ Bundle f51698d;

    /* renamed from: e  reason: collision with root package name */
    private final /* synthetic */ boolean f51699e;

    /* renamed from: f  reason: collision with root package name */
    private final /* synthetic */ boolean f51700f;

    /* renamed from: g  reason: collision with root package name */
    private final /* synthetic */ boolean f51701g;

    /* renamed from: h  reason: collision with root package name */
    private final /* synthetic */ String f51702h = null;

    /* renamed from: i  reason: collision with root package name */
    private final /* synthetic */ gk f51703i;

    static {
        Covode.recordClassIndex(32262);
    }

    public final void run() {
        this.f51703i.a(this.f51695a, this.f51696b, this.f51697c, this.f51698d, this.f51699e, this.f51700f, this.f51701g, this.f51702h);
    }

    gn(gk gkVar, String str, String str2, long j2, Bundle bundle, boolean z, boolean z2, boolean z3) {
        this.f51703i = gkVar;
        this.f51695a = str;
        this.f51696b = str2;
        this.f51697c = j2;
        this.f51698d = bundle;
        this.f51699e = z;
        this.f51700f = z2;
        this.f51701g = z3;
    }
}
