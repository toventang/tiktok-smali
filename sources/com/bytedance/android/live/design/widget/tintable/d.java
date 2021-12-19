package com.bytedance.android.live.design.widget.tintable;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.widget.FrameLayout;
import androidx.core.h.u;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;

public class d extends FrameLayout implements u {

    /* renamed from: a  reason: collision with root package name */
    private a f9624a;

    static {
        Covode.recordClassIndex(4879);
    }

    /* access modifiers changed from: protected */
    public void drawableStateChanged() {
        super.drawableStateChanged();
        a aVar = this.f9624a;
        if (aVar != null) {
            aVar.b();
        }
    }

    @Override // androidx.core.h.u
    public ColorStateList getSupportBackgroundTintList() {
        a aVar = this.f9624a;
        if (aVar == null) {
            return null;
        }
        return aVar.c();
    }

    @Override // androidx.core.h.u
    public PorterDuff.Mode getSupportBackgroundTintMode() {
        a aVar = this.f9624a;
        if (aVar == null) {
            return null;
        }
        return aVar.d();
    }

    @Override // androidx.core.h.u
    public void setSupportBackgroundTintList(ColorStateList colorStateList) {
        a aVar = this.f9624a;
        if (aVar != null) {
            aVar.a(colorStateList);
        }
    }

    @Override // androidx.core.h.u
    public void setSupportBackgroundTintMode(PorterDuff.Mode mode) {
        a aVar = this.f9624a;
        if (aVar != null) {
            aVar.a(mode);
        }
    }

    public void setBackgroundDrawable(Drawable drawable) {
        super.setBackgroundDrawable(drawable);
        a aVar = this.f9624a;
        if (aVar != null) {
            aVar.a(drawable);
        }
    }

    /* access modifiers changed from: protected */
    public boolean verifyDrawable(Drawable drawable) {
        a aVar = this.f9624a;
        if ((aVar == null || !aVar.b(drawable)) && !super.verifyDrawable(drawable)) {
            return false;
        }
        return true;
    }

    public d(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        MethodCollector.i(3995);
        a(attributeSet, 0);
        MethodCollector.o(3995);
    }

    private void a(AttributeSet attributeSet, int i2) {
        a aVar = new a(this);
        this.f9624a = aVar;
        aVar.a(attributeSet, i2, 0);
    }

    public d(Context context, AttributeSet attributeSet, int i2) {
        super(context, attributeSet, i2);
        MethodCollector.i(4162);
        a(attributeSet, i2);
        MethodCollector.o(4162);
    }
}
