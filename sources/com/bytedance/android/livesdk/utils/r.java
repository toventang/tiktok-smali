package com.bytedance.android.livesdk.utils;

import android.content.Context;
import com.bytedance.covode.number.Covode;
import com.bytedance.r.a.a.b;

/* access modifiers changed from: package-private */
public final /* synthetic */ class r implements Runnable {

    /* renamed from: a  reason: collision with root package name */
    private final b f22353a;

    /* renamed from: b  reason: collision with root package name */
    private final boolean f22354b;

    /* renamed from: c  reason: collision with root package name */
    private final Context f22355c;

    /* renamed from: d  reason: collision with root package name */
    private final b f22356d;

    static {
        Covode.recordClassIndex(13198);
    }

    r(b bVar, boolean z, Context context, b bVar2) {
        this.f22353a = bVar;
        this.f22354b = z;
        this.f22355c = context;
        this.f22356d = bVar2;
    }

    public final void run() {
        LiveAppBundleUtils.lambda$tryLoadAppBundlePlugin$7$LiveAppBundleUtils(this.f22353a, this.f22354b, this.f22355c, this.f22356d);
    }
}
