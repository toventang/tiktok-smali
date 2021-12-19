package com.a.a;

import android.content.Context;
import android.content.res.Resources;
import android.os.Build;
import android.util.TypedValue;
import android.view.View;
import android.view.ViewGroup;
import android.view.a;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;
import androidx.drawerlayout.widget.DrawerLayout;
import com.a.b.a.a;
import com.a.b.e;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.bytedance.tux.input.TuxTextView;
import com.ss.android.ugc.aweme.base.ui.CircleImageView;
import com.ss.android.ugc.aweme.tux.a.j.f;
import com.zhiliaoapp.musically.R;

public final class ca implements e {
    static {
        Covode.recordClassIndex(1991);
    }

    @Override // com.a.b.e
    public final View a(Context context, ViewGroup viewGroup, boolean z) {
        MethodCollector.i(2938);
        Resources resources = context.getResources();
        LinearLayout linearLayout = new LinearLayout(context);
        linearLayout.setOrientation(0);
        ViewGroup.LayoutParams a2 = a.a(viewGroup, -2, -2);
        TuxTextView tuxTextView = new TuxTextView(context);
        tuxTextView.setPadding((int) TypedValue.applyDimension(1, 12.0f, resources.getDisplayMetrics()), tuxTextView.getPaddingTop(), tuxTextView.getPaddingRight(), tuxTextView.getPaddingBottom());
        tuxTextView.setPadding(tuxTextView.getPaddingLeft(), tuxTextView.getPaddingTop(), (int) TypedValue.applyDimension(1, 12.0f, resources.getDisplayMetrics()), tuxTextView.getPaddingBottom());
        if (TextView.class.isInstance(tuxTextView)) {
            a.a(tuxTextView, (int) TypedValue.applyDimension(1, 53.0f, resources.getDisplayMetrics()));
        } else {
            tuxTextView.setMinimumWidth((int) TypedValue.applyDimension(1, 53.0f, resources.getDisplayMetrics()));
        }
        tuxTextView.setLines(1);
        tuxTextView.setAlpha(0.6f);
        tuxTextView.setTextColor(resources.getColorStateList(R.color.f159928l));
        tuxTextView.setId(16908308);
        tuxTextView.setText(R.string.gk2);
        tuxTextView.setVisibility(0);
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-2, (int) TypedValue.applyDimension(1, 58.0f, resources.getDisplayMetrics()));
        tuxTextView.setGravity(17);
        if (RelativeLayout.LayoutParams.class.isInstance(layoutParams)) {
            ((RelativeLayout.LayoutParams) layoutParams).addRule(15, -1);
        }
        if (LinearLayout.LayoutParams.class.isInstance(layoutParams)) {
            layoutParams.gravity = 17;
        }
        if (FrameLayout.LayoutParams.class.isInstance(layoutParams)) {
            ((FrameLayout.LayoutParams) layoutParams).gravity = 17;
        }
        if (DrawerLayout.d.class.isInstance(layoutParams)) {
            ((DrawerLayout.d) layoutParams).f2691a = 17;
        }
        f.a("app:tux_font", new a.c("H3_Semibold"), tuxTextView, layoutParams);
        f.a(tuxTextView, layoutParams);
        android.view.a.a(tuxTextView);
        if (tuxTextView.getParent() == null) {
            linearLayout.addView(tuxTextView, layoutParams);
        }
        FrameLayout frameLayout = new FrameLayout(context);
        frameLayout.setId(R.id.b8k);
        if (TextView.class.isInstance(frameLayout)) {
            android.view.a.a(frameLayout, (int) TypedValue.applyDimension(1, 53.0f, resources.getDisplayMetrics()));
        } else {
            frameLayout.setMinimumWidth((int) TypedValue.applyDimension(1, 53.0f, resources.getDisplayMetrics()));
        }
        frameLayout.setPadding((int) TypedValue.applyDimension(1, 12.0f, resources.getDisplayMetrics()), frameLayout.getPaddingTop(), frameLayout.getPaddingRight(), frameLayout.getPaddingBottom());
        frameLayout.setPadding(frameLayout.getPaddingLeft(), frameLayout.getPaddingTop(), (int) TypedValue.applyDimension(1, 12.0f, resources.getDisplayMetrics()), frameLayout.getPaddingBottom());
        frameLayout.setVisibility(8);
        LinearLayout.LayoutParams layoutParams2 = new LinearLayout.LayoutParams(-2, -2);
        if (LinearLayout.LayoutParams.class.isInstance(layoutParams2)) {
            layoutParams2.gravity = 17;
        }
        if (FrameLayout.LayoutParams.class.isInstance(layoutParams2)) {
            ((FrameLayout.LayoutParams) layoutParams2).gravity = 17;
        }
        if (DrawerLayout.d.class.isInstance(layoutParams2)) {
            ((DrawerLayout.d) layoutParams2).f2691a = 17;
        }
        CircleImageView circleImageView = new CircleImageView(context);
        circleImageView.setId(R.id.bvw);
        FrameLayout.LayoutParams layoutParams3 = new FrameLayout.LayoutParams((int) TypedValue.applyDimension(1, 24.0f, resources.getDisplayMetrics()), (int) TypedValue.applyDimension(1, 24.0f, resources.getDisplayMetrics()));
        if (ViewGroup.MarginLayoutParams.class.isInstance(layoutParams3)) {
            int i2 = Build.VERSION.SDK_INT;
            layoutParams3.setMarginStart((int) TypedValue.applyDimension(1, 32.0f, resources.getDisplayMetrics()));
        }
        if (ViewGroup.MarginLayoutParams.class.isInstance(layoutParams3)) {
            ((ViewGroup.MarginLayoutParams) layoutParams3).leftMargin = (int) TypedValue.applyDimension(1, 32.0f, resources.getDisplayMetrics());
        }
        android.view.a.a(circleImageView);
        if (circleImageView.getParent() == null) {
            frameLayout.addView(circleImageView, layoutParams3);
        }
        CircleImageView circleImageView2 = new CircleImageView(context);
        circleImageView2.setId(R.id.bvv);
        FrameLayout.LayoutParams layoutParams4 = new FrameLayout.LayoutParams((int) TypedValue.applyDimension(1, 24.0f, resources.getDisplayMetrics()), (int) TypedValue.applyDimension(1, 24.0f, resources.getDisplayMetrics()));
        if (ViewGroup.MarginLayoutParams.class.isInstance(layoutParams4)) {
            int i3 = Build.VERSION.SDK_INT;
            layoutParams4.setMarginStart((int) TypedValue.applyDimension(1, 16.0f, resources.getDisplayMetrics()));
        }
        if (ViewGroup.MarginLayoutParams.class.isInstance(layoutParams4)) {
            ((ViewGroup.MarginLayoutParams) layoutParams4).leftMargin = (int) TypedValue.applyDimension(1, 16.0f, resources.getDisplayMetrics());
        }
        android.view.a.a(circleImageView2);
        if (circleImageView2.getParent() == null) {
            frameLayout.addView(circleImageView2, layoutParams4);
        }
        CircleImageView circleImageView3 = new CircleImageView(context);
        circleImageView3.setId(R.id.bvu);
        FrameLayout.LayoutParams layoutParams5 = new FrameLayout.LayoutParams((int) TypedValue.applyDimension(1, 24.0f, resources.getDisplayMetrics()), (int) TypedValue.applyDimension(1, 24.0f, resources.getDisplayMetrics()));
        android.view.a.a(circleImageView3);
        if (circleImageView3.getParent() == null) {
            frameLayout.addView(circleImageView3, layoutParams5);
        }
        android.view.a.a(frameLayout);
        if (frameLayout.getParent() == null) {
            linearLayout.addView(frameLayout, layoutParams2);
        }
        View view = new View(context);
        view.setId(R.id.f8q);
        view.setBackgroundResource(R.drawable.a_q);
        view.setVisibility(0);
        LinearLayout.LayoutParams layoutParams6 = new LinearLayout.LayoutParams((int) TypedValue.applyDimension(1, 8.0f, resources.getDisplayMetrics()), (int) TypedValue.applyDimension(1, 8.0f, resources.getDisplayMetrics()));
        if (ViewGroup.MarginLayoutParams.class.isInstance(layoutParams6)) {
            ((ViewGroup.MarginLayoutParams) layoutParams6).leftMargin = (int) TypedValue.applyDimension(1, -12.0f, resources.getDisplayMetrics());
        }
        if (ViewGroup.MarginLayoutParams.class.isInstance(layoutParams6)) {
            int i4 = Build.VERSION.SDK_INT;
            layoutParams6.setMarginStart((int) TypedValue.applyDimension(1, -12.0f, resources.getDisplayMetrics()));
        }
        if (ViewGroup.MarginLayoutParams.class.isInstance(layoutParams6)) {
            ((ViewGroup.MarginLayoutParams) layoutParams6).topMargin = (int) TypedValue.applyDimension(1, 17.0f, resources.getDisplayMetrics());
        }
        android.view.a.a(view);
        if (view.getParent() == null) {
            linearLayout.addView(view, layoutParams6);
        }
        TuxTextView tuxTextView2 = new TuxTextView(context);
        tuxTextView2.setId(R.id.f8r);
        tuxTextView2.setBackgroundResource(R.drawable.a_r);
        if (TextView.class.isInstance(tuxTextView2)) {
            android.view.a.a(tuxTextView2, (int) TypedValue.applyDimension(1, 16.0f, resources.getDisplayMetrics()));
        } else {
            tuxTextView2.setMinimumWidth((int) TypedValue.applyDimension(1, 16.0f, resources.getDisplayMetrics()));
        }
        tuxTextView2.setPadding((int) TypedValue.applyDimension(1, 5.0f, resources.getDisplayMetrics()), tuxTextView2.getPaddingTop(), tuxTextView2.getPaddingRight(), tuxTextView2.getPaddingBottom());
        tuxTextView2.setPadding(tuxTextView2.getPaddingLeft(), tuxTextView2.getPaddingTop(), (int) TypedValue.applyDimension(1, 5.0f, resources.getDisplayMetrics()), tuxTextView2.getPaddingBottom());
        tuxTextView2.setText("99+");
        tuxTextView2.setTextColor(resources.getColorStateList(R.color.a9));
        tuxTextView2.setVisibility(8);
        LinearLayout.LayoutParams layoutParams7 = new LinearLayout.LayoutParams(-2, (int) TypedValue.applyDimension(1, 15.0f, resources.getDisplayMetrics()));
        if (ViewGroup.MarginLayoutParams.class.isInstance(layoutParams7)) {
            ((ViewGroup.MarginLayoutParams) layoutParams7).leftMargin = (int) TypedValue.applyDimension(1, -8.0f, resources.getDisplayMetrics());
        }
        if (ViewGroup.MarginLayoutParams.class.isInstance(layoutParams7)) {
            int i5 = Build.VERSION.SDK_INT;
            layoutParams7.setMarginStart((int) TypedValue.applyDimension(1, -8.0f, resources.getDisplayMetrics()));
        }
        if (ViewGroup.MarginLayoutParams.class.isInstance(layoutParams7)) {
            ((ViewGroup.MarginLayoutParams) layoutParams7).topMargin = (int) TypedValue.applyDimension(1, 13.0f, resources.getDisplayMetrics());
        }
        tuxTextView2.setGravity(17);
        f.a("app:tux_font", new a.c("P3_Regular"), tuxTextView2, layoutParams7);
        f.a(tuxTextView2, layoutParams7);
        android.view.a.a(tuxTextView2);
        if (tuxTextView2.getParent() == null) {
            linearLayout.addView(tuxTextView2, layoutParams7);
        }
        TuxTextView tuxTextView3 = new TuxTextView(context);
        tuxTextView3.setId(R.id.ce8);
        tuxTextView3.setBackgroundResource(R.drawable.a_s);
        tuxTextView3.setMaxWidth((int) TypedValue.applyDimension(1, 64.0f, resources.getDisplayMetrics()));
        if (TextView.class.isInstance(tuxTextView3)) {
            android.view.a.a(tuxTextView3, (int) TypedValue.applyDimension(1, 16.0f, resources.getDisplayMetrics()));
        } else {
            tuxTextView3.setMinimumWidth((int) TypedValue.applyDimension(1, 16.0f, resources.getDisplayMetrics()));
        }
        tuxTextView3.setPadding((int) TypedValue.applyDimension(1, 4.0f, resources.getDisplayMetrics()), tuxTextView3.getPaddingTop(), tuxTextView3.getPaddingRight(), tuxTextView3.getPaddingBottom());
        tuxTextView3.setPadding(tuxTextView3.getPaddingLeft(), tuxTextView3.getPaddingTop(), (int) TypedValue.applyDimension(1, 4.0f, resources.getDisplayMetrics()), tuxTextView3.getPaddingBottom());
        tuxTextView3.setText("LIVE");
        tuxTextView3.setTextColor(resources.getColorStateList(R.color.a9));
        tuxTextView3.setVisibility(8);
        LinearLayout.LayoutParams layoutParams8 = new LinearLayout.LayoutParams(-2, (int) TypedValue.applyDimension(1, 14.0f, resources.getDisplayMetrics()));
        if (ViewGroup.MarginLayoutParams.class.isInstance(layoutParams8)) {
            ((ViewGroup.MarginLayoutParams) layoutParams8).leftMargin = (int) TypedValue.applyDimension(1, -18.0f, resources.getDisplayMetrics());
        }
        if (ViewGroup.MarginLayoutParams.class.isInstance(layoutParams8)) {
            int i6 = Build.VERSION.SDK_INT;
            layoutParams8.setMarginStart((int) TypedValue.applyDimension(1, -18.0f, resources.getDisplayMetrics()));
        }
        if (ViewGroup.MarginLayoutParams.class.isInstance(layoutParams8)) {
            ((ViewGroup.MarginLayoutParams) layoutParams8).topMargin = (int) TypedValue.applyDimension(1, 13.0f, resources.getDisplayMetrics());
        }
        tuxTextView3.setGravity(17);
        f.a("app:tux_font", new a.c("SmallText2_Semibold"), tuxTextView3, layoutParams8);
        f.a(tuxTextView3, layoutParams8);
        android.view.a.a(tuxTextView3);
        if (tuxTextView3.getParent() == null) {
            linearLayout.addView(tuxTextView3, layoutParams8);
        }
        android.view.a.a(linearLayout);
        linearLayout.setLayoutParams(a2);
        if (viewGroup != null && z) {
            viewGroup.addView(linearLayout);
        }
        MethodCollector.o(2938);
        return linearLayout;
    }
}
