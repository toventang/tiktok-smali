package com.a.a;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.util.TypedValue;
import android.view.View;
import android.view.ViewGroup;
import android.view.a;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.drawerlayout.widget.DrawerLayout;
import com.a.b.a.a;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.bytedance.tux.input.TuxCompoundIconTextView;
import com.bytedance.tux.input.TuxTextView;
import com.ss.android.ugc.aweme.tux.a.j.f;
import com.zhiliaoapp.musically.R;

public final class e implements com.a.b.e {
    static {
        Covode.recordClassIndex(2010);
    }

    @Override // com.a.b.e
    public final View a(Context context, ViewGroup viewGroup, boolean z) {
        float f2;
        float f3;
        float f4;
        float f5;
        float f6;
        MethodCollector.i(2317);
        Resources resources = context.getResources();
        FrameLayout frameLayout = new FrameLayout(context);
        frameLayout.setId(R.id.cpa);
        ViewGroup.LayoutParams a2 = a.a(viewGroup, -2, -2);
        LinearLayout linearLayout = new LinearLayout(context);
        linearLayout.setBackgroundResource(R.drawable.ng);
        linearLayout.setOrientation(0);
        ViewGroup.LayoutParams layoutParams = new FrameLayout.LayoutParams(-2, -2);
        TuxTextView tuxTextView = new TuxTextView(context);
        tuxTextView.setId(R.id.cpe);
        tuxTextView.setTextColor(resources.getColorStateList(R.color.a9));
        tuxTextView.setCompoundDrawablePadding((int) TypedValue.applyDimension(1, 4.0f, resources.getDisplayMetrics()));
        tuxTextView.setVisibility(8);
        LinearLayout.LayoutParams layoutParams2 = new LinearLayout.LayoutParams(-2, (int) TypedValue.applyDimension(1, 16.0f, resources.getDisplayMetrics()));
        tuxTextView.setGravity(17);
        if (ViewGroup.MarginLayoutParams.class.isInstance(layoutParams2)) {
            ((ViewGroup.MarginLayoutParams) layoutParams2).leftMargin = (int) TypedValue.applyDimension(1, 5.0f, resources.getDisplayMetrics());
        }
        if (ViewGroup.MarginLayoutParams.class.isInstance(layoutParams2)) {
            int i2 = Build.VERSION.SDK_INT;
            layoutParams2.setMarginStart((int) TypedValue.applyDimension(1, 5.0f, resources.getDisplayMetrics()));
        }
        if (ViewGroup.MarginLayoutParams.class.isInstance(layoutParams2)) {
            ((ViewGroup.MarginLayoutParams) layoutParams2).rightMargin = (int) TypedValue.applyDimension(1, 5.0f, resources.getDisplayMetrics());
        }
        if (ViewGroup.MarginLayoutParams.class.isInstance(layoutParams2)) {
            int i3 = Build.VERSION.SDK_INT;
            layoutParams2.setMarginEnd((int) TypedValue.applyDimension(1, 5.0f, resources.getDisplayMetrics()));
        }
        f.a("app:tux_font", new a.c("P2_Semibold"), tuxTextView, layoutParams2);
        tuxTextView.setCompoundDrawablesWithIntrinsicBounds(context.getResources().getDrawable(2131231264), (Drawable) null, (Drawable) null, (Drawable) null);
        f.a(tuxTextView, layoutParams2);
        android.view.a.a(tuxTextView);
        if (tuxTextView.getParent() == null) {
            linearLayout.addView(tuxTextView, layoutParams2);
        }
        TuxTextView tuxTextView2 = new TuxTextView(context);
        tuxTextView2.setId(R.id.cpc);
        tuxTextView2.setTextColor(resources.getColorStateList(R.color.a9));
        tuxTextView2.setCompoundDrawablePadding((int) TypedValue.applyDimension(1, 4.0f, resources.getDisplayMetrics()));
        tuxTextView2.setVisibility(8);
        LinearLayout.LayoutParams layoutParams3 = new LinearLayout.LayoutParams(-2, (int) TypedValue.applyDimension(1, 16.0f, resources.getDisplayMetrics()));
        tuxTextView2.setGravity(17);
        if (ViewGroup.MarginLayoutParams.class.isInstance(layoutParams3)) {
            ((ViewGroup.MarginLayoutParams) layoutParams3).leftMargin = (int) TypedValue.applyDimension(1, 5.0f, resources.getDisplayMetrics());
        }
        if (ViewGroup.MarginLayoutParams.class.isInstance(layoutParams3)) {
            int i4 = Build.VERSION.SDK_INT;
            f2 = 5.0f;
            layoutParams3.setMarginStart((int) TypedValue.applyDimension(1, 5.0f, resources.getDisplayMetrics()));
        } else {
            f2 = 5.0f;
        }
        if (ViewGroup.MarginLayoutParams.class.isInstance(layoutParams3)) {
            ((ViewGroup.MarginLayoutParams) layoutParams3).rightMargin = (int) TypedValue.applyDimension(1, f2, resources.getDisplayMetrics());
        }
        if (ViewGroup.MarginLayoutParams.class.isInstance(layoutParams3)) {
            int i5 = Build.VERSION.SDK_INT;
            layoutParams3.setMarginEnd((int) TypedValue.applyDimension(1, 5.0f, resources.getDisplayMetrics()));
        }
        f.a("app:tux_font", new a.c("P2_Semibold"), tuxTextView2, layoutParams3);
        tuxTextView2.setCompoundDrawablesWithIntrinsicBounds(context.getResources().getDrawable(2131231262), (Drawable) null, (Drawable) null, (Drawable) null);
        f.a(tuxTextView2, layoutParams3);
        android.view.a.a(tuxTextView2);
        if (tuxTextView2.getParent() == null) {
            linearLayout.addView(tuxTextView2, layoutParams3);
        }
        TuxTextView tuxTextView3 = new TuxTextView(context);
        tuxTextView3.setId(R.id.cpb);
        tuxTextView3.setTextColor(resources.getColorStateList(R.color.a9));
        tuxTextView3.setCompoundDrawablePadding((int) TypedValue.applyDimension(1, 4.0f, resources.getDisplayMetrics()));
        tuxTextView3.setVisibility(8);
        LinearLayout.LayoutParams layoutParams4 = new LinearLayout.LayoutParams(-2, (int) TypedValue.applyDimension(1, 16.0f, resources.getDisplayMetrics()));
        tuxTextView3.setGravity(17);
        if (ViewGroup.MarginLayoutParams.class.isInstance(layoutParams4)) {
            ((ViewGroup.MarginLayoutParams) layoutParams4).leftMargin = (int) TypedValue.applyDimension(1, 5.0f, resources.getDisplayMetrics());
        }
        if (ViewGroup.MarginLayoutParams.class.isInstance(layoutParams4)) {
            int i6 = Build.VERSION.SDK_INT;
            f3 = 5.0f;
            layoutParams4.setMarginStart((int) TypedValue.applyDimension(1, 5.0f, resources.getDisplayMetrics()));
        } else {
            f3 = 5.0f;
        }
        if (ViewGroup.MarginLayoutParams.class.isInstance(layoutParams4)) {
            ((ViewGroup.MarginLayoutParams) layoutParams4).rightMargin = (int) TypedValue.applyDimension(1, f3, resources.getDisplayMetrics());
        }
        if (ViewGroup.MarginLayoutParams.class.isInstance(layoutParams4)) {
            int i7 = Build.VERSION.SDK_INT;
            layoutParams4.setMarginEnd((int) TypedValue.applyDimension(1, 5.0f, resources.getDisplayMetrics()));
        }
        f.a("app:tux_font", new a.c("P2_Semibold"), tuxTextView3, layoutParams4);
        tuxTextView3.setCompoundDrawablesWithIntrinsicBounds(context.getResources().getDrawable(2131231261), (Drawable) null, (Drawable) null, (Drawable) null);
        f.a(tuxTextView3, layoutParams4);
        android.view.a.a(tuxTextView3);
        if (tuxTextView3.getParent() == null) {
            linearLayout.addView(tuxTextView3, layoutParams4);
        }
        TuxTextView tuxTextView4 = new TuxTextView(context);
        tuxTextView4.setId(R.id.cpd);
        tuxTextView4.setTextColor(resources.getColorStateList(R.color.a9));
        tuxTextView4.setCompoundDrawablePadding((int) TypedValue.applyDimension(1, 4.0f, resources.getDisplayMetrics()));
        tuxTextView4.setVisibility(8);
        LinearLayout.LayoutParams layoutParams5 = new LinearLayout.LayoutParams(-2, (int) TypedValue.applyDimension(1, 16.0f, resources.getDisplayMetrics()));
        tuxTextView4.setGravity(17);
        if (ViewGroup.MarginLayoutParams.class.isInstance(layoutParams5)) {
            ((ViewGroup.MarginLayoutParams) layoutParams5).leftMargin = (int) TypedValue.applyDimension(1, 5.0f, resources.getDisplayMetrics());
        }
        if (ViewGroup.MarginLayoutParams.class.isInstance(layoutParams5)) {
            int i8 = Build.VERSION.SDK_INT;
            f4 = 5.0f;
            layoutParams5.setMarginStart((int) TypedValue.applyDimension(1, 5.0f, resources.getDisplayMetrics()));
        } else {
            f4 = 5.0f;
        }
        if (ViewGroup.MarginLayoutParams.class.isInstance(layoutParams5)) {
            ((ViewGroup.MarginLayoutParams) layoutParams5).rightMargin = (int) TypedValue.applyDimension(1, f4, resources.getDisplayMetrics());
        }
        if (ViewGroup.MarginLayoutParams.class.isInstance(layoutParams5)) {
            int i9 = Build.VERSION.SDK_INT;
            layoutParams5.setMarginEnd((int) TypedValue.applyDimension(1, 5.0f, resources.getDisplayMetrics()));
        }
        f.a("app:tux_font", new a.c("P2_Semibold"), tuxTextView4, layoutParams5);
        tuxTextView4.setCompoundDrawablesWithIntrinsicBounds(context.getResources().getDrawable(2131231263), (Drawable) null, (Drawable) null, (Drawable) null);
        f.a(tuxTextView4, layoutParams5);
        android.view.a.a(tuxTextView4);
        if (tuxTextView4.getParent() == null) {
            linearLayout.addView(tuxTextView4, layoutParams5);
        }
        TuxTextView tuxTextView5 = new TuxTextView(context);
        tuxTextView5.setId(R.id.cpf);
        tuxTextView5.setTextColor(resources.getColorStateList(R.color.a9));
        tuxTextView5.setCompoundDrawablePadding((int) TypedValue.applyDimension(1, 4.0f, resources.getDisplayMetrics()));
        tuxTextView5.setVisibility(8);
        LinearLayout.LayoutParams layoutParams6 = new LinearLayout.LayoutParams(-2, (int) TypedValue.applyDimension(1, 16.0f, resources.getDisplayMetrics()));
        tuxTextView5.setGravity(17);
        if (ViewGroup.MarginLayoutParams.class.isInstance(layoutParams6)) {
            ((ViewGroup.MarginLayoutParams) layoutParams6).leftMargin = (int) TypedValue.applyDimension(1, 5.0f, resources.getDisplayMetrics());
        }
        if (ViewGroup.MarginLayoutParams.class.isInstance(layoutParams6)) {
            int i10 = Build.VERSION.SDK_INT;
            f5 = 5.0f;
            layoutParams6.setMarginStart((int) TypedValue.applyDimension(1, 5.0f, resources.getDisplayMetrics()));
        } else {
            f5 = 5.0f;
        }
        if (ViewGroup.MarginLayoutParams.class.isInstance(layoutParams6)) {
            ((ViewGroup.MarginLayoutParams) layoutParams6).rightMargin = (int) TypedValue.applyDimension(1, f5, resources.getDisplayMetrics());
        }
        if (ViewGroup.MarginLayoutParams.class.isInstance(layoutParams6)) {
            int i11 = Build.VERSION.SDK_INT;
            layoutParams6.setMarginEnd((int) TypedValue.applyDimension(1, 5.0f, resources.getDisplayMetrics()));
        }
        f.a("app:tux_font", new a.c("P2_Semibold"), tuxTextView5, layoutParams6);
        tuxTextView5.setCompoundDrawablesWithIntrinsicBounds(context.getResources().getDrawable(2131231265), (Drawable) null, (Drawable) null, (Drawable) null);
        f.a(tuxTextView5, layoutParams6);
        android.view.a.a(tuxTextView5);
        if (tuxTextView5.getParent() == null) {
            linearLayout.addView(tuxTextView5, layoutParams6);
        }
        TuxCompoundIconTextView tuxCompoundIconTextView = new TuxCompoundIconTextView(context);
        tuxCompoundIconTextView.setId(R.id.cpg);
        tuxCompoundIconTextView.setTextColor(resources.getColorStateList(R.color.a9));
        tuxCompoundIconTextView.setVisibility(8);
        LinearLayout.LayoutParams layoutParams7 = new LinearLayout.LayoutParams(-2, (int) TypedValue.applyDimension(1, 16.0f, resources.getDisplayMetrics()));
        tuxCompoundIconTextView.setGravity(17);
        if (ViewGroup.MarginLayoutParams.class.isInstance(layoutParams7)) {
            ((ViewGroup.MarginLayoutParams) layoutParams7).leftMargin = (int) TypedValue.applyDimension(1, 5.0f, resources.getDisplayMetrics());
        }
        if (ViewGroup.MarginLayoutParams.class.isInstance(layoutParams7)) {
            int i12 = Build.VERSION.SDK_INT;
            f6 = 5.0f;
            layoutParams7.setMarginStart((int) TypedValue.applyDimension(1, 5.0f, resources.getDisplayMetrics()));
        } else {
            f6 = 5.0f;
        }
        if (ViewGroup.MarginLayoutParams.class.isInstance(layoutParams7)) {
            ((ViewGroup.MarginLayoutParams) layoutParams7).rightMargin = (int) TypedValue.applyDimension(1, f6, resources.getDisplayMetrics());
        }
        if (ViewGroup.MarginLayoutParams.class.isInstance(layoutParams7)) {
            int i13 = Build.VERSION.SDK_INT;
            layoutParams7.setMarginEnd((int) TypedValue.applyDimension(1, 5.0f, resources.getDisplayMetrics()));
        }
        f.a("app:tux_iconPadding", new a.d("4", "dp"), tuxCompoundIconTextView, layoutParams7);
        f.a("app:tux_font", new a.c("P2_Semibold"), tuxCompoundIconTextView, layoutParams7);
        f.a(tuxCompoundIconTextView, layoutParams7);
        android.view.a.a(tuxCompoundIconTextView);
        if (tuxCompoundIconTextView.getParent() == null) {
            linearLayout.addView(tuxCompoundIconTextView, layoutParams7);
        }
        android.view.a.a(linearLayout);
        if (linearLayout.getParent() == null) {
            frameLayout.addView(linearLayout, layoutParams);
        }
        AppCompatImageView appCompatImageView = new AppCompatImageView(context);
        appCompatImageView.setId(R.id.cp_);
        appCompatImageView.setImageResource(2131231245);
        FrameLayout.LayoutParams layoutParams8 = new FrameLayout.LayoutParams(-2, -2);
        if (RelativeLayout.LayoutParams.class.isInstance(layoutParams8)) {
            ((RelativeLayout.LayoutParams) layoutParams8).addRule(9, -1);
        }
        if (RelativeLayout.LayoutParams.class.isInstance(layoutParams8)) {
            ((RelativeLayout.LayoutParams) layoutParams8).addRule(20, -1);
        }
        if (LinearLayout.LayoutParams.class.isInstance(layoutParams8)) {
            ((LinearLayout.LayoutParams) layoutParams8).gravity = 80;
        }
        if (FrameLayout.LayoutParams.class.isInstance(layoutParams8)) {
            layoutParams8.gravity = 80;
        }
        if (DrawerLayout.d.class.isInstance(layoutParams8)) {
            ((DrawerLayout.d) layoutParams8).f2691a = 80;
        }
        android.view.a.a(appCompatImageView);
        if (appCompatImageView.getParent() == null) {
            frameLayout.addView(appCompatImageView, layoutParams8);
        }
        android.view.a.a(frameLayout);
        frameLayout.setLayoutParams(a2);
        if (viewGroup != null && z) {
            viewGroup.addView(frameLayout);
        }
        MethodCollector.o(2317);
        return frameLayout;
    }
}
