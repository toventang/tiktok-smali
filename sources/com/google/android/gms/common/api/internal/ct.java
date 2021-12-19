package com.google.android.gms.common.api.internal;

import android.content.Context;
import android.os.Handler;
import android.os.Looper;
import com.bytedance.covode.number.Covode;
import com.google.android.gms.common.api.a;
import com.google.android.gms.common.api.a.d;
import com.google.android.gms.common.api.h;
import com.google.android.gms.common.api.internal.f;

public final class ct<O extends a.d> extends h<O> {

    /* renamed from: i  reason: collision with root package name */
    public final a.f f50199i;

    /* renamed from: j  reason: collision with root package name */
    private final cm f50200j;

    /* renamed from: k  reason: collision with root package name */
    private final com.google.android.gms.common.internal.d f50201k;

    /* renamed from: l  reason: collision with root package name */
    private final a.AbstractC1206a<? extends com.google.android.gms.signin.d, com.google.android.gms.signin.a> f50202l;

    static {
        Covode.recordClassIndex(31292);
    }

    @Override // com.google.android.gms.common.api.h
    public final a.f a(Looper looper, f.a<O> aVar) {
        this.f50200j.f50168b = aVar;
        return this.f50199i;
    }

    @Override // com.google.android.gms.common.api.h
    public final br a(Context context, Handler handler) {
        return new br(context, handler, this.f50201k, this.f50202l);
    }

    public ct(Context context, a<O> aVar, Looper looper, a.f fVar, cm cmVar, com.google.android.gms.common.internal.d dVar, a.AbstractC1206a<? extends com.google.android.gms.signin.d, com.google.android.gms.signin.a> aVar2) {
        super(context, aVar, looper);
        this.f50199i = fVar;
        this.f50200j = cmVar;
        this.f50201k = dVar;
        this.f50202l = aVar2;
        this.f49983h.a(this);
    }
}
