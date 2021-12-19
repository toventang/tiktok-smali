package com.bytedance.android.livesdk;

import com.bytedance.covode.number.Covode;

/* access modifiers changed from: package-private */
public final /* synthetic */ class ah implements Runnable {

    /* renamed from: a  reason: collision with root package name */
    private final ab f13702a;

    static {
        Covode.recordClassIndex(7607);
    }

    ah(ab abVar) {
        this.f13702a = abVar;
    }

    public final void run() {
        ab abVar = this.f13702a;
        if (abVar.f13401k != null) {
            abVar.f13401k.run();
        }
    }
}
