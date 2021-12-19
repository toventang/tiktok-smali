package com.ss.android.ugc.aweme.live;

import com.bytedance.android.livesdk.performance.LivePerformanceManager;
import com.bytedance.covode.number.Covode;

/* access modifiers changed from: package-private */
public final /* synthetic */ class ak implements Runnable {

    /* renamed from: a  reason: collision with root package name */
    static final Runnable f108105a = new ak();

    static {
        Covode.recordClassIndex(69317);
    }

    private ak() {
    }

    public final void run() {
        LivePerformanceManager.getInstance().initStartValue();
    }
}
