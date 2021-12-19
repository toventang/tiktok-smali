package com.facebook.drawee.e;

import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Matrix;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import com.bytedance.covode.number.Covode;

public class g extends Drawable implements Drawable.Callback, c, r, s {
    private static final Matrix sTempTransform = new Matrix();
    private Drawable mCurrentDelegate;
    private final d mDrawableProperties = new d();
    protected s mTransformCallback;

    public Drawable getCurrent() {
        return this.mCurrentDelegate;
    }

    @Override // com.facebook.drawee.e.c
    public Drawable getDrawable() {
        return getCurrent();
    }

    public Drawable mutate() {
        Drawable drawable = this.mCurrentDelegate;
        if (drawable != null) {
            drawable.mutate();
        }
        return this;
    }

    static {
        Covode.recordClassIndex(28768);
    }

    public Drawable.ConstantState getConstantState() {
        Drawable drawable = this.mCurrentDelegate;
        if (drawable == null) {
            return super.getConstantState();
        }
        return drawable.getConstantState();
    }

    public int getIntrinsicHeight() {
        Drawable drawable = this.mCurrentDelegate;
        if (drawable == null) {
            return super.getIntrinsicHeight();
        }
        return drawable.getIntrinsicHeight();
    }

    public int getIntrinsicWidth() {
        Drawable drawable = this.mCurrentDelegate;
        if (drawable == null) {
            return super.getIntrinsicWidth();
        }
        return drawable.getIntrinsicWidth();
    }

    public int getOpacity() {
        Drawable drawable = this.mCurrentDelegate;
        if (drawable == null) {
            return 0;
        }
        return drawable.getOpacity();
    }

    public boolean isStateful() {
        Drawable drawable = this.mCurrentDelegate;
        if (drawable == null) {
            return false;
        }
        return drawable.isStateful();
    }

    @Override // com.facebook.drawee.e.s
    public void getTransform(Matrix matrix) {
        getParentTransform(matrix);
    }

    public void invalidateDrawable(Drawable drawable) {
        invalidateSelf();
    }

    @Override // com.facebook.drawee.e.r
    public void setTransformCallback(s sVar) {
        this.mTransformCallback = sVar;
    }

    public void draw(Canvas canvas) {
        Drawable drawable = this.mCurrentDelegate;
        if (drawable != null) {
            drawable.draw(canvas);
        }
    }

    /* access modifiers changed from: protected */
    public void onBoundsChange(Rect rect) {
        Drawable drawable = this.mCurrentDelegate;
        if (drawable != null) {
            drawable.setBounds(rect);
        }
    }

    public Drawable setCurrent(Drawable drawable) {
        Drawable currentWithoutInvalidate = setCurrentWithoutInvalidate(drawable);
        invalidateSelf();
        return currentWithoutInvalidate;
    }

    @Override // com.facebook.drawee.e.c
    public Drawable setDrawable(Drawable drawable) {
        return setCurrent(drawable);
    }

    public g(Drawable drawable) {
        this.mCurrentDelegate = drawable;
        e.a(drawable, this, this);
    }

    public boolean getPadding(Rect rect) {
        Drawable drawable = this.mCurrentDelegate;
        if (drawable == null) {
            return super.getPadding(rect);
        }
        return drawable.getPadding(rect);
    }

    /* access modifiers changed from: protected */
    public void getParentTransform(Matrix matrix) {
        s sVar = this.mTransformCallback;
        if (sVar != null) {
            sVar.getTransform(matrix);
        } else {
            matrix.reset();
        }
    }

    @Override // com.facebook.drawee.e.s
    public void getRootBounds(RectF rectF) {
        s sVar = this.mTransformCallback;
        if (sVar != null) {
            sVar.getRootBounds(rectF);
        } else {
            rectF.set(getBounds());
        }
    }

    public void getTransformedBounds(RectF rectF) {
        Matrix matrix = sTempTransform;
        getParentTransform(matrix);
        rectF.set(getBounds());
        matrix.mapRect(rectF);
    }

    /* access modifiers changed from: protected */
    public boolean onLevelChange(int i2) {
        Drawable drawable = this.mCurrentDelegate;
        if (drawable == null) {
            return super.onLevelChange(i2);
        }
        return drawable.setLevel(i2);
    }

    /* access modifiers changed from: protected */
    public boolean onStateChange(int[] iArr) {
        Drawable drawable = this.mCurrentDelegate;
        if (drawable == null) {
            return super.onStateChange(iArr);
        }
        return drawable.setState(iArr);
    }

    public void setAlpha(int i2) {
        this.mDrawableProperties.f47364a = i2;
        Drawable drawable = this.mCurrentDelegate;
        if (drawable != null) {
            drawable.setAlpha(i2);
        }
    }

    public void setColorFilter(ColorFilter colorFilter) {
        this.mDrawableProperties.a(colorFilter);
        Drawable drawable = this.mCurrentDelegate;
        if (drawable != null) {
            drawable.setColorFilter(colorFilter);
        }
    }

    public void setDither(boolean z) {
        this.mDrawableProperties.a(z);
        Drawable drawable = this.mCurrentDelegate;
        if (drawable != null) {
            drawable.setDither(z);
        }
    }

    public void setFilterBitmap(boolean z) {
        this.mDrawableProperties.b(z);
        Drawable drawable = this.mCurrentDelegate;
        if (drawable != null) {
            drawable.setFilterBitmap(z);
        }
    }

    /* access modifiers changed from: protected */
    public Drawable setCurrentWithoutInvalidate(Drawable drawable) {
        Drawable drawable2 = this.mCurrentDelegate;
        e.a(drawable2, null, null);
        e.a(drawable, null, null);
        e.a(drawable, this.mDrawableProperties);
        e.a(drawable, this);
        e.a(drawable, this, this);
        this.mCurrentDelegate = drawable;
        return drawable2;
    }

    public void unscheduleDrawable(Drawable drawable, Runnable runnable) {
        unscheduleSelf(runnable);
    }

    public void setHotspot(float f2, float f3) {
        Drawable drawable = this.mCurrentDelegate;
        if (drawable != null) {
            drawable.setHotspot(f2, f3);
        }
    }

    public boolean setVisible(boolean z, boolean z2) {
        boolean visible = super.setVisible(z, z2);
        Drawable drawable = this.mCurrentDelegate;
        if (drawable == null) {
            return visible;
        }
        return drawable.setVisible(z, z2);
    }

    public void scheduleDrawable(Drawable drawable, Runnable runnable, long j2) {
        scheduleSelf(runnable, j2);
    }
}
