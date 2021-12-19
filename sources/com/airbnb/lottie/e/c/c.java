package com.airbnb.lottie.e.c;

import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.RectF;
import com.airbnb.lottie.a.b.a;
import com.airbnb.lottie.a.b.p;
import com.airbnb.lottie.g.d;
import com.airbnb.lottie.h;
import com.airbnb.lottie.i.g;
import com.airbnb.lottie.k;
import com.bytedance.covode.number.Covode;

public final class c extends a {

    /* renamed from: h  reason: collision with root package name */
    private final Paint f5484h;

    /* renamed from: i  reason: collision with root package name */
    private final Rect f5485i = new Rect();

    /* renamed from: j  reason: collision with root package name */
    private final Rect f5486j = new Rect();

    /* renamed from: k  reason: collision with root package name */
    private h f5487k;

    /* renamed from: l  reason: collision with root package name */
    private a<ColorFilter, ColorFilter> f5488l;

    static {
        Covode.recordClassIndex(2288);
    }

    private Bitmap e() {
        return this.f5464b.a(this.f5465c.f5495g);
    }

    private int a(Bitmap bitmap) {
        h hVar = this.f5487k;
        if (hVar == null || !hVar.f5661h) {
            return bitmap.getWidth();
        }
        return this.f5487k.f5654a;
    }

    private int b(Bitmap bitmap) {
        h hVar = this.f5487k;
        if (hVar == null || !hVar.f5661h) {
            return bitmap.getHeight();
        }
        return this.f5487k.f5655b;
    }

    private void a(RectF rectF) {
        Bitmap e2 = e();
        if (e2 != null) {
            if (d.a.f5625a) {
                rectF.set(0.0f, 0.0f, ((float) a(e2)) * g.a(), ((float) b(e2)) * g.a());
            } else {
                rectF.set(rectF.left, rectF.top, Math.min(rectF.right, (float) e2.getWidth()), Math.min(rectF.bottom, (float) e2.getHeight()));
            }
            this.f5463a.mapRect(rectF);
        }
    }

    @Override // com.airbnb.lottie.e.c.a, com.airbnb.lottie.a.a.e
    public final void a(RectF rectF, Matrix matrix) {
        super.a(rectF, matrix);
        a(rectF);
    }

    @Override // com.airbnb.lottie.e.c.a
    public final void b(RectF rectF, Matrix matrix) {
        super.b(rectF, matrix);
        a(rectF);
    }

    @Override // com.airbnb.lottie.e.c.a, com.airbnb.lottie.e.f
    public final <T> void a(T t, com.airbnb.lottie.j.c<T> cVar) {
        super.a(t, cVar);
        if (t != k.C) {
            return;
        }
        if (cVar == null) {
            this.f5488l = null;
        } else {
            this.f5488l = new p(cVar);
        }
    }

    c(com.airbnb.lottie.g gVar, d dVar) {
        super(gVar, dVar);
        if (!d.a.f5625a) {
            this.f5484h = new Paint(3);
        } else if (!d.a.f5632h || !d.e.f5649a) {
            this.f5484h = new com.airbnb.lottie.a.a(3);
        } else {
            this.f5484h = new com.airbnb.lottie.a.a(1);
        }
        if (dVar != null && dVar.f5490b != null && dVar.f5490b.f5332c != null) {
            this.f5487k = dVar.f5490b.f5332c.get(dVar.f5495g);
        }
    }

    @Override // com.airbnb.lottie.e.c.a
    public final void b(Canvas canvas, Matrix matrix, int i2) {
        Bitmap e2 = e();
        if (e2 != null && !e2.isRecycled()) {
            float a2 = g.a();
            this.f5484h.setAlpha(i2);
            a<ColorFilter, ColorFilter> aVar = this.f5488l;
            if (aVar != null) {
                this.f5484h.setColorFilter(aVar.f());
            }
            canvas.save();
            canvas.concat(matrix);
            this.f5485i.set(0, 0, e2.getWidth(), e2.getHeight());
            this.f5486j.set(0, 0, (int) (((float) a(e2)) * a2), (int) (((float) b(e2)) * a2));
            canvas.drawBitmap(e2, this.f5485i, this.f5486j, this.f5484h);
            canvas.restore();
        }
    }
}
