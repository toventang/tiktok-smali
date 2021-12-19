package androidx.cardview.widget;

import android.content.res.ColorStateList;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Outline;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import com.bytedance.covode.number.Covode;

/* access modifiers changed from: package-private */
public final class f extends Drawable {

    /* renamed from: a  reason: collision with root package name */
    public float f1859a;

    /* renamed from: b  reason: collision with root package name */
    public float f1860b;

    /* renamed from: c  reason: collision with root package name */
    public ColorStateList f1861c;

    /* renamed from: d  reason: collision with root package name */
    private final Paint f1862d;

    /* renamed from: e  reason: collision with root package name */
    private final RectF f1863e;

    /* renamed from: f  reason: collision with root package name */
    private final Rect f1864f;

    /* renamed from: g  reason: collision with root package name */
    private boolean f1865g;

    /* renamed from: h  reason: collision with root package name */
    private boolean f1866h = true;

    /* renamed from: i  reason: collision with root package name */
    private PorterDuffColorFilter f1867i;

    /* renamed from: j  reason: collision with root package name */
    private ColorStateList f1868j;

    /* renamed from: k  reason: collision with root package name */
    private PorterDuff.Mode f1869k = PorterDuff.Mode.SRC_IN;

    static {
        Covode.recordClassIndex(574);
    }

    public final int getOpacity() {
        return -3;
    }

    public final boolean isStateful() {
        ColorStateList colorStateList = this.f1868j;
        if (colorStateList != null && colorStateList.isStateful()) {
            return true;
        }
        ColorStateList colorStateList2 = this.f1861c;
        if ((colorStateList2 == null || !colorStateList2.isStateful()) && !super.isStateful()) {
            return false;
        }
        return true;
    }

    public final void getOutline(Outline outline) {
        outline.setRoundRect(this.f1864f, this.f1859a);
    }

    /* access modifiers changed from: protected */
    public final void onBoundsChange(Rect rect) {
        super.onBoundsChange(rect);
        a(rect);
    }

    public final void setAlpha(int i2) {
        this.f1862d.setAlpha(i2);
    }

    public final void setColorFilter(ColorFilter colorFilter) {
        this.f1862d.setColorFilter(colorFilter);
    }

    public final void setTintList(ColorStateList colorStateList) {
        this.f1868j = colorStateList;
        this.f1867i = a(colorStateList, this.f1869k);
        invalidateSelf();
    }

    public final void setTintMode(PorterDuff.Mode mode) {
        this.f1869k = mode;
        this.f1867i = a(this.f1868j, mode);
        invalidateSelf();
    }

    public final void draw(Canvas canvas) {
        boolean z;
        Paint paint = this.f1862d;
        if (this.f1867i == null || paint.getColorFilter() != null) {
            z = false;
        } else {
            paint.setColorFilter(this.f1867i);
            z = true;
        }
        RectF rectF = this.f1863e;
        float f2 = this.f1859a;
        canvas.drawRoundRect(rectF, f2, f2, paint);
        if (z) {
            paint.setColorFilter(null);
        }
    }

    /* access modifiers changed from: protected */
    public final boolean onStateChange(int[] iArr) {
        boolean z;
        PorterDuff.Mode mode;
        ColorStateList colorStateList = this.f1861c;
        int colorForState = colorStateList.getColorForState(iArr, colorStateList.getDefaultColor());
        if (colorForState != this.f1862d.getColor()) {
            z = true;
            this.f1862d.setColor(colorForState);
        } else {
            z = false;
        }
        ColorStateList colorStateList2 = this.f1868j;
        if (colorStateList2 == null || (mode = this.f1869k) == null) {
            return z;
        }
        this.f1867i = a(colorStateList2, mode);
        return true;
    }

    /* access modifiers changed from: package-private */
    public final void a(ColorStateList colorStateList) {
        if (colorStateList == null) {
            colorStateList = ColorStateList.valueOf(0);
        }
        this.f1861c = colorStateList;
        this.f1862d.setColor(colorStateList.getColorForState(getState(), this.f1861c.getDefaultColor()));
    }

    /* access modifiers changed from: package-private */
    public final void a(Rect rect) {
        if (rect == null) {
            rect = getBounds();
        }
        this.f1863e.set((float) rect.left, (float) rect.top, (float) rect.right, (float) rect.bottom);
        this.f1864f.set(rect);
        if (this.f1865g) {
            float a2 = g.a(this.f1860b, this.f1859a, this.f1866h);
            this.f1864f.inset((int) Math.ceil((double) g.b(this.f1860b, this.f1859a, this.f1866h)), (int) Math.ceil((double) a2));
            this.f1863e.set(this.f1864f);
        }
    }

    private PorterDuffColorFilter a(ColorStateList colorStateList, PorterDuff.Mode mode) {
        if (colorStateList == null || mode == null) {
            return null;
        }
        return new PorterDuffColorFilter(colorStateList.getColorForState(getState(), 0), mode);
    }

    f(ColorStateList colorStateList, float f2) {
        this.f1859a = f2;
        this.f1862d = new Paint(5);
        a(colorStateList);
        this.f1863e = new RectF();
        this.f1864f = new Rect();
    }

    /* access modifiers changed from: package-private */
    public final void a(float f2, boolean z, boolean z2) {
        if (f2 != this.f1860b || this.f1865g != z || this.f1866h != z2) {
            this.f1860b = f2;
            this.f1865g = z;
            this.f1866h = z2;
            a((Rect) null);
            invalidateSelf();
        }
    }
}
