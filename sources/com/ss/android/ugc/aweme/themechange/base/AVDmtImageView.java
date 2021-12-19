package com.ss.android.ugc.aweme.themechange.base;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import androidx.appcompat.widget.AppCompatImageView;
import com.bytedance.covode.number.Covode;
import com.zhiliaoapp.musically.R;
import h.f.b.l;

public class AVDmtImageView extends AppCompatImageView {

    /* renamed from: a  reason: collision with root package name */
    public boolean f138680a;

    /* renamed from: b  reason: collision with root package name */
    private boolean f138681b;

    /* renamed from: c  reason: collision with root package name */
    private int f138682c;

    static {
        Covode.recordClassIndex(90720);
    }

    public AVDmtImageView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 4, (byte) 0);
    }

    public final void setChangeColor(boolean z) {
        this.f138680a = z;
    }

    @Override // androidx.appcompat.widget.AppCompatImageView
    public void setImageDrawable(Drawable drawable) {
        if (this.f138680a) {
            drawable = c.a(drawable, this.f138682c);
        }
        super.setImageDrawable(drawable);
    }

    public void setSelected(boolean z) {
        int a2;
        super.setSelected(z);
        if (z) {
            a2 = c.f138713a;
        } else {
            a2 = c.a();
        }
        this.f138682c = a2;
        setImageDrawable(getDrawable());
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public AVDmtImageView(Context context, AttributeSet attributeSet, int i2) {
        super(context, attributeSet, 0);
        int a2;
        l.d(context, "");
        this.f138680a = true;
        if (attributeSet != null) {
            TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, new int[]{R.attr.kg, R.attr.kr, R.attr.nt, R.attr.sg, R.attr.u3, R.attr.v1, R.attr.x8, R.attr.x9, R.attr.x_, R.attr.xa, R.attr.xd, R.attr.xe, R.attr.xf, R.attr.xg, R.attr.xh, R.attr.xi, R.attr.xj, R.attr.xk, R.attr.y0, R.attr.y1, R.attr.y2, R.attr.y4, R.attr.z_, R.attr.a2k, R.attr.a3q, R.attr.a61, R.attr.a6b, R.attr.a6k, R.attr.a6p, R.attr.a7e, R.attr.a7f, R.attr.a_v, R.attr.ab4, R.attr.ab8, R.attr.abt, R.attr.abu, R.attr.afv, R.attr.ai9, R.attr.aif, R.attr.aij, R.attr.aio, R.attr.ais, R.attr.aj7, R.attr.ajr, R.attr.asi, R.attr.asq, R.attr.ass});
            l.b(obtainStyledAttributes, "");
            this.f138681b = obtainStyledAttributes.getBoolean(27, false);
            this.f138680a = obtainStyledAttributes.getBoolean(6, true);
            if (obtainStyledAttributes.getBoolean(11, true)) {
                a2 = c.f138713a;
            } else {
                a2 = c.a();
            }
            this.f138682c = a2;
        }
        if (this.f138680a) {
            setImageDrawable(c.a(getDrawable(), this.f138682c));
        }
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ AVDmtImageView(Context context, AttributeSet attributeSet, int i2, byte b2) {
        this(context, (i2 & 2) != 0 ? null : attributeSet, 0);
    }
}
