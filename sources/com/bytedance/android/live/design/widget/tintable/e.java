package com.bytedance.android.live.design.widget.tintable;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.widget.LinearLayout;
import androidx.core.h.u;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.zhiliaoapp.musically.R;

public class e extends LinearLayout implements u {

    /* renamed from: a  reason: collision with root package name */
    private a f9625a;

    static {
        Covode.recordClassIndex(4880);
    }

    /* access modifiers changed from: protected */
    public void drawableStateChanged() {
        super.drawableStateChanged();
        a aVar = this.f9625a;
        if (aVar != null) {
            aVar.b();
        }
    }

    @Override // androidx.core.h.u
    public ColorStateList getSupportBackgroundTintList() {
        a aVar = this.f9625a;
        if (aVar == null) {
            return null;
        }
        return aVar.c();
    }

    @Override // androidx.core.h.u
    public PorterDuff.Mode getSupportBackgroundTintMode() {
        a aVar = this.f9625a;
        if (aVar == null) {
            return null;
        }
        return aVar.d();
    }

    public final void b(int i2) {
        this.f9625a.a(i2);
    }

    @Override // androidx.core.h.u
    public void setSupportBackgroundTintList(ColorStateList colorStateList) {
        a aVar = this.f9625a;
        if (aVar != null) {
            aVar.a(colorStateList);
        }
    }

    @Override // androidx.core.h.u
    public void setSupportBackgroundTintMode(PorterDuff.Mode mode) {
        a aVar = this.f9625a;
        if (aVar != null) {
            aVar.a(mode);
        }
    }

    public void setBackgroundDrawable(Drawable drawable) {
        super.setBackgroundDrawable(drawable);
        a aVar = this.f9625a;
        if (aVar != null) {
            aVar.a(drawable);
        }
    }

    /* access modifiers changed from: protected */
    public boolean verifyDrawable(Drawable drawable) {
        a aVar = this.f9625a;
        if ((aVar == null || !aVar.b(drawable)) && !super.verifyDrawable(drawable)) {
            return false;
        }
        return true;
    }

    public e(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        MethodCollector.i(2235);
        a(attributeSet, 0);
        MethodCollector.o(2235);
    }

    private void a(AttributeSet attributeSet, int i2) {
        a aVar = new a(this);
        this.f9625a = aVar;
        aVar.a(attributeSet, i2, 0);
    }

    public e(Context context, AttributeSet attributeSet, byte b2) {
        super(context, attributeSet, R.attr.a30);
        MethodCollector.i(2594);
        a(attributeSet, R.attr.a30);
        MethodCollector.o(2594);
    }
}
