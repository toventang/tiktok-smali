package com.bytedance.lottie.a.a;

import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Matrix;
import com.bytedance.covode.number.Covode;
import com.bytedance.lottie.a.b.p;
import com.bytedance.lottie.c.c.a;
import com.bytedance.lottie.g.c;
import com.bytedance.lottie.i;
import com.bytedance.lottie.m;

public final class q extends a {

    /* renamed from: b  reason: collision with root package name */
    private final a f40406b;

    /* renamed from: c  reason: collision with root package name */
    private final String f40407c;

    /* renamed from: d  reason: collision with root package name */
    private final com.bytedance.lottie.a.b.a<Integer, Integer> f40408d;

    /* renamed from: e  reason: collision with root package name */
    private com.bytedance.lottie.a.b.a<ColorFilter, ColorFilter> f40409e;

    static {
        Covode.recordClassIndex(24849);
    }

    @Override // com.bytedance.lottie.a.a.b
    public final String b() {
        return this.f40407c;
    }

    @Override // com.bytedance.lottie.a.a.a, com.bytedance.lottie.c.f
    public final <T> void a(T t, c<T> cVar) {
        super.a(t, cVar);
        if (t == m.f40803b) {
            this.f40408d.a(cVar);
        } else if (t != m.x) {
        } else {
            if (cVar == null) {
                this.f40409e = null;
                return;
            }
            p pVar = new p(cVar);
            this.f40409e = pVar;
            pVar.a(this);
            this.f40406b.a(this.f40408d);
        }
    }

    public q(i iVar, a aVar, com.bytedance.lottie.c.b.p pVar) {
        super(iVar, aVar, pVar.f40570g.toPaintCap(), pVar.f40571h.toPaintJoin(), pVar.f40572i, pVar.f40568e, pVar.f40569f, pVar.f40566c, pVar.f40565b);
        this.f40406b = aVar;
        this.f40407c = pVar.f40564a;
        com.bytedance.lottie.a.b.a<Integer, Integer> a2 = pVar.f40567d.a();
        this.f40408d = a2;
        a2.a(this);
        aVar.a(a2);
    }

    @Override // com.bytedance.lottie.a.a.a, com.bytedance.lottie.a.a.d
    public final void a(Canvas canvas, Matrix matrix, int i2) {
        this.f40299a.setColor(this.f40408d.d().intValue());
        if (this.f40409e != null) {
            this.f40299a.setColorFilter(this.f40409e.d());
        }
        super.a(canvas, matrix, i2);
    }
}
