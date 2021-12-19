package com.bytedance.lottie.c.c;

import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.RectF;
import com.bytedance.covode.number.Covode;
import com.bytedance.lottie.a.a.c;
import com.bytedance.lottie.c.b.n;
import com.bytedance.lottie.c.e;
import com.bytedance.lottie.i;
import java.util.Collections;
import java.util.List;

public final class f extends a {

    /* renamed from: g  reason: collision with root package name */
    private final c f40628g;

    static {
        Covode.recordClassIndex(24924);
    }

    @Override // com.bytedance.lottie.a.a.d, com.bytedance.lottie.c.c.a
    public final void a(RectF rectF, Matrix matrix) {
        super.a(rectF, matrix);
        this.f40628g.a(rectF, this.f40587a);
    }

    f(i iVar, d dVar) {
        super(iVar, dVar);
        c cVar = new c(iVar, this, new n("__container", dVar.f40613a));
        this.f40628g = cVar;
        cVar.a(Collections.emptyList(), Collections.emptyList());
    }

    /* access modifiers changed from: package-private */
    @Override // com.bytedance.lottie.c.c.a
    public final void b(Canvas canvas, Matrix matrix, int i2) {
        this.f40628g.a(canvas, matrix, i2);
    }

    /* access modifiers changed from: protected */
    @Override // com.bytedance.lottie.c.c.a
    public final void b(e eVar, int i2, List<e> list, e eVar2) {
        this.f40628g.a(eVar, i2, list, eVar2);
    }
}
