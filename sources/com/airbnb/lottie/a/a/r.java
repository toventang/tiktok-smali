package com.airbnb.lottie.a.a;

import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Matrix;
import com.airbnb.lottie.a.b.p;
import com.airbnb.lottie.e.c.a;
import com.airbnb.lottie.g;
import com.airbnb.lottie.g.d;
import com.airbnb.lottie.j.c;
import com.airbnb.lottie.k;
import com.bytedance.covode.number.Covode;

public final class r extends a {

    /* renamed from: c  reason: collision with root package name */
    private final a f5247c;

    /* renamed from: d  reason: collision with root package name */
    private final String f5248d;

    /* renamed from: e  reason: collision with root package name */
    private final com.airbnb.lottie.a.b.a<Integer, Integer> f5249e;

    /* renamed from: f  reason: collision with root package name */
    private com.airbnb.lottie.a.b.a<ColorFilter, ColorFilter> f5250f;

    static {
        Covode.recordClassIndex(2205);
    }

    @Override // com.airbnb.lottie.a.a.c
    public final String b() {
        return this.f5248d;
    }

    @Override // com.airbnb.lottie.a.a.a, com.airbnb.lottie.e.f
    public final <T> void a(T t, c<T> cVar) {
        com.airbnb.lottie.a.b.a<ColorFilter, ColorFilter> aVar;
        super.a(t, cVar);
        if (t == k.f5736b) {
            this.f5249e.a(cVar);
        } else if (t == k.C) {
            if (d.a.f5625a && (aVar = this.f5250f) != null) {
                this.f5247c.b(aVar);
            }
            if (cVar == null) {
                this.f5250f = null;
                return;
            }
            p pVar = new p(cVar);
            this.f5250f = pVar;
            pVar.a(this);
            this.f5247c.a(this.f5249e);
        }
    }

    public r(g gVar, a aVar, com.airbnb.lottie.e.b.p pVar) {
        super(gVar, aVar, pVar.f5446g.toPaintCap(), pVar.f5447h.toPaintJoin(), pVar.f5448i, pVar.f5444e, pVar.f5445f, pVar.f5442c, pVar.f5441b);
        this.f5247c = aVar;
        this.f5248d = pVar.f5440a;
        com.airbnb.lottie.a.b.a<Integer, Integer> a2 = pVar.f5443d.a();
        this.f5249e = a2;
        a2.a(this);
        aVar.a(a2);
    }

    @Override // com.airbnb.lottie.a.a.a, com.airbnb.lottie.a.a.e
    public final void a(Canvas canvas, Matrix matrix, int i2) {
        this.f5137b.setColor(this.f5249e.f().intValue());
        if (this.f5250f != null) {
            this.f5137b.setColorFilter(this.f5250f.f());
        }
        super.a(canvas, matrix, i2);
    }
}
