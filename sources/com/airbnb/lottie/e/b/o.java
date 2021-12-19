package com.airbnb.lottie.e.b;

import com.airbnb.lottie.a.a.c;
import com.airbnb.lottie.a.a.q;
import com.airbnb.lottie.e.a.h;
import com.airbnb.lottie.e.c.a;
import com.airbnb.lottie.g;
import com.bytedance.covode.number.Covode;

public final class o implements b {

    /* renamed from: a  reason: collision with root package name */
    public final String f5437a;

    /* renamed from: b  reason: collision with root package name */
    public final h f5438b;

    /* renamed from: c  reason: collision with root package name */
    private final int f5439c;

    static {
        Covode.recordClassIndex(2275);
    }

    public final String toString() {
        return "ShapePath{name=" + this.f5437a + ", index=" + this.f5439c + '}';
    }

    @Override // com.airbnb.lottie.e.b.b
    public final c a(g gVar, a aVar) {
        return new q(gVar, aVar, this);
    }

    public o(String str, int i2, h hVar) {
        this.f5437a = str;
        this.f5439c = i2;
        this.f5438b = hVar;
    }
}
