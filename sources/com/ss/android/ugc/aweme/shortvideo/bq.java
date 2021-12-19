package com.ss.android.ugc.aweme.shortvideo;

import com.bytedance.covode.number.Covode;

final /* synthetic */ class bq implements Runnable {

    /* renamed from: a  reason: collision with root package name */
    private final bo f125051a;

    /* renamed from: b  reason: collision with root package name */
    private final ai f125052b;

    /* renamed from: c  reason: collision with root package name */
    private final boolean f125053c;

    static {
        Covode.recordClassIndex(82152);
    }

    bq(bo boVar, ai aiVar, boolean z) {
        this.f125051a = boVar;
        this.f125052b = aiVar;
        this.f125053c = z;
    }

    public final void run() {
        bo boVar = this.f125051a;
        boVar.f125046a.onSuccess(this.f125052b, this.f125053c);
    }
}
