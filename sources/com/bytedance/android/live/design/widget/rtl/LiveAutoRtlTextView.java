package com.bytedance.android.live.design.widget.rtl;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import androidx.core.graphics.drawable.a;
import androidx.core.widget.h;
import com.bytedance.android.live.design.widget.LiveTextView;
import com.bytedance.covode.number.Covode;

public class LiveAutoRtlTextView extends LiveTextView {
    static {
        Covode.recordClassIndex(4867);
    }

    private void a() {
        Drawable background = getBackground();
        if (background != null && !a.a(background)) {
            background.mutate();
            a.a(background, true);
        }
    }

    private void b() {
        Drawable[] compoundDrawables = getCompoundDrawables();
        for (Drawable drawable : compoundDrawables) {
            if (drawable != null && !a.a(drawable)) {
                drawable.mutate();
                a.a(drawable, true);
            }
        }
    }

    private void c() {
        Drawable[] b2 = h.b(this);
        for (Drawable drawable : b2) {
            if (drawable != null && !a.a(drawable)) {
                drawable.mutate();
                a.a(drawable, true);
            }
        }
    }

    @Override // androidx.appcompat.widget.AppCompatTextView
    public void setBackgroundDrawable(Drawable drawable) {
        super.setBackgroundDrawable(drawable);
        a();
    }

    public LiveAutoRtlTextView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        a();
        b();
        c();
    }

    public void setCompoundDrawables(Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4) {
        super.setCompoundDrawables(drawable, drawable2, drawable3, drawable4);
        b();
    }

    public void setCompoundDrawablesRelative(Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4) {
        super.setCompoundDrawablesRelative(drawable, drawable2, drawable3, drawable4);
        c();
    }
}
