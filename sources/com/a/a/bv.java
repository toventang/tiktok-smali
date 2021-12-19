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
import com.ss.android.ugc.aweme.base.ui.CustomInterceptTouchEventFrameLayout;
import com.ss.android.ugc.aweme.homepage.ui.view.FlippableViewPagerExt;
import com.zhiliaoapp.musically.R;

public final class bv implements e {
    static {
        Covode.recordClassIndex(1985);
    }

    @Override // com.a.b.e
    public final View a(Context context, ViewGroup viewGroup, boolean z) {
        MethodCollector.i(3287);
        Resources resources = context.getResources();
        FrameLayout frameLayout = new FrameLayout(context);
        frameLayout.setId(R.id.b69);
        ViewGroup.LayoutParams a2 = a.a(viewGroup, -1, -1);
        View frameLayout2 = new FrameLayout(context);
        frameLayout2.setId(R.id.d84);
        ViewGroup.LayoutParams layoutParams = new FrameLayout.LayoutParams(-1, -1);
        a.a(frameLayout2);
        if (frameLayout2.getParent() == null) {
            frameLayout.addView(frameLayout2, layoutParams);
        }
        CustomInterceptTouchEventFrameLayout customInterceptTouchEventFrameLayout = new CustomInterceptTouchEventFrameLayout(context);
        customInterceptTouchEventFrameLayout.setId(R.id.b52);
        ViewGroup.LayoutParams layoutParams2 = new FrameLayout.LayoutParams(-1, -1);
        View flippableViewPagerExt = new FlippableViewPagerExt(context);
        flippableViewPagerExt.setId(R.id.fk_);
        ViewGroup.LayoutParams a3 = a.a(customInterceptTouchEventFrameLayout, -1, -1);
        a.a(flippableViewPagerExt);
        if (flippableViewPagerExt.getParent() == null) {
            customInterceptTouchEventFrameLayout.addView(flippableViewPagerExt, a3);
        }
        AppCompatImageView appCompatImageView = new AppCompatImageView(context);
        appCompatImageView.setId(R.id.emr);
        appCompatImageView.setImageResource(R.drawable.a_n);
        appCompatImageView.setVisibility(0);
        ViewGroup.LayoutParams a4 = a.a(customInterceptTouchEventFrameLayout, -1, -2);
        a.a(appCompatImageView);
        if (appCompatImageView.getParent() == null) {
            customInterceptTouchEventFrameLayout.addView(appCompatImageView, a4);
        }
        LinearLayout linearLayout = new LinearLayout(context);
        linearLayout.setId(R.id.emb);
        linearLayout.setOrientation(1);
        ViewGroup.LayoutParams a5 = a.a(customInterceptTouchEventFrameLayout, -1, -1);
        View view = new View(context);
        view.setId(R.id.e_f);
        ViewGroup.LayoutParams layoutParams3 = new LinearLayout.LayoutParams(-1, (int) TypedValue.applyDimension(1, 0.0f, resources.getDisplayMetrics()));
        a.a(view);
        if (view.getParent() == null) {
            linearLayout.addView(view, layoutParams3);
        }
        FrameLayout frameLayout3 = new FrameLayout(context);
        ViewGroup.LayoutParams layoutParams4 = new LinearLayout.LayoutParams(-1, -2);
        FrameLayout frameLayout4 = new FrameLayout(context);
        frameLayout4.setId(R.id.dp7);
        FrameLayout.LayoutParams layoutParams5 = new FrameLayout.LayoutParams(-1, -2);
        if (LinearLayout.LayoutParams.class.isInstance(layoutParams5)) {
            ((LinearLayout.LayoutParams) layoutParams5).gravity = 16;
        }
        if (FrameLayout.LayoutParams.class.isInstance(layoutParams5)) {
            layoutParams5.gravity = 16;
        }
        if (DrawerLayout.d.class.isInstance(layoutParams5)) {
            ((DrawerLayout.d) layoutParams5).f2691a = 16;
        }
        a.a(frameLayout4);
        if (frameLayout4.getParent() == null) {
            frameLayout3.addView(frameLayout4, layoutParams5);
        }
        View a6 = com.a.b.a.a(context, R.layout.a46, frameLayout3, false, 0);
        if (a6.getParent() == null) {
            frameLayout3.addView(a6);
        }
        a.a(frameLayout3);
        if (frameLayout3.getParent() == null) {
            linearLayout.addView(frameLayout3, layoutParams4);
        }
        a.a(linearLayout);
        if (linearLayout.getParent() == null) {
            customInterceptTouchEventFrameLayout.addView(linearLayout, a5);
        }
        a.a(customInterceptTouchEventFrameLayout);
        if (customInterceptTouchEventFrameLayout.getParent() == null) {
            frameLayout.addView(customInterceptTouchEventFrameLayout, layoutParams2);
        }
        View view2 = new View(context);
        view2.setId(R.id.fek);
        view2.setBackgroundColor(resources.getColor(R.color.ok));
        view2.setVisibility(8);
        FrameLayout.LayoutParams layoutParams6 = new FrameLayout.LayoutParams(-1, (int) resources.getDimension(R.dimen.n5));
        if (LinearLayout.LayoutParams.class.isInstance(layoutParams6)) {
            ((LinearLayout.LayoutParams) layoutParams6).gravity = 80;
        }
        if (FrameLayout.LayoutParams.class.isInstance(layoutParams6)) {
            layoutParams6.gravity = 80;
        }
        if (DrawerLayout.d.class.isInstance(layoutParams6)) {
            ((DrawerLayout.d) layoutParams6).f2691a = 80;
        }
        a.a(view2);
        if (view2.getParent() == null) {
            frameLayout.addView(view2, layoutParams6);
        }
        ViewStub viewStub = new ViewStub(context);
        viewStub.setId(R.id.bgp);
        ViewGroup.LayoutParams layoutParams7 = new FrameLayout.LayoutParams(-1, -1);
        viewStub.setInflatedId(-1);
        a.a(viewStub);
        if (viewStub.getParent() == null) {
            frameLayout.addView(viewStub, layoutParams7);
        }
        a.a(frameLayout);
        frameLayout.setLayoutParams(a2);
        if (viewGroup != null && z) {
            viewGroup.addView(frameLayout);
        }
        MethodCollector.o(3287);
        return frameLayout;
    }
}
