package com.google.android.gms.common.api.internal;

import com.bytedance.covode.number.Covode;
import java.lang.ref.WeakReference;

/* access modifiers changed from: package-private */
public final class au extends bh {

    /* renamed from: a  reason: collision with root package name */
    private WeakReference<aq> f50066a;

    static {
        Covode.recordClassIndex(31237);
    }

    @Override // com.google.android.gms.common.api.internal.bh
    public final void a() {
        aq aqVar = this.f50066a.get();
        if (aqVar != null) {
            aq.a(aqVar);
        }
    }

    au(aq aqVar) {
        this.f50066a = new WeakReference<>(aqVar);
    }
}
