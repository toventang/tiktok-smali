package com.google.android.gms.measurement.internal;

import com.bytedance.covode.number.Covode;

/* access modifiers changed from: package-private */
public final class jr implements Runnable {

    /* renamed from: a  reason: collision with root package name */
    private final /* synthetic */ ju f51959a;

    /* renamed from: b  reason: collision with root package name */
    private final /* synthetic */ jo f51960b;

    static {
        Covode.recordClassIndex(32348);
    }

    public final void run() {
        jo.a(this.f51960b);
        this.f51960b.a();
    }

    jr(jo joVar, ju juVar) {
        this.f51960b = joVar;
        this.f51959a = juVar;
    }
}
