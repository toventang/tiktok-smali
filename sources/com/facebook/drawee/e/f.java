package com.facebook.drawee.e;

import android.graphics.Canvas;
import android.graphics.drawable.Drawable;
import android.os.SystemClock;
import com.bytedance.covode.number.Covode;
import com.facebook.common.d.i;
import java.util.Arrays;

public class f extends a {

    /* renamed from: c  reason: collision with root package name */
    public int f47369c;

    /* renamed from: d  reason: collision with root package name */
    public int f47370d;

    /* renamed from: e  reason: collision with root package name */
    long f47371e;

    /* renamed from: f  reason: collision with root package name */
    int[] f47372f;

    /* renamed from: g  reason: collision with root package name */
    int[] f47373g;

    /* renamed from: h  reason: collision with root package name */
    int f47374h;

    /* renamed from: i  reason: collision with root package name */
    boolean[] f47375i;

    /* renamed from: j  reason: collision with root package name */
    int f47376j;

    /* renamed from: k  reason: collision with root package name */
    private final Drawable[] f47377k;

    static {
        Covode.recordClassIndex(28767);
    }

    public int getAlpha() {
        return this.f47374h;
    }

    public final void a() {
        this.f47376j++;
    }

    public void invalidateSelf() {
        if (this.f47376j == 0) {
            super.invalidateSelf();
        }
    }

    public final void b() {
        this.f47376j--;
        invalidateSelf();
    }

    public final void c() {
        this.f47369c = 0;
        Arrays.fill(this.f47375i, true);
        invalidateSelf();
    }

    public final void d() {
        int i2;
        this.f47369c = 2;
        for (int i3 = 0; i3 < this.f47377k.length; i3++) {
            int[] iArr = this.f47373g;
            if (this.f47375i[i3]) {
                i2 = 255;
            } else {
                i2 = 0;
            }
            iArr[i3] = i2;
        }
        invalidateSelf();
    }

    public final void d(int i2) {
        this.f47369c = 0;
        this.f47375i[i2] = false;
        invalidateSelf();
    }

    @Override // com.facebook.drawee.e.a
    public void setAlpha(int i2) {
        if (this.f47374h != i2) {
            this.f47374h = i2;
            invalidateSelf();
        }
    }

    public final void b(int i2) {
        this.f47370d = i2;
        if (this.f47369c == 1) {
            this.f47369c = 0;
        }
    }

    public final void c(int i2) {
        this.f47369c = 0;
        this.f47375i[i2] = true;
        invalidateSelf();
    }

    public f(Drawable[] drawableArr) {
        super(drawableArr);
        boolean z;
        if (drawableArr.length > 0) {
            z = true;
        } else {
            z = false;
        }
        i.b(z, "At least one layer required!");
        this.f47377k = drawableArr;
        int[] iArr = new int[drawableArr.length];
        this.f47372f = iArr;
        this.f47373g = new int[drawableArr.length];
        this.f47374h = 255;
        this.f47375i = new boolean[drawableArr.length];
        this.f47376j = 0;
        this.f47369c = 2;
        Arrays.fill(iArr, 0);
        this.f47372f[0] = 255;
        Arrays.fill(this.f47373g, 0);
        this.f47373g[0] = 255;
        Arrays.fill(this.f47375i, false);
        this.f47375i[0] = true;
    }

    private boolean a(float f2) {
        int i2;
        boolean z = true;
        for (int i3 = 0; i3 < this.f47377k.length; i3++) {
            boolean[] zArr = this.f47375i;
            if (zArr[i3]) {
                i2 = 1;
            } else {
                i2 = -1;
            }
            int[] iArr = this.f47373g;
            iArr[i3] = (int) (((float) this.f47372f[i3]) + (((float) (i2 * 255)) * f2));
            if (iArr[i3] < 0) {
                iArr[i3] = 0;
            }
            if (iArr[i3] > 255) {
                iArr[i3] = 255;
            }
            if (zArr[i3] && iArr[i3] < 255) {
                z = false;
            }
            if (!zArr[i3] && iArr[i3] > 0) {
                z = false;
            }
        }
        return z;
    }

    @Override // com.facebook.drawee.e.a
    public void draw(Canvas canvas) {
        boolean z;
        float f2;
        boolean z2;
        int i2 = this.f47369c;
        int i3 = 2;
        int i4 = 0;
        if (i2 == 0) {
            System.arraycopy(this.f47373g, 0, this.f47372f, 0, this.f47377k.length);
            this.f47371e = SystemClock.uptimeMillis();
            if (this.f47370d == 0) {
                f2 = 1.0f;
            } else {
                f2 = 0.0f;
            }
            z = a(f2);
            if (!z) {
                i3 = 1;
            }
            this.f47369c = i3;
        } else if (i2 != 1) {
            z = true;
        } else {
            if (this.f47370d > 0) {
                z2 = true;
            } else {
                z2 = false;
            }
            i.b(z2);
            z = a(((float) (SystemClock.uptimeMillis() - this.f47371e)) / ((float) this.f47370d));
            if (!z) {
                i3 = 1;
            }
            this.f47369c = i3;
        }
        while (true) {
            Drawable[] drawableArr = this.f47377k;
            if (i4 >= drawableArr.length) {
                break;
            }
            Drawable drawable = drawableArr[i4];
            int i5 = (this.f47373g[i4] * this.f47374h) / 255;
            if (drawable != null && i5 > 0) {
                this.f47376j++;
                drawable.mutate().setAlpha(i5);
                this.f47376j--;
                drawable.draw(canvas);
            }
            i4++;
        }
        if (!z) {
            invalidateSelf();
        }
    }
}
