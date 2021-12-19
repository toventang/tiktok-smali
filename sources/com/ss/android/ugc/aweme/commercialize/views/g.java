package com.ss.android.ugc.aweme.commercialize.views;

import com.bytedance.covode.number.Covode;

/* access modifiers changed from: package-private */
public final /* synthetic */ class g implements Runnable {

    /* renamed from: a  reason: collision with root package name */
    private final d f76178a;

    /* renamed from: b  reason: collision with root package name */
    private final int f76179b;

    /* renamed from: c  reason: collision with root package name */
    private final int f76180c;

    static {
        Covode.recordClassIndex(46978);
    }

    g(d dVar, int i2, int i3) {
        this.f76178a = dVar;
        this.f76179b = i2;
        this.f76180c = i3;
    }

    public final void run() {
        this.f76178a.b(this.f76179b, this.f76180c);
    }
}
