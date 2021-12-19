package com.google.android.gms.common.api.internal;

import com.bytedance.covode.number.Covode;
import com.google.android.gms.c.c;
import com.google.android.gms.c.h;
import com.google.android.gms.c.i;

final class v implements c<TResult> {

    /* renamed from: a  reason: collision with root package name */
    private final /* synthetic */ i f50277a;

    /* renamed from: b  reason: collision with root package name */
    private final /* synthetic */ cv f50278b;

    static {
        Covode.recordClassIndex(31325);
    }

    @Override // com.google.android.gms.c.c
    public final void a(h<TResult> hVar) {
        this.f50278b.f50205b.remove(this.f50277a);
    }

    v(cv cvVar, i iVar) {
        this.f50278b = cvVar;
        this.f50277a = iVar;
    }
}
