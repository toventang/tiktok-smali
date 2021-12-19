package com.airbnb.lottie.e.b;

import com.airbnb.lottie.a.a.c;
import com.airbnb.lottie.a.a.d;
import com.airbnb.lottie.e.c.a;
import com.airbnb.lottie.g;
import com.bytedance.covode.number.Covode;
import java.util.Arrays;
import java.util.List;

public final class n implements b {

    /* renamed from: a  reason: collision with root package name */
    public final String f5435a;

    /* renamed from: b  reason: collision with root package name */
    public final List<b> f5436b;

    static {
        Covode.recordClassIndex(2274);
    }

    public final String toString() {
        return "ShapeGroup{name='" + this.f5435a + "' Shapes: " + Arrays.toString(this.f5436b.toArray()) + '}';
    }

    public n(String str, List<b> list) {
        this.f5435a = str;
        this.f5436b = list;
    }

    @Override // com.airbnb.lottie.e.b.b
    public final c a(g gVar, a aVar) {
        return new d(gVar, aVar, this);
    }
}
