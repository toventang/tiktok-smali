package com.ss.android.ugc.aweme.splash;

import com.bytedance.covode.number.Covode;

final /* synthetic */ class d implements Runnable {

    /* renamed from: a  reason: collision with root package name */
    private final TransitActivity f134679a;

    static {
        Covode.recordClassIndex(88009);
    }

    d(TransitActivity transitActivity) {
        this.f134679a = transitActivity;
    }

    public final void run() {
        this.f134679a.finish();
    }
}
