package com.ss.ttvideoengine;

import com.bytedance.covode.number.Covode;

/* access modifiers changed from: package-private */
public final /* synthetic */ class ao implements Runnable {

    /* renamed from: a  reason: collision with root package name */
    private final aj f152258a;

    static {
        Covode.recordClassIndex(101487);
    }

    ao(aj ajVar) {
        this.f152258a = ajVar;
    }

    public final void run() {
        aj ajVar = this.f152258a;
        if (ajVar.ah != null) {
            long a2 = ajVar.ah.a(63, 0L);
            if ((ajVar.f152209f == 1 || (ajVar.f152209f == 0 && a2 < 0)) && ajVar.f152208e > 0) {
                ajVar.f152210g.postDelayed(ajVar.f152211h, (long) ajVar.f152208e);
            }
        }
    }
}
