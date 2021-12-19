package com.ss.android.vesdk;

import com.bytedance.covode.number.Covode;

final /* synthetic */ class e implements Runnable {

    /* renamed from: a  reason: collision with root package name */
    private final d f151263a;

    /* renamed from: b  reason: collision with root package name */
    private final int f151264b;

    /* renamed from: c  reason: collision with root package name */
    private final int f151265c;

    /* renamed from: d  reason: collision with root package name */
    private final boolean f151266d;

    static {
        Covode.recordClassIndex(99430);
    }

    e(d dVar, int i2, int i3, boolean z) {
        this.f151263a = dVar;
        this.f151264b = i2;
        this.f151265c = i3;
        this.f151266d = z;
    }

    public final void run() {
        d dVar = this.f151263a;
        int i2 = this.f151264b;
        int i3 = this.f151265c;
        boolean z = this.f151266d;
        if (dVar.u != 2) {
            an.d(d.f151130a, "startPlayTrack in state:" + dVar.u);
            return;
        }
        an.a(d.f151130a, "startPlayTrack trackIndex " + i2 + " trackType " + i3 + " loop " + z);
        dVar.c(dVar.c(true));
        dVar.f151132c.b(dVar.S, dVar.c(true), dVar);
        dVar.C = false;
        dVar.f151132c.a(z, 0, true);
    }
}
