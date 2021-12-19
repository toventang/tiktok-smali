package com.ss.android.ugc.aweme.common.widget;

import com.bytedance.covode.number.Covode;

/* access modifiers changed from: package-private */
public final /* synthetic */ class o implements Runnable {

    /* renamed from: a  reason: collision with root package name */
    private final VerticalViewPager f76569a;

    /* renamed from: b  reason: collision with root package name */
    private final int f76570b;

    /* renamed from: c  reason: collision with root package name */
    private final boolean f76571c;

    static {
        Covode.recordClassIndex(47281);
    }

    o(VerticalViewPager verticalViewPager, int i2, boolean z) {
        this.f76569a = verticalViewPager;
        this.f76570b = i2;
        this.f76571c = z;
    }

    public final void run() {
        this.f76569a.b(this.f76570b, this.f76571c);
    }
}
