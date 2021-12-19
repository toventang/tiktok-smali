package com.ss.android.ugc.aweme.shortvideo;

import com.bytedance.covode.number.Covode;

final /* synthetic */ class bs implements Runnable {

    /* renamed from: a  reason: collision with root package name */
    private final bo f125056a;

    /* renamed from: b  reason: collision with root package name */
    private final String f125057b;

    static {
        Covode.recordClassIndex(82154);
    }

    bs(bo boVar, String str) {
        this.f125056a = boVar;
        this.f125057b = str;
    }

    public final void run() {
        bo boVar = this.f125056a;
        boVar.f125046a.onSynthetiseSuccess(this.f125057b);
    }
}
