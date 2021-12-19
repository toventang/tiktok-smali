package com.bytedance.android.live.design.widget.tintable;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.core.h.u;
import com.bytedance.covode.number.Covode;

public class c extends ConstraintLayout implements u {

    /* renamed from: g  reason: collision with root package name */
    private a f9623g;

    static {
        Covode.recordClassIndex(4878);
    }

    public void drawableStateChanged() {
        super.drawableStateChanged();
        a aVar = this.f9623g;
        if (aVar != null) {
            aVar.b();
        }
    }

    @Override // androidx.core.h.u
    public ColorStateList getSupportBackgroundTintList() {
        a aVar = this.f9623g;
        if (aVar == null) {
            return null;
        }
        return aVar.c();
    }

    @Override // androidx.core.h.u
    public PorterDuff.Mode getSupportBackgroundTintMode() {
        a aVar = this.f9623g;
        if (aVar == null) {
            return null;
        }
        return aVar.d();
    }

    public final void d(int i2) {
        this.f9623g.a(i2);
    }

    @Override // androidx.core.h.u
    public void setSupportBackgroundTintList(ColorStateList colorStateList) {
        a aVar = this.f9623g;
        if (aVar != null) {
            aVar.a(colorStateList);
        }
    }

    @Override // androidx.core.h.u
    public void setSupportBackgroundTintMode(PorterDuff.Mode mode) {
        a aVar = this.f9623g;
        if (aVar != null) {
            aVar.a(mode);
        }
    }

    public void setBackgroundDrawable(Drawable drawable) {
        super.setBackgroundDrawable(drawable);
        a aVar = this.f9623g;
        if (aVar != null) {
            aVar.a(drawable);
        }
    }

    /* access modifiers changed from: protected */
    public boolean verifyDrawable(Drawable drawable) {
        a aVar = this.f9623g;
        if ((aVar == null || !aVar.b(drawable)) && !super.verifyDrawable(drawable)) {
            return false;
        }
        return true;
    }

    public c(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        a(attributeSet, 0);
    }

    private void a(AttributeSet attributeSet, int i2) {
        a aVar = new a(this);
        this.f9623g = aVar;
        aVar.a(attributeSet, i2, 0);
    }

    public c(Context context, AttributeSet attributeSet, int i2) {
        super(context, attributeSet, 0);
        a(attributeSet, 0);
    }
}
