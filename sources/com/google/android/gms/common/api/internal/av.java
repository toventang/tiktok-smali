package com.google.android.gms.common.api.internal;

import com.bytedance.covode.number.Covode;

abstract class av {

    /* renamed from: a  reason: collision with root package name */
    private final at f50067a;

    static {
        Covode.recordClassIndex(31238);
    }

    /* access modifiers changed from: protected */
    public abstract void a();

    protected av(at atVar) {
        this.f50067a = atVar;
    }

    public final void a(aw awVar) {
        awVar.f50068a.lock();
        try {
            if (awVar.f50078k == this.f50067a) {
                a();
                awVar.f50068a.unlock();
            }
        } finally {
            awVar.f50068a.unlock();
        }
    }
}
