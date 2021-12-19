package com.bytedance.android.livesdk.performance;

import com.bytedance.covode.number.Covode;
import org.json.JSONObject;

/* access modifiers changed from: package-private */
public final /* synthetic */ class n implements Runnable {

    /* renamed from: a  reason: collision with root package name */
    private final LivePerformanceManager f20279a;

    /* renamed from: b  reason: collision with root package name */
    private final double f20280b;

    /* renamed from: c  reason: collision with root package name */
    private final JSONObject f20281c;

    static {
        Covode.recordClassIndex(11968);
    }

    n(LivePerformanceManager livePerformanceManager, double d2, JSONObject jSONObject) {
        this.f20279a = livePerformanceManager;
        this.f20280b = d2;
        this.f20281c = jSONObject;
    }

    public final void run() {
        this.f20279a.lambda$reportFps$5$LivePerformanceManager(this.f20280b, this.f20281c);
    }
}
