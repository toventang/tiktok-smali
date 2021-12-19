package com.airbnb.lottie.e.b;

import android.graphics.Path;
import com.airbnb.lottie.a.a.c;
import com.airbnb.lottie.e.a.a;
import com.airbnb.lottie.e.a.d;
import com.airbnb.lottie.g;
import com.bytedance.covode.number.Covode;

public final class m implements b {

    /* renamed from: a  reason: collision with root package name */
    public final Path.FillType f5430a;

    /* renamed from: b  reason: collision with root package name */
    public final String f5431b;

    /* renamed from: c  reason: collision with root package name */
    public final a f5432c;

    /* renamed from: d  reason: collision with root package name */
    public final d f5433d;

    /* renamed from: e  reason: collision with root package name */
    private final boolean f5434e;

    static {
        Covode.recordClassIndex(2273);
    }

    public final String toString() {
        return "ShapeFill{color=, fillEnabled=" + this.f5434e + '}';
    }

    @Override // com.airbnb.lottie.e.b.b
    public final c a(g gVar, com.airbnb.lottie.e.c.a aVar) {
        return new com.airbnb.lottie.a.a.g(gVar, aVar, this);
    }

    public m(String str, boolean z, Path.FillType fillType, a aVar, d dVar) {
        this.f5431b = str;
        this.f5434e = z;
        this.f5430a = fillType;
        this.f5432c = aVar;
        this.f5433d = dVar;
    }
}
