package com.facebook.drawee.e;

import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import com.bytedance.covode.number.Covode;
import com.facebook.common.d.i;
import java.util.Arrays;

public final class l extends Drawable implements j {

    /* renamed from: a  reason: collision with root package name */
    final float[] f47388a = new float[8];

    /* renamed from: b  reason: collision with root package name */
    float[] f47389b;

    /* renamed from: c  reason: collision with root package name */
    final Paint f47390c = new Paint(1);

    /* renamed from: d  reason: collision with root package name */
    final Path f47391d = new Path();

    /* renamed from: e  reason: collision with root package name */
    final Path f47392e = new Path();

    /* renamed from: f  reason: collision with root package name */
    public int f47393f = 0;

    /* renamed from: g  reason: collision with root package name */
    private final float[] f47394g = new float[8];

    /* renamed from: h  reason: collision with root package name */
    private boolean f47395h = false;

    /* renamed from: i  reason: collision with root package name */
    private float f47396i = 0.0f;

    /* renamed from: j  reason: collision with root package name */
    private float f47397j = 0.0f;

    /* renamed from: k  reason: collision with root package name */
    private int f47398k = 0;

    /* renamed from: l  reason: collision with root package name */
    private boolean f47399l = false;

    /* renamed from: m  reason: collision with root package name */
    private final RectF f47400m = new RectF();
    private int n = 255;

    static {
        Covode.recordClassIndex(28773);
    }

    public final void setColorFilter(ColorFilter colorFilter) {
    }

    public final int getAlpha() {
        return this.n;
    }

    @Override // com.facebook.drawee.e.j
    public final void a() {
        i.a(true, (Object) "radius should be non negative");
        Arrays.fill(this.f47394g, 0.0f);
        b();
        invalidateSelf();
    }

    public final int getOpacity() {
        int a2 = e.a(this.f47393f, this.n) >>> 24;
        if (a2 == 255) {
            return -1;
        }
        if (a2 == 0) {
            return -2;
        }
        return -3;
    }

    private void b() {
        float[] fArr;
        float f2;
        float[] fArr2;
        this.f47391d.reset();
        this.f47392e.reset();
        this.f47400m.set(getBounds());
        RectF rectF = this.f47400m;
        float f3 = this.f47396i;
        rectF.inset(f3 / 2.0f, f3 / 2.0f);
        int i2 = 0;
        if (this.f47395h) {
            this.f47392e.addCircle(this.f47400m.centerX(), this.f47400m.centerY(), Math.min(this.f47400m.width(), this.f47400m.height()) / 2.0f, Path.Direction.CW);
        } else {
            int i3 = 0;
            while (true) {
                fArr = this.f47388a;
                if (i3 >= fArr.length) {
                    break;
                }
                fArr[i3] = (this.f47394g[i3] + this.f47397j) - (this.f47396i / 2.0f);
                i3++;
            }
            this.f47392e.addRoundRect(this.f47400m, fArr, Path.Direction.CW);
        }
        RectF rectF2 = this.f47400m;
        float f4 = this.f47396i;
        rectF2.inset((-f4) / 2.0f, (-f4) / 2.0f);
        float f5 = this.f47397j;
        if (this.f47399l) {
            f2 = this.f47396i;
        } else {
            f2 = 0.0f;
        }
        float f6 = f5 + f2;
        this.f47400m.inset(f6, f6);
        if (this.f47395h) {
            this.f47391d.addCircle(this.f47400m.centerX(), this.f47400m.centerY(), Math.min(this.f47400m.width(), this.f47400m.height()) / 2.0f, Path.Direction.CW);
        } else if (this.f47399l) {
            if (this.f47389b == null) {
                this.f47389b = new float[8];
            }
            while (true) {
                fArr2 = this.f47389b;
                if (i2 >= fArr2.length) {
                    break;
                }
                fArr2[i2] = this.f47394g[i2] - this.f47396i;
                i2++;
            }
            this.f47391d.addRoundRect(this.f47400m, fArr2, Path.Direction.CW);
        } else {
            this.f47391d.addRoundRect(this.f47400m, this.f47394g, Path.Direction.CW);
        }
        float f7 = -f6;
        this.f47400m.inset(f7, f7);
    }

    /* access modifiers changed from: protected */
    public final void onBoundsChange(Rect rect) {
        super.onBoundsChange(rect);
        b();
    }

    public static l a(ColorDrawable colorDrawable) {
        return new l(colorDrawable.getColor());
    }

    @Override // com.facebook.drawee.e.j
    public final void b(boolean z) {
        if (this.f47399l != z) {
            this.f47399l = z;
            b();
            invalidateSelf();
        }
    }

    public final void setAlpha(int i2) {
        if (i2 != this.n) {
            this.n = i2;
            invalidateSelf();
        }
    }

    @Override // com.facebook.drawee.e.j
    public final void a(float f2) {
        if (this.f47397j != f2) {
            this.f47397j = f2;
            b();
            invalidateSelf();
        }
    }

    private l(int i2) {
        if (this.f47393f != i2) {
            this.f47393f = i2;
            invalidateSelf();
        }
    }

    public final void draw(Canvas canvas) {
        this.f47390c.setColor(e.a(this.f47393f, this.n));
        this.f47390c.setStyle(Paint.Style.FILL);
        canvas.drawPath(this.f47391d, this.f47390c);
        if (this.f47396i != 0.0f) {
            this.f47390c.setColor(e.a(this.f47398k, this.n));
            this.f47390c.setStyle(Paint.Style.STROKE);
            this.f47390c.setStrokeWidth(this.f47396i);
            canvas.drawPath(this.f47392e, this.f47390c);
        }
    }

    @Override // com.facebook.drawee.e.j
    public final void a(boolean z) {
        this.f47395h = z;
        b();
        invalidateSelf();
    }

    @Override // com.facebook.drawee.e.j
    public final void a(float[] fArr) {
        boolean z;
        if (fArr == null) {
            Arrays.fill(this.f47394g, 0.0f);
        } else {
            if (fArr.length == 8) {
                z = true;
            } else {
                z = false;
            }
            i.a(z, "radii should have exactly 8 values");
            System.arraycopy(fArr, 0, this.f47394g, 0, 8);
        }
        b();
        invalidateSelf();
    }

    @Override // com.facebook.drawee.e.j
    public final void a(int i2, float f2) {
        if (this.f47398k != i2) {
            this.f47398k = i2;
            invalidateSelf();
        }
        if (this.f47396i != f2) {
            this.f47396i = f2;
            b();
            invalidateSelf();
        }
    }
}
