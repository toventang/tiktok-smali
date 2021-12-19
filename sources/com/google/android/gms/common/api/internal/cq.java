package com.google.android.gms.common.api.internal;

import com.bytedance.covode.number.Covode;

final class cq implements Runnable {

    /* renamed from: a  reason: collision with root package name */
    private final /* synthetic */ cn f50184a;

    static {
        Covode.recordClassIndex(31289);
    }

    public final void run() {
        this.f50184a.f50176g.lock();
        try {
            cn.a(this.f50184a);
        } finally {
            this.f50184a.f50176g.unlock();
        }
    }

    cq(cn cnVar) {
        this.f50184a = cnVar;
    }
}
