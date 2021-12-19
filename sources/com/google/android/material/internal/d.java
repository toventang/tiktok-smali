package com.google.android.material.internal;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.Gravity;
import androidx.appcompat.widget.LinearLayoutCompat;
import com.bytedance.covode.number.Covode;
import com.zhiliaoapp.musically.R;

public class d extends LinearLayoutCompat {

    /* renamed from: a  reason: collision with root package name */
    protected boolean f52525a;

    /* renamed from: b  reason: collision with root package name */
    boolean f52526b;

    /* renamed from: c  reason: collision with root package name */
    private Drawable f52527c;

    /* renamed from: d  reason: collision with root package name */
    private final Rect f52528d;

    /* renamed from: e  reason: collision with root package name */
    private final Rect f52529e;

    /* renamed from: h  reason: collision with root package name */
    private int f52530h;

    static {
        Covode.recordClassIndex(32543);
    }

    public Drawable getForeground() {
        return this.f52527c;
    }

    public int getForegroundGravity() {
        return this.f52530h;
    }

    public void jumpDrawablesToCurrentState() {
        super.jumpDrawablesToCurrentState();
        Drawable drawable = this.f52527c;
        if (drawable != null) {
            drawable.jumpToCurrentState();
        }
    }

    /* access modifiers changed from: protected */
    public void drawableStateChanged() {
        super.drawableStateChanged();
        Drawable drawable = this.f52527c;
        if (drawable != null && drawable.isStateful()) {
            this.f52527c.setState(getDrawableState());
        }
    }

    /* access modifiers changed from: protected */
    public boolean verifyDrawable(Drawable drawable) {
        if (super.verifyDrawable(drawable) || drawable == this.f52527c) {
            return true;
        }
        return false;
    }

    public void setForegroundGravity(int i2) {
        if (this.f52530h != i2) {
            if ((8388615 & i2) == 0) {
                i2 |= 8388611;
            }
            if ((i2 & 112) == 0) {
                i2 |= 48;
            }
            this.f52530h = i2;
            if (i2 == 119 && this.f52527c != null) {
                this.f52527c.getPadding(new Rect());
            }
            requestLayout();
        }
    }

    public void draw(Canvas canvas) {
        super.draw(canvas);
        Drawable drawable = this.f52527c;
        if (drawable != null) {
            if (this.f52526b) {
                this.f52526b = false;
                Rect rect = this.f52528d;
                Rect rect2 = this.f52529e;
                int right = getRight() - getLeft();
                int bottom = getBottom() - getTop();
                if (this.f52525a) {
                    rect.set(0, 0, right, bottom);
                } else {
                    rect.set(getPaddingLeft(), getPaddingTop(), right - getPaddingRight(), bottom - getPaddingBottom());
                }
                Gravity.apply(this.f52530h, drawable.getIntrinsicWidth(), drawable.getIntrinsicHeight(), rect, rect2);
                drawable.setBounds(rect2);
            }
            drawable.draw(canvas);
        }
    }

    public void setForeground(Drawable drawable) {
        Drawable drawable2 = this.f52527c;
        if (drawable2 != drawable) {
            if (drawable2 != null) {
                drawable2.setCallback(null);
                unscheduleDrawable(this.f52527c);
            }
            this.f52527c = drawable;
            if (drawable != null) {
                setWillNotDraw(false);
                drawable.setCallback(this);
                if (drawable.isStateful()) {
                    drawable.setState(getDrawableState());
                }
                if (this.f52530h == 119) {
                    drawable.getPadding(new Rect());
                }
            } else {
                setWillNotDraw(true);
            }
            requestLayout();
            invalidate();
        }
    }

    public d(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, (byte) 0);
    }

    public void drawableHotspotChanged(float f2, float f3) {
        super.drawableHotspotChanged(f2, f3);
        Drawable drawable = this.f52527c;
        if (drawable != null) {
            drawable.setHotspot(f2, f3);
        }
    }

    public d(Context context, AttributeSet attributeSet, byte b2) {
        super(context, attributeSet, 0);
        this.f52528d = new Rect();
        this.f52529e = new Rect();
        this.f52530h = 119;
        this.f52525a = true;
        this.f52526b = false;
        TypedArray a2 = k.a(context, attributeSet, new int[]{16843017, 16843264, R.attr.ux}, 0, 0, new int[0]);
        this.f52530h = a2.getInt(1, this.f52530h);
        Drawable drawable = a2.getDrawable(0);
        if (drawable != null) {
            setForeground(drawable);
        }
        this.f52525a = a2.getBoolean(2, true);
        a2.recycle();
    }

    /* access modifiers changed from: protected */
    public void onSizeChanged(int i2, int i3, int i4, int i5) {
        super.onSizeChanged(i2, i3, i4, i5);
        this.f52526b = true;
    }

    @Override // androidx.appcompat.widget.LinearLayoutCompat
    public void onLayout(boolean z, int i2, int i3, int i4, int i5) {
        super.onLayout(z, i2, i3, i4, i5);
        this.f52526b = z | this.f52526b;
    }
}
