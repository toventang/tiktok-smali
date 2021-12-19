package com.ss.android.ugc.aweme.compliance.protection.timelock.ui.a;

import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.aweme.compliance.protection.timelock.ui.a.l;
import h.f.a.b;

final /* synthetic */ class t implements b {

    /* renamed from: a  reason: collision with root package name */
    private final androidx.lifecycle.t f78076a;

    /* renamed from: b  reason: collision with root package name */
    private final l.a f78077b;

    static {
        Covode.recordClassIndex(48404);
    }

    t(androidx.lifecycle.t tVar, l.a aVar) {
        this.f78076a = tVar;
        this.f78077b = aVar;
    }

    @Override // h.f.a.b
    public final Object invoke(Object obj) {
        androidx.lifecycle.t tVar = this.f78076a;
        l.a aVar = this.f78077b;
        if (!((Boolean) obj).booleanValue()) {
            return null;
        }
        tVar.setValue(aVar);
        return null;
    }
}
