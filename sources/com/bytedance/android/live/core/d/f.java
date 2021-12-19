package com.bytedance.android.live.core.d;

import com.bytedance.covode.number.Covode;

/* access modifiers changed from: package-private */
public final /* synthetic */ class f implements Runnable {

    /* renamed from: a  reason: collision with root package name */
    private final Throwable f8971a;

    /* renamed from: b  reason: collision with root package name */
    private final String f8972b;

    static {
        Covode.recordClassIndex(4577);
    }

    f(Throwable th, String str) {
        this.f8971a = th;
        this.f8972b = str;
    }

    public final void run() {
        c.a().a(this.f8971a, this.f8972b);
    }
}
