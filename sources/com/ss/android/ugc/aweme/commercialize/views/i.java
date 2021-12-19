package com.ss.android.ugc.aweme.commercialize.views;

import com.bytedance.covode.number.Covode;

/* access modifiers changed from: package-private */
public final /* synthetic */ class i implements Runnable {

    /* renamed from: a  reason: collision with root package name */
    private final d f76184a;

    /* renamed from: b  reason: collision with root package name */
    private final int f76185b;

    /* renamed from: c  reason: collision with root package name */
    private final int f76186c;

    static {
        Covode.recordClassIndex(46980);
    }

    i(d dVar, int i2, int i3) {
        this.f76184a = dVar;
        this.f76185b = i2;
        this.f76186c = i3;
    }

    public final void run() {
        this.f76184a.d(this.f76185b, this.f76186c);
    }
}
