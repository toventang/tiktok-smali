package com.bytedance.lottie.c.b;

import com.bytedance.covode.number.Covode;
import com.bytedance.lottie.a.a.b;
import com.bytedance.lottie.a.a.c;
import com.bytedance.lottie.c.c.a;
import com.bytedance.lottie.i;
import java.util.Arrays;
import java.util.List;

public final class n implements b {

    /* renamed from: a  reason: collision with root package name */
    public final String f40559a;

    /* renamed from: b  reason: collision with root package name */
    public final List<b> f40560b;

    static {
        Covode.recordClassIndex(24905);
    }

    public final String toString() {
        return "ShapeGroup{name='" + this.f40559a + "' Shapes: " + Arrays.toString(this.f40560b.toArray()) + '}';
    }

    public n(String str, List<b> list) {
        this.f40559a = str;
        this.f40560b = list;
    }

    @Override // com.bytedance.lottie.c.b.b
    public final b a(i iVar, a aVar) {
        return new c(iVar, aVar, this);
    }
}
