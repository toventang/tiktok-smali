package com.google.android.material.internal;

import android.content.res.ColorStateList;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.LinearGradient;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.Shader;
import android.graphics.drawable.Drawable;
import com.bytedance.covode.number.Covode;

public final class a extends Drawable {

    /* renamed from: a  reason: collision with root package name */
    final Paint f52496a;

    /* renamed from: b  reason: collision with root package name */
    final Rect f52497b;

    /* renamed from: c  reason: collision with root package name */
    final RectF f52498c;

    /* renamed from: d  reason: collision with root package name */
    final C1221a f52499d;

    /* renamed from: e  reason: collision with root package name */
    float f52500e;

    /* renamed from: f  reason: collision with root package name */
    public ColorStateList f52501f;

    /* renamed from: g  reason: collision with root package name */
    public int f52502g;

    /* renamed from: h  reason: collision with root package name */
    public boolean f52503h;

    /* renamed from: i  reason: collision with root package name */
    public float f52504i;

    /* renamed from: j  reason: collision with root package name */
    private int f52505j;

    /* renamed from: k  reason: collision with root package name */
    private int f52506k;

    /* renamed from: l  reason: collision with root package name */
    private int f52507l;

    /* renamed from: m  reason: collision with root package name */
    private int f52508m;

    static {
        Covode.recordClassIndex(32539);
    }

    /* renamed from: com.google.android.material.internal.a$a  reason: collision with other inner class name */
    class C1221a extends Drawable.ConstantState {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ a f52509a;

        static {
            Covode.recordClassIndex(32540);
        }

        public final int getChangingConfigurations() {
            return 0;
        }

        public final Drawable newDrawable() {
            return this.f52509a;
        }
    }

    public final Drawable.ConstantState getConstantState() {
        return this.f52499d;
    }

    public final int getOpacity() {
        if (this.f52500e > 0.0f) {
            return -3;
        }
        return -2;
    }

    public final boolean isStateful() {
        ColorStateList colorStateList = this.f52501f;
        if ((colorStateList == null || !colorStateList.isStateful()) && !super.isStateful()) {
            return false;
        }
        return true;
    }

    /* access modifiers changed from: protected */
    public final void onBoundsChange(Rect rect) {
        this.f52503h = true;
    }

    public final boolean getPadding(Rect rect) {
        int round = Math.round(this.f52500e);
        rect.set(round, round, round, round);
        return true;
    }

    public final void setAlpha(int i2) {
        this.f52496a.setAlpha(i2);
        invalidateSelf();
    }

    public final void setColorFilter(ColorFilter colorFilter) {
        this.f52496a.setColorFilter(colorFilter);
        invalidateSelf();
    }

    /* access modifiers changed from: protected */
    public final boolean onStateChange(int[] iArr) {
        int colorForState;
        ColorStateList colorStateList = this.f52501f;
        if (!(colorStateList == null || (colorForState = colorStateList.getColorForState(iArr, this.f52502g)) == this.f52502g)) {
            this.f52503h = true;
            this.f52502g = colorForState;
        }
        if (this.f52503h) {
            invalidateSelf();
        }
        return this.f52503h;
    }

    public final void draw(Canvas canvas) {
        if (this.f52503h) {
            Paint paint = this.f52496a;
            Rect rect = this.f52497b;
            copyBounds(rect);
            float height = this.f52500e / ((float) rect.height());
            paint.setShader(new LinearGradient(0.0f, (float) rect.top, 0.0f, (float) rect.bottom, new int[]{androidx.core.graphics.a.a(this.f52505j, this.f52502g), androidx.core.graphics.a.a(this.f52506k, this.f52502g), androidx.core.graphics.a.a(androidx.core.graphics.a.b(this.f52506k, 0), this.f52502g), androidx.core.graphics.a.a(androidx.core.graphics.a.b(this.f52508m, 0), this.f52502g), androidx.core.graphics.a.a(this.f52508m, this.f52502g), androidx.core.graphics.a.a(this.f52507l, this.f52502g)}, new float[]{0.0f, height, 0.5f, 0.5f, 1.0f - height, 1.0f}, Shader.TileMode.CLAMP));
            this.f52503h = false;
        }
        float strokeWidth = this.f52496a.getStrokeWidth() / 2.0f;
        RectF rectF = this.f52498c;
        copyBounds(this.f52497b);
        rectF.set(this.f52497b);
        rectF.left += strokeWidth;
        rectF.top += strokeWidth;
        rectF.right -= strokeWidth;
        rectF.bottom -= strokeWidth;
        canvas.save();
        canvas.rotate(this.f52504i, rectF.centerX(), rectF.centerY());
        canvas.drawOval(rectF, this.f52496a);
        canvas.restore();
    }
}
