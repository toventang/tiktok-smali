package com.airbnb.lottie.e.b;

import android.graphics.PointF;
import com.airbnb.lottie.a.a.c;
import com.airbnb.lottie.a.a.o;
import com.airbnb.lottie.e.a.b;
import com.airbnb.lottie.e.a.f;
import com.airbnb.lottie.e.a.m;
import com.airbnb.lottie.e.c.a;
import com.airbnb.lottie.g;
import com.bytedance.covode.number.Covode;

public final class j implements b {

    /* renamed from: a  reason: collision with root package name */
    public final String f5419a;

    /* renamed from: b  reason: collision with root package name */
    public final m<PointF, PointF> f5420b;

    /* renamed from: c  reason: collision with root package name */
    public final f f5421c;

    /* renamed from: d  reason: collision with root package name */
    public final b f5422d;

    static {
        Covode.recordClassIndex(2270);
    }

    public final String toString() {
        return "RectangleShape{position=" + this.f5420b + ", size=" + this.f5421c + '}';
    }

    @Override // com.airbnb.lottie.e.b.b
    public final c a(g gVar, a aVar) {
        return new o(gVar, aVar, this);
    }

    public j(String str, m<PointF, PointF> mVar, f fVar, b bVar) {
        this.f5419a = str;
        this.f5420b = mVar;
        this.f5421c = fVar;
        this.f5422d = bVar;
    }
}
