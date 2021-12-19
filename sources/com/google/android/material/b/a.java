package com.google.android.material.b;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.GradientDrawable;
import android.graphics.drawable.InsetDrawable;
import android.graphics.drawable.LayerDrawable;
import android.graphics.drawable.RippleDrawable;
import android.os.Build;
import android.util.AttributeSet;
import androidx.appcompat.widget.AppCompatButton;
import androidx.core.h.v;
import androidx.core.widget.h;
import com.bytedance.covode.number.Covode;
import com.google.android.material.internal.k;
import com.google.android.material.internal.l;
import com.zhiliaoapp.musically.R;

public final class a extends AppCompatButton {

    /* renamed from: a  reason: collision with root package name */
    private final c f52218a;

    /* renamed from: b  reason: collision with root package name */
    private int f52219b;

    /* renamed from: c  reason: collision with root package name */
    private PorterDuff.Mode f52220c;

    /* renamed from: e  reason: collision with root package name */
    private ColorStateList f52221e;

    /* renamed from: f  reason: collision with root package name */
    private Drawable f52222f;

    /* renamed from: g  reason: collision with root package name */
    private int f52223g;

    /* renamed from: h  reason: collision with root package name */
    private int f52224h;

    /* renamed from: i  reason: collision with root package name */
    private int f52225i;

    static {
        Covode.recordClassIndex(32443);
    }

    public final Drawable getIcon() {
        return this.f52222f;
    }

    public final int getIconGravity() {
        return this.f52225i;
    }

    public final int getIconPadding() {
        return this.f52219b;
    }

    public final int getIconSize() {
        return this.f52223g;
    }

    public final ColorStateList getIconTint() {
        return this.f52221e;
    }

    public final PorterDuff.Mode getIconTintMode() {
        return this.f52220c;
    }

    public final ColorStateList getBackgroundTintList() {
        return getSupportBackgroundTintList();
    }

    public final PorterDuff.Mode getBackgroundTintMode() {
        return getSupportBackgroundTintMode();
    }

    private boolean b() {
        c cVar = this.f52218a;
        if (cVar == null || cVar.w) {
            return false;
        }
        return true;
    }

    public final int getCornerRadius() {
        if (b()) {
            return this.f52218a.f52232g;
        }
        return 0;
    }

    public final ColorStateList getRippleColor() {
        if (b()) {
            return this.f52218a.f52237l;
        }
        return null;
    }

    public final ColorStateList getStrokeColor() {
        if (b()) {
            return this.f52218a.f52236k;
        }
        return null;
    }

    public final int getStrokeWidth() {
        if (b()) {
            return this.f52218a.f52233h;
        }
        return 0;
    }

    @Override // androidx.core.h.u, androidx.appcompat.widget.AppCompatButton
    public final ColorStateList getSupportBackgroundTintList() {
        if (b()) {
            return this.f52218a.f52235j;
        }
        return super.getSupportBackgroundTintList();
    }

    @Override // androidx.core.h.u, androidx.appcompat.widget.AppCompatButton
    public final PorterDuff.Mode getSupportBackgroundTintMode() {
        if (b()) {
            return this.f52218a.f52234i;
        }
        return super.getSupportBackgroundTintMode();
    }

    private void a() {
        Drawable drawable = this.f52222f;
        if (drawable != null) {
            Drawable mutate = drawable.mutate();
            this.f52222f = mutate;
            androidx.core.graphics.drawable.a.a(mutate, this.f52221e);
            PorterDuff.Mode mode = this.f52220c;
            if (mode != null) {
                androidx.core.graphics.drawable.a.a(this.f52222f, mode);
            }
            int i2 = this.f52223g;
            if (i2 == 0) {
                i2 = this.f52222f.getIntrinsicWidth();
            }
            int i3 = this.f52223g;
            if (i3 == 0) {
                i3 = this.f52222f.getIntrinsicHeight();
            }
            Drawable drawable2 = this.f52222f;
            int i4 = this.f52224h;
            drawable2.setBounds(i4, 0, i2 + i4, i3);
        }
        h.a(this, this.f52222f);
    }

    public final void setBackground(Drawable drawable) {
        setBackgroundDrawable(drawable);
    }

    public final void setBackgroundTintList(ColorStateList colorStateList) {
        setSupportBackgroundTintList(colorStateList);
    }

    public final void setBackgroundTintMode(PorterDuff.Mode mode) {
        setSupportBackgroundTintMode(mode);
    }

    public final void setIconGravity(int i2) {
        this.f52225i = i2;
    }

    /* access modifiers changed from: package-private */
    public final void setInternalBackground(Drawable drawable) {
        super.setBackgroundDrawable(drawable);
    }

