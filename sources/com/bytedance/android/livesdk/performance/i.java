package com.bytedance.android.livesdk.performance;

import com.bytedance.covode.number.Covode;

/* access modifiers changed from: package-private */
public final /* synthetic */ class i implements Runnable {

    /* renamed from: a  reason: collision with root package name */
    private final LivePerformanceManager f20268a;

    static {
        Covode.recordClassIndex(11963);
    }

    i(LivePerformanceManager livePerformanceManager) {
        this.f20268a = livePerformanceManager;
    }

    public final void run() {
        this.f20268a.lambda$startTimerMonitor$0$LivePerformanceManager();
    }
}
