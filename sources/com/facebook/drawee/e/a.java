package com.facebook.drawee.e;

import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Matrix;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import com.bytedance.covode.number.Covode;
import com.facebook.common.d.i;

public class a extends Drawable implements Drawable.Callback, r, s {

    /* renamed from: a  reason: collision with root package name */
    public final Drawable[] f47350a;

    /* renamed from: b  reason: collision with root package name */
    public final c[] f47351b;

    /* renamed from: c  reason: collision with root package name */
    private s f47352c;

    /* renamed from: d  reason: collision with root package name */
    private final d f47353d = new d();

    /* renamed from: e  reason: collision with root package name */
    private final Rect f47354e = new Rect();

    /* renamed from: f  reason: collision with root package name */
    private boolean f47355f;

    /* renamed from: g  reason: collision with root package name */
    private boolean f47356g;

    /* renamed from: h  reason: collision with root package name */
    private boolean f47357h;

    static {
        Covode.recordClassIndex(28761);
    }

    public int getIntrinsicHeight() {
        int i2 = 0;
        int i3 = -1;
        while (true) {
            Drawable[] drawableArr = this.f47350a;
            if (i2 >= drawableArr.length) {
                break;
            }
            Drawable drawable = drawableArr[i2];
            if (drawable != null) {
                i3 = Math.max(i3, drawable.getIntrinsicHeight());
            }
            i2++;
        }
        if (i3 > 0) {
            return i3;
        }
        return -1;
    }

    public int getIntrinsicWidth() {
        int i2 = 0;
        int i3 = -1;
        while (true) {
            Drawable[] drawableArr = this.f47350a;
            if (i2 >= drawableArr.length) {
                break;
            }
            Drawable drawable = drawableArr[i2];
            if (drawable != null) {
                i3 = Math.max(i3, drawable.getIntrinsicWidth());
            }
            i2++;
        }
        if (i3 > 0) {
            return i3;
        }
        return -1;
    }

    public int getOpacity() {
        if (this.f47350a.length == 0) {
            return -2;
        }
        int i2 = -1;
        int i3 = 1;
        while (true) {
            Drawable[] drawableArr = this.f47350a;
            if (i3 >= drawableArr.length) {
                return i2;
            }
            Drawable drawable = drawableArr[i3];
            if (drawable != null) {
                i2 = Drawable.resolveOpacity(i2, drawable.getOpacity());
            }
            i3++;
        }
    }

    public Drawable mutate() {
        int i2 = 0;
        while (true) {
            Drawable[] drawableArr = this.f47350a;
            if (i2 < drawableArr.length) {
                Drawable drawable = drawableArr[i2];
                if (drawable != null) {
                    drawable.mutate();
                }
                i2++;
            } else {
                this.f47357h = true;
                return this;
            }
        }
    }

    public boolean isStateful() {
        if (!this.f47356g) {
            this.f47355f = false;
            int i2 = 0;
            while (true) {
                Drawable[] drawableArr = this.f47350a;
                boolean z = true;
                if (i2 >= drawableArr.length) {
                    break;
                }
                Drawable drawable = drawableArr[i2];
                boolean z2 = this.f47355f;
                if (drawable == null || !drawable.isStateful()) {
                    z = false;
                }
                this.f47355f = z2 | z;
                i2++;
            }
            this.f47356g = true;
        }
        return this.f47355f;
    }

    public void invalidateDrawable(Drawable drawable) {
        invalidateSelf();
    }

    @Override // com.facebook.drawee.e.r
    public void setTransformCallback(s sVar) {
        this.f47352c = sVar;
    }

    @Override // com.facebook.drawee.e.s
    public void getRootBounds(RectF rectF) {
        s sVar = this.f47352c;
        if (sVar != null) {
            sVar.getRootBounds(rectF);
        } else {
            rectF.set(getBounds());
        }
    }

    @Override // com.facebook.drawee.e.s
    public void getTransform(Matrix matrix) {
        s sVar = this.f47352c;
        if (sVar != null) {
            sVar.getTransform(matrix);
        } else {
            matrix.reset();
        }
    }

    public final Drawable a(int i2) {
        boolean z;
        boolean z2 = true;
        if (i2 >= 0) {
            z = true;
        } else {
            z = false;
        }
        i.a(z);
        if (i2 >= this.f47350a.length) {
            z2 = false;
        }
        i.a(z2);
        return this.f47350a[i2];
    }

    public void draw(Canvas canvas) {
        int i2 = 0;
        while (true) {
            Drawable[] drawableArr = this.f47350a;
            if (i2 < drawableArr.length) {
                Drawable drawable = drawableArr[i2];
                if (drawable != null) {
                    drawable.draw(canvas);
                }
                i2++;
            } else {
                return;
            }
        }
    }

    /* access modifiers changed from: protected */
    public void onBoundsChange(Rect rect) {
        int i2 = 0;
        while (true) {
            Drawable[] drawableArr = this.f47350a;
            if (i2 < drawableArr.length) {
                Drawable drawable = drawableArr[i2];
                if (drawable != null) {
                    drawable.setBounds(rect);
                }
                i2++;
            } else {
                return;
            }
        }
    }

    /* access modifiers changed from: protected */
    public boolean onLevelChange(int i2) {
        int i3 = 0;
        boolean z = false;
        while (true) {
            Drawable[] drawableArr = this.f47350a;
            if (i3 >= drawableArr.length) {
                return z;
            }
            Drawable drawable = drawableArr[i3];
            if (drawable != null && drawable.setLevel(i2)) {
                z = true;
            }
            i3++;
        }
    }

