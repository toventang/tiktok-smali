package com.ss.android.ugc.aweme.shortvideo;

import com.bytedance.covode.number.Covode;

final /* synthetic */ class br implements Runnable {

    /* renamed from: a  reason: collision with root package name */
    private final bo f125054a;

    /* renamed from: b  reason: collision with root package name */
    private final et f125055b;

    static {
        Covode.recordClassIndex(82153);
    }

    br(bo boVar, et etVar) {
        this.f125054a = boVar;
        this.f125055b = etVar;
    }

    public final void run() {
        bo boVar = this.f125054a;
        boVar.f125046a.onError(this.f125055b);
    }
}
