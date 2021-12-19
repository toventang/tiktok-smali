package com.a.a;

import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Color;
import android.os.Build;
import android.util.TypedValue;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewStub;
import android.view.a;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import androidx.drawerlayout.widget.DrawerLayout;
import com.a.b.a.a;
import com.a.b.e;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.bytedance.ies.uikit.tabhost.FragmentTabHost;
import com.bytedance.tux.input.TuxTextView;
import com.ss.android.ugc.aweme.feed.ui.seekbar.VideoSeekBar;
import com.ss.android.ugc.aweme.feed.ui.seekbar.VideoSeekBarMaskView;
import com.ss.android.ugc.aweme.homepage.ui.view.tab.bottom.MainBottomTabView;
import com.ss.android.ugc.aweme.tux.a.j.f;
import com.zhiliaoapp.musically.R;

public final class by implements e {
    static {
        Covode.recordClassIndex(1988);
    }

    @Override // com.a.b.e
    public final View a(Context context, ViewGroup viewGroup, boolean z) {
        int i2;
        int i3;
        int i4;
        MethodCollector.i(1009);
        Resources resources = context.getResources();
        FragmentTabHost fragmentTabHost = new FragmentTabHost(context);
        fragmentTabHost.setId(R.id.ckb);
        ViewGroup.LayoutParams a2 = a.a(viewGroup, -1, -1);
        VideoSeekBarMaskView videoSeekBarMaskView = new VideoSeekBarMaskView(context);
        videoSeekBarMaskView.setBackgroundDrawable(null);
        videoSeekBarMaskView.setId(R.id.ck9);
        ViewGroup.LayoutParams a3 = a.a(fragmentTabHost, -1, -1);
        View frameLayout = new FrameLayout(context);
        frameLayout.setId(R.id.eh6);
        ViewGroup.LayoutParams a4 = a.a(videoSeekBarMaskView, -1, -1);
        a.a(frameLayout);
        if (frameLayout.getParent() == null) {
            videoSeekBarMaskView.addView(frameLayout, a4);
        }
        View view = new View(context);
        view.setId(R.id.w_);
        view.setBackgroundColor(resources.getColor(R.color.a8));
        ViewGroup.MarginLayoutParams a5 = a.a(videoSeekBarMaskView, -1, (int) TypedValue.applyDimension(1, 0.5f, resources.getDisplayMetrics()));
        if (LinearLayout.LayoutParams.class.isInstance(a5)) {
            ((LinearLayout.LayoutParams) a5).gravity = 80;
        }
        if (FrameLayout.LayoutParams.class.isInstance(a5)) {
            ((FrameLayout.LayoutParams) a5).gravity = 80;
        }
        if (DrawerLayout.d.class.isInstance(a5)) {
            ((DrawerLayout.d) a5).f2691a = 80;
        }
        if (ViewGroup.MarginLayoutParams.class.isInstance(a5)) {
            a5.bottomMargin = (int) TypedValue.applyDimension(1, 47.0f, resources.getDisplayMetrics());
        }
        a.a(view);
        if (view.getParent() == null) {
            videoSeekBarMaskView.addView(view, a5);
        }
        ViewStub viewStub = new ViewStub(context);
        viewStub.setId(R.id.aga);
        viewStub.setLayoutResource(R.layout.a3j);
        ViewGroup.MarginLayoutParams a6 = a.a(videoSeekBarMaskView, -2, -2);
        if (LinearLayout.LayoutParams.class.isInstance(a6)) {
            ((LinearLayout.LayoutParams) a6).gravity = 8388693;
        }
        if (FrameLayout.LayoutParams.class.isInstance(a6)) {
            ((FrameLayout.LayoutParams) a6).gravity = 8388693;
        }
        if (DrawerLayout.d.class.isInstance(a6)) {
            ((DrawerLayout.d) a6).f2691a = 8388693;
        }
        if (ViewGroup.MarginLayoutParams.class.isInstance(a6)) {
            a6.bottomMargin = (int) TypedValue.applyDimension(1, 45.0f, resources.getDisplayMetrics());
        }
        if (ViewGroup.MarginLayoutParams.class.isInstance(a6)) {
            int i5 = Build.VERSION.SDK_INT;
            a6.setMarginEnd((int) TypedValue.applyDimension(1, 13.0f, resources.getDisplayMetrics()));
        }
        if (ViewGroup.MarginLayoutParams.class.isInstance(a6)) {
            a6.rightMargin = (int) TypedValue.applyDimension(1, 13.0f, resources.getDisplayMetrics());
        }
        viewStub.setInflatedId(-1);
        a.a(viewStub);
        if (viewStub.getParent() == null) {
            videoSeekBarMaskView.addView(viewStub, a6);
        }
        View mainBottomTabView = new MainBottomTabView(context);
        mainBottomTabView.setId(R.id.ck7);
        ViewGroup.LayoutParams a7 = a.a(videoSeekBarMaskView, -1, (int) resources.getDimension(R.dimen.n5));
        if (LinearLayout.LayoutParams.class.isInstance(a7)) {
            ((LinearLayout.LayoutParams) a7).gravity = 80;
        }
        if (FrameLayout.LayoutParams.class.isInstance(a7)) {
            ((FrameLayout.LayoutParams) a7).gravity = 80;
        }
        if (DrawerLayout.d.class.isInstance(a7)) {
            ((DrawerLayout.d) a7).f2691a = 80;
        }
        a.a(mainBottomTabView);
        if (mainBottomTabView.getParent() == null) {
            videoSeekBarMaskView.addView(mainBottomTabView, a7);
        }
        View videoSeekBar = new VideoSeekBar(context);
        videoSeekBar.setId(R.id.fh7);
        videoSeekBar.setVisibility(8);
        ViewGroup.MarginLayoutParams a8 = a.a(videoSeekBarMaskView, -1, (int) TypedValue.applyDimension(1, 18.0f, resources.getDisplayMetrics()));
        if (LinearLayout.LayoutParams.class.isInstance(a8)) {
            ((LinearLayout.LayoutParams) a8).gravity = 80;
        }
        if (FrameLayout.LayoutParams.class.isInstance(a8)) {
            ((FrameLayout.LayoutParams) a8).gravity = 80;
        }
        if (DrawerLayout.d.class.isInstance(a8)) {
            ((DrawerLayout.d) a8).f2691a = 80;
        }
        if (ViewGroup.MarginLayoutParams.class.isInstance(a8)) {
            a8.bottomMargin = (int) TypedValue.applyDimension(1, 36.0f, resources.getDisplayMetrics());
        }
        a.a(videoSeekBar);
        if (videoSeekBar.getParent() == null) {
            videoSeekBarMaskView.addView(videoSeekBar, a8);
        }
        RelativeLayout relativeLayout = new RelativeLayout(context);
        relativeLayout.setId(R.id.fh8);
        relativeLayout.setVisibility(8);
        ViewGroup.MarginLayoutParams a9 = a.a(videoSeekBarMaskView, -2, -2);
        if (LinearLayout.LayoutParams.class.isInstance(a9)) {
            ((LinearLayout.LayoutParams) a9).gravity = 81;
        }
        if (FrameLayout.LayoutParams.class.isInstance(a9)) {
            ((FrameLayout.LayoutParams) a9).gravity = 81;
        }
        if (DrawerLayout.d.class.isInstance(a9)) {
            ((DrawerLayout.d) a9).f2691a = 81;
        }
        if (ViewGroup.MarginLayoutParams.class.isInstance(a9)) {
            a9.bottomMargin = (int) TypedValue.applyDimension(1, 116.0f, resources.getDisplayMetrics());
        }
        relativeLayout.setGravity(16);
        TuxTextView tuxTextView = new TuxTextView(context);
        tuxTextView.setId(R.id.ahp);
        TypedArray obtainStyledAttributes = context.getTheme().obtainStyledAttributes(new int[]{R.attr.aa});
        tuxTextView.setTextColor(obtainStyledAttributes.getColor(0, 0));
        obtainStyledAttributes.recycle();
        RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(-2, -2);
        if (RelativeLayout.LayoutParams.class.isInstance(layoutParams)) {
            layoutParams.addRule(16, R.id.aho);
        }
        if (RelativeLayout.LayoutParams.class.isInstance(layoutParams)) {
            layoutParams.addRule(0, R.id.aho);
        }
        f.a("app:tux_font", new a.c("H1_Semibold"), tuxTextView, layoutParams);
        f.a(tuxTextView, layoutParams);
        android.view.a.a(tuxTextView);
        if (tuxTextView.getParent() == null) {
            relativeLayout.addView(tuxTextView, layoutParams);
        }
        TuxTextView tuxTextView2 = new TuxTextView(context);
        tuxTextView2.setId(R.id.aho);
        TypedArray obtainStyledAttributes2 = context.getTheme().obtainStyledAttributes(new int[]{R.attr.aa});
        tuxTextView2.setTextColor(obtainStyledAttributes2.getColor(0, 0));
        obtainStyledAttributes2.recycle();
        tuxTextView2.setText("/");
        RelativeLayout.LayoutParams layoutParams2 = new RelativeLayout.LayoutParams((int) TypedValue.applyDimension(1, 6.0f, resources.getDisplayMetrics()), (int) TypedValue.applyDimension(1, 20.0f, resources.getDisplayMetrics()));
        if (RelativeLayout.LayoutParams.class.isInstance(layoutParams2)) {
            layoutParams2.addRule(13, -1);
        }
        if (ViewGroup.MarginLayoutParams.class.isInstance(layoutParams2)) {
            int i6 = Build.VERSION.SDK_INT;
            layoutParams2.setMarginStart((int) TypedValue.applyDimension(1, 19.0f, resources.getDisplayMetrics()));
        }
        if (ViewGroup.MarginLayoutParams.class.isInstance(layoutParams2)) {
            ((ViewGroup.MarginLayoutParams) layoutParams2).leftMargin = (int) TypedValue.applyDimension(1, 19.0f, resources.getDisplayMetrics());
        }
        if (ViewGroup.MarginLayoutParams.class.isInstance(layoutParams2)) {
            int i7 = Build.VERSION.SDK_INT;
            layoutParams2.setMarginEnd((int) TypedValue.applyDimension(1, 19.0f, resources.getDisplayMetrics()));
        }
        if (ViewGroup.MarginLayoutParams.class.isInstance(layoutParams2)) {
            ((ViewGroup.MarginLayoutParams) layoutParams2).rightMargin = (int) TypedValue.applyDimension(1, 19.0f, resources.getDisplayMetrics());
        }
        f.a("app:tux_font", new a.c("H3_Semibold"), tuxTextView2, layoutParams2);
        f.a(tuxTextView2, layoutParams2);
        android.view.a.a(tuxTextView2);
        if (tuxTextView2.getParent() == null) {
            relativeLayout.addView(tuxTextView2, layoutParams2);
        }
        TuxTextView tuxTextView3 = new TuxTextView(context);
        tuxTextView3.setId(R.id.ept);
        TypedArray obtainStyledAttributes3 = context.getTheme().obtainStyledAttributes(new int[]{R.attr.ac});
        tuxTextView3.setTextColor(obtainStyledAttributes3.getColor(0, 0));
        obtainStyledAttributes3.recycle();
        RelativeLayout.LayoutParams layoutParams3 = new RelativeLayout.LayoutParams(-2, -2);
        if (RelativeLayout.LayoutParams.class.isInstance(layoutParams3)) {
            i2 = R.id.aho;
            layoutParams3.addRule(17, R.id.aho);
        } else {
            i2 = R.id.aho;
        }
        if (RelativeLayout.LayoutParams.class.isInstance(layoutParams3)) {
            layoutParams3.addRule(1, i2);
        }
        f.a("app:tux_font", new a.c("H1_Semibold"), tuxTextView3, layoutParams3);
        f.a(tuxTextView3, layoutParams3);
        android.view.a.a(tuxTextView3);
        if (tuxTextView3.getParent() == null) {
            relativeLayout.addView(tuxTextView3, layoutParams3);
        }
        android.view.a.a(relativeLayout);
        if (relativeLayout.getParent() == null) {
            videoSeekBarMaskView.addView(relativeLayout, a9);
        }
        ViewStub viewStub2 = new ViewStub(context);
        viewStub2.setId(R.id.a0a);
        viewStub2.setLayoutResource(R.layout.a3w);
        ViewGroup.MarginLayoutParams a10 = android.view.a.a(videoSeekBarMaskView, -2, -2);
        if (LinearLayout.LayoutParams.class.isInstance(a10)) {
            i3 = 81;
            ((LinearLayout.LayoutParams) a10).gravity = 81;
        } else {
            i3 = 81;
        }
        if (FrameLayout.LayoutParams.class.isInstance(a10)) {
            ((FrameLayout.LayoutParams) a10).gravity = i3;
        }
        if (DrawerLayout.d.class.isInstance(a10)) {
            ((DrawerLayout.d) a10).f2691a = i3;
        }
        if (ViewGroup.MarginLayoutParams.class.isInstance(a10)) {
            a10.bottomMargin = (int) TypedValue.applyDimension(1, 44.0f, resources.getDisplayMetrics());
        }
        viewStub2.setInflatedId(-1);
        android.view.a.a(viewStub2);
        if (viewStub2.getParent() == null) {
            videoSeekBarMaskView.addView(viewStub2, a10);
        }
        View frameLayout2 = new FrameLayout(context);
        frameLayout2.setId(R.id.d6h);
        frameLayout2.setVisibility(8);
        ViewGroup.LayoutParams a11 = android.view.a.a(videoSeekBarMaskView, -1, -2);
        if (LinearLayout.LayoutParams.class.isInstance(a11)) {
            i4 = 80;
            ((LinearLayout.LayoutParams) a11).gravity = 80;
        } else {
            i4 = 80;
        }
        if (FrameLayout.LayoutParams.class.isInstance(a11)) {
            ((FrameLayout.LayoutParams) a11).gravity = i4;
        }
        if (DrawerLayout.d.class.isInstance(a11)) {
            ((DrawerLayout.d) a11).f2691a = i4;
        }
        android.view.a.a(frameLayout2);
        if (frameLayout2.getParent() == null) {
            videoSeekBarMaskView.addView(frameLayout2, a11);
        }
        android.view.a.a(videoSeekBarMaskView);
        if (videoSeekBarMaskView.getParent() == null) {
            fragmentTabHost.addView(videoSeekBarMaskView, a3);
        }
        View view2 = new View(context);
        view2.setId(R.id.flk);
        view2.setAlpha(0.0f);
        view2.setBackgroundColor(Color.parseColor("#111111"));
        view2.setVisibility(8);
        ViewGroup.LayoutParams a12 = android.view.a.a(fragmentTabHost, -1, -1);
        android.view.a.a(view2);
        if (view2.getParent() == null) {
            fragmentTabHost.addView(view2, a12);
        }
        android.view.a.a(fragmentTabHost);
        fragmentTabHost.setLayoutParams(a2);
        if (viewGroup != null && z) {
            viewGroup.addView(fragmentTabHost);
        }
        MethodCollector.o(1009);
        return fragmentTabHost;
    }
}
