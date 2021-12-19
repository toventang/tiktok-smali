package com.bytedance.lottie.c.b;

import com.bytedance.covode.number.Covode;
import com.bytedance.lottie.a.a.b;
import com.bytedance.lottie.a.a.p;
import com.bytedance.lottie.c.a.h;
import com.bytedance.lottie.c.c.a;
import com.bytedance.lottie.i;

public final class o implements b {

    /* renamed from: a  reason: collision with root package name */
    public final String f40561a;

    /* renamed from: b  reason: collision with root package name */
    public final h f40562b;

    /* renamed from: c  reason: collision with root package name */
    private final int f40563c;

    static {
        Covode.recordClassIndex(24906);
    }

    public final String toString() {
        return "ShapePath{name=" + this.f40561a + ", index=" + this.f40563c + '}';
    }

    @Override // com.bytedance.lottie.c.b.b
    public final b a(i iVar, a aVar) {
        return new p(iVar, aVar, this);
    }

    public o(String str, int i2, h hVar) {
        this.f40561a = str;
        this.f40563c = i2;
        this.f40562b = hVar;
    }
}
