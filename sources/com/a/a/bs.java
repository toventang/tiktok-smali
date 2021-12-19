package com.a.a;

import android.content.Context;
import android.content.res.Resources;
import android.util.TypedValue;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewStub;
import android.view.a;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.drawerlayout.widget.DrawerLayout;
import com.a.b.e;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.bytedance.ies.dmt.ui.gesture.GestureFrameLayout;
import com.ss.android.ugc.aweme.base.ui.ScrollableViewPager;
import com.zhiliaoapp.musically.R;

public final class bs implements e {
    static {
        Covode.recordClassIndex(1982);
    }

    @Override // com.a.b.e
    public final View a(Context context, ViewGroup viewGroup, boolean z) {
        MethodCollector.i(2629);
        Resources resources = context.getResources();
        GestureFrameLayout gestureFrameLayout = new GestureFrameLayout(context);
        gestureFrameLayout.setId(R.id.bcd);
        ViewGroup.MarginLayoutParams a2 = a.a(viewGroup, -1, -1);
        ScrollableViewPager scrollableViewPager = new ScrollableViewPager(context);
        scrollableViewPager.setId(R.id.fk_);
        ViewGroup.MarginLayoutParams a3 = a.a(gestureFrameLayout, -1, -1);
        a.a(scrollableViewPager);
        if (scrollableViewPager.getParent() == null) {
            gestureFrameLayout.addView(scrollableViewPager, a3);
        }
        View a4 = com.a.b.a.a(context, R.layout.a3x, gestureFrameLayout, false, R.layout.a3e);
        if (a4.getParent() == null) {
            gestureFrameLayout.addView(a4);
        }
        AppCompatImageView appCompatImageView = new AppCompatImageView(context);
        appCompatImageView.setId(R.id.bgk);
        appCompatImageView.setImageResource(2131233103);
        ViewGroup.MarginLayoutParams a5 = a.a(gestureFrameLayout, -2, -2);
        if (LinearLayout.LayoutParams.class.isInstance(a5)) {
            ((LinearLayout.LayoutParams) a5).gravity = 51;
        }
        if (FrameLayout.LayoutParams.class.isInstance(a5)) {
            ((FrameLayout.LayoutParams) a5).gravity = 51;
        }
        if (DrawerLayout.d.class.isInstance(a5)) {
            ((DrawerLayout.d) a5).f2691a = 51;
        }
        a.a(appCompatImageView);
        if (appCompatImageView.getParent() == null) {
            gestureFrameLayout.addView(appCompatImageView, a5);
        }
        AppCompatImageView appCompatImageView2 = new AppCompatImageView(context);
        appCompatImageView2.setId(R.id.bgl);
        appCompatImageView2.setImageResource(2131233104);
        ViewGroup.MarginLayoutParams a6 = a.a(gestureFrameLayout, -2, -2);
        if (LinearLayout.LayoutParams.class.isInstance(a6)) {
            ((LinearLayout.LayoutParams) a6).gravity = 53;
        }
        if (FrameLayout.LayoutParams.class.isInstance(a6)) {
            ((FrameLayout.LayoutParams) a6).gravity = 53;
        }
        if (DrawerLayout.d.class.isInstance(a6)) {
            ((DrawerLayout.d) a6).f2691a = 53;
        }
        a.a(appCompatImageView2);
        if (appCompatImageView2.getParent() == null) {
            gestureFrameLayout.addView(appCompatImageView2, a6);
        }
        ViewStub viewStub = new ViewStub(context);
        viewStub.setId(R.id.fl4);
        viewStub.setLayoutResource(R.layout.a3h);
        viewStub.setVisibility(8);
        ViewGroup.MarginLayoutParams a7 = a.a(gestureFrameLayout, -1, -1);
        viewStub.setInflatedId(-1);
        a.a(viewStub);
        if (viewStub.getParent() == null) {
            gestureFrameLayout.addView(viewStub, a7);
        }
        ViewStub viewStub2 = new ViewStub(context);
        viewStub2.setId(R.id.flf);
        viewStub2.setLayoutResource(R.layout.a3g);
        ViewGroup.MarginLayoutParams a8 = a.a(gestureFrameLayout, (int) TypedValue.applyDimension(1, 270.0f, resources.getDisplayMetrics()), (int) TypedValue.applyDimension(1, 295.0f, resources.getDisplayMetrics()));
        viewStub2.setInflatedId(-1);
        a.a(viewStub2);
        if (viewStub2.getParent() == null) {
            gestureFrameLayout.addView(viewStub2, a8);
        }
        ViewStub viewStub3 = new ViewStub(context);
        viewStub3.setId(R.id.ei);
        viewStub3.setLayoutResource(R.layout.rr);
        ViewGroup.MarginLayoutParams a9 = a.a(gestureFrameLayout, -1, -1);
        viewStub3.setInflatedId(-1);
        a.a(viewStub3);
        if (viewStub3.getParent() == null) {
            gestureFrameLayout.addView(viewStub3, a9);
        }
        ViewStub viewStub4 = new ViewStub(context);
        viewStub4.setId(R.id.eg);
        viewStub4.setLayoutResource(R.layout.a3f);
        ViewGroup.MarginLayoutParams a10 = a.a(gestureFrameLayout, -1, -1);
        viewStub4.setInflatedId(-1);
        a.a(viewStub4);
        if (viewStub4.getParent() == null) {
            gestureFrameLayout.addView(viewStub4, a10);
        }
        ViewStub viewStub5 = new ViewStub(context);
        viewStub5.setId(R.id.ac_);
        viewStub5.setLayoutResource(R.layout.rx);
        ViewGroup.MarginLayoutParams a11 = a.a(gestureFrameLayout, -1, -1);
        viewStub5.setInflatedId(-1);
        a.a(viewStub5);
        if (viewStub5.getParent() == null) {
            gestureFrameLayout.addView(viewStub5, a11);
        }
        a.a(gestureFrameLayout);
        gestureFrameLayout.setLayoutParams(a2);
        if (viewGroup != null && z) {
            viewGroup.addView(gestureFrameLayout);
        }
        MethodCollector.o(2629);
        return gestureFrameLayout;
    }
}
