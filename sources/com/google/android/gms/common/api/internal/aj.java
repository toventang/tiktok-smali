package com.google.android.gms.common.api.internal;

import com.bytedance.covode.number.Covode;
import com.google.android.gms.signin.internal.d;
import com.google.android.gms.signin.internal.zak;
import java.lang.ref.WeakReference;

final class aj extends d {

    /* renamed from: a  reason: collision with root package name */
    private final WeakReference<ae> f50044a;

    static {
        Covode.recordClassIndex(31226);
    }

    aj(ae aeVar) {
        this.f50044a = new WeakReference<>(aeVar);
    }

    @Override // com.google.android.gms.signin.internal.d, com.google.android.gms.signin.internal.c
    public final void a(zak zak) {
        ae aeVar = this.f50044a.get();
        if (aeVar != null) {
            aeVar.f50023a.a(new am(aeVar, aeVar, zak));
        }
    }
}
