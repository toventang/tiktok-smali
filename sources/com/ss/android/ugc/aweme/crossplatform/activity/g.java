package com.ss.android.ugc.aweme.crossplatform.activity;

import com.bytedance.covode.number.Covode;

final /* synthetic */ class g implements Runnable {

    /* renamed from: a  reason: collision with root package name */
    private final CrossPlatformActivity f78543a;

    static {
        Covode.recordClassIndex(48777);
    }

    g(CrossPlatformActivity crossPlatformActivity) {
        this.f78543a = crossPlatformActivity;
    }

    public final void run() {
        this.f78543a.finish();
    }
}
