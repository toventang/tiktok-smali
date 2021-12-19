package com.airbnb.lottie.e.c;

import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.RectF;
import com.airbnb.lottie.a.a.d;
import com.airbnb.lottie.e.b.n;
import com.airbnb.lottie.e.e;
import com.airbnb.lottie.g;
import com.bytedance.covode.number.Covode;
import java.util.Collections;
import java.util.List;

public final class f extends a {

    /* renamed from: h  reason: collision with root package name */
    private final d f5504h;

    static {
        Covode.recordClassIndex(2293);
    }

    @Override // com.airbnb.lottie.e.c.a, com.airbnb.lottie.a.a.e
    public final void a(RectF rectF, Matrix matrix) {
        super.a(rectF, matrix);
        this.f5504h.a(rectF, this.f5463a);
    }

    @Override // com.airbnb.lottie.e.c.a
    public final void b(RectF rectF, Matrix matrix) {
        super.b(rectF, matrix);
        this.f5504h.a(rectF, this.f5463a);
    }

    f(g gVar, d dVar) {
        super(gVar, dVar);
        d dVar2 = new d(gVar, this, new n("__container", dVar.f5489a));
        this.f5504h = dVar2;
        dVar2.a(Collections.emptyList(), Collections.emptyList());
    }

    /* access modifiers changed from: package-private */
    @Override // com.airbnb.lottie.e.c.a
    public final void b(Canvas canvas, Matrix matrix, int i2) {
        this.f5504h.a(canvas, matrix, i2);
    }

    /* access modifiers changed from: protected */
    @Override // com.airbnb.lottie.e.c.a
    public final void b(e eVar, int i2, List<e> list, e eVar2) {
        this.f5504h.a(eVar, i2, list, eVar2);
    }
}
