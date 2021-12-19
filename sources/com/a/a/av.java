package com.a.a;

import android.content.Context;
import android.content.res.Resources;
import android.util.TypedValue;
import android.view.View;
import android.view.ViewGroup;
import android.view.a;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.drawerlayout.widget.DrawerLayout;
import com.a.b.a.a;
import com.a.b.e;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.bytedance.tux.input.TuxTextView;
import com.ss.android.ugc.aweme.tux.a.j.f;
import com.zhiliaoapp.musically.R;

public final class av implements e {
    static {
        Covode.recordClassIndex(1958);
    }

    @Override // com.a.b.e
    public final View a(Context context, ViewGroup viewGroup, boolean z) {
        MethodCollector.i(1059);
        Resources resources = context.getResources();
        LinearLayout linearLayout = new LinearLayout(context);
        linearLayout.setId(R.id.aao);
        linearLayout.setFocusable(false);
        linearLayout.setFocusableInTouchMode(false);
        linearLayout.setOrientation(1);
        ViewGroup.LayoutParams a2 = a.a(viewGroup, -2, -2);
        FrameLayout frameLayout = new FrameLayout(context);
        frameLayout.setBackgroundResource(R.drawable.a03);
        frameLayout.setPadding((int) TypedValue.applyDimension(1, 0.0f, resources.getDisplayMetrics()), (int) TypedValue.applyDimension(1, 0.0f, resources.getDisplayMetrics()), (int) TypedValue.applyDimension(1, 0.0f, resources.getDisplayMetrics()), (int) TypedValue.applyDimension(1, 0.0f, resources.getDisplayMetrics()));
        frameLayout.setId(R.id.a_0);
        frameLayout.setFocusable(false);
        frameLayout.setFocusableInTouchMode(false);
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams((int) TypedValue.applyDimension(1, 50.0f, resources.getDisplayMetrics()), (int) TypedValue.applyDimension(1, 50.0f, resources.getDisplayMetrics()));
        if (ViewGroup.MarginLayoutParams.class.isInstance(layoutParams)) {
            ((ViewGroup.MarginLayoutParams) layoutParams).bottomMargin = (int) TypedValue.applyDimension(1, 3.0f, resources.getDisplayMetrics());
        }
        AppCompatImageView appCompatImageView = new AppCompatImageView(context);
        appCompatImageView.setId(R.id.a_h);
        appCompatImageView.setFocusable(false);
        appCompatImageView.setFocusableInTouchMode(false);
        appCompatImageView.setImageResource(2131233108);
        FrameLayout.LayoutParams layoutParams2 = new FrameLayout.LayoutParams((int) TypedValue.applyDimension(1, 40.0f, resources.getDisplayMetrics()), (int) TypedValue.applyDimension(1, 40.0f, resources.getDisplayMetrics()));
        if (LinearLayout.LayoutParams.class.isInstance(layoutParams2)) {
            ((LinearLayout.LayoutParams) layoutParams2).gravity = 17;
        }
        if (FrameLayout.LayoutParams.class.isInstance(layoutParams2)) {
            layoutParams2.gravity = 17;
        }
        if (DrawerLayout.d.class.isInstance(layoutParams2)) {
            ((DrawerLayout.d) layoutParams2).f2691a = 17;
        }
        a.a(appCompatImageView);
        if (appCompatImageView.getParent() == null) {
            frameLayout.addView(appCompatImageView, layoutParams2);
        }
        AppCompatImageView appCompatImageView2 = new AppCompatImageView(context);
        appCompatImageView2.setId(R.id.a_f);
        appCompatImageView2.setImageResource(2131232340);
        appCompatImageView2.setVisibility(8);
        FrameLayout.LayoutParams layoutParams3 = new FrameLayout.LayoutParams((int) TypedValue.applyDimension(1, 20.0f, resources.getDisplayMetrics()), (int) TypedValue.applyDimension(1, 20.0f, resources.getDisplayMetrics()));
        if (LinearLayout.LayoutParams.class.isInstance(layoutParams3)) {
            ((LinearLayout.LayoutParams) layoutParams3).gravity = 8388613;
        }
        if (FrameLayout.LayoutParams.class.isInstance(layoutParams3)) {
            layoutParams3.gravity = 8388613;
        }
        if (DrawerLayout.d.class.isInstance(layoutParams3)) {
            ((DrawerLayout.d) layoutParams3).f2691a = 8388613;
        }
        a.a(appCompatImageView2);
        if (appCompatImageView2.getParent() == null) {
            frameLayout.addView(appCompatImageView2, layoutParams3);
        }
        a.a(frameLayout);
        if (frameLayout.getParent() == null) {
            linearLayout.addView(frameLayout, layoutParams);
        }
        TuxTextView tuxTextView = new TuxTextView(context);
        tuxTextView.setShadowLayer(2.0f, tuxTextView.getShadowDx(), tuxTextView.getShadowDy(), tuxTextView.getShadowColor());
        tuxTextView.setShadowLayer(tuxTextView.getShadowRadius(), tuxTextView.getShadowDx(), 2.0f, tuxTextView.getShadowColor());
        tuxTextView.setShadowLayer(tuxTextView.getShadowRadius(), tuxTextView.getShadowDx(), tuxTextView.getShadowDy(), resources.getColor(R.color.iu));
        tuxTextView.setTextColor(resources.getColorStateList(R.color.a_));
        tuxTextView.setId(R.id.a_2);
        tuxTextView.setFocusable(false);
        tuxTextView.setFocusableInTouchMode(false);
        tuxTextView.setImportantForAccessibility(2);
        tuxTextView.setPadding(tuxTextView.getPaddingLeft(), tuxTextView.getPaddingTop(), tuxTextView.getPaddingRight(), (int) TypedValue.applyDimension(1, 16.0f, resources.getDisplayMetrics()));
        tuxTextView.setVisibility(0);
        LinearLayout.LayoutParams layoutParams4 = new LinearLayout.LayoutParams(-2, -2);
        if (LinearLayout.LayoutParams.class.isInstance(layoutParams4)) {
            layoutParams4.gravity = 1;
        }
        if (FrameLayout.LayoutParams.class.isInstance(layoutParams4)) {
            ((FrameLayout.LayoutParams) layoutParams4).gravity = 1;
        }
        if (DrawerLayout.d.class.isInstance(layoutParams4)) {
            ((DrawerLayout.d) layoutParams4).f2691a = 1;
        }
        if (ViewGroup.MarginLayoutParams.class.isInstance(layoutParams4)) {
            ((ViewGroup.MarginLayoutParams) layoutParams4).topMargin = (int) TypedValue.applyDimension(1, -3.4f, resources.getDisplayMetrics());
        }
        f.a("app:tux_font", new a.c("P3_Semibold"), tuxTextView, layoutParams4);
        f.a(tuxTextView, layoutParams4);
        android.view.a.a(tuxTextView);
        if (tuxTextView.getParent() == null) {
            linearLayout.addView(tuxTextView, layoutParams4);
        }
        android.view.a.a(linearLayout);
        linearLayout.setLayoutParams(a2);
        if (viewGroup != null && z) {
            viewGroup.addView(linearLayout);
        }
        MethodCollector.o(1059);
        return linearLayout;
    }
}
