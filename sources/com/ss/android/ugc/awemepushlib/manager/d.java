package com.ss.android.ugc.awemepushlib.manager;

import androidx.lifecycle.w;
import com.bytedance.covode.number.Covode;

/* access modifiers changed from: package-private */
public final /* synthetic */ class d implements Runnable {

    /* renamed from: a  reason: collision with root package name */
    private final AwemeRedBadgerManager f145514a;

    static {
        Covode.recordClassIndex(95143);
    }

    d(AwemeRedBadgerManager awemeRedBadgerManager) {
        this.f145514a = awemeRedBadgerManager;
    }

    public final void run() {
        w.f3548i.getLifecycle().a(this.f145514a);
    }
}
