package com.bytedance.android.livesdk.util.rxutils.autodispose;

import com.bytedance.covode.number.Covode;
import f.a.ab;
import f.a.ae;
import f.a.ag;
import f.a.f;

final class r<T> extends ab<T> {

    /* renamed from: a  reason: collision with root package name */
    private final ag<T> f22170a;

    /* renamed from: b  reason: collision with root package name */
    private final f f22171b;

    static {
        Covode.recordClassIndex(13079);
    }

    @Override // f.a.ab
    public final void a(ae<? super T> aeVar) {
        this.f22170a.a_(new u(this.f22171b, aeVar));
    }

    r(ag<T> agVar, f fVar) {
        this.f22170a = agVar;
        this.f22171b = fVar;
    }
}
