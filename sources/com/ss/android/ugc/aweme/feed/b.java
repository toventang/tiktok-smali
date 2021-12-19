package com.ss.android.ugc.aweme.feed;

import com.bytedance.android.livesdk.performance.LivePerformanceManager;
import com.bytedance.covode.number.Covode;

/* access modifiers changed from: package-private */
public final /* synthetic */ class b implements Runnable {

    /* renamed from: a  reason: collision with root package name */
    static final Runnable f92648a = new b();

    static {
        Covode.recordClassIndex(58753);
    }

    private b() {
    }

    public final void run() {
        LivePerformanceManager.getInstance().initStartValue();
    }
}
