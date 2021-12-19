package com.bytedance.android.livesdk.olddialog.giftpanellist.c;

import com.bytedance.android.livesdk.service.animation.a.a;
import com.bytedance.covode.number.Covode;

/* access modifiers changed from: package-private */
public final /* synthetic */ class i implements Runnable {

    /* renamed from: a  reason: collision with root package name */
    private final g f20080a;

    static {
        Covode.recordClassIndex(11855);
    }

    i(g gVar) {
        this.f20080a = gVar;
    }

    public final void run() {
        a.c(this.f20080a.f20073a).start();
    }
}
