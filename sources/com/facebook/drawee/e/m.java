package com.facebook.drawee.e;

import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import com.bytedance.covode.number.Covode;
import com.facebook.common.d.i;
import java.util.Arrays;

public final class m extends g implements j {

    /* renamed from: a  reason: collision with root package name */
    a f47401a = a.OVERLAY_COLOR;

    /* renamed from: b  reason: collision with root package name */
    final float[] f47402b = new float[8];

    /* renamed from: c  reason: collision with root package name */
    final Paint f47403c = new Paint(1);

    /* renamed from: d  reason: collision with root package name */
    public int f47404d = 0;

    /* renamed from: e  reason: collision with root package name */
    private final RectF f47405e = new RectF();

    /* renamed from: f  reason: collision with root package name */
    private RectF f47406f;

    /* renamed from: g  reason: collision with root package name */
    private Matrix f47407g;

    /* renamed from: h  reason: collision with root package name */
    private final float[] f47408h = new float[8];

    /* renamed from: i  reason: collision with root package name */
    private boolean f47409i = false;

    /* renamed from: j  reason: collision with root package name */
    private float f47410j = 0.0f;

    /* renamed from: k  reason: collision with root package name */
    private int f47411k = 0;

    /* renamed from: l  reason: collision with root package name */
    private float f47412l = 0.0f;

    /* renamed from: m  reason: collision with root package name */
    private boolean f47413m = false;
    private final Path n = new Path();
    private final Path o = new Path();
    private final RectF p = new RectF();

    static {
        Covode.recordClassIndex(28774);
    }

    @Override // com.facebook.drawee.e.j
    public final void a() {
        Arrays.fill(this.f47408h, 0.0f);
        b();
        invalidateSelf();
    }

