package com.bytedance.android.livesdk.utils;

import com.bytedance.covode.number.Covode;
import com.bytedance.r.a.a.b;

/* access modifiers changed from: package-private */
public final /* synthetic */ class u implements Runnable {

    /* renamed from: a  reason: collision with root package name */
    private final boolean f22360a;

    /* renamed from: b  reason: collision with root package name */
    private final String f22361b;

    /* renamed from: c  reason: collision with root package name */
    private final long f22362c;

    /* renamed from: d  reason: collision with root package name */
    private final Throwable f22363d;

    /* renamed from: e  reason: collision with root package name */
    private final b f22364e;

    static {
        Covode.recordClassIndex(13201);
    }

    u(boolean z, String str, long j2, Throwable th, b bVar) {
        this.f22360a = z;
        this.f22361b = str;
        this.f22362c = j2;
        this.f22363d = th;
        this.f22364e = bVar;
    }

    public final void run() {
        LiveAppBundleUtils.lambda$null$5$LiveAppBundleUtils(this.f22360a, this.f22361b, this.f22362c, this.f22363d, this.f22364e);
    }
}
