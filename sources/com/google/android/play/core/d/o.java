package com.google.android.play.core.d;

import com.bytedance.covode.number.Covode;

/* access modifiers changed from: package-private */
public final class o implements Runnable {

    /* renamed from: a  reason: collision with root package name */
    final /* synthetic */ a f53214a;

    static {
        Covode.recordClassIndex(32889);
    }

    o(a aVar) {
        this.f53214a = aVar;
    }

    public final void run() {
        try {
            this.f53214a.f53190b.a();
        } catch (Exception unused) {
        }
    }
}
