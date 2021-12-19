package com.bytedance.android.livesdk.browser.jsbridge.newmethods;

import com.bytedance.covode.number.Covode;
import f.a.d.f;

/* access modifiers changed from: package-private */
public final /* synthetic */ class bz implements f {

    /* renamed from: a  reason: collision with root package name */
    private final bs f14658a;

    static {
        Covode.recordClassIndex(8139);
    }

    bz(bs bsVar) {
        this.f14658a = bsVar;
    }

    @Override // f.a.d.f
    public final void accept(Object obj) {
        this.f14658a.finishWithFailure((Throwable) obj);
    }
}
