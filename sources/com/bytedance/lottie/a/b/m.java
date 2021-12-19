package com.bytedance.lottie.a.b;

import android.graphics.PointF;
import com.bytedance.covode.number.Covode;
import com.bytedance.lottie.a.b.a;
import java.util.Collections;

public final class m extends a<PointF, PointF> {

    /* renamed from: e  reason: collision with root package name */
    private final PointF f40443e = new PointF();

    /* renamed from: f  reason: collision with root package name */
    private final a<Float, Float> f40444f;

    /* renamed from: g  reason: collision with root package name */
    private final a<Float, Float> f40445g;

    static {
        Covode.recordClassIndex(24864);
    }

    /* Return type fixed from 'java.lang.Object' to match base method */
    @Override // com.bytedance.lottie.a.b.a
    public final /* bridge */ /* synthetic */ PointF d() {
        return this.f40443e;
    }

    @Override // com.bytedance.lottie.a.b.a
    public final void a(float f2) {
        this.f40444f.a(f2);
        this.f40445g.a(f2);
        this.f40443e.set(this.f40444f.d().floatValue(), this.f40445g.d().floatValue());
        for (int i2 = 0; i2 < this.f40416a.size(); i2++) {
            ((a.AbstractC0986a) this.f40416a.get(i2)).a();
        }
    }

    /* Return type fixed from 'java.lang.Object' to match base method */
    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [com.bytedance.lottie.g.a, float] */
    /* access modifiers changed from: package-private */
    @Override // com.bytedance.lottie.a.b.a
    public final /* bridge */ /* synthetic */ PointF a(com.bytedance.lottie.g.a<PointF> aVar, float f2) {
        return this.f40443e;
    }

    public m(a<Float, Float> aVar, a<Float, Float> aVar2) {
        super(Collections.emptyList());
        this.f40444f = aVar;
        this.f40445g = aVar2;
        a(this.f40418c);
    }
}
