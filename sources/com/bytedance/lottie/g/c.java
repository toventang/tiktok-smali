package com.bytedance.lottie.g;

import com.bytedance.covode.number.Covode;
import com.bytedance.lottie.a.b.a;

public final class c<T> {

    /* renamed from: a  reason: collision with root package name */
    public a<?, ?> f40735a;

    /* renamed from: b  reason: collision with root package name */
    protected T f40736b = null;

    /* renamed from: c  reason: collision with root package name */
    private final b<T> f40737c = new b<>();

    static {
        Covode.recordClassIndex(24988);
    }

    public c() {
    }

    public c(T t) {
        this.f40736b = t;
    }

    public final T a(float f2, float f3, T t, T t2, float f4, float f5, float f6) {
        b<T> bVar = this.f40737c;
        bVar.f40728a = f2;
        bVar.f40729b = f3;
        bVar.f40730c = t;
        bVar.f40731d = t2;
        bVar.f40732e = f4;
        bVar.f40733f = f5;
        bVar.f40734g = f6;
        return this.f40736b;
    }
}
