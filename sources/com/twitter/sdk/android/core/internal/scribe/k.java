package com.twitter.sdk.android.core.internal.scribe;

import com.bytedance.covode.number.Covode;

final /* synthetic */ class k implements Runnable {

    /* renamed from: a  reason: collision with root package name */
    private final i f156089a;

    static {
        Covode.recordClassIndex(103686);
    }

    k(i iVar) {
        this.f156089a = iVar;
    }

    public final void run() {
        this.f156089a.b();
    }
}
