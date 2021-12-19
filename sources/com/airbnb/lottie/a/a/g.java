package com.airbnb.lottie.a.a;

import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.RectF;
import com.airbnb.lottie.a.b.a;
import com.airbnb.lottie.a.b.p;
import com.airbnb.lottie.e.b.m;
import com.airbnb.lottie.e.e;
import com.airbnb.lottie.g.d;
import com.airbnb.lottie.i.f;
import com.airbnb.lottie.j.c;
import com.airbnb.lottie.k;
import com.bytedance.covode.number.Covode;
import java.util.ArrayList;
import java.util.List;

public final class g implements e, k, a.AbstractC0073a {

    /* renamed from: a  reason: collision with root package name */
    private final Path f5169a;

    /* renamed from: b  reason: collision with root package name */
    private final Paint f5170b = new Paint(1);

    /* renamed from: c  reason: collision with root package name */
    private final com.airbnb.lottie.e.c.a f5171c;

    /* renamed from: d  reason: collision with root package name */
    private final String f5172d;

    /* renamed from: e  reason: collision with root package name */
    private final List<m> f5173e = new ArrayList();

    /* renamed from: f  reason: collision with root package name */
    private final a<Integer, Integer> f5174f;

    /* renamed from: g  reason: collision with root package name */
    private final a<Integer, Integer> f5175g;

    /* renamed from: h  reason: collision with root package name */
    private a<ColorFilter, ColorFilter> f5176h;

    /* renamed from: i  reason: collision with root package name */
    private final com.airbnb.lottie.g f5177i;

    static {
        Covode.recordClassIndex(2192);
    }

    @Override // com.airbnb.lottie.a.a.c
    public final String b() {
        return this.f5172d;
    }

    @Override // com.airbnb.lottie.a.b.a.AbstractC0073a
    public final void a() {
        this.f5177i.invalidateSelf();
    }

    /* JADX DEBUG: Multi-variable search result rejected for r0v2, resolved type: java.util.List<com.airbnb.lottie.a.a.m> */
    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.airbnb.lottie.a.a.c
    public final void a(List<c> list, List<c> list2) {
        for (int i2 = 0; i2 < list2.size(); i2++) {
            c cVar = list2.get(i2);
            if (cVar instanceof m) {
                this.f5173e.add(cVar);
            }
        }
    }

    @Override // com.airbnb.lottie.a.a.e
    public final void a(RectF rectF, Matrix matrix) {
        this.f5169a.reset();
        for (int i2 = 0; i2 < this.f5173e.size(); i2++) {
            this.f5169a.addPath(this.f5173e.get(i2).e(), matrix);
        }
        this.f5169a.computeBounds(rectF, false);
        rectF.set(rectF.left - 1.0f, rectF.top - 1.0f, rectF.right + 1.0f, rectF.bottom + 1.0f);
    }

    @Override // com.airbnb.lottie.e.f
    public final <T> void a(T t, c<T> cVar) {
        a<ColorFilter, ColorFilter> aVar;
        if (t == k.f5735a) {
            this.f5174f.a(cVar);
        } else if (t == k.f5738d) {
            this.f5175g.a(cVar);
        } else if (t == k.C) {
            if (d.a.f5625a && (aVar = this.f5176h) != null) {
                this.f5171c.b(aVar);
            }
            if (cVar == null) {
                this.f5176h = null;
                return;
            }
            p pVar = new p(cVar);
            this.f5176h = pVar;
            pVar.a(this);
            this.f5171c.a(this.f5176h);
        }
    }

    public g(com.airbnb.lottie.g gVar, com.airbnb.lottie.e.c.a aVar, m mVar) {
        Path path = new Path();
        this.f5169a = path;
        this.f5171c = aVar;
        this.f5172d = mVar.f5431b;
        this.f5177i = gVar;
        if (mVar.f5432c == null || mVar.f5433d == null) {
            this.f5174f = null;
            this.f5175g = null;
            return;
        }
        path.setFillType(mVar.f5430a);
        a<Integer, Integer> a2 = mVar.f5432c.a();
        this.f5174f = a2;
        a2.a(this);
        aVar.a(a2);
        a<Integer, Integer> a3 = mVar.f5433d.a();
        this.f5175g = a3;
        a3.a(this);
        aVar.a(a3);
    }

    @Override // com.airbnb.lottie.a.a.e
    public final void a(Canvas canvas, Matrix matrix, int i2) {
        com.airbnb.lottie.d.b("FillContent#draw");
        this.f5170b.setColor(this.f5174f.f().intValue());
        this.f5170b.setAlpha(f.a((int) ((((((float) i2) / 255.0f) * ((float) this.f5175g.f().intValue())) / 100.0f) * 255.0f)));
        a<ColorFilter, ColorFilter> aVar = this.f5176h;
        if (aVar != null) {
            this.f5170b.setColorFilter(aVar.f());
        }
        this.f5169a.reset();
        for (int i3 = 0; i3 < this.f5173e.size(); i3++) {
            this.f5169a.addPath(this.f5173e.get(i3).e(), matrix);
        }
        canvas.drawPath(this.f5169a, this.f5170b);
        com.airbnb.lottie.d.c("FillContent#draw");
    }

    @Override // com.airbnb.lottie.e.f
    public final void a(e eVar, int i2, List<e> list, e eVar2) {
        f.a(eVar, i2, list, eVar2, this);
    }
}
