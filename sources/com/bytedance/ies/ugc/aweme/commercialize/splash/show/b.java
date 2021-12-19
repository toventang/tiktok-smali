package com.bytedance.ies.ugc.aweme.commercialize.splash.show;

import com.bytedance.covode.number.Covode;

final /* synthetic */ class b implements Runnable {

    /* renamed from: a  reason: collision with root package name */
    private final NormalSplashAdActivity f34858a;

    static {
        Covode.recordClassIndex(20906);
    }

    b(NormalSplashAdActivity normalSplashAdActivity) {
        this.f34858a = normalSplashAdActivity;
    }

    public final void run() {
        NormalSplashAdActivity normalSplashAdActivity = this.f34858a;
        normalSplashAdActivity.finish();
        normalSplashAdActivity.overridePendingTransition(0, 0);
    }
}
