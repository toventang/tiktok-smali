package com.google.android.gms.c;

import com.bytedance.covode.number.Covode;
import java.util.concurrent.Executor;

final class l<TResult, TContinuationResult> implements z<TResult> {

    /* renamed from: a  reason: collision with root package name */
    final a<TResult, TContinuationResult> f49907a;

    /* renamed from: b  reason: collision with root package name */
    final ac<TContinuationResult> f49908b;

    /* renamed from: c  reason: collision with root package name */
    private final Executor f49909c;

    static {
        Covode.recordClassIndex(31161);
    }

    public l(Executor executor, a<TResult, TContinuationResult> aVar, ac<TContinuationResult> acVar) {
        this.f49909c = executor;
        this.f49907a = aVar;
        this.f49908b = acVar;
    }

    @Override // com.google.android.gms.c.z
    public final void a(h<TResult> hVar) {
        this.f49909c.execute(new m(this, hVar));
    }

    @Override // com.google.android.gms.c.z
    public final void N_() {
        throw new UnsupportedOperationException();
    }
}
