package com.ss.android.ugc.tools.view.style;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.Typeface;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.GradientDrawable;
import android.util.AttributeSet;
import android.widget.TextView;
import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.tools.view.style.b;
import com.zhiliaoapp.musically.R;
import h.f.a.a;
import h.f.b.l;

public final class g {
    static {
        Covode.recordClassIndex(98841);
    }

    public static final void a(TextView textView) {
        l.d(textView, "");
        Typeface a2 = f.a(a.MEDIUM.getFONT_NAME());
        if (a2 != null) {
            textView.setTypeface(a2);
        } else {
            textView.setTypeface(textView.getTypeface(), 1);
        }
    }

    public static final Drawable a(Drawable drawable, int i2) {
        if (drawable == null) {
            return drawable;
        }
        Drawable mutate = drawable.mutate();
        l.b(mutate, "");
        mutate.setColorFilter(new PorterDuffColorFilter(i2, PorterDuff.Mode.SRC_IN));
        return mutate;
    }

    public static final GradientDrawable a(Context context, AttributeSet attributeSet, boolean z) {
        boolean z2;
        float f2;
        boolean z3;
        if (context == null) {
            return null;
        }
        int color = context.getResources().getColor(R.color.u9);
        if (attributeSet != null) {
            TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, new int[]{R.attr.ak9, R.attr.ak_, R.attr.aka, R.attr.akb, R.attr.akc, R.attr.akd, R.attr.ake, R.attr.akf, R.attr.akg, R.attr.akh, R.attr.aki, R.attr.akj, R.attr.akk, R.attr.akl, R.attr.akm, R.attr.akn, R.attr.ako, R.attr.akp, R.attr.akq, R.attr.akr, R.attr.aks, R.attr.akt, R.attr.aku, R.attr.akv, R.attr.akw, R.attr.akx});
            l.b(obtainStyledAttributes, "");
            z2 = obtainStyledAttributes.getBoolean(1, false);
            f2 = obtainStyledAttributes.getDimension(15, 0.0f);
            z3 = obtainStyledAttributes.getBoolean(25, false);
            color = obtainStyledAttributes.getColor(0, color);
            z = obtainStyledAttributes.getBoolean(2, z);
            obtainStyledAttributes.recycle();
        } else {
            z2 = false;
            f2 = 0.0f;
            z3 = false;
        }
        if (!z) {
            return null;
        }
        b a2 = b.a.a().b(color).a(color, 0);
        if (z2) {
            a2.a(1);
        } else {
            a2.a(0);
            if (z3) {
                a2.a(new float[]{f2, f2, f2, f2, 0.0f, 0.0f, 0.0f, 0.0f});
            } else {
                a2.a(f2);
            }
        }
        return a2.a();
    }

    public static final void a(TextView textView, AttributeSet attributeSet, boolean z) {
        int i2;
        boolean z2;
        boolean z3;
        l.d(textView, "");
        if (attributeSet == null) {
            i2 = Integer.MIN_VALUE;
        } else if (z) {
            TypedArray obtainStyledAttributes = textView.getContext().obtainStyledAttributes(attributeSet, new int[]{R.attr.j4, R.attr.j5, R.attr.j6});
            l.b(obtainStyledAttributes, "");
            i2 = obtainStyledAttributes.getInt(0, Integer.MIN_VALUE);
            obtainStyledAttributes.recycle();
        } else {
            TypedArray obtainStyledAttributes2 = textView.getContext().obtainStyledAttributes(attributeSet, new int[]{R.attr.ak9, R.attr.ak_, R.attr.aka, R.attr.akb, R.attr.akc, R.attr.akd, R.attr.ake, R.attr.akf, R.attr.akg, R.attr.akh, R.attr.aki, R.attr.akj, R.attr.akk, R.attr.akl, R.attr.akm, R.attr.akn, R.attr.ako, R.attr.akp, R.attr.akq, R.attr.akr, R.attr.aks, R.attr.akt, R.attr.aku, R.attr.akv, R.attr.akw, R.attr.akx});
            l.b(obtainStyledAttributes2, "");
            i2 = obtainStyledAttributes2.getInt(7, Integer.MIN_VALUE);
            obtainStyledAttributes2.recycle();
        }
        Typeface typeface = null;
        if (i2 != Integer.MIN_VALUE) {
            c cVar = f.f150193a;
            if (cVar != null) {
                typeface = cVar.a(i2);
            }
        } else {
            a<? extends Typeface> aVar = f.f150194b;
            if (aVar != null) {
                typeface = (Typeface) aVar.invoke();
            }
        }
        if (attributeSet != null) {
            if (z) {
                TypedArray obtainStyledAttributes3 = textView.getContext().obtainStyledAttributes(attributeSet, new int[]{R.attr.j4, R.attr.j5, R.attr.j6});
                l.b(obtainStyledAttributes3, "");
                z2 = obtainStyledAttributes3.getBoolean(2, false);
                obtainStyledAttributes3.recycle();
            } else {
                TypedArray obtainStyledAttributes4 = textView.getContext().obtainStyledAttributes(attributeSet, new int[]{R.attr.ak9, R.attr.ak_, R.attr.aka, R.attr.akb, R.attr.akc, R.attr.akd, R.attr.ake, R.attr.akf, R.attr.akg, R.attr.akh, R.attr.aki, R.attr.akj, R.attr.akk, R.attr.akl, R.attr.akm, R.attr.akn, R.attr.ako, R.attr.akp, R.attr.akq, R.attr.akr, R.attr.aks, R.attr.akt, R.attr.aku, R.attr.akv, R.attr.akw, R.attr.akx});
                l.b(obtainStyledAttributes4, "");
                z2 = obtainStyledAttributes4.getBoolean(9, false);
                obtainStyledAttributes4.recycle();
            }
            if (z) {
                TypedArray obtainStyledAttributes5 = textView.getContext().obtainStyledAttributes(attributeSet, new int[]{R.attr.j4, R.attr.j5, R.attr.j6});
                l.b(obtainStyledAttributes5, "");
                z3 = obtainStyledAttributes5.getBoolean(1, false);
                obtainStyledAttributes5.recycle();
            } else {
                TypedArray obtainStyledAttributes6 = textView.getContext().obtainStyledAttributes(attributeSet, new int[]{R.attr.ak9, R.attr.ak_, R.attr.aka, R.attr.akb, R.attr.akc, R.attr.akd, R.attr.ake, R.attr.akf, R.attr.akg, R.attr.akh, R.attr.aki, R.attr.akj, R.attr.akk, R.attr.akl, R.attr.akm, R.attr.akn, R.attr.ako, R.attr.akp, R.attr.akq, R.attr.akr, R.attr.aks, R.attr.akt, R.attr.aku, R.attr.akv, R.attr.akw, R.attr.akx});
                l.b(obtainStyledAttributes6, "");
                z3 = obtainStyledAttributes6.getBoolean(8, false);
                obtainStyledAttributes6.recycle();
            }
            if (typeface != null) {
                if (z2) {
                    textView.setIncludeFontPadding(true);
                }
            } else if (!z3) {
                textView.setIncludeFontPadding(true);
                return;
            } else {
                return;
            }
        } else if (typeface == null) {
            return;
        }
        textView.setTypeface(typeface);
    }
}
