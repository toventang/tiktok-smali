package com.a.a;

import android.content.Context;
import android.content.res.Resources;
import android.os.Build;
import android.text.TextUtils;
import android.util.TypedValue;
import android.view.View;
import android.view.ViewGroup;
import android.view.a;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.drawerlayout.widget.DrawerLayout;
import com.a.b.a.a;
import com.a.b.e;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.bytedance.ies.dmt.ui.widget.AutoRTLImageView;
import com.bytedance.tux.input.TuxTextView;
import com.ss.android.ugc.aweme.tux.a.j.f;
import com.zhiliaoapp.musically.R;

public final class t implements e {
    static {
        Covode.recordClassIndex(2025);
    }

    @Override // com.a.b.e
    public final View a(Context context, ViewGroup viewGroup, boolean z) {
        float f2;
        int i2;
        int i3;
        int i4;
        int i5;
        MethodCollector.i(1797);
        Resources resources = context.getResources();
        if (viewGroup == null || !z) {
            IllegalStateException illegalStateException = new IllegalStateException("merge tag container should not be null attach should not be false");
            MethodCollector.o(1797);
            throw illegalStateException;
        }
        AutoRTLImageView autoRTLImageView = new AutoRTLImageView(context);
        autoRTLImageView.setId(R.id.qh);
        autoRTLImageView.setRotation(180.0f);
        androidx.core.widget.e.a(autoRTLImageView, resources.getColorStateList(R.color.c5));
        autoRTLImageView.setImageResource(R.drawable.yq);
        ViewGroup.LayoutParams a2 = a.a(viewGroup, (int) TypedValue.applyDimension(1, 16.0f, resources.getDisplayMetrics()), (int) TypedValue.applyDimension(1, 16.0f, resources.getDisplayMetrics()));
        if (ConstraintLayout.a.class.isInstance(a2)) {
            ((ConstraintLayout.a) a2).f2054k = R.id.dxn;
        }
        if (ConstraintLayout.a.class.isInstance(a2)) {
            ((ConstraintLayout.a) a2).s = 0;
        }
        if (ConstraintLayout.a.class.isInstance(a2)) {
            ((ConstraintLayout.a) a2).f2051h = 0;
        }
        a.a(autoRTLImageView);
        if (autoRTLImageView.getParent() == null) {
            viewGroup.addView(autoRTLImageView, a2);
        }
        TuxTextView tuxTextView = new TuxTextView(context);
        tuxTextView.setId(R.id.dxh);
        tuxTextView.setEllipsize(TextUtils.TruncateAt.END);
        tuxTextView.setMaxLines(1);
        tuxTextView.setTextAlignment(6);
        tuxTextView.setTextColor(resources.getColorStateList(R.color.c5));
        ViewGroup.MarginLayoutParams a3 = a.a(viewGroup, (int) TypedValue.applyDimension(1, 0.0f, resources.getDisplayMetrics()), -2);
        if (LinearLayout.LayoutParams.class.isInstance(a3)) {
            ((LinearLayout.LayoutParams) a3).gravity = 8388613;
        }
        if (FrameLayout.LayoutParams.class.isInstance(a3)) {
            ((FrameLayout.LayoutParams) a3).gravity = 8388613;
        }
        if (DrawerLayout.d.class.isInstance(a3)) {
            ((DrawerLayout.d) a3).f2691a = 8388613;
        }
        if (ViewGroup.MarginLayoutParams.class.isInstance(a3)) {
            int i6 = Build.VERSION.SDK_INT;
            a3.setMarginEnd((int) TypedValue.applyDimension(1, 4.0f, resources.getDisplayMetrics()));
        }
        if (ViewGroup.MarginLayoutParams.class.isInstance(a3)) {
            a3.leftMargin = (int) TypedValue.applyDimension(1, 8.0f, resources.getDisplayMetrics());
        }
        if (ViewGroup.MarginLayoutParams.class.isInstance(a3)) {
            a3.rightMargin = (int) TypedValue.applyDimension(1, 4.0f, resources.getDisplayMetrics());
        }
        if (ViewGroup.MarginLayoutParams.class.isInstance(a3)) {
            int i7 = Build.VERSION.SDK_INT;
            a3.setMarginStart((int) TypedValue.applyDimension(1, 8.0f, resources.getDisplayMetrics()));
        }
        if (LinearLayout.LayoutParams.class.isInstance(a3)) {
            ((LinearLayout.LayoutParams) a3).weight = 1.0f;
        }
        if (ConstraintLayout.a.class.isInstance(a3)) {
            ((ConstraintLayout.a) a3).f2054k = R.id.dxn;
        }
        if (ConstraintLayout.a.class.isInstance(a3)) {
            ((ConstraintLayout.a) a3).r = R.id.dxj;
        }
        if (ConstraintLayout.a.class.isInstance(a3)) {
            ((ConstraintLayout.a) a3).f2048e = R.id.dxn;
        }
        if (ConstraintLayout.a.class.isInstance(a3)) {
            ((ConstraintLayout.a) a3).f2049f = R.id.dxj;
        }
        if (ConstraintLayout.a.class.isInstance(a3)) {
            ((ConstraintLayout.a) a3).p = R.id.dxn;
        }
        if (ConstraintLayout.a.class.isInstance(a3)) {
            ((ConstraintLayout.a) a3).f2051h = R.id.dxn;
        }
        f.a("app:tux_font", new a.c("H4_Regular"), tuxTextView, a3);
        f.a(tuxTextView, a3);
        android.view.a.a(tuxTextView);
        if (tuxTextView.getParent() == null) {
            viewGroup.addView(tuxTextView, a3);
        }
        TuxTextView tuxTextView2 = new TuxTextView(context);
        tuxTextView2.setId(R.id.dxj);
        tuxTextView2.setMaxWidth((int) TypedValue.applyDimension(1, 240.0f, resources.getDisplayMetrics()));
        tuxTextView2.setEllipsize(TextUtils.TruncateAt.END);
        tuxTextView2.setMaxLines(1);
        tuxTextView2.setTextAlignment(6);
        tuxTextView2.setTextColor(resources.getColorStateList(R.color.bx));
        tuxTextView2.setVisibility(8);
        ViewGroup.LayoutParams a4 = android.view.a.a(viewGroup, -2, -2);
        if (LinearLayout.LayoutParams.class.isInstance(a4)) {
            ((LinearLayout.LayoutParams) a4).gravity = 8388613;
        }
        if (FrameLayout.LayoutParams.class.isInstance(a4)) {
            ((FrameLayout.LayoutParams) a4).gravity = 8388613;
        }
        if (DrawerLayout.d.class.isInstance(a4)) {
            ((DrawerLayout.d) a4).f2691a = 8388613;
        }
        if (LinearLayout.LayoutParams.class.isInstance(a4)) {
            ((LinearLayout.LayoutParams) a4).weight = 1.0f;
        }
        if (ConstraintLayout.a.class.isInstance(a4)) {
            ((ConstraintLayout.a) a4).r = R.id.qh;
        }
        if (ConstraintLayout.a.class.isInstance(a4)) {
            ((ConstraintLayout.a) a4).f2048e = R.id.dxh;
        }
        if (ConstraintLayout.a.class.isInstance(a4)) {
            ((ConstraintLayout.a) a4).f2049f = R.id.qh;
        }
        if (ConstraintLayout.a.class.isInstance(a4)) {
            ((ConstraintLayout.a) a4).p = R.id.dxh;
        }
        if (ConstraintLayout.a.class.isInstance(a4)) {
            ((ConstraintLayout.a) a4).f2054k = R.id.dxn;
        }
        if (ConstraintLayout.a.class.isInstance(a4)) {
            ((ConstraintLayout.a) a4).f2051h = R.id.dxn;
        }
        f.a("app:tux_font", new a.c("H4_Semibold"), tuxTextView2, a4);
        f.a(tuxTextView2, a4);
        android.view.a.a(tuxTextView2);
        if (tuxTextView2.getParent() == null) {
            viewGroup.addView(tuxTextView2, a4);
        }
        TuxTextView tuxTextView3 = new TuxTextView(context);
        tuxTextView3.setId(R.id.dxn);
        tuxTextView3.setTextColor(resources.getColorStateList(R.color.bx));
        ViewGroup.MarginLayoutParams a5 = android.view.a.a(viewGroup, -2, -2);
        if (ViewGroup.MarginLayoutParams.class.isInstance(a5)) {
            int i8 = Build.VERSION.SDK_INT;
            f2 = 8.0f;
            a5.setMarginEnd((int) TypedValue.applyDimension(1, 8.0f, resources.getDisplayMetrics()));
        } else {
            f2 = 8.0f;
        }
        if (ViewGroup.MarginLayoutParams.class.isInstance(a5)) {
            a5.rightMargin = (int) TypedValue.applyDimension(1, f2, resources.getDisplayMetrics());
        }
        f.a("app:tux_font", new a.c("H4_Semibold"), tuxTextView3, a5);
        if (ConstraintLayout.a.class.isInstance(a5)) {
            i2 = 0;
            ((ConstraintLayout.a) a5).q = 0;
        } else {
            i2 = 0;
        }
        if (ConstraintLayout.a.class.isInstance(a5)) {
            ((ConstraintLayout.a) a5).f2051h = i2;
        }
        f.a(tuxTextView3, a5);
        android.view.a.a(tuxTextView3);
        if (tuxTextView3.getParent() == null) {
            viewGroup.addView(tuxTextView3, a5);
        }
        TuxTextView tuxTextView4 = new TuxTextView(context);
        tuxTextView4.setId(R.id.dxm);
        tuxTextView4.setTextColor(resources.getColorStateList(R.color.c5));
        tuxTextView4.setVisibility(8);
        ViewGroup.MarginLayoutParams a6 = android.view.a.a(viewGroup, (int) TypedValue.applyDimension(1, 0.0f, resources.getDisplayMetrics()), -2);
        if (ViewGroup.MarginLayoutParams.class.isInstance(a6)) {
            a6.topMargin = (int) TypedValue.applyDimension(1, 9.0f, resources.getDisplayMetrics());
        }
        if (ConstraintLayout.a.class.isInstance(a6)) {
            i3 = 0;
            ((ConstraintLayout.a) a6).s = 0;
        } else {
            i3 = 0;
        }
        if (ConstraintLayout.a.class.isInstance(a6)) {
            ((ConstraintLayout.a) a6).f2050g = i3;
        }
        if (ConstraintLayout.a.class.isInstance(a6)) {
            ((ConstraintLayout.a) a6).q = i3;
        }
        if (ConstraintLayout.a.class.isInstance(a6)) {
            ((ConstraintLayout.a) a6).f2052i = R.id.dxn;
        }
        f.a("app:tux_font", new a.c("P2_Regular"), tuxTextView4, a6);
        f.a(tuxTextView4, a6);
        android.view.a.a(tuxTextView4);
        if (tuxTextView4.getParent() == null) {
            viewGroup.addView(tuxTextView4, a6);
        }
        TuxTextView tuxTextView5 = new TuxTextView(context);
        tuxTextView5.setId(R.id.dxl);
        tuxTextView5.setTextColor(resources.getColorStateList(R.color.c4));
        tuxTextView5.setVisibility(8);
        tuxTextView5.setPadding((int) TypedValue.applyDimension(1, 8.0f, resources.getDisplayMetrics()), (int) TypedValue.applyDimension(1, 8.0f, resources.getDisplayMetrics()), (int) TypedValue.applyDimension(1, 8.0f, resources.getDisplayMetrics()), (int) TypedValue.applyDimension(1, 8.0f, resources.getDisplayMetrics()));
        tuxTextView5.setBackgroundResource(R.drawable.xt);
        ViewGroup.MarginLayoutParams a7 = android.view.a.a(viewGroup, (int) TypedValue.applyDimension(1, 0.0f, resources.getDisplayMetrics()), -2);
        if (ViewGroup.MarginLayoutParams.class.isInstance(a7)) {
            a7.topMargin = (int) TypedValue.applyDimension(1, 8.0f, resources.getDisplayMetrics());
        }
        if (ConstraintLayout.a.class.isInstance(a7)) {
            i4 = 0;
            ((ConstraintLayout.a) a7).s = 0;
        } else {
            i4 = 0;
        }
        if (ConstraintLayout.a.class.isInstance(a7)) {
            ((ConstraintLayout.a) a7).f2050g = i4;
        }
        if (ConstraintLayout.a.class.isInstance(a7)) {
            ((ConstraintLayout.a) a7).q = i4;
        }
        if (ConstraintLayout.a.class.isInstance(a7)) {
            ((ConstraintLayout.a) a7).f2052i = R.id.dxm;
        }
        f.a("app:tux_font", new a.c("P2_Regular"), tuxTextView5, a7);
        f.a(tuxTextView5, a7);
        android.view.a.a(tuxTextView5);
        if (tuxTextView5.getParent() == null) {
            viewGroup.addView(tuxTextView5, a7);
        }
        TuxTextView tuxTextView6 = new TuxTextView(context);
        tuxTextView6.setId(R.id.dxi);
        tuxTextView6.setTextColor(resources.getColorStateList(R.color.c5));
        tuxTextView6.setVisibility(8);
        ViewGroup.MarginLayoutParams a8 = android.view.a.a(viewGroup, (int) TypedValue.applyDimension(1, 0.0f, resources.getDisplayMetrics()), -2);
        if (ViewGroup.MarginLayoutParams.class.isInstance(a8)) {
            a8.topMargin = (int) TypedValue.applyDimension(1, 2.0f, resources.getDisplayMetrics());
        }
        if (ConstraintLayout.a.class.isInstance(a8)) {
            i5 = 0;
            ((ConstraintLayout.a) a8).s = 0;
        } else {
            i5 = 0;
        }
        if (ConstraintLayout.a.class.isInstance(a8)) {
            ((ConstraintLayout.a) a8).f2050g = i5;
        }
        if (ConstraintLayout.a.class.isInstance(a8)) {
            ((ConstraintLayout.a) a8).q = i5;
        }
        if (ConstraintLayout.a.class.isInstance(a8)) {
            ((ConstraintLayout.a) a8).f2052i = R.id.dxl;
        }
        f.a("app:tux_font", new a.c("P3_Regular"), tuxTextView6, a8);
        f.a(tuxTextView6, a8);
        android.view.a.a(tuxTextView6);
        if (tuxTextView6.getParent() == null) {
            viewGroup.addView(tuxTextView6, a8);
        }
        MethodCollector.o(1797);
        return viewGroup;
    }
}
