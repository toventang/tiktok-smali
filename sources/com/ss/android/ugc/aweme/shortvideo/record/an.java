package com.ss.android.ugc.aweme.shortvideo.record;

import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.aweme.shortvideo.record.u;

final /* synthetic */ class an implements Runnable {

    /* renamed from: a  reason: collision with root package name */
    private final u.AnonymousClass2 f130049a;

    /* renamed from: b  reason: collision with root package name */
    private final int f130050b;

    static {
        Covode.recordClassIndex(85336);
    }

    an(u.AnonymousClass2 r1, int i2) {
        this.f130049a = r1;
        this.f130050b = i2;
    }

    public final void run() {
        this.f130049a.a(this.f130050b);
    }
}
