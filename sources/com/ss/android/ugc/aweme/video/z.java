package com.ss.android.ugc.aweme.video;

import com.bytedance.covode.number.Covode;
import java.util.concurrent.Callable;

/* access modifiers changed from: package-private */
public final /* synthetic */ class z implements Callable {

    /* renamed from: a  reason: collision with root package name */
    private final VideoBitRateABManager f144013a;

    static {
        Covode.recordClassIndex(94229);
    }

    z(VideoBitRateABManager videoBitRateABManager) {
        this.f144013a = videoBitRateABManager;
    }

    @Override // java.util.concurrent.Callable
    public final Object call() {
        return this.f144013a.e();
    }
}
