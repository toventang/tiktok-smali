package com.ss.android.ugc.aweme.themechange.base;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.drawable.ClipDrawable;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.GradientDrawable;
import android.graphics.drawable.LayerDrawable;
import android.os.Build;
import android.util.AttributeSet;
import androidx.core.content.b;
import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.aweme.filter.widget.FilterBeautySeekBar;
import com.ss.android.ugc.tools.view.a;
import com.zhiliaoapp.musically.R;
import h.f.b.l;

public final class AVDmtSeekBar extends FilterBeautySeekBar {

    /* renamed from: h  reason: collision with root package name */
    private ClipDrawable f138684h;

    static {
        Covode.recordClassIndex(90726);
    }

    public AVDmtSeekBar(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, (byte) 0);
    }

    public final boolean hasOverlappingRendering() {
        return false;
    }

    public final void setProgress(int i2) {
        super.setProgress(i2);
        ClipDrawable clipDrawable = this.f138684h;
        if (clipDrawable != null) {
            clipDrawable.setLevel((i2 * 10000) / getMax());
        }
    }

    private /* synthetic */ AVDmtSeekBar(Context context, AttributeSet attributeSet, byte b2) {
        this(context, attributeSet, (char) 0);
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    private AVDmtSeekBar(Context context, AttributeSet attributeSet, char c2) {
        super(context, attributeSet, 16842875);
        boolean z;
        int i2;
        int i3;
        int i4;
        l.d(context, "");
        if (attributeSet != null) {
            TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, new int[]{R.attr.kg, R.attr.kr, R.attr.nt, R.attr.sg, R.attr.u3, R.attr.v1, R.attr.x8, R.attr.x9, R.attr.x_, R.attr.xa, R.attr.xd, R.attr.xe, R.attr.xf, R.attr.xg, R.attr.xh, R.attr.xi, R.attr.xj, R.attr.xk, R.attr.y0, R.attr.y1, R.attr.y2, R.attr.y4, R.attr.z_, R.attr.a2k, R.attr.a3q, R.attr.a61, R.attr.a6b, R.attr.a6k, R.attr.a6p, R.attr.a7e, R.attr.a7f, R.attr.a_v, R.attr.ab4, R.attr.ab8, R.attr.abt, R.attr.abu, R.attr.afv, R.attr.ai9, R.attr.aif, R.attr.aij, R.attr.aio, R.attr.ais, R.attr.aj7, R.attr.ajr, R.attr.asi, R.attr.asq, R.attr.ass});
            l.b(obtainStyledAttributes, "");
            i2 = (int) obtainStyledAttributes.getDimension(31, 0.0f);
            i4 = (int) obtainStyledAttributes.getDimension(41, 0.0f);
            i3 = (int) obtainStyledAttributes.getDimension(40, 0.0f);
            z = obtainStyledAttributes.getBoolean(37, false);
        } else {
            z = false;
            i2 = 0;
            i3 = 0;
            i4 = 0;
        }
        int i5 = c.f138713a;
        GradientDrawable gradientDrawable = new GradientDrawable();
        gradientDrawable.setShape(1);
        gradientDrawable.setColor(i5);
        gradientDrawable.setStroke(0, i5);
        gradientDrawable.setSize(i4, i3);
        setThumb(gradientDrawable);
        if (Build.VERSION.SDK_INT >= 21) {
            setSplitTrack(true);
        }
        int c3 = b.c(getContext(), R.color.bh);
        ClipDrawable clipDrawable = new ClipDrawable(a.a(c3, c3, 0, i2), 3, 1);
        this.f138684h = clipDrawable;
        clipDrawable.setLevel((getProgress() * 10000) / getMax());
        int c4 = b.c(getContext(), R.color.ad);
        Drawable a2 = a.a(c4, c4, 0, i2);
        Drawable[] drawableArr = new Drawable[2];
        l.b(a2, "");
        drawableArr[0] = a2;
        ClipDrawable clipDrawable2 = this.f138684h;
        if (clipDrawable2 == null) {
            l.b();
        }
        drawableArr[1] = clipDrawable2;
        setProgressDrawable(new LayerDrawable(drawableArr));
        if (z) {
            setTextColor(c.a());
        }
    }
}
