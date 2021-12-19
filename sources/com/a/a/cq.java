package com.a.a;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Color;
import android.os.Build;
import android.util.TypedValue;
import android.view.View;
import android.view.ViewGroup;
import android.view.a;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.drawerlayout.widget.DrawerLayout;
import com.a.b.e;
import com.bytedance.android.live.design.widget.LiveTextView;
import com.bytedance.android.livesdk.widget.LiveLoadingView;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.zhiliaoapp.musically.R;

public final class cq implements e {
    static {
        Covode.recordClassIndex(2007);
    }

    @Override // com.a.b.e
    public final View a(Context context, ViewGroup viewGroup, boolean z) {
        MethodCollector.i(1211);
        Resources resources = context.getResources();
        FrameLayout frameLayout = new FrameLayout(context);
        frameLayout.setBackgroundResource(R.drawable.bt3);
        ViewGroup.LayoutParams a2 = a.a(viewGroup, -1, -1);
        LinearLayout linearLayout = new LinearLayout(context);
        linearLayout.setOrientation(1);
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-2, -2);
        if (LinearLayout.LayoutParams.class.isInstance(layoutParams)) {
            ((LinearLayout.LayoutParams) layoutParams).gravity = 17;
        }
        if (FrameLayout.LayoutParams.class.isInstance(layoutParams)) {
            layoutParams.gravity = 17;
        }
        if (DrawerLayout.d.class.isInstance(layoutParams)) {
            ((DrawerLayout.d) layoutParams).f2691a = 17;
        }
        if (ViewGroup.MarginLayoutParams.class.isInstance(layoutParams)) {
            int i2 = Build.VERSION.SDK_INT;
            layoutParams.setMarginStart((int) TypedValue.applyDimension(1, 12.0f, resources.getDisplayMetrics()));
        }
        if (ViewGroup.MarginLayoutParams.class.isInstance(layoutParams)) {
            int i3 = Build.VERSION.SDK_INT;
            layoutParams.setMarginEnd((int) TypedValue.applyDimension(1, 12.0f, resources.getDisplayMetrics()));
        }
        View liveLoadingView = new LiveLoadingView(context);
        liveLoadingView.setId(R.id.ci9);
        LinearLayout.LayoutParams layoutParams2 = new LinearLayout.LayoutParams(-2, -2);
        if (LinearLayout.LayoutParams.class.isInstance(layoutParams2)) {
            layoutParams2.gravity = 1;
        }
        if (FrameLayout.LayoutParams.class.isInstance(layoutParams2)) {
            ((FrameLayout.LayoutParams) layoutParams2).gravity = 1;
        }
        if (DrawerLayout.d.class.isInstance(layoutParams2)) {
            ((DrawerLayout.d) layoutParams2).f2691a = 1;
        }
        a.a(liveLoadingView);
        if (liveLoadingView.getParent() == null) {
            linearLayout.addView(liveLoadingView, layoutParams2);
        }
        LiveTextView liveTextView = new LiveTextView(context);
        liveTextView.setId(R.id.f9i);
        liveTextView.setTextColor(Color.parseColor("#FFFFFF"));
        liveTextView.setTextSize(1, 14.0f);
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
        liveTextView.setGravity(17);
        a.a(liveTextView);
        if (liveTextView.getParent() == null) {
            linearLayout.addView(liveTextView, layoutParams3);
        }
        LinearLayout linearLayout2 = new LinearLayout(context);
        linearLayout2.setId(R.id.a1r);
        linearLayout2.setOrientation(0);
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
            ((ViewGroup.MarginLayoutParams) layoutParams4).topMargin = (int) TypedValue.applyDimension(1, 36.0f, resources.getDisplayMetrics());
        }
        AppCompatImageView appCompatImageView = new AppCompatImageView(context);
        appCompatImageView.setImageResource(2131234466);
        LinearLayout.LayoutParams layoutParams5 = new LinearLayout.LayoutParams((int) TypedValue.applyDimension(1, 15.0f, resources.getDisplayMetrics()), (int) TypedValue.applyDimension(1, 10.0f, resources.getDisplayMetrics()));
        if (LinearLayout.LayoutParams.class.isInstance(layoutParams5)) {
            layoutParams5.gravity = 17;
        }
        if (FrameLayout.LayoutParams.class.isInstance(layoutParams5)) {
            ((FrameLayout.LayoutParams) layoutParams5).gravity = 17;
        }
        if (DrawerLayout.d.class.isInstance(layoutParams5)) {
            ((DrawerLayout.d) layoutParams5).f2691a = 17;
        }
        a.a(appCompatImageView);
        if (appCompatImageView.getParent() == null) {
            linearLayout2.addView(appCompatImageView, layoutParams5);
        }
        LiveTextView liveTextView2 = new LiveTextView(context);
        liveTextView2.setIncludeFontPadding(false);
        liveTextView2.setText(R.string.dxk);
        liveTextView2.setTextColor(Color.parseColor("#C0FFFFFF"));
        liveTextView2.setTextSize(1, 14.0f);
        LinearLayout.LayoutParams layoutParams6 = new LinearLayout.LayoutParams(-2, -2);
        if (LinearLayout.LayoutParams.class.isInstance(layoutParams6)) {
            layoutParams6.gravity = 17;
        }
        if (FrameLayout.LayoutParams.class.isInstance(layoutParams6)) {
            ((FrameLayout.LayoutParams) layoutParams6).gravity = 17;
        }
        if (DrawerLayout.d.class.isInstance(layoutParams6)) {
            ((DrawerLayout.d) layoutParams6).f2691a = 17;
        }
        if (ViewGroup.MarginLayoutParams.class.isInstance(layoutParams6)) {
            int i4 = Build.VERSION.SDK_INT;
            layoutParams6.setMarginStart((int) TypedValue.applyDimension(1, 7.0f, resources.getDisplayMetrics()));
        }
        a.a(liveTextView2);
        if (liveTextView2.getParent() == null) {
            linearLayout2.addView(liveTextView2, layoutParams6);
        }
        a.a(linearLayout2);
        if (linearLayout2.getParent() == null) {
            linearLayout.addView(linearLayout2, layoutParams4);
        }
        a.a(linearLayout);
        if (linearLayout.getParent() == null) {
            frameLayout.addView(linearLayout, layoutParams);
        }
        a.a(frameLayout);
        frameLayout.setLayoutParams(a2);
        if (viewGroup != null && z) {
            viewGroup.addView(frameLayout);
        }
        MethodCollector.o(1211);
        return frameLayout;
    }
}
