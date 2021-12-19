package com.bytedance.android.livesdk.utils;

import android.os.SystemClock;
import com.bytedance.covode.number.Covode;

/* access modifiers changed from: package-private */
public final /* synthetic */ class t implements Runnable {

    /* renamed from: a  reason: collision with root package name */
    private final String f22358a;

    /* renamed from: b  reason: collision with root package name */
    private final long f22359b;

    static {
        Covode.recordClassIndex(13200);
    }

    t(String str, long j2) {
        this.f22358a = str;
        this.f22359b = j2;
    }

    public final void run() {
        LiveAppBundleUtils.monitorLoadSuccess(this.f22358a, SystemClock.uptimeMillis() - this.f22359b);
    }
}
