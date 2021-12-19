package com.airbnb.lottie.j;

import com.airbnb.lottie.a.b.a;
import com.bytedance.covode.number.Covode;

public final class c<T> {

    /* renamed from: a  reason: collision with root package name */
    public a<?, ?> f5730a;

    /* renamed from: b  reason: collision with root package name */
    protected T f5731b = null;

    /* renamed from: c  reason: collision with root package name */
    private final b<T> f5732c = new b<>();

    static {
        Covode.recordClassIndex(2399);
    }

    public c() {
    }

    public c(T t) {
        this.f5731b = t;
    }

    public final T a(float f2, float f3, T t, T t2, float f4, float f5, float f6) {
        b<T> bVar = this.f5732c;
        bVar.f5723a = f2;
        bVar.f5724b = f3;
        bVar.f5725c = t;
        bVar.f5726d = t2;
        bVar.f5727e = f4;
        bVar.f5728f = f5;
        bVar.f5729g = f6;
        return this.f5731b;
    }
}
