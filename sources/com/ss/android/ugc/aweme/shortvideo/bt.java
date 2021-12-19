package com.ss.android.ugc.aweme.shortvideo;

import com.bytedance.covode.number.Covode;

final /* synthetic */ class bt implements Runnable {

    /* renamed from: a  reason: collision with root package name */
    private final bo f125058a;

    static {
        Covode.recordClassIndex(82155);
    }

    bt(bo boVar) {
        this.f125058a = boVar;
    }

    public final void run() {
        this.f125058a.f125046a.onParallelPublishPause();
    }
}
