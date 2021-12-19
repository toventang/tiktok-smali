package com.ss.android.ugc.aweme.music.ui;

import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.aweme.music.ui.w;

final /* synthetic */ class aa implements Runnable {

    /* renamed from: a  reason: collision with root package name */
    private final w.AnonymousClass2 f111831a;

    /* renamed from: b  reason: collision with root package name */
    private final int f111832b;

    /* renamed from: c  reason: collision with root package name */
    private final boolean f111833c;

    static {
        Covode.recordClassIndex(71888);
    }

    aa(w.AnonymousClass2 r1, int i2, boolean z) {
        this.f111831a = r1;
        this.f111832b = i2;
        this.f111833c = z;
    }

    public final void run() {
        w.AnonymousClass2 r0 = this.f111831a;
        w.this.f112069b.a_(this.f111832b, this.f111833c);
    }
}
