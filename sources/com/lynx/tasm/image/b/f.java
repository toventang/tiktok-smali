package com.lynx.tasm.image.b;

import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffXfermode;
import android.graphics.RectF;
import com.bytedance.covode.number.Covode;
import com.bytedance.vcloud.abrmodule.ABRConfig;
import com.lynx.tasm.image.b;
import com.lynx.tasm.image.d;

/* access modifiers changed from: package-private */
public final class f extends d {

    /* renamed from: b  reason: collision with root package name */
    private static final PorterDuffXfermode f56701b = new PorterDuffXfermode(PorterDuff.Mode.DST_OUT);

    /* renamed from: c  reason: collision with root package name */
    private final Paint f56702c = new Paint(1);

    /* renamed from: d  reason: collision with root package name */
    private final Path f56703d = new Path();

    /* renamed from: e  reason: collision with root package name */
    private float[] f56704e;

    static {
        Covode.recordClassIndex(35337);
    }

    public f(d dVar) {
        super(dVar);
    }

    @Override // com.lynx.tasm.image.d
    public final void b(Canvas canvas, Bitmap bitmap, b bVar) {
        int i2;
        float[] fArr = bVar.f56675a;
        int i3 = bVar.f56678d;
        int i4 = bVar.f56679e;
        if (fArr != null) {
            this.f56702c.setXfermode(null);
            i2 = canvas.saveLayer(new RectF(0.0f, 0.0f, (float) i3, (float) i4), this.f56702c, 31);
        } else {
            i2 = 0;
        }
        super.b(canvas, bitmap, bVar);
        if (fArr != null) {
            int i5 = bVar.f56686l;
            int i6 = bVar.f56687m;
            int i7 = bVar.n;
            int i8 = bVar.o;
            a(i5, i6, i7, i8, fArr);
            this.f56703d.reset();
            this.f56703d.setFillType(Path.FillType.INVERSE_EVEN_ODD);
            this.f56703d.addRoundRect(new RectF((float) i5, (float) i6, (float) (i3 - i7), (float) (i4 - i8)), this.f56704e, Path.Direction.CW);
            this.f56702c.setXfermode(f56701b);
            canvas.drawPath(this.f56703d, this.f56702c);
            canvas.restoreToCount(i2);
        }
    }

    private void a(int i2, int i3, int i4, int i5, float[] fArr) {
        int i6;
        if (this.f56704e == null) {
            this.f56704e = new float[8];
        }
        for (int i7 = 0; i7 < fArr.length; i7++) {
            switch (i7) {
                case 0:
                case ABRConfig.ABR_PLAYER_DISPLAY_WIDTH_KEY:
                    i6 = i2;
                    break;
                case 1:
                case 3:
                    i6 = i3;
                    break;
                case 2:
                case 4:
                    i6 = i4;
                    break;
                case ABRConfig.ABR_STARTUP_MODEL_KEY:
                case ABRConfig.ABR_PLAYER_DISPLAY_HEIGHT_KEY:
                    i6 = i5;
                    break;
                default:
                    i6 = 0;
                    break;
            }
            this.f56704e[i7] = Math.max(fArr[i7] - ((float) i6), 0.0f);
        }
    }
}
