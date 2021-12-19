package com.a.a;

import android.content.Context;
import android.content.res.Resources;
import android.util.TypedValue;
import android.view.View;
import android.view.ViewGroup;
import android.view.a;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import androidx.drawerlayout.widget.DrawerLayout;
import com.a.b.a.a;
import com.a.b.e;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.bytedance.tux.input.TuxTextView;
import com.ss.android.ugc.aweme.feed.widget.DiggAnimationView;
import com.ss.android.ugc.aweme.tux.a.j.f;
import com.zhiliaoapp.musically.R;

public final class ay implements e {
    static {
        Covode.recordClassIndex(1961);
    }

    @Override // com.a.b.e
    public final View a(Context context, ViewGroup viewGroup, boolean z) {
        MethodCollector.i(526);
        Resources resources = context.getResources();
        LinearLayout linearLayout = new LinearLayout(context);
        linearLayout.setId(R.id.am7);
        linearLayout.setOrientation(1);
        linearLayout.setFocusable(false);
        linearLayout.setFocusableInTouchMode(false);
        ViewGroup.LayoutParams a2 = a.a(viewGroup, -2, -2);
        FrameLayout frameLayout = new FrameLayout(context);
        frameLayout.setBackgroundResource(R.drawable.a03);
        frameLayout.setPadding((int) TypedValue.applyDimension(1, 0.0f, resources.getDisplayMetrics()), (int) TypedValue.applyDimension(1, 0.0f, resources.getDisplayMetrics()), (int) TypedValue.applyDimension(1, 0.0f, resources.getDisplayMetrics()), (int) TypedValue.applyDimension(1, 0.0f, resources.getDisplayMetrics()));
        frameLayout.setId(R.id.am3);
        frameLayout.setFocusable(false);
        frameLayout.setFocusableInTouchMode(false);
        ViewGroup.LayoutParams layoutParams = new LinearLayout.LayoutParams((int) TypedValue.applyDimension(1, 50.0f, resources.getDisplayMetrics()), (int) TypedValue.applyDimension(1, 50.0f, resources.getDisplayMetrics()));
        DiggAnimationView diggAnimationView = new DiggAnimationView(context);
        diggAnimationView.setId(R.id.am1);
        diggAnimationView.setFocusable(false);
        diggAnimationView.setFocusableInTouchMode(false);
        diggAnimationView.setScaleType(ImageView.ScaleType.CENTER_INSIDE);
        diggAnimationView.setContentDescription(context.getResources().getString(R.string.kx));
        FrameLayout.LayoutParams layoutParams2 = new FrameLayout.LayoutParams((int) TypedValue.applyDimension(1, 50.0f, resources.getDisplayMetrics()), (int) TypedValue.applyDimension(1, 50.0f, resources.getDisplayMetrics()));
        if (LinearLayout.LayoutParams.class.isInstance(layoutParams2)) {
            ((LinearLayout.LayoutParams) layoutParams2).gravity = 17;
        }
        if (FrameLayout.LayoutParams.class.isInstance(layoutParams2)) {
            layoutParams2.gravity = 17;
        }
        if (DrawerLayout.d.class.isInstance(layoutParams2)) {
            ((DrawerLayout.d) layoutParams2).f2691a = 17;
        }
        a.a(diggAnimationView);
        if (diggAnimationView.getParent() == null) {
            frameLayout.addView(diggAnimationView, layoutParams2);
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
        tuxTextView.setId(R.id.am4);
        tuxTextView.setFocusable(false);
        tuxTextView.setFocusableInTouchMode(false);
        tuxTextView.setImportantForAccessibility(2);
        tuxTextView.setPadding(tuxTextView.getPaddingLeft(), tuxTextView.getPaddingTop(), tuxTextView.getPaddingRight(), (int) TypedValue.applyDimension(1, 16.0f, resources.getDisplayMetrics()));
        LinearLayout.LayoutParams layoutParams3 = new LinearLayout.LayoutParams(-2, -2);
        if (LinearLayout.LayoutParams.class.isInstance(layoutParams3)) {
            layoutParams3.gravity = 1;
        }
        if (FrameLayout.LayoutParams.class.isInstance(layoutParams3)) {
            ((FrameLayout.LayoutParams) layoutParams3).gravity = 1;
        }
        if (DrawerLayout.d.class.isInstance(layoutParams3)) {
            ((DrawerLayout.d) layoutParams3).f2691a = 1;
        }
        if (ViewGroup.MarginLayoutParams.class.isInstance(layoutParams3)) {
            ((ViewGroup.MarginLayoutParams) layoutParams3).topMargin = (int) TypedValue.applyDimension(1, -3.4f, resources.getDisplayMetrics());
        }
        f.a("app:tux_font", new a.c("P3_Semibold"), tuxTextView, layoutParams3);
        f.a(tuxTextView, layoutParams3);
        android.view.a.a(tuxTextView);
        if (tuxTextView.getParent() == null) {
            linearLayout.addView(tuxTextView, layoutParams3);
        }
        android.view.a.a(linearLayout);
        linearLayout.setLayoutParams(a2);
        if (viewGroup != null && z) {
            viewGroup.addView(linearLayout);
        }
        MethodCollector.o(526);
        return linearLayout;
    }
}
