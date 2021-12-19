package com.google.android.gms.measurement.internal;

import com.bytedance.covode.number.Covode;

final class fx implements Runnable {

    /* renamed from: a  reason: collision with root package name */
    private final /* synthetic */ String f51657a;

    /* renamed from: b  reason: collision with root package name */
    private final /* synthetic */ String f51658b;

    /* renamed from: c  reason: collision with root package name */
    private final /* synthetic */ String f51659c;

    /* renamed from: d  reason: collision with root package name */
    private final /* synthetic */ long f51660d;

    /* renamed from: e  reason: collision with root package name */
    private final /* synthetic */ fg f51661e;

    static {
        Covode.recordClassIndex(32245);
    }

    public final void run() {
        if (this.f51657a == null) {
            this.f51661e.f51608a.f51940b.h().a(this.f51658b, (hn) null);
            return;
        }
        this.f51661e.f51608a.f51940b.h().a(this.f51658b, new hn(this.f51659c, this.f51657a, this.f51660d));
    }

    fx(fg fgVar, String str, String str2, String str3, long j2) {
        this.f51661e = fgVar;
        this.f51657a = str;
        this.f51658b = str2;
        this.f51659c = str3;
        this.f51660d = j2;
    }
}