    @Override // androidx.appcompat.widget.AppCompatButton
    public final void setBackgroundResource(int i2) {
        Drawable drawable;
        if (i2 != 0) {
            drawable = androidx.appcompat.a.a.a.b(getContext(), i2);
        } else {
            drawable = null;
        }
        setBackgroundDrawable(drawable);
    }

    public final void setIcon(Drawable drawable) {
        if (this.f52222f != drawable) {
            this.f52222f = drawable;
            a();
        }
    }

    public final void setIconPadding(int i2) {
        if (this.f52219b != i2) {
            this.f52219b = i2;
            setCompoundDrawablePadding(i2);
        }
    }

    public final void setIconResource(int i2) {
        Drawable drawable;
        if (i2 != 0) {
            drawable = androidx.appcompat.a.a.a.b(getContext(), i2);
        } else {
            drawable = null;
        }
        setIcon(drawable);
    }

    public final void setIconTint(ColorStateList colorStateList) {
        if (this.f52221e != colorStateList) {
            this.f52221e = colorStateList;
            a();
        }
    }

    public final void setIconTintMode(PorterDuff.Mode mode) {
        if (this.f52220c != mode) {
            this.f52220c = mode;
            a();
        }
    }

    public final void setIconTintResource(int i2) {
        setIconTint(androidx.appcompat.a.a.a.a(getContext(), i2));
    }

    public final void setCornerRadiusResource(int i2) {
        if (b()) {
            setCornerRadius(getResources().getDimensionPixelSize(i2));
        }
    }

    public final void setIconSize(int i2) {
        if (i2 < 0) {
            throw new IllegalArgumentException("iconSize cannot be less than 0");
        } else if (this.f52223g != i2) {
            this.f52223g = i2;
            a();
        }
    }

    public final void setRippleColorResource(int i2) {
        if (b()) {
            setRippleColor(androidx.appcompat.a.a.a.a(getContext(), i2));
        }
    }

    public final void setStrokeColorResource(int i2) {
        if (b()) {
            setStrokeColor(androidx.appcompat.a.a.a.a(getContext(), i2));
        }
    }

    public final void setStrokeWidth(int i2) {
        if (b()) {
            c cVar = this.f52218a;
            if (cVar.f52233h != i2) {
                cVar.f52233h = i2;
                cVar.f52238m.setStrokeWidth((float) i2);
                cVar.c();
            }
        }
    }

    public final void setStrokeWidthResource(int i2) {
        if (b()) {
            setStrokeWidth(getResources().getDimensionPixelSize(i2));
        }
    }

    public final void setBackgroundColor(int i2) {
        if (b()) {
            c cVar = this.f52218a;
            if (c.f52226a && cVar.t != null) {
                cVar.t.setColor(i2);
            } else if (!c.f52226a && cVar.p != null) {
                cVar.p.setColor(i2);
            }
        } else {
            super.setBackgroundColor(i2);
        }
    }

    @Override // androidx.appcompat.widget.AppCompatButton
    public final void setBackgroundDrawable(Drawable drawable) {
        if (b()) {
            if (drawable != getBackground()) {
                c cVar = this.f52218a;
                cVar.w = true;
                cVar.f52227b.setSupportBackgroundTintList(cVar.f52235j);
                cVar.f52227b.setSupportBackgroundTintMode(cVar.f52234i);
            } else {
                getBackground().setState(drawable.getState());
                return;
            }
        }
        super.setBackgroundDrawable(drawable);
    }

    public final void setRippleColor(ColorStateList colorStateList) {
        if (b()) {
            c cVar = this.f52218a;
            if (cVar.f52237l != colorStateList) {
                cVar.f52237l = colorStateList;
                if (c.f52226a && (cVar.f52227b.getBackground() instanceof RippleDrawable)) {
                    ((RippleDrawable) cVar.f52227b.getBackground()).setColor(colorStateList);
                } else if (!c.f52226a && cVar.s != null) {
                    androidx.core.graphics.drawable.a.a(cVar.s, colorStateList);
                }
            }
        }
    }

    public final void setStrokeColor(ColorStateList colorStateList) {
        if (b()) {
            c cVar = this.f52218a;
            if (cVar.f52236k != colorStateList) {
                cVar.f52236k = colorStateList;
                Paint paint = cVar.f52238m;
                int i2 = 0;
                if (colorStateList != null) {
                    i2 = colorStateList.getColorForState(cVar.f52227b.getDrawableState(), 0);
                }
                paint.setColor(i2);
                cVar.c();
            }
        }
    }

