package com.ss.android.ugc.aweme.ay;

import com.bytedance.covode.number.Covode;

final /* synthetic */ class t implements Runnable {

    /* renamed from: a  reason: collision with root package name */
    private final s f67848a;

    static {
        Covode.recordClassIndex(41757);
    }

    t(s sVar) {
        this.f67848a = sVar;
    }

    public final void run() {
        this.f67848a.f67840e.cancel();
    }
}
