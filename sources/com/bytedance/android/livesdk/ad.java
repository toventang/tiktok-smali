package com.bytedance.android.livesdk;

import com.bytedance.android.livesdk.performance.LivePerformanceManager;
import com.bytedance.covode.number.Covode;

public final /* synthetic */ class ad implements Runnable {

    /* renamed from: a  reason: collision with root package name */
    public static final Runnable f13646a = new ad();

    static {
        Covode.recordClassIndex(7568);
    }

    private ad() {
    }

    public final void run() {
        LivePerformanceManager.getInstance().startTimerMonitor();
        LivePerformanceManager.getInstance().onEnterRoom();
    }
}
