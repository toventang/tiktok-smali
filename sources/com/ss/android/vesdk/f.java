package com.ss.android.vesdk;

import com.bytedance.covode.number.Covode;

final /* synthetic */ class f implements Runnable {

    /* renamed from: a  reason: collision with root package name */
    private final d f151268a;

    /* renamed from: b  reason: collision with root package name */
    private final int f151269b;

    /* renamed from: c  reason: collision with root package name */
    private final int f151270c;

    static {
        Covode.recordClassIndex(99432);
    }

    f(d dVar, int i2, int i3) {
        this.f151268a = dVar;
        this.f151269b = i2;
        this.f151270c = i3;
    }

    public final void run() {
        d dVar = this.f151268a;
        int i2 = this.f151269b;
        int i3 = this.f151270c;
        if (dVar.u != 2) {
            an.d(d.f151130a, "pausePlayTrack in state:" + dVar.u);
            return;
        }
        an.a(d.f151130a, "pausePlayTrack trackIndex " + i2 + " trackType " + i3);
        dVar.f151132c.m();
        dVar.C = true;
        dVar.a(aj.I, i2, (float) i3, "");
    }
}
