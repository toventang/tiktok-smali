package com.a.a;

import android.content.Context;
import android.content.res.Resources;
import android.os.Build;
import android.text.TextUtils;
import android.util.TypedValue;
import android.view.View;
import android.view.ViewGroup;
import android.view.a;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import com.a.b.a.a;
import com.a.b.e;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.bytedance.tux.icon.TuxIconView;
import com.bytedance.tux.input.TuxTextView;
import com.ss.android.ugc.aweme.base.ui.SmartAvatarImageView;
import com.ss.android.ugc.aweme.tux.a.j.f;
import com.zhiliaoapp.musically.R;

public final class cf implements e {
    static {
        Covode.recordClassIndex(1996);
    }

    @Override // com.a.b.e
    public final View a(Context context, ViewGroup viewGroup, boolean z) {
        int i2;
        int i3;
        int i4;
        int i5;
        int i6;
        MethodCollector.i(1273);
        Resources resources = context.getResources();
        LinearLayout linearLayout = new LinearLayout(context);
        linearLayout.setVisibility(8);
        ViewGroup.LayoutParams a2 = a.a(viewGroup, (int) TypedValue.applyDimension(1, 270.0f, resources.getDisplayMetrics()), -2);
        RelativeLayout relativeLayout = new RelativeLayout(context);
        relativeLayout.setId(R.id.ayz);
        relativeLayout.setBackgroundResource(R.drawable.a0h);
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams((int) TypedValue.applyDimension(1, 270.0f, resources.getDisplayMetrics()), -2);
        if (ViewGroup.MarginLayoutParams.class.isInstance(layoutParams)) {
            ((ViewGroup.MarginLayoutParams) layoutParams).topMargin = (int) TypedValue.applyDimension(1, 12.0f, resources.getDisplayMetrics());
        }
        SmartAvatarImageView smartAvatarImageView = new SmartAvatarImageView(context);
        smartAvatarImageView.setId(R.id.e2h);
        smartAvatarImageView.setVisibility(0);
        RelativeLayout.LayoutParams layoutParams2 = new RelativeLayout.LayoutParams((int) TypedValue.applyDimension(1, 38.0f, resources.getDisplayMetrics()), (int) TypedValue.applyDimension(1, 38.0f, resources.getDisplayMetrics()));
        if (ViewGroup.MarginLayoutParams.class.isInstance(layoutParams2)) {
            int i7 = Build.VERSION.SDK_INT;
            layoutParams2.setMarginStart((int) TypedValue.applyDimension(1, 10.0f, resources.getDisplayMetrics()));
        }
        if (ViewGroup.MarginLayoutParams.class.isInstance(layoutParams2)) {
            ((ViewGroup.MarginLayoutParams) layoutParams2).leftMargin = (int) TypedValue.applyDimension(1, 10.0f, resources.getDisplayMetrics());
        }
        if (ViewGroup.MarginLayoutParams.class.isInstance(layoutParams2)) {
            ((ViewGroup.MarginLayoutParams) layoutParams2).topMargin = (int) TypedValue.applyDimension(1, 12.0f, resources.getDisplayMetrics());
        }
        if (ViewGroup.MarginLayoutParams.class.isInstance(layoutParams2)) {
            ((ViewGroup.MarginLayoutParams) layoutParams2).bottomMargin = (int) TypedValue.applyDimension(1, 12.0f, resources.getDisplayMetrics());
        }
        a.a(smartAvatarImageView);
        if (smartAvatarImageView.getParent() == null) {
            relativeLayout.addView(smartAvatarImageView, layoutParams2);
        }
        TuxTextView tuxTextView = new TuxTextView(context);
        tuxTextView.setId(R.id.f7_);
        tuxTextView.setEllipsize(TextUtils.TruncateAt.END);
        tuxTextView.setMaxLines(1);
        tuxTextView.setText("yyggpppjjllLL");
        tuxTextView.setTextAlignment(5);
        tuxTextView.setTextColor(resources.getColorStateList(R.color.a9));
        RelativeLayout.LayoutParams layoutParams3 = new RelativeLayout.LayoutParams(-2, (int) TypedValue.applyDimension(1, 20.0f, resources.getDisplayMetrics()));
        if (RelativeLayout.LayoutParams.class.isInstance(layoutParams3)) {
            layoutParams3.addRule(21, -1);
        }
        if (RelativeLayout.LayoutParams.class.isInstance(layoutParams3)) {
            layoutParams3.addRule(9, -1);
        }
        if (RelativeLayout.LayoutParams.class.isInstance(layoutParams3)) {
            layoutParams3.addRule(11, -1);
        }
        if (RelativeLayout.LayoutParams.class.isInstance(layoutParams3)) {
            layoutParams3.addRule(20, -1);
        }
        if (RelativeLayout.LayoutParams.class.isInstance(layoutParams3)) {
            layoutParams3.addRule(10, -1);
        }
        if (ViewGroup.MarginLayoutParams.class.isInstance(layoutParams3)) {
            int i8 = Build.VERSION.SDK_INT;
            layoutParams3.setMarginEnd((int) TypedValue.applyDimension(1, 92.0f, resources.getDisplayMetrics()));
        }
        if (ViewGroup.MarginLayoutParams.class.isInstance(layoutParams3)) {
            ((ViewGroup.MarginLayoutParams) layoutParams3).leftMargin = (int) TypedValue.applyDimension(1, 56.0f, resources.getDisplayMetrics());
        }
        if (ViewGroup.MarginLayoutParams.class.isInstance(layoutParams3)) {
            ((ViewGroup.MarginLayoutParams) layoutParams3).rightMargin = (int) TypedValue.applyDimension(1, 92.0f, resources.getDisplayMetrics());
        }
        if (ViewGroup.MarginLayoutParams.class.isInstance(layoutParams3)) {
            int i9 = Build.VERSION.SDK_INT;
            layoutParams3.setMarginStart((int) TypedValue.applyDimension(1, 56.0f, resources.getDisplayMetrics()));
        }
        if (ViewGroup.MarginLayoutParams.class.isInstance(layoutParams3)) {
            ((ViewGroup.MarginLayoutParams) layoutParams3).topMargin = (int) TypedValue.applyDimension(1, 12.0f, resources.getDisplayMetrics());
        }
        tuxTextView.setGravity(8388611);
        f.a("app:tux_font", new a.c("H4_Bold"), tuxTextView, layoutParams3);
        f.a(tuxTextView, layoutParams3);
        android.view.a.a(tuxTextView);
        if (tuxTextView.getParent() == null) {
            relativeLayout.addView(tuxTextView, layoutParams3);
        }
        TuxTextView tuxTextView2 = new TuxTextView(context);
        tuxTextView2.setId(R.id.f7a);
        tuxTextView2.setEllipsize(TextUtils.TruncateAt.END);
        tuxTextView2.setMaxLines(2);
        tuxTextView2.setText(R.string.g9);
        tuxTextView2.setTextAlignment(5);
        tuxTextView2.setTextColor(resources.getColorStateList(R.color.a9));
        RelativeLayout.LayoutParams layoutParams4 = new RelativeLayout.LayoutParams(-2, -2);
        if (RelativeLayout.LayoutParams.class.isInstance(layoutParams4)) {
            i2 = -1;
            layoutParams4.addRule(21, -1);
        } else {
            i2 = -1;
        }
        if (RelativeLayout.LayoutParams.class.isInstance(layoutParams4)) {
            layoutParams4.addRule(9, i2);
        }
        if (RelativeLayout.LayoutParams.class.isInstance(layoutParams4)) {
            layoutParams4.addRule(11, i2);
        }
        if (RelativeLayout.LayoutParams.class.isInstance(layoutParams4)) {
            layoutParams4.addRule(20, i2);
        }
        if (RelativeLayout.LayoutParams.class.isInstance(layoutParams4)) {
            layoutParams4.addRule(10, i2);
        }
        if (ViewGroup.MarginLayoutParams.class.isInstance(layoutParams4)) {
            ((ViewGroup.MarginLayoutParams) layoutParams4).bottomMargin = (int) TypedValue.applyDimension(1, 14.0f, resources.getDisplayMetrics());
        }
        if (ViewGroup.MarginLayoutParams.class.isInstance(layoutParams4)) {
            int i10 = Build.VERSION.SDK_INT;
            layoutParams4.setMarginEnd((int) TypedValue.applyDimension(1, 93.0f, resources.getDisplayMetrics()));
        }
        if (ViewGroup.MarginLayoutParams.class.isInstance(layoutParams4)) {
            ((ViewGroup.MarginLayoutParams) layoutParams4).leftMargin = (int) TypedValue.applyDimension(1, 56.0f, resources.getDisplayMetrics());
        }
        if (ViewGroup.MarginLayoutParams.class.isInstance(layoutParams4)) {
            ((ViewGroup.MarginLayoutParams) layoutParams4).rightMargin = (int) TypedValue.applyDimension(1, 93.0f, resources.getDisplayMetrics());
        }
        if (ViewGroup.MarginLayoutParams.class.isInstance(layoutParams4)) {
            int i11 = Build.VERSION.SDK_INT;
            layoutParams4.setMarginStart((int) TypedValue.applyDimension(1, 56.0f, resources.getDisplayMetrics()));
        }
        if (ViewGroup.MarginLayoutParams.class.isInstance(layoutParams4)) {
            ((ViewGroup.MarginLayoutParams) layoutParams4).topMargin = (int) TypedValue.applyDimension(1, 34.0f, resources.getDisplayMetrics());
        }
        tuxTextView2.setGravity(8388611);
        f.a("app:tux_font", new a.c("SmallText1_Regular"), tuxTextView2, layoutParams4);
        f.a(tuxTextView2, layoutParams4);
        android.view.a.a(tuxTextView2);
        if (tuxTextView2.getParent() == null) {
            relativeLayout.addView(tuxTextView2, layoutParams4);
        }
        RelativeLayout relativeLayout2 = new RelativeLayout(context);
        relativeLayout2.setId(R.id.ezp);
        relativeLayout2.setBackgroundResource(R.drawable.a1x);
        RelativeLayout.LayoutParams layoutParams5 = new RelativeLayout.LayoutParams((int) TypedValue.applyDimension(1, 72.0f, resources.getDisplayMetrics()), (int) TypedValue.applyDimension(1, 28.0f, resources.getDisplayMetrics()));
        if (RelativeLayout.LayoutParams.class.isInstance(layoutParams5)) {
            i3 = -1;
            layoutParams5.addRule(11, -1);
        } else {
            i3 = -1;
        }
        if (RelativeLayout.LayoutParams.class.isInstance(layoutParams5)) {
            layoutParams5.addRule(21, i3);
        }
        if (ViewGroup.MarginLayoutParams.class.isInstance(layoutParams5)) {
            ((ViewGroup.MarginLayoutParams) layoutParams5).rightMargin = (int) TypedValue.applyDimension(1, 10.0f, resources.getDisplayMetrics());
        }
        if (ViewGroup.MarginLayoutParams.class.isInstance(layoutParams5)) {
            int i12 = Build.VERSION.SDK_INT;
            layoutParams5.setMarginEnd((int) TypedValue.applyDimension(1, 10.0f, resources.getDisplayMetrics()));
        }
        if (RelativeLayout.LayoutParams.class.isInstance(layoutParams5)) {
            layoutParams5.addRule(10, -1);
        }
        if (ViewGroup.MarginLayoutParams.class.isInstance(layoutParams5)) {
            ((ViewGroup.MarginLayoutParams) layoutParams5).topMargin = (int) TypedValue.applyDimension(1, 17.0f, resources.getDisplayMetrics());
        }
        if (RelativeLayout.LayoutParams.class.isInstance(layoutParams5)) {
            layoutParams5.addRule(15, -1);
        }
        TuxTextView tuxTextView3 = new TuxTextView(context);
        tuxTextView3.setId(R.id.b7h);
        tuxTextView3.setMaxLines(1);
        tuxTextView3.setText(R.string.d88);
        tuxTextView3.setAllCaps(false);
        tuxTextView3.setTextColor(resources.getColorStateList(R.color.f159928l));
        tuxTextView3.setAutoSizeTextTypeWithDefaults(1);
        RelativeLayout.LayoutParams layoutParams6 = new RelativeLayout.LayoutParams((int) TypedValue.applyDimension(1, 56.0f, resources.getDisplayMetrics()), (int) TypedValue.applyDimension(1, 18.0f, resources.getDisplayMetrics()));
        if (RelativeLayout.LayoutParams.class.isInstance(layoutParams6)) {
            i4 = -1;
            layoutParams6.addRule(11, -1);
        } else {
            i4 = -1;
        }
        if (RelativeLayout.LayoutParams.class.isInstance(layoutParams6)) {
            layoutParams6.addRule(21, i4);
        }
        if (ViewGroup.MarginLayoutParams.class.isInstance(layoutParams6)) {
            ((ViewGroup.MarginLayoutParams) layoutParams6).rightMargin = (int) TypedValue.applyDimension(1, 8.0f, resources.getDisplayMetrics());
        }
        if (ViewGroup.MarginLayoutParams.class.isInstance(layoutParams6)) {
            int i13 = Build.VERSION.SDK_INT;
            layoutParams6.setMarginEnd((int) TypedValue.applyDimension(1, 8.0f, resources.getDisplayMetrics()));
        }
        if (RelativeLayout.LayoutParams.class.isInstance(layoutParams6)) {
            layoutParams6.addRule(10, -1);
        }
        if (ViewGroup.MarginLayoutParams.class.isInstance(layoutParams6)) {
            ((ViewGroup.MarginLayoutParams) layoutParams6).topMargin = (int) TypedValue.applyDimension(1, 5.0f, resources.getDisplayMetrics());
        }
        if (RelativeLayout.LayoutParams.class.isInstance(layoutParams6)) {
            layoutParams6.addRule(15, -1);
        }
        tuxTextView3.setGravity(17);
        f.a("app:tux_font", new a.c("P1_Semibold"), tuxTextView3, layoutParams6);
        tuxTextView3.setAutoSizeTextTypeUniformWithConfiguration(10, 14, 1, 1);
        f.a(tuxTextView3, layoutParams6);
        android.view.a.a(tuxTextView3);
        if (tuxTextView3.getParent() == null) {
            relativeLayout2.addView(tuxTextView3, layoutParams6);
        }
        android.view.a.a(relativeLayout2);
        if (relativeLayout2.getParent() == null) {
            relativeLayout.addView(relativeLayout2, layoutParams5);
        }
        RelativeLayout relativeLayout3 = new RelativeLayout(context);
        RelativeLayout.LayoutParams layoutParams7 = new RelativeLayout.LayoutParams((int) TypedValue.applyDimension(1, 126.0f, resources.getDisplayMetrics()), -2);
        if (RelativeLayout.LayoutParams.class.isInstance(layoutParams7)) {
            i5 = -1;
            layoutParams7.addRule(21, -1);
        } else {
            i5 = -1;
        }
        if (RelativeLayout.LayoutParams.class.isInstance(layoutParams7)) {
            layoutParams7.addRule(11, i5);
        }
        if (RelativeLayout.LayoutParams.class.isInstance(layoutParams7)) {
            layoutParams7.addRule(15, i5);
        }
        if (ViewGroup.MarginLayoutParams.class.isInstance(layoutParams7)) {
            int i14 = Build.VERSION.SDK_INT;
            layoutParams7.setMarginEnd((int) TypedValue.applyDimension(1, 11.5f, resources.getDisplayMetrics()));
        }
        if (ViewGroup.MarginLayoutParams.class.isInstance(layoutParams7)) {
            ((ViewGroup.MarginLayoutParams) layoutParams7).rightMargin = (int) TypedValue.applyDimension(1, 11.5f, resources.getDisplayMetrics());
        }
        TuxIconView tuxIconView = new TuxIconView(context);
        tuxIconView.setId(R.id.cs2);
        tuxIconView.setAlpha(0.0f);
        RelativeLayout.LayoutParams layoutParams8 = new RelativeLayout.LayoutParams((int) TypedValue.applyDimension(1, 18.0f, resources.getDisplayMetrics()), (int) TypedValue.applyDimension(1, 18.0f, resources.getDisplayMetrics()));
        if (RelativeLayout.LayoutParams.class.isInstance(layoutParams8)) {
            i6 = -1;
            layoutParams8.addRule(21, -1);
        } else {
            i6 = -1;
        }
        if (RelativeLayout.LayoutParams.class.isInstance(layoutParams8)) {
            layoutParams8.addRule(11, i6);
        }
        if (RelativeLayout.LayoutParams.class.isInstance(layoutParams8)) {
            layoutParams8.addRule(15, i6);
        }
        com.ss.android.ugc.aweme.tux.a.j.e.a("app:tux_icon", new a.b("2131755199", "raw"), tuxIconView, layoutParams8);
        com.ss.android.ugc.aweme.tux.a.j.e.a("app:tux_tintColor", new a.b("2130968613", "attr"), tuxIconView, layoutParams8);
        com.ss.android.ugc.aweme.tux.a.j.e.a(tuxIconView, layoutParams8);
        android.view.a.a(tuxIconView);
        if (tuxIconView.getParent() == null) {
            relativeLayout3.addView(tuxIconView, layoutParams8);
        }
        android.view.a.a(relativeLayout3);
        if (relativeLayout3.getParent() == null) {
            relativeLayout.addView(relativeLayout3, layoutParams7);
        }
        android.view.a.a(relativeLayout);
        if (relativeLayout.getParent() == null) {
            linearLayout.addView(relativeLayout, layoutParams);
        }
        android.view.a.a(linearLayout);
        linearLayout.setLayoutParams(a2);
        if (viewGroup != null && z) {
            viewGroup.addView(linearLayout);
        }
        MethodCollector.o(1273);
        return linearLayout;
    }
}
