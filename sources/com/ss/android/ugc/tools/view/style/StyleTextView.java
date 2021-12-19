package com.ss.android.ugc.tools.view.style;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.Typeface;
import android.graphics.drawable.GradientDrawable;
import android.util.AttributeSet;
import android.view.View;
import android.view.accessibility.AccessibilityNodeInfo;
import android.widget.TextView;
import androidx.appcompat.widget.AppCompatTextView;
import com.bytedance.covode.number.Covode;
import com.zhiliaoapp.musically.R;
import h.f.b.l;

public class StyleTextView extends AppCompatTextView {

    /* renamed from: a  reason: collision with root package name */
    private Typeface f150134a;

    static {
        Covode.recordClassIndex(98823);
    }

    public AccessibilityNodeInfo createAccessibilityNodeInfo() {
        try {
            return super.createAccessibilityNodeInfo();
        } catch (Exception e2) {
            e2.printStackTrace();
            return null;
        }
    }

    public boolean performLongClick() {
        try {
            return super.performLongClick();
        } catch (Exception unused) {
            getText();
            return false;
        }
    }

    public String toString() {
        return super.toString() + ", text: " + getText();
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public StyleTextView(Context context) {
        this(context, null);
        l.d(context, "");
    }

    /* access modifiers changed from: protected */
    public void onVisibilityChanged(View view, int i2) {
        l.d(view, "");
        try {
            super.onVisibilityChanged(view, i2);
        } catch (NullPointerException e2) {
            e2.printStackTrace();
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public StyleTextView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        l.d(context, "");
        this.f150134a = f.a(a.MEDIUM.getFONT_NAME());
        a(context, attributeSet);
    }

    private void a(Context context, AttributeSet attributeSet) {
        l.d(context, "");
        g.a((TextView) this, attributeSet, false);
        GradientDrawable a2 = g.a(context, attributeSet, false);
        if (a2 != null) {
            setBackground(a2);
        }
        if (attributeSet != null) {
            TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, new int[]{R.attr.ak9, R.attr.ak_, R.attr.aka, R.attr.akb, R.attr.akc, R.attr.akd, R.attr.ake, R.attr.akf, R.attr.akg, R.attr.akh, R.attr.aki, R.attr.akj, R.attr.akk, R.attr.akl, R.attr.akm, R.attr.akn, R.attr.ako, R.attr.akp, R.attr.akq, R.attr.akr, R.attr.aks, R.attr.akt, R.attr.aku, R.attr.akv, R.attr.akw, R.attr.akx});
            l.b(obtainStyledAttributes, "");
            boolean z = obtainStyledAttributes.getBoolean(4, true);
            ColorStateList colorStateList = obtainStyledAttributes.getColorStateList(19);
            obtainStyledAttributes.recycle();
            if (!z) {
                return;
            }
            if (colorStateList != null) {
                setTextColor(colorStateList);
                return;
            }
        }
        setTextColor(context.getResources().getColor(R.color.ub));
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public StyleTextView(Context context, AttributeSet attributeSet, int i2) {
        super(context, null, 0);
        l.d(context, "");
        this.f150134a = f.a(a.MEDIUM.getFONT_NAME());
        a(context, null);
    }
}
