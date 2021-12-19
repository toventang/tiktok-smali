package com.bytedance.android.livesdk.performance;

import com.bytedance.covode.number.Covode;

/* access modifiers changed from: package-private */
public final /* synthetic */ class j implements Runnable {

    /* renamed from: a  reason: collision with root package name */
    private final LivePerformanceManager f20269a;

    static {
        Covode.recordClassIndex(11964);
    }

    j(LivePerformanceManager livePerformanceManager) {
        this.f20269a = livePerformanceManager;
    }

    public final void run() {
        this.f20269a.lambda$initStartValue$1$LivePerformanceManager();
    }
}
