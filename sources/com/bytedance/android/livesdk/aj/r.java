package com.bytedance.android.livesdk.aj;

import com.bytedance.covode.number.Covode;

final /* synthetic */ class r implements Runnable {

    /* renamed from: a  reason: collision with root package name */
    private final n f13889a;

    /* renamed from: b  reason: collision with root package name */
    private final float f13890b;

    static {
        Covode.recordClassIndex(7714);
    }

    r(n nVar, float f2) {
        this.f13889a = nVar;
        this.f13890b = f2;
    }

    public final void run() {
        n nVar = this.f13889a;
        float f2 = this.f13890b;
        if (nVar.f13865a && f2 >= 0.0f) {
            nVar.f13866b = f2;
        }
    }
}
