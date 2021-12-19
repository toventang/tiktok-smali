package com.bytedance.android.livesdk.r;

import com.bytedance.covode.number.Covode;

final /* synthetic */ class f implements Runnable {

    /* renamed from: a  reason: collision with root package name */
    private final a f20563a;

    static {
        Covode.recordClassIndex(12142);
    }

    f(a aVar) {
        this.f20563a = aVar;
    }

    public final void run() {
        a aVar = this.f20563a;
        aVar.f20550b.setVisibility(8);
        if (aVar.f20551c && aVar.f20552d != null) {
            aVar.f20552d.setVisibility(0);
        }
    }
}
