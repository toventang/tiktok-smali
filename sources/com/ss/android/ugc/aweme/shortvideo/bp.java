package com.ss.android.ugc.aweme.shortvideo;

import com.bytedance.covode.number.Covode;

final /* synthetic */ class bp implements Runnable {

    /* renamed from: a  reason: collision with root package name */
    private final bo f125048a;

    /* renamed from: b  reason: collision with root package name */
    private final int f125049b;

    /* renamed from: c  reason: collision with root package name */
    private final boolean f125050c;

    static {
        Covode.recordClassIndex(82151);
    }

    bp(bo boVar, int i2, boolean z) {
        this.f125048a = boVar;
        this.f125049b = i2;
        this.f125050c = z;
    }

    public final void run() {
        bo boVar = this.f125048a;
        boVar.f125046a.onProgressUpdate(this.f125049b, this.f125050c);
    }
}
