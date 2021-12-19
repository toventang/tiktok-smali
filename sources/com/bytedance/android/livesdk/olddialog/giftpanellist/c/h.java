package com.bytedance.android.livesdk.olddialog.giftpanellist.c;

import com.bytedance.android.livesdk.service.animation.a.a;
import com.bytedance.covode.number.Covode;

final /* synthetic */ class h implements Runnable {

    /* renamed from: a  reason: collision with root package name */
    private final g f20079a;

    static {
        Covode.recordClassIndex(11854);
    }

    h(g gVar) {
        this.f20079a = gVar;
    }

    public final void run() {
        a.c(this.f20079a.f20073a).start();
    }
}
