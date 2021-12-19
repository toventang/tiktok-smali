package com.bytedance.android.livesdk.utils;

import com.bytedance.covode.number.Covode;

/* access modifiers changed from: package-private */
public final /* synthetic */ class s implements Runnable {

    /* renamed from: a  reason: collision with root package name */
    private final String f22357a;

    static {
        Covode.recordClassIndex(13199);
    }

    s(String str) {
        this.f22357a = str;
    }

    public final void run() {
        LiveAppBundleUtils.monitorStartLoad(this.f22357a);
    }
}
