package com.ss.android.ugc.aweme.themechange.base;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.widget.LinearLayout;
import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.tools.a;
import com.ss.android.ugc.tools.utils.r;
import com.zhiliaoapp.musically.R;
import h.f.b.l;

public final class AVDmtHorizontalImageTextLayout extends AVDmtPanelLinearLayout {

    /* renamed from: a  reason: collision with root package name */
    public AVDmtTextView f138660a;

    /* renamed from: b  reason: collision with root package name */
    private AVDmtImageView f138661b;

    /* renamed from: c  reason: collision with root package name */
    private String f138662c;

    /* renamed from: d  reason: collision with root package name */
    private Drawable f138663d;

    /* renamed from: e  reason: collision with root package name */
    private int f138664e;

    /* renamed from: f  reason: collision with root package name */
    private boolean f138665f;

    /* renamed from: g  reason: collision with root package name */
    private boolean f138666g;

    static {
        Covode.recordClassIndex(90717);
    }

    public AVDmtHorizontalImageTextLayout(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, (byte) 0);
    }

    public final AVDmtTextView getAvDmtTextView() {
        AVDmtTextView aVDmtTextView = this.f138660a;
        if (aVDmtTextView == null) {
            l.a("avDmtTextView");
        }
        return aVDmtTextView;
    }

    public final void setAvDmtTextView(AVDmtTextView aVDmtTextView) {
        l.d(aVDmtTextView, "");
        this.f138660a = aVDmtTextView;
    }

    public final void setChangeColor(boolean z) {
        AVDmtImageView aVDmtImageView = this.f138661b;
        if (aVDmtImageView == null) {
            l.a("avDmtImageView");
        }
        aVDmtImageView.setChangeColor(z);
    }

    public final void setTextSize(int i2) {
        AVDmtTextView aVDmtTextView = this.f138660a;
        if (aVDmtTextView == null) {
            l.a("avDmtTextView");
        }
        aVDmtTextView.setTextSize((float) i2);
    }

    public final void setImageRes(int i2) {
        AVDmtImageView aVDmtImageView = this.f138661b;
        if (aVDmtImageView == null) {
            l.a("avDmtImageView");
        }
        Context context = getContext();
        l.b(context, "");
        aVDmtImageView.setImageDrawable(context.getResources().getDrawable(i2));
    }

    public final void setText(String str) {
        if (!TextUtils.isEmpty(str)) {
            AVDmtTextView aVDmtTextView = this.f138660a;
            if (aVDmtTextView == null) {
                l.a("avDmtTextView");
            }
            aVDmtTextView.setText(str);
        }
    }

    private /* synthetic */ AVDmtHorizontalImageTextLayout(Context context, AttributeSet attributeSet, byte b2) {
        this(context, attributeSet, (char) 0);
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    private AVDmtHorizontalImageTextLayout(Context context, AttributeSet attributeSet, char c2) {
        super(context, attributeSet, 0);
        l.d(context, "");
        this.f138666g = true;
        if (attributeSet != null) {
            TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, new int[]{R.attr.kg, R.attr.kr, R.attr.nt, R.attr.sg, R.attr.u3, R.attr.v1, R.attr.x8, R.attr.x9, R.attr.x_, R.attr.xa, R.attr.xd, R.attr.xe, R.attr.xf, R.attr.xg, R.attr.xh, R.attr.xi, R.attr.xj, R.attr.xk, R.attr.y0, R.attr.y1, R.attr.y2, R.attr.y4, R.attr.z_, R.attr.a2k, R.attr.a3q, R.attr.a61, R.attr.a6b, R.attr.a6k, R.attr.a6p, R.attr.a7e, R.attr.a7f, R.attr.a_v, R.attr.ab4, R.attr.ab8, R.attr.abt, R.attr.abu, R.attr.afv, R.attr.ai9, R.attr.aif, R.attr.aij, R.attr.aio, R.attr.ais, R.attr.aj7, R.attr.ajr, R.attr.asi, R.attr.asq, R.attr.ass});
            l.b(obtainStyledAttributes, "");
            this.f138662c = obtainStyledAttributes.getString(42);
            this.f138663d = obtainStyledAttributes.getDrawable(24);
            this.f138664e = (int) obtainStyledAttributes.getDimension(28, 0.0f);
            this.f138665f = obtainStyledAttributes.getBoolean(17, false);
            obtainStyledAttributes.recycle();
        }
        if (this.f138665f) {
            this.f138666g = a.f149054l.f149056a;
        }
        this.f138660a = new AVDmtTextView(context, (AttributeSet) null, 6);
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-2, -2);
        layoutParams.leftMargin = (int) r.a(context, 4.0f);
        layoutParams.gravity = 16;
        AVDmtTextView aVDmtTextView = this.f138660a;
        if (aVDmtTextView == null) {
            l.a("avDmtTextView");
        }
        aVDmtTextView.setLayoutParams(layoutParams);
        this.f138661b = new AVDmtImageView(context, null, 6, (byte) 0);
        LinearLayout.LayoutParams layoutParams2 = new LinearLayout.LayoutParams(-2, -2);
        layoutParams2.gravity = 16;
        if (!this.f138666g) {
            Context context2 = getContext();
            l.b(context2, "");
            int a2 = (int) r.a(context2, 12.0f);
            layoutParams2.rightMargin = a2;
            layoutParams2.leftMargin = a2;
        }
        AVDmtImageView aVDmtImageView = this.f138661b;
        if (aVDmtImageView == null) {
            l.a("avDmtImageView");
        }
        aVDmtImageView.setLayoutParams(layoutParams2);
        AVDmtImageView aVDmtImageView2 = this.f138661b;
        if (aVDmtImageView2 == null) {
            l.a("avDmtImageView");
        }
        addView(aVDmtImageView2);
        AVDmtTextView aVDmtTextView2 = this.f138660a;
        if (aVDmtTextView2 == null) {
            l.a("avDmtTextView");
        }
        addView(aVDmtTextView2);
        int i2 = this.f138664e;
        setPadding(i2, i2, i2, i2);
        setGravity(17);
        AVDmtTextView aVDmtTextView3 = this.f138660a;
        if (aVDmtTextView3 == null) {
            l.a("avDmtTextView");
        }
        aVDmtTextView3.setTextSize(13.0f);
        AVDmtTextView aVDmtTextView4 = this.f138660a;
        if (aVDmtTextView4 == null) {
            l.a("avDmtTextView");
        }
        aVDmtTextView4.setMaxLines(1);
        AVDmtTextView aVDmtTextView5 = this.f138660a;
        if (aVDmtTextView5 == null) {
            l.a("avDmtTextView");
        }
        aVDmtTextView5.setEllipsize(TextUtils.TruncateAt.END);
        AVDmtTextView aVDmtTextView6 = this.f138660a;
        if (aVDmtTextView6 == null) {
            l.a("avDmtTextView");
        }
        aVDmtTextView6.setVisibility(8);
        AVDmtImageView aVDmtImageView3 = this.f138661b;
        if (aVDmtImageView3 == null) {
            l.a("avDmtImageView");
        }
        aVDmtImageView3.setChangeColor(false);
        if (!TextUtils.isEmpty(this.f138662c)) {
            AVDmtTextView aVDmtTextView7 = this.f138660a;
            if (aVDmtTextView7 == null) {
                l.a("avDmtTextView");
            }
            aVDmtTextView7.setText(this.f138662c);
        }
        if (this.f138663d != null) {
            AVDmtImageView aVDmtImageView4 = this.f138661b;
            if (aVDmtImageView4 == null) {
                l.a("avDmtImageView");
            }
            aVDmtImageView4.setImageDrawable(this.f138663d);
        }
        if (this.f138666g) {
            AVDmtTextView aVDmtTextView8 = this.f138660a;
            if (aVDmtTextView8 == null) {
                l.a("avDmtTextView");
            }
            aVDmtTextView8.setVisibility(0);
        }
    }
}