    @Override // androidx.core.h.u, androidx.appcompat.widget.AppCompatButton
    public final void setSupportBackgroundTintList(ColorStateList colorStateList) {
        if (b()) {
            c cVar = this.f52218a;
            if (cVar.f52235j != colorStateList) {
                cVar.f52235j = colorStateList;
                if (c.f52226a) {
                    cVar.a();
                } else if (cVar.q != null) {
                    androidx.core.graphics.drawable.a.a(cVar.q, cVar.f52235j);
                }
            }
        } else if (this.f52218a != null) {
            super.setSupportBackgroundTintList(colorStateList);
        }
    }

    @Override // androidx.core.h.u, androidx.appcompat.widget.AppCompatButton
    public final void setSupportBackgroundTintMode(PorterDuff.Mode mode) {
        if (b()) {
            c cVar = this.f52218a;
            if (cVar.f52234i != mode) {
                cVar.f52234i = mode;
                if (c.f52226a) {
                    cVar.a();
                } else if (cVar.q != null && cVar.f52234i != null) {
                    androidx.core.graphics.drawable.a.a(cVar.q, cVar.f52234i);
                }
            }
        } else if (this.f52218a != null) {
            super.setSupportBackgroundTintMode(mode);
        }
    }

    /* access modifiers changed from: protected */
    public final void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        if (Build.VERSION.SDK_INT < 21 && b()) {
            c cVar = this.f52218a;
            if (canvas != null && cVar.f52236k != null && cVar.f52233h > 0) {
                cVar.n.set(cVar.f52227b.getBackground().getBounds());
                cVar.o.set(((float) cVar.n.left) + (((float) cVar.f52233h) / 2.0f) + ((float) cVar.f52228c), ((float) cVar.n.top) + (((float) cVar.f52233h) / 2.0f) + ((float) cVar.f52230e), (((float) cVar.n.right) - (((float) cVar.f52233h) / 2.0f)) - ((float) cVar.f52229d), (((float) cVar.n.bottom) - (((float) cVar.f52233h) / 2.0f)) - ((float) cVar.f52231f));
                float f2 = ((float) cVar.f52232g) - (((float) cVar.f52233h) / 2.0f);
                canvas.drawRoundRect(cVar.o, f2, f2, cVar.f52238m);
            }
        }
    }

    public final void setCornerRadius(int i2) {
        GradientDrawable gradientDrawable;
        if (b()) {
            c cVar = this.f52218a;
            if (cVar.f52232g != i2) {
                cVar.f52232g = i2;
                if (c.f52226a && cVar.t != null && cVar.u != null && cVar.v != null) {
                    if (Build.VERSION.SDK_INT == 21) {
                        GradientDrawable gradientDrawable2 = null;
                        if (!c.f52226a || cVar.f52227b.getBackground() == null) {
                            gradientDrawable = null;
                        } else {
                            gradientDrawable = (GradientDrawable) ((LayerDrawable) ((InsetDrawable) ((RippleDrawable) cVar.f52227b.getBackground()).getDrawable(0)).getDrawable()).getDrawable(0);
                        }
                        float f2 = ((float) i2) + 1.0E-5f;
                        gradientDrawable.setCornerRadius(f2);
                        if (c.f52226a && cVar.f52227b.getBackground() != null) {
                            gradientDrawable2 = (GradientDrawable) ((LayerDrawable) ((InsetDrawable) ((RippleDrawable) cVar.f52227b.getBackground()).getDrawable(0)).getDrawable()).getDrawable(1);
                        }
                        gradientDrawable2.setCornerRadius(f2);
                    }
                    float f3 = ((float) i2) + 1.0E-5f;
                    cVar.t.setCornerRadius(f3);
                    cVar.u.setCornerRadius(f3);
                    cVar.v.setCornerRadius(f3);
                } else if (!c.f52226a && cVar.p != null && cVar.r != null) {
                    float f4 = ((float) i2) + 1.0E-5f;
                    cVar.p.setCornerRadius(f4);
                    cVar.r.setCornerRadius(f4);
                    cVar.f52227b.invalidate();
                }
            }
        }
    }

    public a(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, (byte) 0);
    }

    /* access modifiers changed from: protected */
    public final void onMeasure(int i2, int i3) {
        super.onMeasure(i2, i3);
        if (this.f52222f != null && this.f52225i == 2) {
            int measureText = (int) getPaint().measureText(getText().toString());
            int i4 = this.f52223g;
            if (i4 == 0) {
                i4 = this.f52222f.getIntrinsicWidth();
            }
            int measuredWidth = (((((getMeasuredWidth() - measureText) - v.g(this)) - i4) - this.f52219b) - v.f(this)) / 2;
            if (v.e(this) == 1) {
                measuredWidth = -measuredWidth;
            }
            if (this.f52224h != measuredWidth) {
                this.f52224h = measuredWidth;
                a();
            }
        }
    }

    private a(Context context, AttributeSet attributeSet, byte b2) {
        super(context, attributeSet, R.attr.a4z);
        int i2;
        Drawable a2;
        TypedArray a3 = k.a(context, attributeSet, new int[]{16843191, 16843192, 16843193, 16843194, R.attr.jh, R.attr.ji, R.attr.q1, R.attr.vw, R.attr.w0, R.attr.w2, R.attr.w3, R.attr.w6, R.attr.w7, R.attr.a_a, R.attr.afn, R.attr.afo}, R.attr.a4z, R.style.rp, new int[0]);
        this.f52219b = a3.getDimensionPixelSize(9, 0);
        this.f52220c = l.a(a3.getInt(12, -1), PorterDuff.Mode.SRC_IN);
        this.f52221e = com.google.android.material.f.a.a(getContext(), a3, 11);
        this.f52222f = com.google.android.material.f.a.b(getContext(), a3, 7);
        this.f52225i = a3.getInteger(8, 1);
        this.f52223g = a3.getDimensionPixelSize(10, 0);
        c cVar = new c(this);
        this.f52218a = cVar;
        cVar.f52228c = a3.getDimensionPixelOffset(0, 0);
        cVar.f52229d = a3.getDimensionPixelOffset(1, 0);
        cVar.f52230e = a3.getDimensionPixelOffset(2, 0);
        cVar.f52231f = a3.getDimensionPixelOffset(3, 0);
        cVar.f52232g = a3.getDimensionPixelSize(6, 0);
        cVar.f52233h = a3.getDimensionPixelSize(15, 0);
        cVar.f52234i = l.a(a3.getInt(5, -1), PorterDuff.Mode.SRC_IN);
        cVar.f52235j = com.google.android.material.f.a.a(cVar.f52227b.getContext(), a3, 4);
        cVar.f52236k = com.google.android.material.f.a.a(cVar.f52227b.getContext(), a3, 14);
        cVar.f52237l = com.google.android.material.f.a.a(cVar.f52227b.getContext(), a3, 13);
        cVar.f52238m.setStyle(Paint.Style.STROKE);
        cVar.f52238m.setStrokeWidth((float) cVar.f52233h);
        Paint paint = cVar.f52238m;
        if (cVar.f52236k != null) {
            i2 = cVar.f52236k.getColorForState(cVar.f52227b.getDrawableState(), 0);
        } else {
            i2 = 0;
        }
        paint.setColor(i2);
        int f2 = v.f(cVar.f52227b);
        int paddingTop = cVar.f52227b.getPaddingTop();
        int g2 = v.g(cVar.f52227b);
        int paddingBottom = cVar.f52227b.getPaddingBottom();
        a aVar = cVar.f52227b;
        if (c.f52226a) {
            a2 = cVar.b();
        } else {
            cVar.p = new GradientDrawable();
            cVar.p.setCornerRadius(((float) cVar.f52232g) + 1.0E-5f);
            cVar.p.setColor(-1);
            cVar.q = androidx.core.graphics.drawable.a.e(cVar.p);
            androidx.core.graphics.drawable.a.a(cVar.q, cVar.f52235j);
            if (cVar.f52234i != null) {
                androidx.core.graphics.drawable.a.a(cVar.q, cVar.f52234i);
            }
            cVar.r = new GradientDrawable();
            cVar.r.setCornerRadius(((float) cVar.f52232g) + 1.0E-5f);
            cVar.r.setColor(-1);
            cVar.s = androidx.core.graphics.drawable.a.e(cVar.r);
            androidx.core.graphics.drawable.a.a(cVar.s, cVar.f52237l);
            a2 = cVar.a(new LayerDrawable(new Drawable[]{cVar.q, cVar.s}));
        }
        aVar.setInternalBackground(a2);
        v.a(cVar.f52227b, f2 + cVar.f52228c, paddingTop + cVar.f52230e, g2 + cVar.f52229d, paddingBottom + cVar.f52231f);
        a3.recycle();
        setCompoundDrawablePadding(this.f52219b);
        a();
    }

    @Override // androidx.appcompat.widget.AppCompatButton
    public final void onLayout(boolean z, int i2, int i3, int i4, int i5) {
        c cVar;
        super.onLayout(z, i2, i3, i4, i5);
        if (Build.VERSION.SDK_INT == 21 && (cVar = this.f52218a) != null) {
            int i6 = i5 - i3;
            int i7 = i4 - i2;
            if (cVar.v != null) {
                cVar.v.setBounds(cVar.f52228c, cVar.f52230e, i7 - cVar.f52229d, i6 - cVar.f52231f);
            }
        }
    }
}
