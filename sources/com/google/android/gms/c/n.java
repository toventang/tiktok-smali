package com.google.android.gms.c;

import com.bytedance.covode.number.Covode;
import java.util.concurrent.Executor;

final class n<TResult, TContinuationResult> implements b, d, e<TContinuationResult>, z<TResult> {

    /* renamed from: a  reason: collision with root package name */
    final a<TResult, h<TContinuationResult>> f49912a;

    /* renamed from: b  reason: collision with root package name */
    final ac<TContinuationResult> f49913b;

    /* renamed from: c  reason: collision with root package name */
    private final Executor f49914c;

    static {
        Covode.recordClassIndex(31163);
    }

    public n(Executor executor, a<TResult, h<TContinuationResult>> aVar, ac<TContinuationResult> acVar) {
        this.f49914c = executor;
        this.f49912a = aVar;
        this.f49913b = acVar;
    }

    @Override // com.google.android.gms.c.z
    public final void a(h<TResult> hVar) {
        this.f49914c.execute(new o(this, hVar));
    }

    @Override // com.google.android.gms.c.e
    public final void a(TContinuationResult tcontinuationresult) {
        this.f49913b.a(tcontinuationresult);
    }

    @Override // com.google.android.gms.c.d
    public final void a(Exception exc) {
        this.f49913b.a(exc);
    }

    @Override // com.google.android.gms.c.b
    public final void a() {
        this.f49913b.f();
    }

    @Override // com.google.android.gms.c.z
    public final void N_() {
        throw new UnsupportedOperationException();
    }
}
