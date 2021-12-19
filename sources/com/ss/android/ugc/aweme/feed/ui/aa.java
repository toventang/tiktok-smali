package com.ss.android.ugc.aweme.feed.ui;

import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.aweme.common.r;
import com.ss.android.ugc.aweme.metrics.am;

/* access modifiers changed from: package-private */
public final /* synthetic */ class aa implements Runnable {

    /* renamed from: a  reason: collision with root package name */
    private final z f94214a;

    /* renamed from: b  reason: collision with root package name */
    private final long f94215b;

    static {
        Covode.recordClassIndex(59858);
    }

    aa(z zVar, long j2) {
        this.f94214a = zVar;
        this.f94215b = j2;
    }

    public final void run() {
        z zVar = this.f94214a;
        long j2 = this.f94215b;
        zVar.getContext();
        r.a("stay_time", zVar.t, j2);
        am amVar = new am();
        amVar.f109498a = String.valueOf(j2);
        amVar.a(zVar.t).f();
    }
}
