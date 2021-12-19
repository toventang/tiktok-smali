package com.bytedance.android.livesdk.performance;

import com.bytedance.covode.number.Covode;

/* access modifiers changed from: package-private */
public final /* synthetic */ class k implements Runnable {

    /* renamed from: a  reason: collision with root package name */
    private final LivePerformanceManager f20270a;

    static {
        Covode.recordClassIndex(11965);
    }

    k(LivePerformanceManager livePerformanceManager) {
        this.f20270a = livePerformanceManager;
    }

    public final void run() {
        this.f20270a.lambda$stopTimerMonitor$2$LivePerformanceManager();
    }
}
