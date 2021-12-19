package com.ss.android.ugc.aweme.setting.ui;

import android.content.Context;
import android.content.res.TypedArray;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import androidx.core.content.b;
import com.bytedance.common.utility.n;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.bytedance.ies.dmt.ui.common.c;
import com.bytedance.ies.dmt.ui.widget.DmtTextView;
import com.bytedance.ies.dmt.ui.widget.util.d;
import com.zhiliaoapp.musically.R;
import h.f.b.l;

public final class Divider extends LinearLayout {

    /* renamed from: a  reason: collision with root package name */
    private View f122758a;

    /* renamed from: b  reason: collision with root package name */
    private DmtTextView f122759b;

    /* renamed from: c  reason: collision with root package name */
    private View f122760c;

    static {
        Covode.recordClassIndex(80580);
    }

    public Divider(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, (byte) 0);
    }

    public final void setLeftText(CharSequence charSequence) {
        int i2;
        l.d(charSequence, "");
        DmtTextView dmtTextView = this.f122759b;
        if (dmtTextView != null) {
            dmtTextView.setText(charSequence);
        }
        DmtTextView dmtTextView2 = this.f122759b;
        if (dmtTextView2 != null) {
            if (TextUtils.isEmpty(charSequence)) {
                i2 = 8;
            } else {
                i2 = 0;
            }
            dmtTextView2.setVisibility(i2);
        }
    }

    private /* synthetic */ Divider(Context context, AttributeSet attributeSet, byte b2) {
        this(context, attributeSet, (char) 0);
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    private Divider(Context context, AttributeSet attributeSet, char c2) {
        super(context, attributeSet, 0);
        DmtTextView dmtTextView;
        ViewGroup.LayoutParams layoutParams;
        DmtTextView dmtTextView2;
        View view;
        l.d(context, "");
        MethodCollector.i(4250);
        View inflate = View.inflate(context, R.layout.bi0, this);
        this.f122758a = inflate;
        View view2 = null;
        if (inflate != null) {
            dmtTextView = (DmtTextView) inflate.findViewById(R.id.f1u);
        } else {
            dmtTextView = null;
        }
        this.f122759b = dmtTextView;
        View view3 = this.f122758a;
        this.f122760c = view3 != null ? view3.findViewById(R.id.fbk) : view2;
        View view4 = this.f122758a;
        if (view4 != null) {
            view4.setBackgroundColor(b.c(getContext(), R.color.f159928l));
        }
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, new int[]{R.attr.vg, R.attr.xm, R.attr.afb});
        l.b(obtainStyledAttributes, "");
        if (obtainStyledAttributes.getBoolean(0, false) && (view = this.f122760c) != null) {
            view.setVisibility(8);
        }
        View view5 = this.f122760c;
        if (view5 != null) {
            view5.setBackgroundColor(b.c(context, R.color.b2));
        }
        View view6 = this.f122758a;
        if (view6 != null) {
            view6.setBackgroundColor(b.c(context, R.color.f159928l));
        }
        String string = obtainStyledAttributes.getString(2);
        if (!TextUtils.isEmpty(string)) {
            DmtTextView dmtTextView3 = this.f122759b;
            if (dmtTextView3 != null) {
                dmtTextView3.setText(string);
            }
            DmtTextView dmtTextView4 = this.f122759b;
            if (dmtTextView4 != null) {
                dmtTextView4.setFontType(d.f33801g);
            }
        } else {
            DmtTextView dmtTextView5 = this.f122759b;
            if (dmtTextView5 != null) {
                dmtTextView5.setVisibility(8);
            }
            View view7 = this.f122760c;
            if (view7 == null || (layoutParams = view7.getLayoutParams()) == null) {
                NullPointerException nullPointerException = new NullPointerException("null cannot be cast to non-null type android.view.ViewGroup.MarginLayoutParams");
                MethodCollector.o(4250);
                throw nullPointerException;
            }
            ((ViewGroup.MarginLayoutParams) layoutParams).bottomMargin = (int) n.b(getContext(), 8.0f);
        }
        if (obtainStyledAttributes.getBoolean(1, false) && (dmtTextView2 = this.f122759b) != null) {
            dmtTextView2.setAllCaps(true);
        }
        DmtTextView dmtTextView6 = this.f122759b;
        if (dmtTextView6 != null) {
            dmtTextView6.setTextColor(c.b(getContext()));
        }
        obtainStyledAttributes.recycle();
        MethodCollector.o(4250);
    }
}
