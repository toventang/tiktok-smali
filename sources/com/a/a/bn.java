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
import com.ss.android.ugc.aweme.commercialize.views.AdHalfWebPageContainer;
import com.ss.android.ugc.aweme.commercialize.views.AdHalfWebPageMaskLayer;
import com.zhiliaoapp.musically.R;

public final class bn implements e {
    static {
        Covode.recordClassIndex(1977);
    }

    @Override // com.a.b.e
    public final View a(Context context, ViewGroup viewGroup, boolean z) {
        MethodCollector.i(2006);
        Resources resources = context.getResources();
        FrameLayout frameLayout = new FrameLayout(context);
        frameLayout.setBackgroundColor(resources.getColor(R.color.c9));
        frameLayout.setId(R.id.al1);
        ViewGroup.MarginLayoutParams a2 = a.a(viewGroup, -1, -1);
        FrameLayout frameLayout2 = new FrameLayout(context);
        frameLayout2.setId(R.id.b97);
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-1, -1);
        a.a(frameLayout2);
        if (frameLayout2.getParent() == null) {
            frameLayout.addView(frameLayout2, layoutParams);
        }
        FrameLayout frameLayout3 = new FrameLayout(context);
        frameLayout3.setId(R.id.b94);
        FrameLayout.LayoutParams layoutParams2 = new FrameLayout.LayoutParams(-1, -1);
        a.a(frameLayout3);
        if (frameLayout3.getParent() == null) {
            frameLayout.addView(frameLayout3, layoutParams2);
        }
        AppCompatImageView appCompatImageView = new AppCompatImageView(context);
        appCompatImageView.setImageResource(2131233103);
        FrameLayout.LayoutParams layoutParams3 = new FrameLayout.LayoutParams(-2, -2);
        if (LinearLayout.LayoutParams.class.isInstance(layoutParams3)) {
            ((LinearLayout.LayoutParams) layoutParams3).gravity = 51;
        }
        if (FrameLayout.LayoutParams.class.isInstance(layoutParams3)) {
            layoutParams3.gravity = 51;
        }
        if (DrawerLayout.d.class.isInstance(layoutParams3)) {
            ((DrawerLayout.d) layoutParams3).f2691a = 51;
        }
        a.a(appCompatImageView);
        if (appCompatImageView.getParent() == null) {
            frameLayout.addView(appCompatImageView, layoutParams3);
        }
        AppCompatImageView appCompatImageView2 = new AppCompatImageView(context);
        appCompatImageView2.setImageResource(2131233104);
        FrameLayout.LayoutParams layoutParams4 = new FrameLayout.LayoutParams(-2, -2);
        if (LinearLayout.LayoutParams.class.isInstance(layoutParams4)) {
            ((LinearLayout.LayoutParams) layoutParams4).gravity = 53;
        }
        if (FrameLayout.LayoutParams.class.isInstance(layoutParams4)) {
            layoutParams4.gravity = 53;
        }
        if (DrawerLayout.d.class.isInstance(layoutParams4)) {
            ((DrawerLayout.d) layoutParams4).f2691a = 53;
        }
        a.a(appCompatImageView2);
        if (appCompatImageView2.getParent() == null) {
            frameLayout.addView(appCompatImageView2, layoutParams4);
        }
        FrameLayout frameLayout4 = new FrameLayout(context);
        frameLayout4.setId(R.id.bcd);
        FrameLayout.LayoutParams layoutParams5 = new FrameLayout.LayoutParams(-1, -1);
        a.a(frameLayout4);
        if (frameLayout4.getParent() == null) {
            frameLayout.addView(frameLayout4, layoutParams5);
        }
        FrameLayout frameLayout5 = new FrameLayout(context);
        frameLayout5.setId(R.id.gg);
        FrameLayout.LayoutParams layoutParams6 = new FrameLayout.LayoutParams(-1, -1);
        a.a(frameLayout5);
        if (frameLayout5.getParent() == null) {
            frameLayout.addView(frameLayout5, layoutParams6);
        }
        AdHalfWebPageMaskLayer adHalfWebPageMaskLayer = new AdHalfWebPageMaskLayer(context);
        adHalfWebPageMaskLayer.setId(R.id.gu);
        FrameLayout.LayoutParams layoutParams7 = new FrameLayout.LayoutParams(-1, -1);
        a.a(adHalfWebPageMaskLayer);
        if (adHalfWebPageMaskLayer.getParent() == null) {
            frameLayout.addView(adHalfWebPageMaskLayer, layoutParams7);
        }
        AdHalfWebPageContainer adHalfWebPageContainer = new AdHalfWebPageContainer(context);
        adHalfWebPageContainer.setId(R.id.gt);
        FrameLayout.LayoutParams layoutParams8 = new FrameLayout.LayoutParams((int) TypedValue.applyDimension(1, 270.0f, resources.getDisplayMetrics()), (int) TypedValue.applyDimension(1, 295.0f, resources.getDisplayMetrics()));
        if (LinearLayout.LayoutParams.class.isInstance(layoutParams8)) {
            ((LinearLayout.LayoutParams) layoutParams8).gravity = 81;
        }
        if (FrameLayout.LayoutParams.class.isInstance(layoutParams8)) {
            layoutParams8.gravity = 81;
        }
        if (DrawerLayout.d.class.isInstance(layoutParams8)) {
            ((DrawerLayout.d) layoutParams8).f2691a = 81;
        }
        if (ViewGroup.MarginLayoutParams.class.isInstance(layoutParams8)) {
            ((ViewGroup.MarginLayoutParams) layoutParams8).bottomMargin = (int) TypedValue.applyDimension(1, -300.0f, resources.getDisplayMetrics());
        }
        a.a(adHalfWebPageContainer);
        if (adHalfWebPageContainer.getParent() == null) {
            frameLayout.addView(adHalfWebPageContainer, layoutParams8);
        }
        FrameLayout frameLayout6 = new FrameLayout(context);
        frameLayout6.setId(R.id.b6p);
        frameLayout6.setVisibility(8);
        FrameLayout.LayoutParams layoutParams9 = new FrameLayout.LayoutParams(-1, -1);
        a.a(frameLayout6);
        if (frameLayout6.getParent() == null) {
            frameLayout.addView(frameLayout6, layoutParams9);
        }
        FrameLayout frameLayout7 = new FrameLayout(context);
        frameLayout7.setId(R.id.erg);
        frameLayout7.setVisibility(8);
        FrameLayout.LayoutParams layoutParams10 = new FrameLayout.LayoutParams(-2, -2);
        a.a(frameLayout7);
        if (frameLayout7.getParent() == null) {
            frameLayout.addView(frameLayout7, layoutParams10);
        }
        ViewStub viewStub = new ViewStub(context);
        viewStub.setId(R.id.ac_);
        viewStub.setLayoutResource(R.layout.rx);
        FrameLayout.LayoutParams layoutParams11 = new FrameLayout.LayoutParams(-1, -1);
        viewStub.setInflatedId(-1);
        a.a(viewStub);
        if (viewStub.getParent() == null) {
            frameLayout.addView(viewStub, layoutParams11);
        }
        ViewStub viewStub2 = new ViewStub(context);
        viewStub2.setId(R.id.eg);
        viewStub2.setLayoutResource(R.layout.wc);
        FrameLayout.LayoutParams layoutParams12 = new FrameLayout.LayoutParams(-1, -1);
        viewStub2.setInflatedId(-1);
        a.a(viewStub2);
        if (viewStub2.getParent() == null) {
            frameLayout.addView(viewStub2, layoutParams12);
        }
        a.a(frameLayout);
        frameLayout.setLayoutParams(a2);
        if (viewGroup != null && z) {
            viewGroup.addView(frameLayout);
        }
        MethodCollector.o(2006);
        return frameLayout;
    }
}
