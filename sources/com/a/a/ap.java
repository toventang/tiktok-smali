package com.a.a;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Color;
import android.os.Build;
import android.util.TypedValue;
import android.view.View;
import android.view.ViewGroup;
import android.view.a;
import android.widget.RelativeLayout;
import com.a.b.a.a;
import com.a.b.e;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.bytedance.tux.icon.TuxIconView;
import com.bytedance.tux.input.TuxTextView;
import com.ss.android.ugc.aweme.tux.a.j.f;
import com.zhiliaoapp.musically.R;

public final class ap implements e {
    static {
        Covode.recordClassIndex(1952);
    }

    @Override // com.a.b.e
    public final View a(Context context, ViewGroup viewGroup, boolean z) {
        int i2;
        int i3;
        int i4;
        int i5;
        int i6;
        MethodCollector.i(1213);
        Resources resources = context.getResources();
        RelativeLayout relativeLayout = new RelativeLayout(context);
        relativeLayout.setId(R.id.dqi);
        relativeLayout.setVisibility(8);
        relativeLayout.setBackgroundColor(Color.parseColor("#383838"));
        ViewGroup.MarginLayoutParams a2 = a.a(viewGroup, -1, -2);
        TuxIconView tuxIconView = new TuxIconView(context);
        tuxIconView.setId(R.id.ap7);
        tuxIconView.setVisibility(8);
        RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams((int) TypedValue.applyDimension(1, 12.0f, resources.getDisplayMetrics()), (int) TypedValue.applyDimension(1, 12.0f, resources.getDisplayMetrics()));
        if (RelativeLayout.LayoutParams.class.isInstance(layoutParams)) {
            layoutParams.addRule(15, -1);
        }
        if (ViewGroup.MarginLayoutParams.class.isInstance(layoutParams)) {
            int i7 = Build.VERSION.SDK_INT;
            layoutParams.setMarginStart((int) TypedValue.applyDimension(1, 12.0f, resources.getDisplayMetrics()));
        }
        if (ViewGroup.MarginLayoutParams.class.isInstance(layoutParams)) {
            ((ViewGroup.MarginLayoutParams) layoutParams).topMargin = (int) TypedValue.applyDimension(1, 10.0f, resources.getDisplayMetrics());
        }
        if (ViewGroup.MarginLayoutParams.class.isInstance(layoutParams)) {
            ((ViewGroup.MarginLayoutParams) layoutParams).bottomMargin = (int) TypedValue.applyDimension(1, 10.0f, resources.getDisplayMetrics());
        }
        com.ss.android.ugc.aweme.tux.a.j.e.a("app:tux_icon", new a.b("2131755526", "raw"), tuxIconView, layoutParams);
        com.ss.android.ugc.aweme.tux.a.j.e.a("app:tux_tintColor", new a.b("2130968613", "attr"), tuxIconView, layoutParams);
        com.ss.android.ugc.aweme.tux.a.j.e.a(tuxIconView, layoutParams);
        android.view.a.a(tuxIconView);
        if (tuxIconView.getParent() == null) {
            relativeLayout.addView(tuxIconView, layoutParams);
        }
        TuxTextView tuxTextView = new TuxTextView(context);
        tuxTextView.setId(R.id.ap8);
        tuxTextView.setText(R.string.bvj);
        tuxTextView.setTextColor(resources.getColorStateList(R.color.a9));
        tuxTextView.setVisibility(8);
        RelativeLayout.LayoutParams layoutParams2 = new RelativeLayout.LayoutParams(-2, -2);
        if (RelativeLayout.LayoutParams.class.isInstance(layoutParams2)) {
            layoutParams2.addRule(13, -1);
        }
        if (ViewGroup.MarginLayoutParams.class.isInstance(layoutParams2)) {
            ((ViewGroup.MarginLayoutParams) layoutParams2).bottomMargin = (int) TypedValue.applyDimension(1, 10.0f, resources.getDisplayMetrics());
        }
        if (ViewGroup.MarginLayoutParams.class.isInstance(layoutParams2)) {
            int i8 = Build.VERSION.SDK_INT;
            layoutParams2.setMarginEnd((int) TypedValue.applyDimension(1, 4.0f, resources.getDisplayMetrics()));
        }
        if (ViewGroup.MarginLayoutParams.class.isInstance(layoutParams2)) {
            int i9 = Build.VERSION.SDK_INT;
            layoutParams2.setMarginStart((int) TypedValue.applyDimension(1, 4.0f, resources.getDisplayMetrics()));
        }
        if (ViewGroup.MarginLayoutParams.class.isInstance(layoutParams2)) {
            ((ViewGroup.MarginLayoutParams) layoutParams2).topMargin = (int) TypedValue.applyDimension(1, 10.0f, resources.getDisplayMetrics());
        }
        if (RelativeLayout.LayoutParams.class.isInstance(layoutParams2)) {
            i2 = R.id.ap7;
            layoutParams2.addRule(17, R.id.ap7);
        } else {
            i2 = R.id.ap7;
        }
        if (RelativeLayout.LayoutParams.class.isInstance(layoutParams2)) {
            layoutParams2.addRule(1, i2);
        }
        f.a("app:tux_font", new a.c("P2_Regular"), tuxTextView, layoutParams2);
        f.a(tuxTextView, layoutParams2);
        android.view.a.a(tuxTextView);
        if (tuxTextView.getParent() == null) {
            relativeLayout.addView(tuxTextView, layoutParams2);
        }
        TuxTextView tuxTextView2 = new TuxTextView(context);
        tuxTextView2.setId(R.id.ap4);
        tuxTextView2.setText("0%");
        tuxTextView2.setTextColor(resources.getColorStateList(R.color.a9));
        tuxTextView2.setVisibility(8);
        RelativeLayout.LayoutParams layoutParams3 = new RelativeLayout.LayoutParams((int) TypedValue.applyDimension(1, 32.0f, resources.getDisplayMetrics()), -2);
        if (RelativeLayout.LayoutParams.class.isInstance(layoutParams3)) {
            i3 = -1;
            layoutParams3.addRule(9, -1);
        } else {
            i3 = -1;
        }
        if (RelativeLayout.LayoutParams.class.isInstance(layoutParams3)) {
            layoutParams3.addRule(20, i3);
        }
        if (RelativeLayout.LayoutParams.class.isInstance(layoutParams3)) {
            layoutParams3.addRule(13, i3);
        }
        if (ViewGroup.MarginLayoutParams.class.isInstance(layoutParams3)) {
            ((ViewGroup.MarginLayoutParams) layoutParams3).bottomMargin = (int) TypedValue.applyDimension(1, 10.0f, resources.getDisplayMetrics());
        }
        if (ViewGroup.MarginLayoutParams.class.isInstance(layoutParams3)) {
            ((ViewGroup.MarginLayoutParams) layoutParams3).leftMargin = (int) TypedValue.applyDimension(1, 16.0f, resources.getDisplayMetrics());
        }
        if (ViewGroup.MarginLayoutParams.class.isInstance(layoutParams3)) {
            int i10 = Build.VERSION.SDK_INT;
            layoutParams3.setMarginStart((int) TypedValue.applyDimension(1, 16.0f, resources.getDisplayMetrics()));
        }
        if (ViewGroup.MarginLayoutParams.class.isInstance(layoutParams3)) {
            ((ViewGroup.MarginLayoutParams) layoutParams3).topMargin = (int) TypedValue.applyDimension(1, 10.0f, resources.getDisplayMetrics());
        }
        f.a("app:tux_font", new a.c("P2_Regular"), tuxTextView2, layoutParams3);
        f.a(tuxTextView2, layoutParams3);
        android.view.a.a(tuxTextView2);
        if (tuxTextView2.getParent() == null) {
            relativeLayout.addView(tuxTextView2, layoutParams3);
        }
        TuxTextView tuxTextView3 = new TuxTextView(context);
        tuxTextView3.setId(R.id.apc);
        tuxTextView3.setText(R.string.fgh);
        tuxTextView3.setTextColor(resources.getColorStateList(R.color.a9));
        tuxTextView3.setVisibility(8);
        RelativeLayout.LayoutParams layoutParams4 = new RelativeLayout.LayoutParams(-2, -2);
        if (ViewGroup.MarginLayoutParams.class.isInstance(layoutParams4)) {
            ((ViewGroup.MarginLayoutParams) layoutParams4).bottomMargin = (int) TypedValue.applyDimension(1, 10.0f, resources.getDisplayMetrics());
        }
        if (ViewGroup.MarginLayoutParams.class.isInstance(layoutParams4)) {
            int i11 = Build.VERSION.SDK_INT;
            layoutParams4.setMarginEnd((int) TypedValue.applyDimension(1, 16.0f, resources.getDisplayMetrics()));
        }
        if (ViewGroup.MarginLayoutParams.class.isInstance(layoutParams4)) {
            ((ViewGroup.MarginLayoutParams) layoutParams4).rightMargin = (int) TypedValue.applyDimension(1, 16.0f, resources.getDisplayMetrics());
        }
        if (ViewGroup.MarginLayoutParams.class.isInstance(layoutParams4)) {
            ((ViewGroup.MarginLayoutParams) layoutParams4).topMargin = (int) TypedValue.applyDimension(1, 10.0f, resources.getDisplayMetrics());
        }
        if (RelativeLayout.LayoutParams.class.isInstance(layoutParams4)) {
            i4 = R.id.ap4;
            layoutParams4.addRule(17, R.id.ap4);
        } else {
            i4 = R.id.ap4;
        }
        if (RelativeLayout.LayoutParams.class.isInstance(layoutParams4)) {
            layoutParams4.addRule(1, i4);
        }
        f.a("app:tux_font", new a.c("P2_Regular"), tuxTextView3, layoutParams4);
        f.a(tuxTextView3, layoutParams4);
        android.view.a.a(tuxTextView3);
        if (tuxTextView3.getParent() == null) {
            relativeLayout.addView(tuxTextView3, layoutParams4);
        }
        TuxTextView tuxTextView4 = new TuxTextView(context);
        tuxTextView4.setId(R.id.aoy);
        tuxTextView4.setClickable(true);
        tuxTextView4.setFocusable(true);
        tuxTextView4.setText(R.string.bva);
        tuxTextView4.setTextColor(resources.getColorStateList(R.color.a9));
        tuxTextView4.setVisibility(8);
        RelativeLayout.LayoutParams layoutParams5 = new RelativeLayout.LayoutParams(-2, -2);
        if (RelativeLayout.LayoutParams.class.isInstance(layoutParams5)) {
            i5 = -1;
            layoutParams5.addRule(21, -1);
        } else {
            i5 = -1;
        }
        if (RelativeLayout.LayoutParams.class.isInstance(layoutParams5)) {
            layoutParams5.addRule(11, i5);
        }
        if (RelativeLayout.LayoutParams.class.isInstance(layoutParams5)) {
            layoutParams5.addRule(13, i5);
        }
        if (ViewGroup.MarginLayoutParams.class.isInstance(layoutParams5)) {
            ((ViewGroup.MarginLayoutParams) layoutParams5).bottomMargin = (int) TypedValue.applyDimension(1, 10.0f, resources.getDisplayMetrics());
        }
        if (ViewGroup.MarginLayoutParams.class.isInstance(layoutParams5)) {
            int i12 = Build.VERSION.SDK_INT;
            layoutParams5.setMarginEnd((int) TypedValue.applyDimension(1, 16.0f, resources.getDisplayMetrics()));
        }
        if (ViewGroup.MarginLayoutParams.class.isInstance(layoutParams5)) {
            ((ViewGroup.MarginLayoutParams) layoutParams5).topMargin = (int) TypedValue.applyDimension(1, 10.0f, resources.getDisplayMetrics());
        }
        f.a("app:tux_font", new a.c("P2_Regular"), tuxTextView4, layoutParams5);
        f.a(tuxTextView4, layoutParams5);
        android.view.a.a(tuxTextView4);
        if (tuxTextView4.getParent() == null) {
            relativeLayout.addView(tuxTextView4, layoutParams5);
        }
        TuxTextView tuxTextView5 = new TuxTextView(context);
        tuxTextView5.setId(R.id.aoz);
        tuxTextView5.setClickable(true);
        tuxTextView5.setFocusable(true);
        tuxTextView5.setText(R.string.bvc);
        tuxTextView5.setTextColor(resources.getColorStateList(R.color.a9));
        tuxTextView5.setVisibility(8);
        RelativeLayout.LayoutParams layoutParams6 = new RelativeLayout.LayoutParams(-2, -2);
        if (ViewGroup.MarginLayoutParams.class.isInstance(layoutParams6)) {
            ((ViewGroup.MarginLayoutParams) layoutParams6).bottomMargin = (int) TypedValue.applyDimension(1, 10.0f, resources.getDisplayMetrics());
        }
        if (ViewGroup.MarginLayoutParams.class.isInstance(layoutParams6)) {
            int i13 = Build.VERSION.SDK_INT;
            layoutParams6.setMarginEnd((int) TypedValue.applyDimension(1, 16.0f, resources.getDisplayMetrics()));
        }
        if (ViewGroup.MarginLayoutParams.class.isInstance(layoutParams6)) {
            int i14 = Build.VERSION.SDK_INT;
            layoutParams6.setMarginStart((int) TypedValue.applyDimension(1, 16.0f, resources.getDisplayMetrics()));
        }
        if (ViewGroup.MarginLayoutParams.class.isInstance(layoutParams6)) {
            ((ViewGroup.MarginLayoutParams) layoutParams6).topMargin = (int) TypedValue.applyDimension(1, 10.0f, resources.getDisplayMetrics());
        }
        if (RelativeLayout.LayoutParams.class.isInstance(layoutParams6)) {
            i6 = R.id.aoy;
            layoutParams6.addRule(0, R.id.aoy);
        } else {
            i6 = R.id.aoy;
        }
        if (RelativeLayout.LayoutParams.class.isInstance(layoutParams6)) {
            layoutParams6.addRule(16, i6);
        }
        f.a("app:tux_font", new a.c("P2_Regular"), tuxTextView5, layoutParams6);
        f.a(tuxTextView5, layoutParams6);
        android.view.a.a(tuxTextView5);
        if (tuxTextView5.getParent() == null) {
            relativeLayout.addView(tuxTextView5, layoutParams6);
        }
        android.view.a.a(relativeLayout);
        relativeLayout.setLayoutParams(a2);
        if (viewGroup != null && z) {
            viewGroup.addView(relativeLayout);
        }
        MethodCollector.o(1213);
        return relativeLayout;
    }
}
