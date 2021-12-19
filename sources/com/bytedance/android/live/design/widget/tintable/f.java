package com.bytedance.android.live.design.widget.tintable;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.widget.RelativeLayout;
import androidx.core.h.u;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;

public class f extends RelativeLayout implements u {

    /* renamed from: a  reason: collision with root package name */
    private a f9626a;

    static {
        Covode.recordClassIndex(4881);
    }

    /* access modifiers changed from: protected */
    public void drawableStateChanged() {
        super.drawableStateChanged();
        a aVar = this.f9626a;
        if (aVar != null) {
            aVar.b();
        }
    }

    @Override // androidx.core.h.u
    public ColorStateList getSupportBackgroundTintList() {
        a aVar = this.f9626a;
        if (aVar == null) {
            return null;
        }
        return aVar.c();
    }

    @Override // androidx.core.h.u
    public PorterDuff.Mode getSupportBackgroundTintMode() {
        a aVar = this.f9626a;
        if (aVar == null) {
            return null;
        }
        return aVar.d();
    }

    @Override // androidx.core.h.u
    public void setSupportBackgroundTintList(ColorStateList colorStateList) {
        a aVar = this.f9626a;
        if (aVar != null) {
            aVar.a(colorStateList);
        }
    }

    @Override // androidx.core.h.u
    public void setSupportBackgroundTintMode(PorterDuff.Mode mode) {
        a aVar = this.f9626a;
        if (aVar != null) {
            aVar.a(mode);
        }
    }

    public void setBackgroundDrawable(Drawable drawable) {
        super.setBackgroundDrawable(drawable);
        a aVar = this.f9626a;
        if (aVar != null) {
            aVar.a(drawable);
        }
    }

    /* access modifiers changed from: protected */
    public boolean verifyDrawable(Drawable drawable) {
        a aVar = this.f9626a;
        if ((aVar == null || !aVar.b(drawable)) && !super.verifyDrawable(drawable)) {
            return false;
        }
        return true;
    }

    public f(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        MethodCollector.i(2217);
        a aVar = new a(this);
        this.f9626a = aVar;
        aVar.a(attributeSet, 0, 0);
        MethodCollector.o(2217);
    }
}
