package com.google.android.gms.common.api.internal;

import android.content.Context;
import android.os.Looper;
import com.bytedance.covode.number.Covode;
import com.google.android.gms.common.api.a;
import com.google.android.gms.common.api.a.d;
import com.google.android.gms.common.api.h;
import com.google.android.gms.common.api.internal.d;
import com.google.android.gms.common.api.p;

public final class bf<O extends a.d> extends aa {

    /* renamed from: b  reason: collision with root package name */
    private final h<O> f50094b;

    static {
        Covode.recordClassIndex(31249);
    }

    @Override // com.google.android.gms.common.api.i
    public final void a(bv bvVar) {
    }

    @Override // com.google.android.gms.common.api.i
    public final void b(bv bvVar) {
    }

    @Override // com.google.android.gms.common.api.i
    public final Context b() {
        return this.f50094b.f49976a;
    }

    @Override // com.google.android.gms.common.api.i
    public final Looper c() {
        return this.f50094b.f49980e;
    }

    public bf(h<O> hVar) {
        super("Method is not supported by connectionless client. APIs supporting connectionless client must not call this method.");
        this.f50094b = hVar;
    }

    @Override // com.google.android.gms.common.api.i
    public final <A extends a.b, R extends p, T extends d.a<R, A>> T a(T t) {
        return (T) this.f50094b.a(t);
    }

    @Override // com.google.android.gms.common.api.i
    public final <A extends a.b, T extends d.a<? extends p, A>> T b(T t) {
        return (T) this.f50094b.b(t);
    }
}
