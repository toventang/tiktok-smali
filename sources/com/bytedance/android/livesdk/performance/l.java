package com.bytedance.android.livesdk.performance;

import com.bytedance.covode.number.Covode;

/* access modifiers changed from: package-private */
public final /* synthetic */ class l implements Runnable {

    /* renamed from: a  reason: collision with root package name */
    private final LivePerformanceManager f20271a;

    static {
        Covode.recordClassIndex(11966);
    }

    l(LivePerformanceManager livePerformanceManager) {
        this.f20271a = livePerformanceManager;
    }

    public final void run() {
        this.f20271a.lambda$check$3$LivePerformanceManager();
    }
}
