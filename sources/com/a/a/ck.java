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
import com.bytedance.android.live.core.widget.HSImageView;
import com.bytedance.android.live.design.widget.LiveTextView;
import com.bytedance.android.livesdk.widget.LiveLoadingView;
import com.bytedance.android.widget.WidgetContainer;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.zhiliaoapp.musically.R;

public final class ck implements e {
    static {
        Covode.recordClassIndex(2001);
    }

    @Override // com.a.b.e
    public final View a(Context context, ViewGroup viewGroup, boolean z) {
        MethodCollector.i(683);
        Resources resources = context.getResources();
        FrameLayout frameLayout = new FrameLayout(context);
        frameLayout.setId(R.id.ad7);
        ViewGroup.LayoutParams a2 = a.a(viewGroup, -1, -1);
        HSImageView hSImageView = new HSImageView(context);
        hSImageView.setId(R.id.cbz);
        hSImageView.setScaleType(ImageView.ScaleType.CENTER_CROP);
        hSImageView.setVisibility(8);
        ViewGroup.LayoutParams layoutParams = new FrameLayout.LayoutParams(-1, -1);
        com.a.a.a.a.a aVar = new com.a.a.a.a.a();
        aVar.a("custom:placeholderImageScaleType", new a.c("centerCrop"), hSImageView, layoutParams);
        aVar.a(hSImageView, layoutParams);
        android.view.a.a(hSImageView);
        if (hSImageView.getParent() == null) {
            frameLayout.addView(hSImageView, layoutParams);
        }
        View widgetContainer = new WidgetContainer(context);
        widgetContainer.setId(R.id.d98);
        ViewGroup.LayoutParams layoutParams2 = new FrameLayout.LayoutParams(-1, -1);
        android.view.a.a(widgetContainer);
        if (widgetContainer.getParent() == null) {
            frameLayout.addView(widgetContainer, layoutParams2);
        }
        View frameLayout2 = new FrameLayout(context);
        frameLayout2.setId(R.id.jn);
        ViewGroup.LayoutParams layoutParams3 = new FrameLayout.LayoutParams(-1, -1);
        android.view.a.a(frameLayout2);
        if (frameLayout2.getParent() == null) {
            frameLayout.addView(frameLayout2, layoutParams3);
        }
        HSImageView hSImageView2 = new HSImageView(context);
        hSImageView2.setId(R.id.cbt);
        hSImageView2.setScaleType(ImageView.ScaleType.CENTER_CROP);
        hSImageView2.setVisibility(0);
        ViewGroup.LayoutParams layoutParams4 = new FrameLayout.LayoutParams(-1, -1);
        com.a.a.a.a.a aVar2 = new com.a.a.a.a.a();
        aVar2.a("custom:placeholderImage", new a.b("2131234762", "drawable"), hSImageView2, layoutParams4);
        aVar2.a("custom:placeholderImageScaleType", new a.c("centerCrop"), hSImageView2, layoutParams4);
        aVar2.a(hSImageView2, layoutParams4);
        android.view.a.a(hSImageView2);
        if (hSImageView2.getParent() == null) {
            frameLayout.addView(hSImageView2, layoutParams4);
        }
        View frameLayout3 = new FrameLayout(context);
        frameLayout3.setId(R.id.bqk);
        ViewGroup.LayoutParams layoutParams5 = new FrameLayout.LayoutParams(-1, -1);
        android.view.a.a(frameLayout3);
        if (frameLayout3.getParent() == null) {
            frameLayout.addView(frameLayout3, layoutParams5);
        }
        View frameLayout4 = new FrameLayout(context);
        frameLayout4.setId(R.id.bb4);
        frameLayout4.setVisibility(8);
        ViewGroup.LayoutParams layoutParams6 = new FrameLayout.LayoutParams(-1, -1);
        android.view.a.a(frameLayout4);
        if (frameLayout4.getParent() == null) {
            frameLayout.addView(frameLayout4, layoutParams6);
        }
        FrameLayout frameLayout5 = new FrameLayout(context);
        frameLayout5.setId(R.id.bqb);
        frameLayout5.setClickable(false);
        frameLayout5.setVisibility(8);
        ViewGroup.LayoutParams layoutParams7 = new FrameLayout.LayoutParams(-1, -1);
        HSImageView hSImageView3 = new HSImageView(context);
        hSImageView3.setId(R.id.tl);
        FrameLayout.LayoutParams layoutParams8 = new FrameLayout.LayoutParams((int) TypedValue.applyDimension(1, 156.0f, resources.getDisplayMetrics()), -1);
        if (LinearLayout.LayoutParams.class.isInstance(layoutParams8)) {
            ((LinearLayout.LayoutParams) layoutParams8).gravity = 8388613;
        }
        if (FrameLayout.LayoutParams.class.isInstance(layoutParams8)) {
            layoutParams8.gravity = 8388613;
        }
        if (DrawerLayout.d.class.isInstance(layoutParams8)) {
            ((DrawerLayout.d) layoutParams8).f2691a = 8388613;
        }
        android.view.a.a(hSImageView3);
        if (hSImageView3.getParent() == null) {
            frameLayout5.addView(hSImageView3, layoutParams8);
        }
        HSImageView hSImageView4 = new HSImageView(context);
        hSImageView4.setId(R.id.bdq);
        FrameLayout.LayoutParams layoutParams9 = new FrameLayout.LayoutParams((int) TypedValue.applyDimension(1, 260.0f, resources.getDisplayMetrics()), (int) TypedValue.applyDimension(1, 260.0f, resources.getDisplayMetrics()));
        if (LinearLayout.LayoutParams.class.isInstance(layoutParams9)) {
            ((LinearLayout.LayoutParams) layoutParams9).gravity = 1;
        }
        if (FrameLayout.LayoutParams.class.isInstance(layoutParams9)) {
            layoutParams9.gravity = 1;
        }
        if (DrawerLayout.d.class.isInstance(layoutParams9)) {
            ((DrawerLayout.d) layoutParams9).f2691a = 1;
        }
        if (ViewGroup.MarginLayoutParams.class.isInstance(layoutParams9)) {
            ((ViewGroup.MarginLayoutParams) layoutParams9).topMargin = (int) TypedValue.applyDimension(1, 170.0f, resources.getDisplayMetrics());
        }
        android.view.a.a(hSImageView4);
        if (hSImageView4.getParent() == null) {
            frameLayout5.addView(hSImageView4, layoutParams9);
        }
        LiveTextView liveTextView = new LiveTextView(context);
        liveTextView.setId(R.id.cc8);
        liveTextView.setTextColor(resources.getColorStateList(R.color.a2r));
        liveTextView.setTextSize(2, 28.0f);
        FrameLayout.LayoutParams layoutParams10 = new FrameLayout.LayoutParams(-2, -2);
        if (ViewGroup.MarginLayoutParams.class.isInstance(layoutParams10)) {
            ((ViewGroup.MarginLayoutParams) layoutParams10).topMargin = (int) TypedValue.applyDimension(1, 380.0f, resources.getDisplayMetrics());
        }
        liveTextView.setGravity(17);
        if (LinearLayout.LayoutParams.class.isInstance(layoutParams10)) {
            ((LinearLayout.LayoutParams) layoutParams10).gravity = 1;
        }
        if (FrameLayout.LayoutParams.class.isInstance(layoutParams10)) {
            layoutParams10.gravity = 1;
        }
        if (DrawerLayout.d.class.isInstance(layoutParams10)) {
            ((DrawerLayout.d) layoutParams10).f2691a = 1;
        }
        android.view.a.a(liveTextView);
        if (liveTextView.getParent() == null) {
            frameLayout5.addView(liveTextView, layoutParams10);
        }
        android.view.a.a(frameLayout5);
        if (frameLayout5.getParent() == null) {
            frameLayout.addView(frameLayout5, layoutParams7);
        }
        LiveLoadingView liveLoadingView = new LiveLoadingView(context);
        liveLoadingView.setId(R.id.cc1);
        liveLoadingView.setVisibility(8);
        FrameLayout.LayoutParams layoutParams11 = new FrameLayout.LayoutParams(-2, -2);
        if (LinearLayout.LayoutParams.class.isInstance(layoutParams11)) {
            ((LinearLayout.LayoutParams) layoutParams11).gravity = 17;
        }
        if (FrameLayout.LayoutParams.class.isInstance(layoutParams11)) {
            layoutParams11.gravity = 17;
        }
        if (DrawerLayout.d.class.isInstance(layoutParams11)) {
            ((DrawerLayout.d) layoutParams11).f2691a = 17;
        }
        android.view.a.a(liveLoadingView);
        if (liveLoadingView.getParent() == null) {
            frameLayout.addView(liveLoadingView, layoutParams11);
        }
        android.view.a.a(frameLayout);
        frameLayout.setLayoutParams(a2);
        if (viewGroup != null && z) {
            viewGroup.addView(frameLayout);
        }
        MethodCollector.o(683);
        return frameLayout;
    }
}
