package com.airbnb.lottie.a.b;

import android.graphics.PointF;
import com.airbnb.lottie.a.b.a;
import com.bytedance.covode.number.Covode;
import java.util.Collections;

public final class m extends a<PointF, PointF> {

    /* renamed from: e  reason: collision with root package name */
    private final PointF f5287e = new PointF();

    /* renamed from: f  reason: collision with root package name */
    private final a<Float, Float> f5288f;

    /* renamed from: g  reason: collision with root package name */
    private final a<Float, Float> f5289g;

    static {
        Covode.recordClassIndex(2224);
    }

    /* Return type fixed from 'java.lang.Object' to match base method */
    @Override // com.airbnb.lottie.a.b.a
    public final /* bridge */ /* synthetic */ PointF f() {
        return this.f5287e;
    }

    @Override // com.airbnb.lottie.a.b.a
    public final void a(float f2) {
        this.f5288f.a(f2);
        this.f5289g.a(f2);
        this.f5287e.set(this.f5288f.f().floatValue(), this.f5289g.f().floatValue());
        for (int i2 = 0; i2 < this.f5257a.size(); i2++) {
            ((a.AbstractC0073a) this.f5257a.get(i2)).a();
        }
    }

    /* Return type fixed from 'java.lang.Object' to match base method */
    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [com.airbnb.lottie.j.a, float] */
    /* access modifiers changed from: package-private */
    @Override // com.airbnb.lottie.a.b.a
    public final /* bridge */ /* synthetic */ PointF a(com.airbnb.lottie.j.a<PointF> aVar, float f2) {
        return this.f5287e;
    }

    public m(a<Float, Float> aVar, a<Float, Float> aVar2) {
        super(Collections.emptyList());
        this.f5288f = aVar;
        this.f5289g = aVar2;
        a(this.f5259c);
    }
}
