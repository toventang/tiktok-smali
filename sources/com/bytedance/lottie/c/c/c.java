package com.bytedance.lottie.c.c;

import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.RectF;
import com.bytedance.covode.number.Covode;
import com.bytedance.lottie.a.b.a;
import com.bytedance.lottie.a.b.p;
import com.bytedance.lottie.f.h;
import com.bytedance.lottie.i;
import com.bytedance.lottie.m;

public final class c extends a {

    /* renamed from: g  reason: collision with root package name */
    private final Paint f40609g = new Paint(3);

    /* renamed from: h  reason: collision with root package name */
    private final Rect f40610h = new Rect();

    /* renamed from: i  reason: collision with root package name */
    private final Rect f40611i = new Rect();

    /* renamed from: j  reason: collision with root package name */
    private a<ColorFilter, ColorFilter> f40612j;

    static {
        Covode.recordClassIndex(24919);
    }

    private Bitmap c() {
        return this.f40588b.a(this.f40589c.f40619g);
    }

    c(i iVar, d dVar) {
        super(iVar, dVar);
    }

    @Override // com.bytedance.lottie.c.f, com.bytedance.lottie.c.c.a
    public final <T> void a(T t, com.bytedance.lottie.g.c<T> cVar) {
        super.a(t, cVar);
        if (t != m.x) {
            return;
        }
        if (cVar == null) {
            this.f40612j = null;
        } else {
            this.f40612j = new p(cVar);
        }
    }

    @Override // com.bytedance.lottie.a.a.d, com.bytedance.lottie.c.c.a
    public final void a(RectF rectF, Matrix matrix) {
        super.a(rectF, matrix);
        Bitmap c2 = c();
        if (c2 != null) {
            rectF.set(rectF.left, rectF.top, Math.min(rectF.right, (float) c2.getWidth()), Math.min(rectF.bottom, (float) c2.getHeight()));
            this.f40587a.mapRect(rectF);
        }
    }

    @Override // com.bytedance.lottie.c.c.a
    public final void b(Canvas canvas, Matrix matrix, int i2) {
        try {
            Bitmap c2 = c();
            if (c2 == null) {
                return;
            }
            if (!c2.isRecycled()) {
                float a2 = h.a();
                this.f40609g.setAlpha(i2);
                a<ColorFilter, ColorFilter> aVar = this.f40612j;
                if (aVar != null) {
                    this.f40609g.setColorFilter(aVar.d());
                }
                canvas.save();
                canvas.concat(matrix);
                this.f40610h.set(0, 0, c2.getWidth(), c2.getHeight());
                this.f40611i.set(0, 0, (int) (((float) c2.getWidth()) * a2), (int) (((float) c2.getHeight()) * a2));
                canvas.drawBitmap(c2, this.f40610h, this.f40611i, this.f40609g);
                canvas.restore();
            }
        } catch (Exception unused) {
        }
    }
}
