package com.bytedance.android.livesdk.browser.jsbridge.newmethods;

import com.bytedance.covode.number.Covode;
import f.a.d.f;

/* access modifiers changed from: package-private */
public final /* synthetic */ class bx implements f {

    /* renamed from: a  reason: collision with root package name */
    private final bs f14656a;

    static {
        Covode.recordClassIndex(8137);
    }

    bx(bs bsVar) {
        this.f14656a = bsVar;
    }

    @Override // f.a.d.f
    public final void accept(Object obj) {
        this.f14656a.finishWithFailure((Throwable) obj);
    }
}
