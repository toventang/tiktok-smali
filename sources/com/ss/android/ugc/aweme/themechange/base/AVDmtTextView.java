package com.ss.android.ugc.aweme.themechange.base;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Typeface;
import android.util.AttributeSet;
import androidx.core.content.b;
import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.tools.a;
import com.ss.android.ugc.tools.view.style.f;
import com.ss.android.ugc.tools.view.widget.AVTextView;
import com.zhiliaoapp.musically.R;
import h.f.b.l;

public final class AVDmtTextView extends AVTextView {

    /* renamed from: a  reason: collision with root package name */
    private boolean f138686a;

    /* renamed from: b  reason: collision with root package name */
    private boolean f138687b;

    /* renamed from: c  reason: collision with root package name */
    private boolean f138688c;

    /* renamed from: e  reason: collision with root package name */
    private boolean f138689e;

    /* renamed from: f  reason: collision with root package name */
    private boolean f138690f;

    /* renamed from: g  reason: collision with root package name */
    private int f138691g;

    /* renamed from: h  reason: collision with root package name */
    private int f138692h;

    /* renamed from: i  reason: collision with root package name */
    private int f138693i;

    /* renamed from: j  reason: collision with root package name */
    private boolean f138694j;

    /* renamed from: k  reason: collision with root package name */
    private Typeface f138695k;

    /* renamed from: l  reason: collision with root package name */
    private boolean f138696l;

    /* renamed from: m  reason: collision with root package name */
    private boolean f138697m;

    static {
        Covode.recordClassIndex(90730);
    }

    public AVDmtTextView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 4);
    }

    public final void a() {
        if (a.f149054l.f149061f) {
            setTextSize(12.0f);
            b();
            return;
        }
        setTextSize(11.0f);
        setTypeface(Typeface.defaultFromStyle(0));
    }

    public final void b() {
        if (this.f138695k == null) {
            this.f138695k = f.a(com.ss.android.ugc.tools.view.style.a.MEDIUM.getFONT_NAME());
        }
        Typeface typeface = this.f138695k;
        if (typeface != null) {
            setTypeface(typeface);
        } else {
            setTypeface(getTypeface(), 1);
        }
    }

    public final void setSelectTextColor(int i2) {
        this.f138691g = i2;
    }

    public final void setStatusTextColor(int i2) {
        this.f138693i = i2;
        a(this.f138697m);
    }

    public final void setOldPanelStyle(boolean z) {
        this.f138686a = z;
        int i2 = c.f138713a;
        this.f138691g = i2;
        int i3 = (16777215 & i2) | Integer.MIN_VALUE;
        this.f138692h = i3;
        if (!this.f138690f) {
            i2 = i3;
        }
        setTextColor(i2);
    }

    public final void setSelected(boolean z) {
        int i2;
        super.setSelected(z);
        if (this.f138689e) {
            if (z) {
                i2 = this.f138691g;
            } else {
                i2 = this.f138692h;
            }
            setTextColor(i2);
        }
    }

    public final void a(boolean z) {
        this.f138697m = z;
        if (!z) {
            setTextColor(this.f138691g);
        } else if (this.f138687b) {
            setTextColor(this.f138693i);
        }
    }

    public final void setEnableUI(boolean z) {
        if (!z) {
            setTextColor(b.c(getContext(), R.color.ac));
        } else if (!this.f138697m) {
            setTextColor(this.f138691g);
        } else if (this.f138687b) {
            setTextColor(this.f138693i);
        }
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ AVDmtTextView(Context context, AttributeSet attributeSet, int i2) {
        this(context, (i2 & 2) != 0 ? null : attributeSet, (byte) 0);
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    private AVDmtTextView(Context context, AttributeSet attributeSet, byte b2) {
        super(context, attributeSet, 0);
        l.d(context, "");
        this.f138687b = true;
        this.f138690f = true;
        this.f138694j = true;
        this.f138695k = f.a(com.ss.android.ugc.tools.view.style.a.MEDIUM.getFONT_NAME());
        if (attributeSet != null) {
            TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, new int[]{R.attr.kg, R.attr.kr, R.attr.nt, R.attr.sg, R.attr.u3, R.attr.v1, R.attr.x8, R.attr.x9, R.attr.x_, R.attr.xa, R.attr.xd, R.attr.xe, R.attr.xf, R.attr.xg, R.attr.xh, R.attr.xi, R.attr.xj, R.attr.xk, R.attr.y0, R.attr.y1, R.attr.y2, R.attr.y4, R.attr.z_, R.attr.a2k, R.attr.a3q, R.attr.a61, R.attr.a6b, R.attr.a6k, R.attr.a6p, R.attr.a7e, R.attr.a7f, R.attr.a_v, R.attr.ab4, R.attr.ab8, R.attr.abt, R.attr.abu, R.attr.afv, R.attr.ai9, R.attr.aif, R.attr.aij, R.attr.aio, R.attr.ais, R.attr.aj7, R.attr.ajr, R.attr.asi, R.attr.asq, R.attr.ass});
            l.b(obtainStyledAttributes, "");
            this.f138686a = obtainStyledAttributes.getBoolean(27, false);
            this.f138687b = obtainStyledAttributes.getBoolean(2, true);
            this.f138688c = obtainStyledAttributes.getBoolean(7, false);
            this.f138689e = obtainStyledAttributes.getBoolean(10, false);
            this.f138690f = obtainStyledAttributes.getBoolean(11, true);
            this.f138694j = obtainStyledAttributes.getBoolean(6, true);
            this.f138696l = obtainStyledAttributes.getBoolean(34, false);
            obtainStyledAttributes.recycle();
        }
        if (this.f138696l) {
            setBackgroundDrawable(c.f138716d.a(context, attributeSet));
        }
        this.f138693i = b.c(getContext(), R.color.bh);
        int i2 = c.f138713a;
        this.f138691g = i2;
        int i3 = (16777215 & i2) | Integer.MIN_VALUE;
        this.f138692h = i3;
        if (this.f138694j) {
            setTextColor(!this.f138690f ? i3 : i2);
        }
    }
}
