package com.ss.android.ugc.aweme.commercialize.views;

import com.bytedance.covode.number.Covode;

/* access modifiers changed from: package-private */
public final /* synthetic */ class f implements Runnable {

    /* renamed from: a  reason: collision with root package name */
    private final d f76147a;

    /* renamed from: b  reason: collision with root package name */
    private final int f76148b;

    /* renamed from: c  reason: collision with root package name */
    private final int f76149c;

    static {
        Covode.recordClassIndex(46962);
    }

    f(d dVar, int i2, int i3) {
        this.f76147a = dVar;
        this.f76148b = i2;
        this.f76149c = i3;
    }

    public final void run() {
        this.f76147a.c(this.f76148b, this.f76149c);
    }
}
