package com.airbnb.lottie.e.b;

import android.graphics.PointF;
import com.airbnb.lottie.a.a.c;
import com.airbnb.lottie.e.a.f;
import com.airbnb.lottie.e.a.m;
import com.airbnb.lottie.g;
import com.bytedance.covode.number.Covode;

public final class a implements b {

    /* renamed from: a  reason: collision with root package name */
    public final String f5374a;

    /* renamed from: b  reason: collision with root package name */
    public final m<PointF, PointF> f5375b;

    /* renamed from: c  reason: collision with root package name */
    public final f f5376c;

    /* renamed from: d  reason: collision with root package name */
    public final boolean f5377d;

    static {
        Covode.recordClassIndex(2258);
    }

    @Override // com.airbnb.lottie.e.b.b
    public final c a(g gVar, com.airbnb.lottie.e.c.a aVar) {
        return new com.airbnb.lottie.a.a.f(gVar, aVar, this);
    }

    public a(String str, m<PointF, PointF> mVar, f fVar, boolean z) {
        this.f5374a = str;
        this.f5375b = mVar;
        this.f5376c = fVar;
        this.f5377d = z;
    }
}
