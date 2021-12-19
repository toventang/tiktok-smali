package com.facebook.drawee.e;

import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Matrix;
import android.graphics.Path;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import com.bytedance.covode.number.Covode;
import com.facebook.common.d.i;
import com.facebook.imagepipeline.p.b;
import java.util.Arrays;

public abstract class n extends Drawable implements j, r {
    private boolean A = true;
    private s B;

    /* renamed from: a  reason: collision with root package name */
    private final float[] f47416a = new float[8];

    /* renamed from: b  reason: collision with root package name */
    protected final Drawable f47417b;

    /* renamed from: c  reason: collision with root package name */
    protected boolean f47418c;

    /* renamed from: d  reason: collision with root package name */
    protected boolean f47419d;

    /* renamed from: e  reason: collision with root package name */
    protected float f47420e;

    /* renamed from: f  reason: collision with root package name */
    protected final Path f47421f = new Path();

    /* renamed from: g  reason: collision with root package name */
    protected boolean f47422g = true;

    /* renamed from: h  reason: collision with root package name */
    protected int f47423h = 0;

    /* renamed from: i  reason: collision with root package name */
    protected final Path f47424i = new Path();

    /* renamed from: j  reason: collision with root package name */
    final float[] f47425j = new float[8];

    /* renamed from: k  reason: collision with root package name */
    float[] f47426k;

    /* renamed from: l  reason: collision with root package name */
    final RectF f47427l = new RectF();

    /* renamed from: m  reason: collision with root package name */
    final RectF f47428m = new RectF();
    final RectF n = new RectF();
    final RectF o = new RectF();
    RectF p;
    final Matrix q = new Matrix();
    final Matrix r = new Matrix();
    final Matrix s = new Matrix();
    final Matrix t = new Matrix();
    final Matrix u = new Matrix();
    Matrix v;
    Matrix w;
    final Matrix x = new Matrix();
    private float y = 0.0f;
    private boolean z = false;

    static {
        Covode.recordClassIndex(28777);
    }

    public void clearColorFilter() {
        this.f47417b.clearColorFilter();
    }

    public int getAlpha() {
        return this.f47417b.getAlpha();
    }

    public ColorFilter getColorFilter() {
        return this.f47417b.getColorFilter();
    }

    public int getIntrinsicHeight() {
        return this.f47417b.getIntrinsicHeight();
    }

    public int getIntrinsicWidth() {
        return this.f47417b.getIntrinsicWidth();
    }

    public int getOpacity() {
        return this.f47417b.getOpacity();
    }

    @Override // com.facebook.drawee.e.j
    public final void a() {
        i.b(true);
        Arrays.fill(this.f47416a, 0.0f);
        this.f47419d = false;
        this.A = true;
        invalidateSelf();
    }

    /* access modifiers changed from: package-private */
    public boolean b() {
        if (this.f47418c || this.f47419d || this.f47420e > 0.0f) {
            return true;
        }
        return false;
    }

    /* access modifiers changed from: protected */
    public final void d() {
        float[] fArr;
        float f2;
        if (this.A) {
            this.f47424i.reset();
            RectF rectF = this.f47427l;
            float f3 = this.f47420e;
            rectF.inset(f3 / 2.0f, f3 / 2.0f);
            if (this.f47418c) {
                this.f47424i.addCircle(this.f47427l.centerX(), this.f47427l.centerY(), Math.min(this.f47427l.width(), this.f47427l.height()) / 2.0f, Path.Direction.CW);
            } else {
                int i2 = 0;
                while (true) {
                    fArr = this.f47425j;
                    if (i2 >= fArr.length) {
                        break;
                    }
                    fArr[i2] = (this.f47416a[i2] + this.y) - (this.f47420e / 2.0f);
                    i2++;
                }
                this.f47424i.addRoundRect(this.f47427l, fArr, Path.Direction.CW);
            }
            RectF rectF2 = this.f47427l;
            float f4 = this.f47420e;
            rectF2.inset((-f4) / 2.0f, (-f4) / 2.0f);
            this.f47421f.reset();
            float f5 = this.y;
            if (this.z) {
                f2 = this.f47420e;
            } else {
                f2 = 0.0f;
            }
            float f6 = f5 + f2;
            this.f47427l.inset(f6, f6);
            if (this.f47418c) {
                this.f47421f.addCircle(this.f47427l.centerX(), this.f47427l.centerY(), Math.min(this.f47427l.width(), this.f47427l.height()) / 2.0f, Path.Direction.CW);
            } else if (this.z) {
                if (this.f47426k == null) {
                    this.f47426k = new float[8];
                }
                for (int i3 = 0; i3 < this.f47425j.length; i3++) {
                    this.f47426k[i3] = this.f47416a[i3] - this.f47420e;
                }
                this.f47421f.addRoundRect(this.f47427l, this.f47426k, Path.Direction.CW);
            } else {
                this.f47421f.addRoundRect(this.f47427l, this.f47416a, Path.Direction.CW);
            }
            float f7 = -f6;
            this.f47427l.inset(f7, f7);
            this.f47421f.setFillType(Path.FillType.WINDING);
            this.A = false;
        }
    }

