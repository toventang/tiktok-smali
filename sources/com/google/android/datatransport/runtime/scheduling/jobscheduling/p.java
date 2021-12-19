package com.google.android.datatransport.runtime.scheduling.jobscheduling;

import com.bytedance.covode.number.Covode;

public final /* synthetic */ class p implements Runnable {

    /* renamed from: a  reason: collision with root package name */
    private final o f49607a;

    static {
        Covode.recordClassIndex(31024);
    }

    public p(o oVar) {
        this.f49607a = oVar;
    }

    public final void run() {
        o oVar = this.f49607a;
        oVar.f49606d.a(new q(oVar));
    }
}
