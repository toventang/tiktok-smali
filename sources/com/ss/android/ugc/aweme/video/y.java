package com.ss.android.ugc.aweme.video;

import com.bytedance.covode.number.Covode;
import java.util.concurrent.Callable;

/* access modifiers changed from: package-private */
public final /* synthetic */ class y implements Callable {

    /* renamed from: a  reason: collision with root package name */
    private final VideoBitRateABManager f144012a;

    static {
        Covode.recordClassIndex(94228);
    }

    y(VideoBitRateABManager videoBitRateABManager) {
        this.f144012a = videoBitRateABManager;
    }

    @Override // java.util.concurrent.Callable
    public final Object call() {
        return this.f144012a.f();
    }
}
