package com.ss.android.ugc.aweme.themechange.base;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import com.bytedance.covode.number.Covode;
import com.google.android.material.internal.CheckableImageButton;
import com.ss.android.ugc.aweme.lancet.k;
import com.zhiliaoapp.musically.R;
import h.f.b.l;

public final class AVDmtCheckableImageButton extends CheckableImageButton {

    /* renamed from: a  reason: collision with root package name */
    private Drawable f138657a;

    /* renamed from: b  reason: collision with root package name */
    private Drawable f138658b;

    /* renamed from: c  reason: collision with root package name */
    private boolean f138659c;

    static {
        Covode.recordClassIndex(90716);
    }

    /* access modifiers changed from: protected */
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        k.a(this);
    }

    @Override // com.google.android.material.internal.CheckableImageButton
    public final void toggle() {
        Drawable drawable;
        super.toggle();
        if (isChecked()) {
            drawable = this.f138657a;
        } else {
            drawable = this.f138658b;
        }
        setImageDrawable(drawable);
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public AVDmtCheckableImageButton(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, (byte) 0);
        l.d(context, "");
        l.d(attributeSet, "");
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    private AVDmtCheckableImageButton(Context context, AttributeSet attributeSet, byte b2) {
        super(context, attributeSet, 0);
        l.d(context, "");
        this.f138659c = true;
        if (attributeSet != null) {
            TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, new int[]{R.attr.kg, R.attr.kr, R.attr.nt, R.attr.sg, R.attr.u3, R.attr.v1, R.attr.x8, R.attr.x9, R.attr.x_, R.attr.xa, R.attr.xd, R.attr.xe, R.attr.xf, R.attr.xg, R.attr.xh, R.attr.xi, R.attr.xj, R.attr.xk, R.attr.y0, R.attr.y1, R.attr.y2, R.attr.y4, R.attr.z_, R.attr.a2k, R.attr.a3q, R.attr.a61, R.attr.a6b, R.attr.a6k, R.attr.a6p, R.attr.a7e, R.attr.a7f, R.attr.a_v, R.attr.ab4, R.attr.ab8, R.attr.abt, R.attr.abu, R.attr.afv, R.attr.ai9, R.attr.aif, R.attr.aij, R.attr.aio, R.attr.ais, R.attr.aj7, R.attr.ajr, R.attr.asi, R.attr.asq, R.attr.ass});
            l.b(obtainStyledAttributes, "");
            obtainStyledAttributes.getBoolean(27, false);
            this.f138659c = obtainStyledAttributes.getBoolean(6, true);
            this.f138657a = obtainStyledAttributes.getDrawable(33);
            this.f138658b = obtainStyledAttributes.getDrawable(44);
            if (this.f138659c) {
                this.f138657a = c.a(this.f138657a);
                this.f138658b = c.a(this.f138658b);
            }
            setImageDrawable(this.f138658b);
        }
    }
}
