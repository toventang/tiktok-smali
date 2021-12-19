package com.google.android.gms.c;

import com.bytedance.covode.number.Covode;
import java.util.concurrent.Executor;

final class x<TResult, TContinuationResult> implements b, d, e<TContinuationResult>, z<TResult> {

    /* renamed from: a  reason: collision with root package name */
    final g<TResult, TContinuationResult> f49936a;

    /* renamed from: b  reason: collision with root package name */
    private final Executor f49937b;

    /* renamed from: c  reason: collision with root package name */
    private final ac<TContinuationResult> f49938c;

    static {
        Covode.recordClassIndex(31173);
    }

    public x(Executor executor, g<TResult, TContinuationResult> gVar, ac<TContinuationResult> acVar) {
        this.f49937b = executor;
        this.f49936a = gVar;
        this.f49938c = acVar;
    }

    @Override // com.google.android.gms.c.z
    public final void a(h<TResult> hVar) {
        this.f49937b.execute(new y(this, hVar));
    }

    @Override // com.google.android.gms.c.z
    public final void N_() {
        throw new UnsupportedOperationException();
    }

    @Override // com.google.android.gms.c.e
    public final void a(TContinuationResult tcontinuationresult) {
        this.f49938c.a(tcontinuationresult);
    }

    @Override // com.google.android.gms.c.d
    public final void a(Exception exc) {
        this.f49938c.a(exc);
    }

    @Override // com.google.android.gms.c.b
    public final void a() {
        this.f49938c.f();
    }
}
