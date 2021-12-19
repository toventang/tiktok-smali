package com.bytedance.android.livesdk.util.rxutils;

import com.bytedance.covode.number.Covode;
import f.a.ab;
import f.a.ag;
import f.a.ah;
import f.a.b.b;
import f.a.d.f;
import f.a.n;
import f.a.r;
import f.a.s;
import f.a.t;
import f.a.x;
import f.a.y;

public final class a<T> implements ah<T, T>, s<T, T>, y<T, T> {

    /* renamed from: a  reason: collision with root package name */
    f.a.b.a f22119a;

    static {
        Covode.recordClassIndex(13029);
    }

    public a(f.a.b.a aVar) {
        this.f22119a = aVar;
    }

    @Override // f.a.ah
    public final ag<T> a(ab<T> abVar) {
        return abVar.a((f<? super b>) new c(this));
    }

    @Override // f.a.s
    public final r<T> a(n<T> nVar) {
        return nVar.c(new d(this));
    }

    @Override // f.a.y
    public final x<T> a(t<T> tVar) {
        return tVar.c(new b(this));
    }
}
