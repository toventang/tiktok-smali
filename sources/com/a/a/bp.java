package com.a.a;

import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.os.Build;
import android.util.TypedValue;
import android.view.View;
import android.view.ViewGroup;
import android.view.a;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import androidx.drawerlayout.widget.DrawerLayout;
import com.a.b.a.a;
import com.a.b.e;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.bytedance.tux.input.TuxTextView;
import com.ss.android.ugc.aweme.feed.ui.seekbar.VideoSeekBar;
import com.ss.android.ugc.aweme.tux.a.j.f;
import com.zhiliaoapp.musically.R;

public final class bp implements e {
    static {
        Covode.recordClassIndex(1979);
    }

    @Override // com.a.b.e
    public final View a(Context context, ViewGroup viewGroup, boolean z) {
        MethodCollector.i(2984);
        Resources resources = context.getResources();
        FrameLayout frameLayout = new FrameLayout(context);
        ViewGroup.LayoutParams a2 = a.a(viewGroup, -1, -2);
        if (LinearLayout.LayoutParams.class.isInstance(a2)) {
            ((LinearLayout.LayoutParams) a2).gravity = 80;
        }
        if (FrameLayout.LayoutParams.class.isInstance(a2)) {
            ((FrameLayout.LayoutParams) a2).gravity = 80;
        }
        if (DrawerLayout.d.class.isInstance(a2)) {
            ((DrawerLayout.d) a2).f2691a = 80;
        }
        RelativeLayout relativeLayout = new RelativeLayout(context);
        relativeLayout.setId(R.id.fh8);
        relativeLayout.setVisibility(8);
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-1, (int) TypedValue.applyDimension(1, 164.0f, resources.getDisplayMetrics()));
        if (ViewGroup.MarginLayoutParams.class.isInstance(layoutParams)) {
            ((ViewGroup.MarginLayoutParams) layoutParams).bottomMargin = (int) TypedValue.applyDimension(1, 62.0f, resources.getDisplayMetrics());
        }
        relativeLayout.setGravity(16);
        TuxTextView tuxTextView = new TuxTextView(context);
        tuxTextView.setId(R.id.ahp);
        TypedArray obtainStyledAttributes = context.getTheme().obtainStyledAttributes(new int[]{R.attr.aa});
        tuxTextView.setTextColor(obtainStyledAttributes.getColor(0, 0));
        obtainStyledAttributes.recycle();
        RelativeLayout.LayoutParams layoutParams2 = new RelativeLayout.LayoutParams(-2, -2);
        if (RelativeLayout.LayoutParams.class.isInstance(layoutParams2)) {
            layoutParams2.addRule(16, R.id.aho);
        }
        f.a("app:tux_font", new a.c("H1_Semibold"), tuxTextView, layoutParams2);
        f.a(tuxTextView, layoutParams2);
        android.view.a.a(tuxTextView);
        if (tuxTextView.getParent() == null) {
            relativeLayout.addView(tuxTextView, layoutParams2);
        }
        TuxTextView tuxTextView2 = new TuxTextView(context);
        tuxTextView2.setId(R.id.aho);
        TypedArray obtainStyledAttributes2 = context.getTheme().obtainStyledAttributes(new int[]{R.attr.aa});
        tuxTextView2.setTextColor(obtainStyledAttributes2.getColor(0, 0));
        obtainStyledAttributes2.recycle();
        tuxTextView2.setText("/");
        RelativeLayout.LayoutParams layoutParams3 = new RelativeLayout.LayoutParams((int) TypedValue.applyDimension(1, 6.0f, resources.getDisplayMetrics()), (int) TypedValue.applyDimension(1, 20.0f, resources.getDisplayMetrics()));
        if (RelativeLayout.LayoutParams.class.isInstance(layoutParams3)) {
            layoutParams3.addRule(13, -1);
        }
        if (ViewGroup.MarginLayoutParams.class.isInstance(layoutParams3)) {
            int i2 = Build.VERSION.SDK_INT;
            layoutParams3.setMarginStart((int) TypedValue.applyDimension(1, 19.0f, resources.getDisplayMetrics()));
        }
        if (ViewGroup.MarginLayoutParams.class.isInstance(layoutParams3)) {
            ((ViewGroup.MarginLayoutParams) layoutParams3).leftMargin = (int) TypedValue.applyDimension(1, 19.0f, resources.getDisplayMetrics());
        }
        if (ViewGroup.MarginLayoutParams.class.isInstance(layoutParams3)) {
            int i3 = Build.VERSION.SDK_INT;
            layoutParams3.setMarginEnd((int) TypedValue.applyDimension(1, 19.0f, resources.getDisplayMetrics()));
        }
        if (ViewGroup.MarginLayoutParams.class.isInstance(layoutParams3)) {
            ((ViewGroup.MarginLayoutParams) layoutParams3).rightMargin = (int) TypedValue.applyDimension(1, 19.0f, resources.getDisplayMetrics());
        }
        f.a("app:tux_font", new a.c("H3_Semibold"), tuxTextView2, layoutParams3);
        f.a(tuxTextView2, layoutParams3);
        android.view.a.a(tuxTextView2);
        if (tuxTextView2.getParent() == null) {
            relativeLayout.addView(tuxTextView2, layoutParams3);
        }
        TuxTextView tuxTextView3 = new TuxTextView(context);
        tuxTextView3.setId(R.id.ept);
        TypedArray obtainStyledAttributes3 = context.getTheme().obtainStyledAttributes(new int[]{R.attr.ac});
        tuxTextView3.setTextColor(obtainStyledAttributes3.getColor(0, 0));
        obtainStyledAttributes3.recycle();
        RelativeLayout.LayoutParams layoutParams4 = new RelativeLayout.LayoutParams(-2, -2);
        if (RelativeLayout.LayoutParams.class.isInstance(layoutParams4)) {
            layoutParams4.addRule(17, R.id.aho);
        }
        f.a("app:tux_font", new a.c("H1_Semibold"), tuxTextView3, layoutParams4);
        f.a(tuxTextView3, layoutParams4);
        android.view.a.a(tuxTextView3);
        if (tuxTextView3.getParent() == null) {
            relativeLayout.addView(tuxTextView3, layoutParams4);
        }
        android.view.a.a(relativeLayout);
        if (relativeLayout.getParent() == null) {
            frameLayout.addView(relativeLayout, layoutParams);
        }
        View videoSeekBar = new VideoSeekBar(context);
        videoSeekBar.setId(R.id.fh7);
        videoSeekBar.setVisibility(8);
        ViewGroup.LayoutParams layoutParams5 = new FrameLayout.LayoutParams(-1, (int) TypedValue.applyDimension(1, 18.0f, resources.getDisplayMetrics()));
        android.view.a.a(videoSeekBar);
        if (videoSeekBar.getParent() == null) {
            frameLayout.addView(videoSeekBar, layoutParams5);
        }
        android.view.a.a(frameLayout);
        frameLayout.setLayoutParams(a2);
        if (viewGroup != null && z) {
            viewGroup.addView(frameLayout);
        }
        MethodCollector.o(2984);
        return frameLayout;
    }
}
