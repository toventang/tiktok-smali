package com.bytedance.lottie.c.c;

import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.ColorFilter;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.RectF;
import com.bytedance.covode.number.Covode;
import com.bytedance.lottie.a.b.a;
import com.bytedance.lottie.a.b.p;
import com.bytedance.lottie.g.c;
import com.bytedance.lottie.i;
import com.bytedance.lottie.m;

public final class g extends a {

    /* renamed from: g  reason: collision with root package name */
    private final RectF f40629g = new RectF();

    /* renamed from: h  reason: collision with root package name */
    private final Paint f40630h;

    /* renamed from: i  reason: collision with root package name */
    private final float[] f40631i;

    /* renamed from: j  reason: collision with root package name */
    private final Path f40632j;

    /* renamed from: k  reason: collision with root package name */
    private final d f40633k;

    /* renamed from: l  reason: collision with root package name */
    private a<ColorFilter, ColorFilter> f40634l;

    static {
        Covode.recordClassIndex(24925);
    }

    @Override // com.bytedance.lottie.a.a.d, com.bytedance.lottie.c.c.a
    public final void a(RectF rectF, Matrix matrix) {
        super.a(rectF, matrix);
        this.f40629g.set(0.0f, 0.0f, (float) this.f40633k.f40622j, (float) this.f40633k.f40623k);
        this.f40587a.mapRect(this.f40629g);
        rectF.set(this.f40629g);
    }

    g(i iVar, d dVar) {
        super(iVar, dVar);
        Paint paint = new Paint();
        this.f40630h = paint;
        this.f40631i = new float[8];
        this.f40632j = new Path();
        this.f40633k = dVar;
        paint.setAlpha(0);
        paint.setStyle(Paint.Style.FILL);
        paint.setColor(dVar.f40624l);
    }

    @Override // com.bytedance.lottie.c.f, com.bytedance.lottie.c.c.a
    public final <T> void a(T t, c<T> cVar) {
        super.a(t, cVar);
        if (t != m.x) {
            return;
        }
        if (cVar == null) {
            this.f40634l = null;
        } else {
            this.f40634l = new p(cVar);
        }
    }

    @Override // com.bytedance.lottie.c.c.a
    public final void b(Canvas canvas, Matrix matrix, int i2) {
        int alpha = Color.alpha(this.f40633k.f40624l);
        if (alpha != 0) {
            int intValue = (int) ((((float) i2) / 255.0f) * (((((float) alpha) / 255.0f) * ((float) this.f40592f.f40450e.d().intValue())) / 100.0f) * 255.0f);
            this.f40630h.setAlpha(intValue);
            a<ColorFilter, ColorFilter> aVar = this.f40634l;
            if (aVar != null) {
                this.f40630h.setColorFilter(aVar.d());
            }
            if (intValue > 0) {
                float[] fArr = this.f40631i;
                fArr[0] = 0.0f;
                fArr[1] = 0.0f;
                fArr[2] = (float) this.f40633k.f40622j;
                float[] fArr2 = this.f40631i;
                fArr2[3] = 0.0f;
                fArr2[4] = (float) this.f40633k.f40622j;
                this.f40631i[5] = (float) this.f40633k.f40623k;
                float[] fArr3 = this.f40631i;
                fArr3[6] = 0.0f;
                fArr3[7] = (float) this.f40633k.f40623k;
                matrix.mapPoints(this.f40631i);
                this.f40632j.reset();
                Path path = this.f40632j;
                float[] fArr4 = this.f40631i;
                path.moveTo(fArr4[0], fArr4[1]);
                Path path2 = this.f40632j;
                float[] fArr5 = this.f40631i;
                path2.lineTo(fArr5[2], fArr5[3]);
                Path path3 = this.f40632j;
                float[] fArr6 = this.f40631i;
                path3.lineTo(fArr6[4], fArr6[5]);
                Path path4 = this.f40632j;
                float[] fArr7 = this.f40631i;
                path4.lineTo(fArr7[6], fArr7[7]);
                Path path5 = this.f40632j;
                float[] fArr8 = this.f40631i;
                path5.lineTo(fArr8[0], fArr8[1]);
                this.f40632j.close();
                canvas.drawPath(this.f40632j, this.f40630h);
            }
        }
    }
}
