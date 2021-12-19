package com.ss.android.ugc.aweme.tools.beauty.views;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.drawable.GradientDrawable;
import android.util.AttributeSet;
import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.tools.view.style.StyleFrameLayout;
import com.ss.android.ugc.tools.view.style.b;
import com.zhiliaoapp.musically.R;
import h.f.b.l;

public final class BeautyStyleFrameLayout extends StyleFrameLayout {

    /* renamed from: a  reason: collision with root package name */
    private int f139185a;

    static {
        Covode.recordClassIndex(91021);
    }

    public BeautyStyleFrameLayout(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, (byte) 0);
    }

    public final void a(float f2) {
        b a2 = b.a.a().b(this.f139185a).a(this.f139185a, 0);
        a2.a(0);
        a2.a(new float[]{f2, f2, f2, f2, 0.0f, 0.0f, 0.0f, 0.0f});
        setBackground(a2.a());
    }

    private /* synthetic */ BeautyStyleFrameLayout(Context context, AttributeSet attributeSet, byte b2) {
        this(context, attributeSet, (char) 0);
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    private BeautyStyleFrameLayout(Context context, AttributeSet attributeSet, char c2) {
        super(context, attributeSet, 0);
        boolean z;
        float f2;
        boolean z2;
        l.d(context, "");
        this.f139185a = context.getResources().getColor(R.color.u9);
        if (attributeSet != null) {
            TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, new int[]{R.attr.ak9, R.attr.ak_, R.attr.aka, R.attr.akb, R.attr.akc, R.attr.akd, R.attr.ake, R.attr.akf, R.attr.akg, R.attr.akh, R.attr.aki, R.attr.akj, R.attr.akk, R.attr.akl, R.attr.akm, R.attr.akn, R.attr.ako, R.attr.akp, R.attr.akq, R.attr.akr, R.attr.aks, R.attr.akt, R.attr.aku, R.attr.akv, R.attr.akw, R.attr.akx});
            l.b(obtainStyledAttributes, "");
            z = obtainStyledAttributes.getBoolean(1, false);
            f2 = obtainStyledAttributes.getDimension(15, 0.0f);
            z2 = obtainStyledAttributes.getBoolean(25, false);
            this.f139185a = obtainStyledAttributes.getColor(0, this.f139185a);
            boolean z3 = obtainStyledAttributes.getBoolean(2, true);
            obtainStyledAttributes.recycle();
            if (!z3) {
                return;
            }
        } else {
            z = false;
            f2 = 0.0f;
            z2 = false;
        }
        b a2 = b.a.a().b(this.f139185a).a(this.f139185a, 0);
        if (z) {
            a2.a(1);
        } else {
            a2.a(0);
            if (z2) {
                a2.a(new float[]{f2, f2, f2, f2, 0.0f, 0.0f, 0.0f, 0.0f});
            } else {
                a2.a(f2);
            }
        }
        GradientDrawable a3 = a2.a();
        if (a3 != null) {
            setBackground(a3);
        }
    }
}
