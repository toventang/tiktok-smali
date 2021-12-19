package com.google.android.gms.common.api.internal;

import com.bytedance.covode.number.Covode;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.api.a;
import com.google.android.gms.common.api.internal.d;
import com.google.android.gms.common.api.internal.d.a;
import com.google.android.gms.common.api.internal.f;
import com.google.android.gms.common.api.p;

public final class cb<A extends d.a<? extends p, a.b>> extends bn {

    /* renamed from: a  reason: collision with root package name */
    private final A f50141a;

    static {
        Covode.recordClassIndex(31273);
    }

    @Override // com.google.android.gms.common.api.internal.bn
    public final void a(Status status) {
        this.f50141a.b(status);
    }

    @Override // com.google.android.gms.common.api.internal.bn
    public final void c(f.a<?> aVar) {
        try {
            this.f50141a.b(aVar.f50235a);
        } catch (RuntimeException e2) {
            a(e2);
        }
    }

    @Override // com.google.android.gms.common.api.internal.bn
    public final void a(RuntimeException runtimeException) {
        String simpleName = runtimeException.getClass().getSimpleName();
        String localizedMessage = runtimeException.getLocalizedMessage();
        this.f50141a.b(new Status(10, new StringBuilder(String.valueOf(simpleName).length() + 2 + String.valueOf(localizedMessage).length()).append(simpleName).append(": ").append(localizedMessage).toString()));
    }

    public cb(int i2, A a2) {
        super(i2);
        this.f50141a = a2;
    }

    @Override // com.google.android.gms.common.api.internal.bn
    public final void a(cv cvVar, boolean z) {
        A a2 = this.f50141a;
        cvVar.f50204a.put(a2, Boolean.valueOf(z));
        a2.a(new w(cvVar, a2));
    }
}
