package com.ss.android.ugc.aweme.shortvideo.record;

import com.bytedance.covode.number.Covode;
import com.bytedance.creativex.recorder.b.a.h;

/* access modifiers changed from: package-private */
public final /* synthetic */ class aa implements Runnable {

    /* renamed from: a  reason: collision with root package name */
    private final u f130029a;

    /* renamed from: b  reason: collision with root package name */
    private final long f130030b;

    static {
        Covode.recordClassIndex(85323);
    }

    aa(u uVar, long j2) {
        this.f130029a = uVar;
        this.f130030b = j2;
    }

    public final void run() {
        u uVar = this.f130029a;
        uVar.f130164i.a(new h(uVar.I, this.f130030b, uVar.J));
    }
}
