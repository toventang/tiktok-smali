package com.bytedance.android.livesdk.browser.jsbridge.newmethods;

import com.bytedance.covode.number.Covode;
import f.a.d.f;

/* access modifiers changed from: package-private */
public final /* synthetic */ class bv implements f {

    /* renamed from: a  reason: collision with root package name */
    private final bs f14654a;

    static {
        Covode.recordClassIndex(8135);
    }

    bv(bs bsVar) {
        this.f14654a = bsVar;
    }

    @Override // f.a.d.f
    public final void accept(Object obj) {
        this.f14654a.finishWithFailure((Throwable) obj);
    }
}
