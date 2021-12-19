package com.bytedance.tiktok.homepage.mainactivity;

import androidx.fragment.app.e;
import com.bytedance.covode.number.Covode;

/* access modifiers changed from: package-private */
public final /* synthetic */ class k implements Runnable {

    /* renamed from: a  reason: collision with root package name */
    private final PerformanceActivityObserver f44172a;

    /* renamed from: b  reason: collision with root package name */
    private final e f44173b;

    static {
        Covode.recordClassIndex(27067);
    }

    k(PerformanceActivityObserver performanceActivityObserver, e eVar) {
        this.f44172a = performanceActivityObserver;
        this.f44173b = eVar;
    }

    public final void run() {
        PerformanceActivityObserver.a(this.f44173b);
    }
}