    /* access modifiers changed from: protected */
    public boolean onStateChange(int[] iArr) {
        int i2 = 0;
        boolean z = false;
        while (true) {
            Drawable[] drawableArr = this.f47350a;
            if (i2 >= drawableArr.length) {
                return z;
            }
            Drawable drawable = drawableArr[i2];
            if (drawable != null && drawable.setState(iArr)) {
                z = true;
            }
            i2++;
        }
    }

    public void setAlpha(int i2) {
        this.f47353d.f47364a = i2;
        int i3 = 0;
        while (true) {
            Drawable[] drawableArr = this.f47350a;
            if (i3 < drawableArr.length) {
                Drawable drawable = drawableArr[i3];
                if (drawable != null) {
                    drawable.setAlpha(i2);
                }
                i3++;
            } else {
                return;
            }
        }
    }

    public void setColorFilter(ColorFilter colorFilter) {
        this.f47353d.a(colorFilter);
        int i2 = 0;
        while (true) {
            Drawable[] drawableArr = this.f47350a;
            if (i2 < drawableArr.length) {
                Drawable drawable = drawableArr[i2];
                if (drawable != null) {
                    drawable.setColorFilter(colorFilter);
                }
                i2++;
            } else {
                return;
            }
        }
    }

    public void setDither(boolean z) {
        this.f47353d.a(z);
        int i2 = 0;
        while (true) {
            Drawable[] drawableArr = this.f47350a;
            if (i2 < drawableArr.length) {
                Drawable drawable = drawableArr[i2];
                if (drawable != null) {
                    drawable.setDither(z);
                }
                i2++;
            } else {
                return;
            }
        }
    }

    public void setFilterBitmap(boolean z) {
        this.f47353d.b(z);
        int i2 = 0;
        while (true) {
            Drawable[] drawableArr = this.f47350a;
            if (i2 < drawableArr.length) {
                Drawable drawable = drawableArr[i2];
                if (drawable != null) {
                    drawable.setFilterBitmap(z);
                }
                i2++;
            } else {
                return;
            }
        }
    }

    public a(Drawable[] drawableArr) {
        int i2 = 0;
        this.f47355f = false;
        this.f47356g = false;
        this.f47357h = false;
        i.a(drawableArr);
        this.f47350a = drawableArr;
        while (true) {
            Drawable[] drawableArr2 = this.f47350a;
            if (i2 < drawableArr2.length) {
                e.a(drawableArr2[i2], this, this);
                i2++;
            } else {
                this.f47351b = new c[drawableArr2.length];
                return;
            }
        }
    }

    public boolean getPadding(Rect rect) {
        int i2 = 0;
        rect.left = 0;
        rect.top = 0;
        rect.right = 0;
        rect.bottom = 0;
        Rect rect2 = this.f47354e;
        while (true) {
            Drawable[] drawableArr = this.f47350a;
            if (i2 >= drawableArr.length) {
                return true;
            }
            Drawable drawable = drawableArr[i2];
            if (drawable != null) {
                drawable.getPadding(rect2);
                rect.left = Math.max(rect.left, rect2.left);
                rect.top = Math.max(rect.top, rect2.top);
                rect.right = Math.max(rect.right, rect2.right);
                rect.bottom = Math.max(rect.bottom, rect2.bottom);
            }
            i2++;
        }
    }

    public void unscheduleDrawable(Drawable drawable, Runnable runnable) {
        unscheduleSelf(runnable);
    }

    public void setHotspot(float f2, float f3) {
        int i2 = 0;
        while (true) {
            Drawable[] drawableArr = this.f47350a;
            if (i2 < drawableArr.length) {
                Drawable drawable = drawableArr[i2];
                if (drawable != null) {
                    drawable.setHotspot(f2, f3);
                }
                i2++;
            } else {
                return;
            }
        }
    }

    public boolean setVisible(boolean z, boolean z2) {
        boolean visible = super.setVisible(z, z2);
        int i2 = 0;
        while (true) {
            Drawable[] drawableArr = this.f47350a;
            if (i2 >= drawableArr.length) {
                return visible;
            }
            Drawable drawable = drawableArr[i2];
            if (drawable != null) {
                drawable.setVisible(z, z2);
            }
            i2++;
        }
    }

    public final Drawable a(int i2, Drawable drawable) {
        boolean z;
        boolean z2 = true;
        if (i2 >= 0) {
            z = true;
        } else {
            z = false;
        }
        i.a(z);
        if (i2 >= this.f47350a.length) {
            z2 = false;
        }
        i.a(z2);
        Drawable drawable2 = this.f47350a[i2];
        if (drawable != drawable2) {
            if (drawable != null && this.f47357h) {
                drawable.mutate();
            }
            e.a(this.f47350a[i2], null, null);
            e.a(drawable, null, null);
            e.a(drawable, this.f47353d);
            e.a(drawable, this);
            e.a(drawable, this, this);
            this.f47356g = false;
            this.f47350a[i2] = drawable;
            invalidateSelf();
        }
        return drawable2;
    }

    public void scheduleDrawable(Drawable drawable, Runnable runnable, long j2) {
        scheduleSelf(runnable, j2);
    }
}
