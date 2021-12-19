package com.airbnb.lottie.e.c;

import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.ColorFilter;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.RectF;
import com.airbnb.lottie.a.b.a;
import com.airbnb.lottie.a.b.p;
import com.airbnb.lottie.j.c;
import com.airbnb.lottie.k;
import com.bytedance.covode.number.Covode;

public final class g extends a {

    /* renamed from: h  reason: collision with root package name */
    private final RectF f5505h = new RectF();

    /* renamed from: i  reason: collision with root package name */
    private final Paint f5506i;

    /* renamed from: j  reason: collision with root package name */
    private final float[] f5507j;

    /* renamed from: k  reason: collision with root package name */
    private final Path f5508k;

    /* renamed from: l  reason: collision with root package name */
    private final d f5509l;

    /* renamed from: m  reason: collision with root package name */
    private a<ColorFilter, ColorFilter> f5510m;

    static {
        Covode.recordClassIndex(2294);
    }

    private void a(RectF rectF) {
        this.f5505h.set(0.0f, 0.0f, (float) this.f5509l.f5498j, (float) this.f5509l.f5499k);
        this.f5463a.mapRect(this.f5505h);
        rectF.set(this.f5505h);
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

    g(com.airbnb.lottie.g gVar, d dVar) {
        super(gVar, dVar);
        Paint paint = new Paint();
        this.f5506i = paint;
        this.f5507j = new float[8];
        this.f5508k = new Path();
        this.f5509l = dVar;
        paint.setAlpha(0);
        paint.setStyle(Paint.Style.FILL);
        paint.setColor(dVar.f5500l);
    }

    @Override // com.airbnb.lottie.e.c.a, com.airbnb.lottie.e.f
    public final <T> void a(T t, c<T> cVar) {
        super.a(t, cVar);
        if (t != k.C) {
            return;
        }
        if (cVar == null) {
            this.f5510m = null;
        } else {
            this.f5510m = new p(cVar);
        }
    }

    @Override // com.airbnb.lottie.e.c.a
    public final void b(Canvas canvas, Matrix matrix, int i2) {
        int alpha = Color.alpha(this.f5509l.f5500l);
        if (alpha != 0) {
            int intValue = (int) ((((float) i2) / 255.0f) * (((((float) alpha) / 255.0f) * ((float) this.f5469g.f5294e.f().intValue())) / 100.0f) * 255.0f);
            this.f5506i.setAlpha(intValue);
            a<ColorFilter, ColorFilter> aVar = this.f5510m;
            if (aVar != null) {
                this.f5506i.setColorFilter(aVar.f());
            }
            if (intValue > 0) {
                float[] fArr = this.f5507j;
                fArr[0] = 0.0f;
                fArr[1] = 0.0f;
                fArr[2] = (float) this.f5509l.f5498j;
                float[] fArr2 = this.f5507j;
                fArr2[3] = 0.0f;
                fArr2[4] = (float) this.f5509l.f5498j;
                this.f5507j[5] = (float) this.f5509l.f5499k;
                float[] fArr3 = this.f5507j;
                fArr3[6] = 0.0f;
                fArr3[7] = (float) this.f5509l.f5499k;
                matrix.mapPoints(this.f5507j);
                this.f5508k.reset();
                Path path = this.f5508k;
                float[] fArr4 = this.f5507j;
                path.moveTo(fArr4[0], fArr4[1]);
                Path path2 = this.f5508k;
                float[] fArr5 = this.f5507j;
                path2.lineTo(fArr5[2], fArr5[3]);
                Path path3 = this.f5508k;
                float[] fArr6 = this.f5507j;
                path3.lineTo(fArr6[4], fArr6[5]);
                Path path4 = this.f5508k;
                float[] fArr7 = this.f5507j;
                path4.lineTo(fArr7[6], fArr7[7]);
                Path path5 = this.f5508k;
                float[] fArr8 = this.f5507j;
                path5.lineTo(fArr8[0], fArr8[1]);
                this.f5508k.close();
                canvas.drawPath(this.f5508k, this.f5506i);
            }
        }
    }
}
