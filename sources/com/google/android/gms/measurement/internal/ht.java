package com.google.android.gms.measurement.internal;

import com.bytedance.covode.number.Covode;

final class ht implements Runnable {

    /* renamed from: a  reason: collision with root package name */
    private final /* synthetic */ hn f51801a;

    /* renamed from: b  reason: collision with root package name */
    private final /* synthetic */ long f51802b;

    /* renamed from: c  reason: collision with root package name */
    private final /* synthetic */ hq f51803c;

    static {
        Covode.recordClassIndex(32295);
    }

    public final void run() {
        this.f51803c.a(this.f51801a, false, this.f51802b);
        this.f51803c.f51785c = null;
        this.f51803c.g().a((hn) null);
    }

    ht(hq hqVar, hn hnVar, long j2) {
        this.f51803c = hqVar;
        this.f51801a = hnVar;
        this.f51802b = j2;
    }
}
