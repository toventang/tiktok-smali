package com.ss.android.ugc.aweme.effect;

import com.bytedance.covode.number.Covode;

final /* synthetic */ class ay implements Runnable {

    /* renamed from: a  reason: collision with root package name */
    private final ac f88826a;

    /* renamed from: b  reason: collision with root package name */
    private final int f88827b;

    /* renamed from: c  reason: collision with root package name */
    private final int f88828c;

    static {
        Covode.recordClassIndex(55878);
    }

    ay(ac acVar, int i2, int i3) {
        this.f88826a = acVar;
        this.f88827b = i2;
        this.f88828c = i3;
    }

    public final void run() {
        ac acVar = this.f88826a;
        acVar.x.a(this.f88827b, this.f88828c, false);
    }
}
