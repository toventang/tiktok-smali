package com.lynx.tasm.image.b;

import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import com.bytedance.covode.number.Covode;
import com.lynx.a.a;
import com.lynx.a.f;
import com.lynx.tasm.base.LLog;
import com.lynx.tasm.image.b;
import com.lynx.tasm.image.d;
import com.lynx.tasm.utils.BlurUtils;

public final class b extends d {

    /* renamed from: b  reason: collision with root package name */
    private final Paint f56693b;

    /* renamed from: c  reason: collision with root package name */
    private final Matrix f56694c = new Matrix();

    /* renamed from: d  reason: collision with root package name */
    private a f56695d;

    /* renamed from: e  reason: collision with root package name */
    private Bitmap f56696e;

    /* renamed from: f  reason: collision with root package name */
    private Bitmap f56697f;

    static {
        Covode.recordClassIndex(35333);
    }

    @Override // com.lynx.tasm.image.d
    public final void c() {
        a aVar = this.f56695d;
        if (aVar != null) {
            aVar.recycle(this.f56696e);
            this.f56695d.recycle(this.f56697f);
        }
        super.c();
    }

    public b(d dVar) {
        super(dVar);
        Paint paint = new Paint();
        this.f56693b = paint;
        paint.setFlags(3);
    }

    @Override // com.lynx.tasm.image.d
    public final void b(Canvas canvas, Bitmap bitmap, com.lynx.tasm.image.b bVar) {
        b.a aVar = bVar.p;
        if (aVar == null) {
            super.b(canvas, bitmap, bVar);
            return;
        }
        int i2 = bVar.f56678d;
        int i3 = bVar.f56679e;
        int i4 = bVar.f56686l;
        int i5 = bVar.f56687m;
        int i6 = (i2 - i4) - bVar.n;
        int i7 = (i3 - i5) - bVar.o;
        if (i6 <= 0 || i7 <= 0) {
            super.b(canvas, bitmap, bVar);
            return;
        }
        Bitmap a2 = a(this.f56696e, i6, i7, Bitmap.Config.ARGB_8888);
        this.f56696e = a2;
        if (a2 == null) {
            super.b(canvas, bitmap, bVar);
            LLog.a(6, "FilterImage", "create soft bitmap failed!");
            return;
        }
        a2.eraseColor(0);
        Canvas canvas2 = new Canvas(this.f56696e);
        bVar.f56678d = i6;
        bVar.f56679e = i7;
        super.b(canvas2, bitmap, bVar);
        bVar.f56678d = i2;
        bVar.f56679e = i3;
        Bitmap a3 = a(this.f56697f, Math.max(i2 / 2, 1), Math.max(i3 / 2, 1), Bitmap.Config.ARGB_8888);
        this.f56697f = a3;
        if (a3 == null) {
            canvas.drawBitmap(this.f56696e, (float) i4, (float) i5, (Paint) null);
            LLog.d("FilterImage", "create shadow bitmap failed!");
            return;
        }
        a3.eraseColor(0);
        Canvas canvas3 = new Canvas(this.f56697f);
        this.f56693b.setColorFilter(new PorterDuffColorFilter(aVar.f56690c, PorterDuff.Mode.SRC_IN));
        this.f56694c.reset();
        this.f56694c.setScale(0.5f, 0.5f);
        this.f56694c.preTranslate((float) (aVar.f56688a + i4), (float) (aVar.f56689b + i5));
        canvas3.drawBitmap(this.f56696e, this.f56694c, this.f56693b);
        BlurUtils.iterativeBoxBlur(this.f56697f, aVar.f56691d / 2);
        this.f56694c.reset();
        this.f56694c.setScale(2.0f, 2.0f);
        canvas.drawBitmap(this.f56697f, this.f56694c, null);
        canvas.drawBitmap(this.f56696e, (float) i4, (float) i5, (Paint) null);
    }

    private Bitmap a(Bitmap bitmap, int i2, int i3, Bitmap.Config config) {
        if (bitmap != null && bitmap.getWidth() >= i2 && bitmap.getHeight() >= i3) {
            return bitmap;
        }
        if (this.f56695d == null) {
            this.f56695d = f.b();
        }
        this.f56695d.recycle(bitmap);
        return this.f56695d.require(i2, i3, config);
    }
}