    /* access modifiers changed from: protected */
    public final void c() {
        Matrix matrix;
        s sVar = this.B;
        if (sVar != null) {
            sVar.getTransform(this.s);
            this.B.getRootBounds(this.f47427l);
        } else {
            this.s.reset();
            this.f47427l.set(getBounds());
        }
        this.n.set(0.0f, 0.0f, (float) getIntrinsicWidth(), (float) getIntrinsicHeight());
        this.o.set(this.f47417b.getBounds());
        this.q.setRectToRect(this.n, this.o, Matrix.ScaleToFit.FILL);
        if (this.z) {
            RectF rectF = this.p;
            if (rectF == null) {
                this.p = new RectF(this.f47427l);
            } else {
                rectF.set(this.f47427l);
            }
            RectF rectF2 = this.p;
            float f2 = this.f47420e;
            rectF2.inset(f2, f2);
            if (this.v == null) {
                this.v = new Matrix();
            }
            this.v.setRectToRect(this.f47427l, this.p, Matrix.ScaleToFit.FILL);
        } else {
            Matrix matrix2 = this.v;
            if (matrix2 != null) {
                matrix2.reset();
            }
        }
        if (!this.s.equals(this.t) || !this.q.equals(this.r) || ((matrix = this.v) != null && !matrix.equals(this.w))) {
            this.f47422g = true;
            this.s.invert(this.u);
            this.x.set(this.s);
            if (this.z) {
                this.x.postConcat(this.v);
            }
            this.x.preConcat(this.q);
            this.t.set(this.s);
            this.r.set(this.q);
            if (this.z) {
                Matrix matrix3 = this.w;
                if (matrix3 == null) {
                    this.w = new Matrix(this.v);
                } else {
                    matrix3.set(this.v);
                }
            } else {
                Matrix matrix4 = this.w;
                if (matrix4 != null) {
                    matrix4.reset();
                }
            }
        }
        if (!this.f47427l.equals(this.f47428m)) {
            this.A = true;
            this.f47428m.set(this.f47427l);
        }
    }

    @Override // com.facebook.drawee.e.r
    public void setTransformCallback(s sVar) {
        this.B = sVar;
    }

    /* access modifiers changed from: protected */
    public void onBoundsChange(Rect rect) {
        this.f47417b.setBounds(rect);
    }

    public void setAlpha(int i2) {
        this.f47417b.setAlpha(i2);
    }

    @Override // com.facebook.drawee.e.j
    public final void a(float f2) {
        if (this.y != f2) {
            this.y = f2;
            this.A = true;
            invalidateSelf();
        }
    }

    @Override // com.facebook.drawee.e.j
    public final void b(boolean z2) {
        if (this.z != z2) {
            this.z = z2;
            this.A = true;
            invalidateSelf();
        }
    }

    public void draw(Canvas canvas) {
        b.a();
        this.f47417b.draw(canvas);
        b.a();
    }

    public void setColorFilter(ColorFilter colorFilter) {
        this.f47417b.setColorFilter(colorFilter);
    }

    n(Drawable drawable) {
        this.f47417b = drawable;
    }

    @Override // com.facebook.drawee.e.j
    public final void a(boolean z2) {
        this.f47418c = z2;
        this.A = true;
        invalidateSelf();
    }

    @Override // com.facebook.drawee.e.j
    public final void a(float[] fArr) {
        boolean z2;
        boolean z3;
        if (fArr == null) {
            Arrays.fill(this.f47416a, 0.0f);
            this.f47419d = false;
        } else {
            if (fArr.length == 8) {
                z2 = true;
            } else {
                z2 = false;
            }
            i.a(z2, "radii should have exactly 8 values");
            System.arraycopy(fArr, 0, this.f47416a, 0, 8);
            this.f47419d = false;
            int i2 = 0;
            do {
                boolean z4 = this.f47419d;
                if (fArr[i2] > 0.0f) {
                    z3 = true;
                } else {
                    z3 = false;
                }
                this.f47419d = z4 | z3;
                i2++;
            } while (i2 < 8);
        }
        this.A = true;
        invalidateSelf();
    }

    public void setColorFilter(int i2, PorterDuff.Mode mode) {
        this.f47417b.setColorFilter(i2, mode);
    }

    @Override // com.facebook.drawee.e.j
    public final void a(int i2, float f2) {
        if (this.f47423h != i2 || this.f47420e != f2) {
            this.f47423h = i2;
            this.f47420e = f2;
            this.A = true;
            invalidateSelf();
        }
    }
}