    /* renamed from: com.facebook.drawee.e.m$1  reason: invalid class name */
    static /* synthetic */ class AnonymousClass1 {

        /* renamed from: a  reason: collision with root package name */
        static final /* synthetic */ int[] f47414a;

        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0017 */
        static {
            /*
                r0 = 28775(0x7067, float:4.0322E-41)
                com.bytedance.covode.number.Covode.recordClassIndex(r0)
                com.facebook.drawee.e.m$a[] r0 = com.facebook.drawee.e.m.a.values()
                int r0 = r0.length
                int[] r2 = new int[r0]
                com.facebook.drawee.e.m.AnonymousClass1.f47414a = r2
                com.facebook.drawee.e.m$a r0 = com.facebook.drawee.e.m.a.CLIPPING     // Catch:{ NoSuchFieldError -> 0x0017 }
                int r1 = r0.ordinal()     // Catch:{ NoSuchFieldError -> 0x0017 }
                r0 = 1
                r2[r1] = r0     // Catch:{ NoSuchFieldError -> 0x0017 }
            L_0x0017:
                int[] r2 = com.facebook.drawee.e.m.AnonymousClass1.f47414a     // Catch:{ NoSuchFieldError -> 0x0022 }
                com.facebook.drawee.e.m$a r0 = com.facebook.drawee.e.m.a.OVERLAY_COLOR     // Catch:{ NoSuchFieldError -> 0x0022 }
                int r1 = r0.ordinal()     // Catch:{ NoSuchFieldError -> 0x0022 }
                r0 = 2
                r2[r1] = r0     // Catch:{ NoSuchFieldError -> 0x0022 }
            L_0x0022:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.facebook.drawee.e.m.AnonymousClass1.<clinit>():void");
        }
    }

    public enum a {
        OVERLAY_COLOR,
        CLIPPING;

        static {
            Covode.recordClassIndex(28776);
        }
    }

    private void b() {
        float[] fArr;
        this.n.reset();
        this.o.reset();
        this.p.set(getBounds());
        RectF rectF = this.p;
        float f2 = this.f47412l;
        rectF.inset(f2, f2);
        this.n.addRect(this.p, Path.Direction.CW);
        if (this.f47409i) {
            this.n.addCircle(this.p.centerX(), this.p.centerY(), Math.min(this.p.width(), this.p.height()) / 2.0f, Path.Direction.CW);
        } else {
            this.n.addRoundRect(this.p, this.f47408h, Path.Direction.CW);
        }
        RectF rectF2 = this.p;
        float f3 = this.f47412l;
        rectF2.inset(-f3, -f3);
        RectF rectF3 = this.p;
        float f4 = this.f47410j;
        rectF3.inset(f4 / 2.0f, f4 / 2.0f);
        if (this.f47409i) {
            this.o.addCircle(this.p.centerX(), this.p.centerY(), Math.min(this.p.width(), this.p.height()) / 2.0f, Path.Direction.CW);
        } else {
            int i2 = 0;
            while (true) {
                fArr = this.f47402b;
                if (i2 >= fArr.length) {
                    break;
                }
                fArr[i2] = (this.f47408h[i2] + this.f47412l) - (this.f47410j / 2.0f);
                i2++;
            }
            this.o.addRoundRect(this.p, fArr, Path.Direction.CW);
        }
        RectF rectF4 = this.p;
        float f5 = this.f47410j;
        rectF4.inset((-f5) / 2.0f, (-f5) / 2.0f);
    }

    public final void a(int i2) {
        this.f47404d = i2;
        invalidateSelf();
    }

    /* access modifiers changed from: protected */
    @Override // com.facebook.drawee.e.g
    public final void onBoundsChange(Rect rect) {
        super.onBoundsChange(rect);
        b();
    }

    @Override // com.facebook.drawee.e.j
    public final void b(boolean z) {
        this.f47413m = z;
        b();
        invalidateSelf();
    }

    @Override // com.facebook.drawee.e.j
    public final void a(float f2) {
        this.f47412l = f2;
        b();
        invalidateSelf();
    }

    public m(Drawable drawable) {
        super((Drawable) i.a(drawable));
    }

    @Override // com.facebook.drawee.e.j
    public final void a(boolean z) {
        this.f47409i = z;
        b();
        invalidateSelf();
    }

    @Override // com.facebook.drawee.e.j
    public final void a(float[] fArr) {
        boolean z;
        if (fArr == null) {
            Arrays.fill(this.f47408h, 0.0f);
        } else {
            if (fArr.length == 8) {
                z = true;
            } else {
                z = false;
            }
            i.a(z, "radii should have exactly 8 values");
            System.arraycopy(fArr, 0, this.f47408h, 0, 8);
        }
        b();
        invalidateSelf();
    }

    @Override // com.facebook.drawee.e.g
    public final void draw(Canvas canvas) {
        this.f47405e.set(getBounds());
        int i2 = AnonymousClass1.f47414a[this.f47401a.ordinal()];
        if (i2 == 1) {
            int save = canvas.save();
            this.n.setFillType(Path.FillType.EVEN_ODD);
            canvas.clipPath(this.n);
            super.draw(canvas);
            canvas.restoreToCount(save);
        } else if (i2 == 2) {
            if (this.f47413m) {
                RectF rectF = this.f47406f;
                if (rectF == null) {
                    this.f47406f = new RectF(this.f47405e);
                    this.f47407g = new Matrix();
                } else {
                    rectF.set(this.f47405e);
                }
                RectF rectF2 = this.f47406f;
                float f2 = this.f47410j;
                rectF2.inset(f2, f2);
                this.f47407g.setRectToRect(this.f47405e, this.f47406f, Matrix.ScaleToFit.FILL);
                int save2 = canvas.save();
                canvas.clipRect(this.f47405e);
                canvas.concat(this.f47407g);
                super.draw(canvas);
                canvas.restoreToCount(save2);
            } else {
                super.draw(canvas);
            }
            this.f47403c.setStyle(Paint.Style.FILL);
            this.f47403c.setColor(this.f47404d);
            this.f47403c.setStrokeWidth(0.0f);
            this.n.setFillType(Path.FillType.EVEN_ODD);
            canvas.drawPath(this.n, this.f47403c);
            if (this.f47409i) {
                float width = ((this.f47405e.width() - this.f47405e.height()) + this.f47410j) / 2.0f;
                float height = ((this.f47405e.height() - this.f47405e.width()) + this.f47410j) / 2.0f;
                if (width > 0.0f) {
                    canvas.drawRect(this.f47405e.left, this.f47405e.top, this.f47405e.left + width, this.f47405e.bottom, this.f47403c);
                    canvas.drawRect(this.f47405e.right - width, this.f47405e.top, this.f47405e.right, this.f47405e.bottom, this.f47403c);
                }
                if (height > 0.0f) {
                    canvas.drawRect(this.f47405e.left, this.f47405e.top, this.f47405e.right, this.f47405e.top + height, this.f47403c);
                    canvas.drawRect(this.f47405e.left, this.f47405e.bottom - height, this.f47405e.right, this.f47405e.bottom, this.f47403c);
                }
            }
        }
        if (this.f47411k != 0) {
            this.f47403c.setStyle(Paint.Style.STROKE);
            this.f47403c.setColor(this.f47411k);
            this.f47403c.setStrokeWidth(this.f47410j);
            this.n.setFillType(Path.FillType.EVEN_ODD);
            canvas.drawPath(this.o, this.f47403c);
        }
    }

    @Override // com.facebook.drawee.e.j
    public final void a(int i2, float f2) {
        this.f47411k = i2;
        this.f47410j = f2;
        b();
        invalidateSelf();
    }
}
