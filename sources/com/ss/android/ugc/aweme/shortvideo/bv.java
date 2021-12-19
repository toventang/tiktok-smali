package com.ss.android.ugc.aweme.shortvideo;

import com.bytedance.covode.number.Covode;

final /* synthetic */ class bv implements Runnable {

    /* renamed from: a  reason: collision with root package name */
    private final bo f125060a;

    static {
        Covode.recordClassIndex(82157);
    }

    bv(bo boVar) {
        this.f125060a = boVar;
    }

    public final void run() {
        this.f125060a.f125046a.onParallelPublishCancel();
    }
}
