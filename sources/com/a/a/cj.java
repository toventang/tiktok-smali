package com.a.a;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Color;
import android.os.Build;
import android.util.DisplayMetrics;
import android.util.TypedValue;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewStub;
import android.view.a;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.drawerlayout.widget.DrawerLayout;
import com.a.b.a.a;
import com.a.b.e;
import com.bytedance.android.live.broadcast.view.LinkCrossGuestBgView;
import com.bytedance.android.live.broadcast.view.LiveCenterContainerView;
import com.bytedance.android.live.design.widget.LiveTextView;
import com.bytedance.android.live.design.widget.shapecontrol.ShapeControllableView;
import com.bytedance.android.livesdk.livesetting.pullstream.LiveNetAdaptiveHurryTimeSetting;
import com.bytedance.android.livesdk.widget.DisallowInterceptFrameLayout;
import com.bytedance.android.livesdk.widget.GestureDetectLayout;
import com.bytedance.android.widget.WidgetContainer;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.zhiliaoapp.musically.R;

public final class cj implements e {
    static {
        Covode.recordClassIndex(LiveNetAdaptiveHurryTimeSetting.DEFAULT);
    }

    @Override // com.a.b.e
    public final View a(Context context, ViewGroup viewGroup, boolean z) {
        int i2;
        int i3;
        int i4;
        int i5;
        int i6;
        int i7;
        int i8;
        int i9;
        int i10;
        int i11;
        int i12;
        int i13;
        int i14;
        int i15;
        float f2;
        int i16;
        boolean z2;
        int i17;
        float f3;
        int i18;
        int i19;
        int i20;
        float f4;
        int i21;
        int i22;
        int i23;
        float f5;
        int i24;
        float f6;
        float f7;
        int i25;
        int i26;
        int i27;
        int i28;
        int i29;
        int i30;
        float f8;
        int i31;
        float f9;
        int i32;
        float f10;
        int i33;
        float f11;
        int i34;
        int i35;
        int i36;
        int i37;
        float f12;
        int i38;
        int i39;
        int i40;
        int i41;
        int i42;
        int i43;
        MethodCollector.i(1836);
        Resources resources = context.getResources();
        GestureDetectLayout gestureDetectLayout = new GestureDetectLayout(context);
        gestureDetectLayout.setId(R.id.d1y);
        gestureDetectLayout.setClipChildren(false);
        ViewGroup.LayoutParams a2 = a.a(viewGroup, -1, -1);
        FrameLayout frameLayout = new FrameLayout(context);
        frameLayout.setId(R.id.bql);
        ViewGroup.LayoutParams a3 = a.a(gestureDetectLayout, -1, -1);
        View view = new View(context);
        view.setId(R.id.d2b);
        view.setBackgroundColor(Color.parseColor("#B3000000"));
        view.setVisibility(4);
        ViewGroup.LayoutParams layoutParams = new FrameLayout.LayoutParams(-1, -1);
        a.a(view);
        if (view.getParent() == null) {
            frameLayout.addView(view, layoutParams);
        }
        RelativeLayout relativeLayout = new RelativeLayout(context);
        ViewGroup.LayoutParams layoutParams2 = new FrameLayout.LayoutParams(-1, -1);
        ConstraintLayout constraintLayout = new ConstraintLayout(context);
        constraintLayout.setId(R.id.cye);
        constraintLayout.setVisibility(8);
        ViewGroup.LayoutParams layoutParams3 = new RelativeLayout.LayoutParams((int) TypedValue.applyDimension(1, 0.0f, resources.getDisplayMetrics()), (int) TypedValue.applyDimension(1, 0.0f, resources.getDisplayMetrics()));
        a.a(constraintLayout);
        if (constraintLayout.getParent() == null) {
            relativeLayout.addView(constraintLayout, layoutParams3);
        }
        View view2 = new View(context);
        view2.setId(R.id.e06);
        view2.setBackgroundResource(R.drawable.bs2);
        ViewGroup.LayoutParams layoutParams4 = new RelativeLayout.LayoutParams(-1, (int) TypedValue.applyDimension(1, 96.0f, resources.getDisplayMetrics()));
        a.a(view2);
        if (view2.getParent() == null) {
            relativeLayout.addView(view2, layoutParams4);
        }
        View view3 = new View(context);
        view3.setId(R.id.va);
        view3.setBackgroundResource(R.drawable.bs1);
        RelativeLayout.LayoutParams layoutParams5 = new RelativeLayout.LayoutParams(-1, (int) TypedValue.applyDimension(1, 240.0f, resources.getDisplayMetrics()));
        if (RelativeLayout.LayoutParams.class.isInstance(layoutParams5)) {
            layoutParams5.addRule(12, -1);
        }
        a.a(view3);
        if (view3.getParent() == null) {
            relativeLayout.addView(view3, layoutParams5);
        }
        a.a(relativeLayout);
        if (relativeLayout.getParent() == null) {
            frameLayout.addView(relativeLayout, layoutParams2);
        }
        FrameLayout frameLayout2 = new FrameLayout(context);
        frameLayout2.setId(R.id.h2);
        ViewGroup.LayoutParams layoutParams6 = new FrameLayout.LayoutParams(-1, -1);
        View widgetContainer = new WidgetContainer(context);
        widgetContainer.setId(R.id.awq);
        ViewGroup.LayoutParams layoutParams7 = new FrameLayout.LayoutParams(-2, -1);
        a.a(widgetContainer);
        if (widgetContainer.getParent() == null) {
            frameLayout2.addView(widgetContainer, layoutParams7);
        }
        View view4 = new View(context);
        view4.setId(R.id.bqp);
        view4.setVisibility(8);
        ViewGroup.LayoutParams layoutParams8 = new FrameLayout.LayoutParams(-1, -1);
        a.a(view4);
        if (view4.getParent() == null) {
            frameLayout2.addView(view4, layoutParams8);
        }
        View frameLayout3 = new FrameLayout(context);
        frameLayout3.setId(R.id.bbn);
        ViewGroup.LayoutParams layoutParams9 = new FrameLayout.LayoutParams(-1, -1);
        a.a(frameLayout3);
        if (frameLayout3.getParent() == null) {
            frameLayout2.addView(frameLayout3, layoutParams9);
        }
        View frameLayout4 = new FrameLayout(context);
        frameLayout4.setId(R.id.bqc);
        ViewGroup.LayoutParams layoutParams10 = new FrameLayout.LayoutParams(-1, -1);
        a.a(frameLayout4);
        if (frameLayout4.getParent() == null) {
            frameLayout2.addView(frameLayout4, layoutParams10);
        }
        View linkCrossGuestBgView = new LinkCrossGuestBgView(context);
        linkCrossGuestBgView.setId(R.id.sl);
        linkCrossGuestBgView.setVisibility(8);
        ViewGroup.LayoutParams layoutParams11 = new FrameLayout.LayoutParams(-1, -1);
        a.a(linkCrossGuestBgView);
        if (linkCrossGuestBgView.getParent() == null) {
            frameLayout2.addView(linkCrossGuestBgView, layoutParams11);
        }
        View widgetContainer2 = new WidgetContainer(context);
        widgetContainer2.setId(R.id.d54);
        ViewGroup.LayoutParams layoutParams12 = new FrameLayout.LayoutParams(-1, -1);
        a.a(widgetContainer2);
        if (widgetContainer2.getParent() == null) {
            frameLayout2.addView(widgetContainer2, layoutParams12);
        }
        View widgetContainer3 = new WidgetContainer(context);
        widgetContainer3.setId(R.id.d0p);
        ViewGroup.LayoutParams layoutParams13 = new FrameLayout.LayoutParams(-1, -1);
        a.a(widgetContainer3);
        if (widgetContainer3.getParent() == null) {
            frameLayout2.addView(widgetContainer3, layoutParams13);
        }
        View widgetContainer4 = new WidgetContainer(context);
        widgetContainer4.setId(R.id.cwb);
        ViewGroup.LayoutParams layoutParams14 = new FrameLayout.LayoutParams(-1, -1);
        a.a(widgetContainer4);
        if (widgetContainer4.getParent() == null) {
            frameLayout2.addView(widgetContainer4, layoutParams14);
        }
        View widgetContainer5 = new WidgetContainer(context);
        widgetContainer5.setId(R.id.ji);
        ViewGroup.LayoutParams layoutParams15 = new FrameLayout.LayoutParams(-1, -1);
        a.a(widgetContainer5);
        if (widgetContainer5.getParent() == null) {
            frameLayout2.addView(widgetContainer5, layoutParams15);
        }
        RelativeLayout relativeLayout2 = new RelativeLayout(context);
        relativeLayout2.setId(R.id.bqn);
        relativeLayout2.setClipChildren(false);
        ViewGroup.LayoutParams layoutParams16 = new FrameLayout.LayoutParams(-1, -1);
        View frameLayout5 = new FrameLayout(context);
        frameLayout5.setId(R.id.bqo);
        frameLayout5.setBackgroundResource(R.drawable.bra);
        frameLayout5.setVisibility(8);
        ViewGroup.LayoutParams layoutParams17 = new RelativeLayout.LayoutParams(-1, (int) TypedValue.applyDimension(1, 140.0f, resources.getDisplayMetrics()));
        a.a(frameLayout5);
        if (frameLayout5.getParent() == null) {
            relativeLayout2.addView(frameLayout5, layoutParams17);
        }
        View widgetContainer6 = new WidgetContainer(context);
        widgetContainer6.setId(R.id.dy7);
        ViewGroup.LayoutParams layoutParams18 = new RelativeLayout.LayoutParams(-1, -1);
        a.a(widgetContainer6);
        if (widgetContainer6.getParent() == null) {
            relativeLayout2.addView(widgetContainer6, layoutParams18);
        }
        View widgetContainer7 = new WidgetContainer(context);
        widgetContainer7.setId(R.id.ccf);
        ViewGroup.LayoutParams layoutParams19 = new RelativeLayout.LayoutParams(-1, -1);
        a.a(widgetContainer7);
        if (widgetContainer7.getParent() == null) {
            relativeLayout2.addView(widgetContainer7, layoutParams19);
        }
        RelativeLayout relativeLayout3 = new RelativeLayout(context);
        relativeLayout3.setClipChildren(false);
        relativeLayout3.setId(R.id.epk);
        ViewGroup.LayoutParams layoutParams20 = new RelativeLayout.LayoutParams(-1, -2);
        View widgetContainer8 = new WidgetContainer(context);
        widgetContainer8.setId(R.id.fdb);
        RelativeLayout.LayoutParams layoutParams21 = new RelativeLayout.LayoutParams(-2, -2);
        if (RelativeLayout.LayoutParams.class.isInstance(layoutParams21)) {
            layoutParams21.addRule(15, -1);
        }
        if (ViewGroup.MarginLayoutParams.class.isInstance(layoutParams21)) {
            int i44 = Build.VERSION.SDK_INT;
            i2 = 1;
            layoutParams21.setMarginStart((int) TypedValue.applyDimension(1, 4.0f, resources.getDisplayMetrics()));
        } else {
            i2 = 1;
        }
        if (ViewGroup.MarginLayoutParams.class.isInstance(layoutParams21)) {
            ((ViewGroup.MarginLayoutParams) layoutParams21).leftMargin = (int) TypedValue.applyDimension(i2, 4.0f, resources.getDisplayMetrics());
        }
        if (ViewGroup.MarginLayoutParams.class.isInstance(layoutParams21)) {
            int i45 = Build.VERSION.SDK_INT;
            i3 = 1;
            layoutParams21.setMarginEnd((int) TypedValue.applyDimension(1, 12.0f, resources.getDisplayMetrics()));
        } else {
            i3 = 1;
        }
        if (ViewGroup.MarginLayoutParams.class.isInstance(layoutParams21)) {
            ((ViewGroup.MarginLayoutParams) layoutParams21).rightMargin = (int) TypedValue.applyDimension(i3, 12.0f, resources.getDisplayMetrics());
        }
        a.a(widgetContainer8);
        if (widgetContainer8.getParent() == null) {
            relativeLayout3.addView(widgetContainer8, layoutParams21);
        }
        View widgetContainer9 = new WidgetContainer(context);
        widgetContainer9.setId(R.id.n9);
        widgetContainer9.setBackgroundColor(resources.getColor(R.color.c9));
        RelativeLayout.LayoutParams layoutParams22 = new RelativeLayout.LayoutParams(-1, -2);
        if (RelativeLayout.LayoutParams.class.isInstance(layoutParams22)) {
            layoutParams22.addRule(21, -1);
        }
        if (RelativeLayout.LayoutParams.class.isInstance(layoutParams22)) {
            layoutParams22.addRule(11, -1);
        }
        if (RelativeLayout.LayoutParams.class.isInstance(layoutParams22)) {
            layoutParams22.addRule(15, -1);
        }
        if (LinearLayout.LayoutParams.class.isInstance(layoutParams22)) {
            ((LinearLayout.LayoutParams) layoutParams22).gravity = 8388613;
        }
        if (FrameLayout.LayoutParams.class.isInstance(layoutParams22)) {
            ((FrameLayout.LayoutParams) layoutParams22).gravity = 8388613;
        }
        if (DrawerLayout.d.class.isInstance(layoutParams22)) {
            ((DrawerLayout.d) layoutParams22).f2691a = 8388613;
        }
        if (ViewGroup.MarginLayoutParams.class.isInstance(layoutParams22)) {
            int i46 = Build.VERSION.SDK_INT;
            i4 = 1;
            layoutParams22.setMarginEnd((int) TypedValue.applyDimension(1, 12.0f, resources.getDisplayMetrics()));
        } else {
            i4 = 1;
        }
        if (ViewGroup.MarginLayoutParams.class.isInstance(layoutParams22)) {
            ((ViewGroup.MarginLayoutParams) layoutParams22).rightMargin = (int) TypedValue.applyDimension(i4, 12.0f, resources.getDisplayMetrics());
        }
        if (RelativeLayout.LayoutParams.class.isInstance(layoutParams22)) {
            i5 = R.id.fdb;
            layoutParams22.addRule(17, R.id.fdb);
        } else {
            i5 = R.id.fdb;
        }
        if (RelativeLayout.LayoutParams.class.isInstance(layoutParams22)) {
            layoutParams22.addRule(1, i5);
        }
        a.a(widgetContainer9);
        if (widgetContainer9.getParent() == null) {
            relativeLayout3.addView(widgetContainer9, layoutParams22);
        }
        View frameLayout6 = new FrameLayout(context);
        frameLayout6.setId(R.id.ep5);
        RelativeLayout.LayoutParams layoutParams23 = new RelativeLayout.LayoutParams(-1, -2);
        if (RelativeLayout.LayoutParams.class.isInstance(layoutParams23)) {
            layoutParams23.addRule(15, -1);
        }
        if (ViewGroup.MarginLayoutParams.class.isInstance(layoutParams23)) {
            int i47 = Build.VERSION.SDK_INT;
            i6 = 1;
            layoutParams23.setMarginStart((int) TypedValue.applyDimension(1, 12.0f, resources.getDisplayMetrics()));
        } else {
            i6 = 1;
        }
        if (ViewGroup.MarginLayoutParams.class.isInstance(layoutParams23)) {
            ((ViewGroup.MarginLayoutParams) layoutParams23).leftMargin = (int) TypedValue.applyDimension(i6, 12.0f, resources.getDisplayMetrics());
        }
        if (ViewGroup.MarginLayoutParams.class.isInstance(layoutParams23)) {
            int i48 = Build.VERSION.SDK_INT;
            i7 = 1;
            layoutParams23.setMarginEnd((int) TypedValue.applyDimension(1, 12.0f, resources.getDisplayMetrics()));
        } else {
            i7 = 1;
        }
        if (ViewGroup.MarginLayoutParams.class.isInstance(layoutParams23)) {
            ((ViewGroup.MarginLayoutParams) layoutParams23).rightMargin = (int) TypedValue.applyDimension(i7, 12.0f, resources.getDisplayMetrics());
        }
        if (RelativeLayout.LayoutParams.class.isInstance(layoutParams23)) {
            i8 = R.id.fdb;
            layoutParams23.addRule(17, R.id.fdb);
        } else {
            i8 = R.id.fdb;
        }
        if (RelativeLayout.LayoutParams.class.isInstance(layoutParams23)) {
            layoutParams23.addRule(1, i8);
        }
        a.a(frameLayout6);
        if (frameLayout6.getParent() == null) {
            relativeLayout3.addView(frameLayout6, layoutParams23);
        }
        View frameLayout7 = new FrameLayout(context);
        frameLayout7.setId(R.id.apt);
        RelativeLayout.LayoutParams layoutParams24 = new RelativeLayout.LayoutParams(-2, -2);
        if (RelativeLayout.LayoutParams.class.isInstance(layoutParams24)) {
            i9 = -1;
            layoutParams24.addRule(21, -1);
        } else {
            i9 = -1;
        }
        if (RelativeLayout.LayoutParams.class.isInstance(layoutParams24)) {
            layoutParams24.addRule(11, i9);
        }
        if (RelativeLayout.LayoutParams.class.isInstance(layoutParams24)) {
            layoutParams24.addRule(15, i9);
        }
        a.a(frameLayout7);
        if (frameLayout7.getParent() == null) {
            relativeLayout3.addView(frameLayout7, layoutParams24);
        }
        a.a(relativeLayout3);
        if (relativeLayout3.getParent() == null) {
            relativeLayout2.addView(relativeLayout3, layoutParams20);
        }
        View widgetContainer10 = new WidgetContainer(context);
        widgetContainer10.setId(R.id.c_x);
        RelativeLayout.LayoutParams layoutParams25 = new RelativeLayout.LayoutParams(-2, -2);
        if (ViewGroup.MarginLayoutParams.class.isInstance(layoutParams25)) {
            int i49 = Build.VERSION.SDK_INT;
            i10 = 1;
            layoutParams25.setMarginStart((int) TypedValue.applyDimension(1, 12.0f, resources.getDisplayMetrics()));
        } else {
            i10 = 1;
        }
        if (ViewGroup.MarginLayoutParams.class.isInstance(layoutParams25)) {
            ((ViewGroup.MarginLayoutParams) layoutParams25).leftMargin = (int) TypedValue.applyDimension(i10, 12.0f, resources.getDisplayMetrics());
        }
        a.a(widgetContainer10);
        if (widgetContainer10.getParent() == null) {
            relativeLayout2.addView(widgetContainer10, layoutParams25);
        }
        View frameLayout8 = new FrameLayout(context);
        frameLayout8.setId(R.id.eo6);
        frameLayout8.setPadding(frameLayout8.getPaddingLeft(), frameLayout8.getPaddingTop(), (int) TypedValue.applyDimension(1, 8.0f, resources.getDisplayMetrics()), frameLayout8.getPaddingBottom());
        frameLayout8.setPadding(frameLayout8.getPaddingLeft(), frameLayout8.getPaddingTop(), (int) TypedValue.applyDimension(1, 8.0f, resources.getDisplayMetrics()), frameLayout8.getPaddingBottom());
        RelativeLayout.LayoutParams layoutParams26 = new RelativeLayout.LayoutParams(-1, -2);
        if (RelativeLayout.LayoutParams.class.isInstance(layoutParams26)) {
            layoutParams26.addRule(3, R.id.epk);
        }
        if (ViewGroup.MarginLayoutParams.class.isInstance(layoutParams26)) {
            ((ViewGroup.MarginLayoutParams) layoutParams26).topMargin = (int) TypedValue.applyDimension(1, -1.0f, resources.getDisplayMetrics());
        }
        a.a(frameLayout8);
        if (frameLayout8.getParent() == null) {
            relativeLayout2.addView(frameLayout8, layoutParams26);
        }
        View frameLayout9 = new FrameLayout(context);
        frameLayout9.setId(R.id.dcl);
        RelativeLayout.LayoutParams layoutParams27 = new RelativeLayout.LayoutParams(-2, -2);
        if (RelativeLayout.LayoutParams.class.isInstance(layoutParams27)) {
            layoutParams27.addRule(3, R.id.epk);
        }
        if (RelativeLayout.LayoutParams.class.isInstance(layoutParams27)) {
            i11 = -1;
            layoutParams27.addRule(21, -1);
        } else {
            i11 = -1;
        }
        if (RelativeLayout.LayoutParams.class.isInstance(layoutParams27)) {
            layoutParams27.addRule(11, i11);
        }
        if (ViewGroup.MarginLayoutParams.class.isInstance(layoutParams27)) {
            int i50 = Build.VERSION.SDK_INT;
            i12 = 1;
            layoutParams27.setMarginEnd((int) TypedValue.applyDimension(1, 8.0f, resources.getDisplayMetrics()));
        } else {
            i12 = 1;
        }
        if (ViewGroup.MarginLayoutParams.class.isInstance(layoutParams27)) {
            ((ViewGroup.MarginLayoutParams) layoutParams27).rightMargin = (int) TypedValue.applyDimension(i12, 8.0f, resources.getDisplayMetrics());
        }
        a.a(frameLayout9);
        if (frameLayout9.getParent() == null) {
            relativeLayout2.addView(frameLayout9, layoutParams27);
        }
        View widgetContainer11 = new WidgetContainer(context);
        widgetContainer11.setId(R.id.cc7);
        RelativeLayout.LayoutParams layoutParams28 = new RelativeLayout.LayoutParams(-2, -2);
        if (RelativeLayout.LayoutParams.class.isInstance(layoutParams28)) {
            layoutParams28.addRule(3, R.id.epk);
        }
        if (RelativeLayout.LayoutParams.class.isInstance(layoutParams28)) {
            i13 = -1;
            layoutParams28.addRule(21, -1);
        } else {
            i13 = -1;
        }
        if (RelativeLayout.LayoutParams.class.isInstance(layoutParams28)) {
            layoutParams28.addRule(11, i13);
        }
        a.a(widgetContainer11);
        if (widgetContainer11.getParent() == null) {
            relativeLayout2.addView(widgetContainer11, layoutParams28);
        }
        View widgetContainer12 = new WidgetContainer(context);
        widgetContainer12.setId(R.id.cu6);
        RelativeLayout.LayoutParams layoutParams29 = new RelativeLayout.LayoutParams(-2, (int) TypedValue.applyDimension(1, 21.0f, resources.getDisplayMetrics()));
        if (RelativeLayout.LayoutParams.class.isInstance(layoutParams29)) {
            layoutParams29.addRule(3, R.id.epk);
        }
        if (RelativeLayout.LayoutParams.class.isInstance(layoutParams29)) {
            layoutParams29.addRule(0, R.id.cc7);
        }
        if (RelativeLayout.LayoutParams.class.isInstance(layoutParams29)) {
            layoutParams29.addRule(16, R.id.cc7);
        }
        if (ViewGroup.MarginLayoutParams.class.isInstance(layoutParams29)) {
            int i51 = Build.VERSION.SDK_INT;
            layoutParams29.setMarginEnd((int) TypedValue.applyDimension(1, 14.0f, resources.getDisplayMetrics()));
        }
        if (ViewGroup.MarginLayoutParams.class.isInstance(layoutParams29)) {
            ((ViewGroup.MarginLayoutParams) layoutParams29).rightMargin = (int) TypedValue.applyDimension(1, 14.0f, resources.getDisplayMetrics());
        }
        a.a(widgetContainer12);
        if (widgetContainer12.getParent() == null) {
            relativeLayout2.addView(widgetContainer12, layoutParams29);
        }
        View frameLayout10 = new FrameLayout(context);
        frameLayout10.setId(R.id.eop);
        RelativeLayout.LayoutParams layoutParams30 = new RelativeLayout.LayoutParams(-1, (int) TypedValue.applyDimension(1, 21.0f, resources.getDisplayMetrics()));
        if (RelativeLayout.LayoutParams.class.isInstance(layoutParams30)) {
            layoutParams30.addRule(3, R.id.epk);
        }
        a.a(frameLayout10);
        if (frameLayout10.getParent() == null) {
            relativeLayout2.addView(frameLayout10, layoutParams30);
        }
        ConstraintLayout constraintLayout2 = new ConstraintLayout(context);
        constraintLayout2.setId(R.id.rc);
        RelativeLayout.LayoutParams layoutParams31 = new RelativeLayout.LayoutParams(-2, -2);
        if (RelativeLayout.LayoutParams.class.isInstance(layoutParams31)) {
            layoutParams31.addRule(3, R.id.eop);
        }
        if (RelativeLayout.LayoutParams.class.isInstance(layoutParams31)) {
            i14 = -1;
            layoutParams31.addRule(21, -1);
        } else {
            i14 = -1;
        }
        if (RelativeLayout.LayoutParams.class.isInstance(layoutParams31)) {
            layoutParams31.addRule(11, i14);
        }
        if (ViewGroup.MarginLayoutParams.class.isInstance(layoutParams31)) {
            ((ViewGroup.MarginLayoutParams) layoutParams31).topMargin = (int) TypedValue.applyDimension(1, 8.0f, resources.getDisplayMetrics());
        }
        if (ViewGroup.MarginLayoutParams.class.isInstance(layoutParams31)) {
            int i52 = Build.VERSION.SDK_INT;
            i15 = 1;
            f2 = 12.0f;
            layoutParams31.setMarginEnd((int) TypedValue.applyDimension(1, 12.0f, resources.getDisplayMetrics()));
        } else {
            i15 = 1;
            f2 = 12.0f;
        }
        if (ViewGroup.MarginLayoutParams.class.isInstance(layoutParams31)) {
            ((ViewGroup.MarginLayoutParams) layoutParams31).rightMargin = (int) TypedValue.applyDimension(i15, f2, resources.getDisplayMetrics());
        }
        View widgetContainer13 = new WidgetContainer(context);
        widgetContainer13.setId(R.id.cm3);
        ConstraintLayout.a aVar = new ConstraintLayout.a(-2, -2);
        if (ConstraintLayout.a.class.isInstance(aVar)) {
            aVar.U = true;
        }
        if (ConstraintLayout.a.class.isInstance(aVar)) {
            i16 = 0;
            aVar.f2054k = 0;
        } else {
            i16 = 0;
        }
        if (ConstraintLayout.a.class.isInstance(aVar)) {
            aVar.s = i16;
        }
        if (ConstraintLayout.a.class.isInstance(aVar)) {
            aVar.f2051h = i16;
        }
        a.a(widgetContainer13);
        if (widgetContainer13.getParent() == null) {
            constraintLayout2.addView(widgetContainer13, aVar);
        }
        View widgetContainer14 = new WidgetContainer(context);
        widgetContainer14.setId(R.id.ep3);
        ConstraintLayout.a aVar2 = new ConstraintLayout.a(-2, -2);
        if (ViewGroup.MarginLayoutParams.class.isInstance(aVar2)) {
            int i53 = Build.VERSION.SDK_INT;
            z2 = true;
            aVar2.setMarginEnd((int) TypedValue.applyDimension(1, 8.0f, resources.getDisplayMetrics()));
        } else {
            z2 = true;
        }
        if (ViewGroup.MarginLayoutParams.class.isInstance(aVar2)) {
            DisplayMetrics displayMetrics = resources.getDisplayMetrics();
            int i54 = z2 ? 1 : 0;
            int i55 = z2 ? 1 : 0;
            int i56 = z2 ? 1 : 0;
            ((ViewGroup.MarginLayoutParams) aVar2).rightMargin = (int) TypedValue.applyDimension(i54, 8.0f, displayMetrics);
        }
        if (ConstraintLayout.a.class.isInstance(aVar2)) {
            aVar2.U = z2;
        }
        if (ConstraintLayout.a.class.isInstance(aVar2)) {
            aVar2.f2054k = 0;
        }
        if (ConstraintLayout.a.class.isInstance(aVar2)) {
            aVar2.r = R.id.cm3;
        }
        if (ConstraintLayout.a.class.isInstance(aVar2)) {
            aVar2.f2051h = 0;
        }
        if (ConstraintLayout.a.class.isInstance(aVar2)) {
            i17 = 1;
            f3 = 0.0f;
            aVar2.y = (int) TypedValue.applyDimension(1, 0.0f, resources.getDisplayMetrics());
        } else {
            i17 = 1;
            f3 = 0.0f;
        }
        if (ConstraintLayout.a.class.isInstance(aVar2)) {
            aVar2.v = (int) TypedValue.applyDimension(i17, f3, resources.getDisplayMetrics());
        }
        a.a(widgetContainer14);
        if (widgetContainer14.getParent() == null) {
            constraintLayout2.addView(widgetContainer14, aVar2);
        }
        a.a(constraintLayout2);
        if (constraintLayout2.getParent() == null) {
            relativeLayout2.addView(constraintLayout2, layoutParams31);
        }
        View widgetContainer15 = new WidgetContainer(context);
        widgetContainer15.setId(R.id.fms);
        RelativeLayout.LayoutParams layoutParams32 = new RelativeLayout.LayoutParams(-2, -2);
        if (RelativeLayout.LayoutParams.class.isInstance(layoutParams32)) {
            layoutParams32.addRule(3, R.id.eop);
        }
        if (ViewGroup.MarginLayoutParams.class.isInstance(layoutParams32)) {
            ((ViewGroup.MarginLayoutParams) layoutParams32).topMargin = (int) TypedValue.applyDimension(1, 8.0f, resources.getDisplayMetrics());
        }
        if (ViewGroup.MarginLayoutParams.class.isInstance(layoutParams32)) {
            int i57 = Build.VERSION.SDK_INT;
            layoutParams32.setMarginEnd((int) TypedValue.applyDimension(1, 6.0f, resources.getDisplayMetrics()));
        }
        if (ViewGroup.MarginLayoutParams.class.isInstance(layoutParams32)) {
            ((ViewGroup.MarginLayoutParams) layoutParams32).rightMargin = (int) TypedValue.applyDimension(1, 6.0f, resources.getDisplayMetrics());
        }
        if (RelativeLayout.LayoutParams.class.isInstance(layoutParams32)) {
            i18 = R.id.rc;
            layoutParams32.addRule(16, R.id.rc);
        } else {
            i18 = R.id.rc;
        }
        if (RelativeLayout.LayoutParams.class.isInstance(layoutParams32)) {
            layoutParams32.addRule(0, i18);
        }
        a.a(widgetContainer15);
        if (widgetContainer15.getParent() == null) {
            relativeLayout2.addView(widgetContainer15, layoutParams32);
        }
        View widgetContainer16 = new WidgetContainer(context);
        widgetContainer16.setId(R.id.vz);
        RelativeLayout.LayoutParams layoutParams33 = new RelativeLayout.LayoutParams(-2, -2);
        if (RelativeLayout.LayoutParams.class.isInstance(layoutParams33)) {
            i19 = -1;
            layoutParams33.addRule(11, -1);
        } else {
            i19 = -1;
        }
        if (RelativeLayout.LayoutParams.class.isInstance(layoutParams33)) {
            layoutParams33.addRule(12, i19);
        }
        if (ViewGroup.MarginLayoutParams.class.isInstance(layoutParams33)) {
            ((ViewGroup.MarginLayoutParams) layoutParams33).leftMargin = (int) resources.getDimension(R.dimen.zd);
        }
        if (ViewGroup.MarginLayoutParams.class.isInstance(layoutParams33)) {
            ((ViewGroup.MarginLayoutParams) layoutParams33).rightMargin = (int) TypedValue.applyDimension(1, 12.0f, resources.getDisplayMetrics());
        }
        if (ViewGroup.MarginLayoutParams.class.isInstance(layoutParams33)) {
            ((ViewGroup.MarginLayoutParams) layoutParams33).bottomMargin = (int) resources.getDimension(R.dimen.zc);
        }
        a.a(widgetContainer16);
        if (widgetContainer16.getParent() == null) {
            relativeLayout2.addView(widgetContainer16, layoutParams33);
        }
        View frameLayout11 = new FrameLayout(context);
        frameLayout11.setId(R.id.ai6);
        RelativeLayout.LayoutParams layoutParams34 = new RelativeLayout.LayoutParams(-2, -2);
        if (RelativeLayout.LayoutParams.class.isInstance(layoutParams34)) {
            layoutParams34.addRule(3, R.id.epk);
        }
        if (ViewGroup.MarginLayoutParams.class.isInstance(layoutParams34)) {
            int i58 = Build.VERSION.SDK_INT;
            layoutParams34.setMarginStart((int) resources.getDimension(R.dimen.v6));
        }
        if (ViewGroup.MarginLayoutParams.class.isInstance(layoutParams34)) {
            ((ViewGroup.MarginLayoutParams) layoutParams34).leftMargin = (int) resources.getDimension(R.dimen.v6);
        }
        if (RelativeLayout.LayoutParams.class.isInstance(layoutParams34)) {
            layoutParams34.addRule(17, R.id.b01);
        }
        if (RelativeLayout.LayoutParams.class.isInstance(layoutParams34)) {
            layoutParams34.addRule(1, R.id.b01);
        }
        a.a(frameLayout11);
        if (frameLayout11.getParent() == null) {
            relativeLayout2.addView(frameLayout11, layoutParams34);
        }
        View frameLayout12 = new FrameLayout(context);
        frameLayout12.setId(R.id.bdg);
        RelativeLayout.LayoutParams layoutParams35 = new RelativeLayout.LayoutParams(-2, -2);
        if (RelativeLayout.LayoutParams.class.isInstance(layoutParams35)) {
            layoutParams35.addRule(3, R.id.epk);
        }
        if (ViewGroup.MarginLayoutParams.class.isInstance(layoutParams35)) {
            int i59 = Build.VERSION.SDK_INT;
            layoutParams35.setMarginStart((int) resources.getDimension(R.dimen.w5));
        }
        if (ViewGroup.MarginLayoutParams.class.isInstance(layoutParams35)) {
            ((ViewGroup.MarginLayoutParams) layoutParams35).leftMargin = (int) resources.getDimension(R.dimen.w5);
        }
        if (RelativeLayout.LayoutParams.class.isInstance(layoutParams35)) {
            layoutParams35.addRule(17, R.id.ai6);
        }
        if (RelativeLayout.LayoutParams.class.isInstance(layoutParams35)) {
            layoutParams35.addRule(1, R.id.ai6);
        }
        a.a(frameLayout12);
        if (frameLayout12.getParent() == null) {
            relativeLayout2.addView(frameLayout12, layoutParams35);
        }
        View frameLayout13 = new FrameLayout(context);
        frameLayout13.setId(R.id.d56);
        RelativeLayout.LayoutParams layoutParams36 = new RelativeLayout.LayoutParams(-2, (int) TypedValue.applyDimension(1, 46.0f, resources.getDisplayMetrics()));
        if (RelativeLayout.LayoutParams.class.isInstance(layoutParams36)) {
            layoutParams36.addRule(3, R.id.ai6);
        }
        if (RelativeLayout.LayoutParams.class.isInstance(layoutParams36)) {
            i20 = -1;
            layoutParams36.addRule(20, -1);
        } else {
            i20 = -1;
        }
        if (RelativeLayout.LayoutParams.class.isInstance(layoutParams36)) {
            layoutParams36.addRule(9, i20);
        }
        if (ViewGroup.MarginLayoutParams.class.isInstance(layoutParams36)) {
            int i60 = Build.VERSION.SDK_INT;
            f4 = 8.0f;
            i21 = 1;
            layoutParams36.setMarginStart((int) TypedValue.applyDimension(1, 8.0f, resources.getDisplayMetrics()));
        } else {
            f4 = 8.0f;
            i21 = 1;
        }
        if (ViewGroup.MarginLayoutParams.class.isInstance(layoutParams36)) {
            ((ViewGroup.MarginLayoutParams) layoutParams36).topMargin = (int) TypedValue.applyDimension(i21, f4, resources.getDisplayMetrics());
        }
        if (ViewGroup.MarginLayoutParams.class.isInstance(layoutParams36)) {
            int i61 = Build.VERSION.SDK_INT;
            layoutParams36.setMarginEnd((int) TypedValue.applyDimension(1, 8.0f, resources.getDisplayMetrics()));
        }
        a.a(frameLayout13);
        if (frameLayout13.getParent() == null) {
            relativeLayout2.addView(frameLayout13, layoutParams36);
        }
        View frameLayout14 = new FrameLayout(context);
        frameLayout14.setId(R.id.dk0);
        frameLayout14.setClickable(true);
        frameLayout14.setFocusable(true);
        RelativeLayout.LayoutParams layoutParams37 = new RelativeLayout.LayoutParams(-2, -2);
        if (RelativeLayout.LayoutParams.class.isInstance(layoutParams37)) {
            layoutParams37.addRule(3, R.id.rc);
        }
        if (RelativeLayout.LayoutParams.class.isInstance(layoutParams37)) {
            i22 = -1;
            layoutParams37.addRule(21, -1);
        } else {
            i22 = -1;
        }
        if (RelativeLayout.LayoutParams.class.isInstance(layoutParams37)) {
            layoutParams37.addRule(11, i22);
        }
        a.a(frameLayout14);
        if (frameLayout14.getParent() == null) {
            relativeLayout2.addView(frameLayout14, layoutParams37);
        }
        ConstraintLayout constraintLayout3 = new ConstraintLayout(context);
        constraintLayout3.setId(R.id.eoo);
        constraintLayout3.setPadding((int) TypedValue.applyDimension(1, 4.0f, resources.getDisplayMetrics()), constraintLayout3.getPaddingTop(), constraintLayout3.getPaddingRight(), constraintLayout3.getPaddingBottom());
        constraintLayout3.setPadding((int) TypedValue.applyDimension(1, 4.0f, resources.getDisplayMetrics()), constraintLayout3.getPaddingTop(), constraintLayout3.getPaddingRight(), constraintLayout3.getPaddingBottom());
        RelativeLayout.LayoutParams layoutParams38 = new RelativeLayout.LayoutParams(-1, -2);
        if (RelativeLayout.LayoutParams.class.isInstance(layoutParams38)) {
            layoutParams38.addRule(3, R.id.epk);
        }
        if (RelativeLayout.LayoutParams.class.isInstance(layoutParams38)) {
            i23 = -1;
            layoutParams38.addRule(20, -1);
        } else {
            i23 = -1;
        }
        if (RelativeLayout.LayoutParams.class.isInstance(layoutParams38)) {
            layoutParams38.addRule(9, i23);
        }
        if (RelativeLayout.LayoutParams.class.isInstance(layoutParams38)) {
            layoutParams38.addRule(16, R.id.cu6);
        }
        if (RelativeLayout.LayoutParams.class.isInstance(layoutParams38)) {
            layoutParams38.addRule(0, R.id.cu6);
        }
        View widgetContainer17 = new WidgetContainer(context);
        widgetContainer17.setId(R.id.dpy);
        widgetContainer17.setPadding((int) TypedValue.applyDimension(1, 4.0f, resources.getDisplayMetrics()), widgetContainer17.getPaddingTop(), widgetContainer17.getPaddingRight(), widgetContainer17.getPaddingBottom());
        widgetContainer17.setPadding((int) TypedValue.applyDimension(1, 4.0f, resources.getDisplayMetrics()), widgetContainer17.getPaddingTop(), widgetContainer17.getPaddingRight(), widgetContainer17.getPaddingBottom());
        widgetContainer17.setPadding(widgetContainer17.getPaddingLeft(), (int) TypedValue.applyDimension(1, 4.0f, resources.getDisplayMetrics()), widgetContainer17.getPaddingRight(), widgetContainer17.getPaddingBottom());
        widgetContainer17.setPadding(widgetContainer17.getPaddingLeft(), widgetContainer17.getPaddingTop(), (int) TypedValue.applyDimension(1, 6.0f, resources.getDisplayMetrics()), widgetContainer17.getPaddingBottom());
        widgetContainer17.setPadding(widgetContainer17.getPaddingLeft(), widgetContainer17.getPaddingTop(), (int) TypedValue.applyDimension(1, 6.0f, resources.getDisplayMetrics()), widgetContainer17.getPaddingBottom());
        widgetContainer17.setPadding(widgetContainer17.getPaddingLeft(), widgetContainer17.getPaddingTop(), widgetContainer17.getPaddingRight(), (int) TypedValue.applyDimension(1, 4.0f, resources.getDisplayMetrics()));
        ConstraintLayout.a aVar3 = new ConstraintLayout.a((int) TypedValue.applyDimension(1, 0.0f, resources.getDisplayMetrics()), -2);
        if (ViewGroup.MarginLayoutParams.class.isInstance(aVar3)) {
            int i62 = Build.VERSION.SDK_INT;
            f5 = 8.0f;
            aVar3.setMarginEnd((int) TypedValue.applyDimension(1, 8.0f, resources.getDisplayMetrics()));
        } else {
            f5 = 8.0f;
        }
        if (ViewGroup.MarginLayoutParams.class.isInstance(aVar3)) {
            ((ViewGroup.MarginLayoutParams) aVar3).rightMargin = (int) TypedValue.applyDimension(1, f5, resources.getDisplayMetrics());
        }
        if (ConstraintLayout.a.class.isInstance(aVar3)) {
            aVar3.f2054k = 0;
        }
        if (ConstraintLayout.a.class.isInstance(aVar3)) {
            aVar3.r = R.id.bem;
        }
        if (ConstraintLayout.a.class.isInstance(aVar3)) {
            aVar3.G = 1;
        }
        if (ConstraintLayout.a.class.isInstance(aVar3)) {
            i24 = 0;
            aVar3.q = 0;
        } else {
            i24 = 0;
        }
        if (ConstraintLayout.a.class.isInstance(aVar3)) {
            aVar3.f2051h = i24;
        }
        if (ConstraintLayout.a.class.isInstance(aVar3)) {
            aVar3.I = 1;
        }
        a.a(widgetContainer17);
        if (widgetContainer17.getParent() == null) {
            constraintLayout3.addView(widgetContainer17, aVar3);
        }
        View widgetContainer18 = new WidgetContainer(context);
        widgetContainer18.setId(R.id.bem);
        ConstraintLayout.a aVar4 = new ConstraintLayout.a((int) TypedValue.applyDimension(1, 0.0f, resources.getDisplayMetrics()), -2);
        if (ViewGroup.MarginLayoutParams.class.isInstance(aVar4)) {
            int i63 = Build.VERSION.SDK_INT;
            f6 = 8.0f;
            aVar4.setMarginStart((int) TypedValue.applyDimension(1, 8.0f, resources.getDisplayMetrics()));
        } else {
            f6 = 8.0f;
        }
        if (ViewGroup.MarginLayoutParams.class.isInstance(aVar4)) {
            ((ViewGroup.MarginLayoutParams) aVar4).leftMargin = (int) TypedValue.applyDimension(1, f6, resources.getDisplayMetrics());
        }
        if (ViewGroup.MarginLayoutParams.class.isInstance(aVar4)) {
            int i64 = Build.VERSION.SDK_INT;
            f7 = 8.0f;
            i25 = 1;
            aVar4.setMarginEnd((int) TypedValue.applyDimension(1, 8.0f, resources.getDisplayMetrics()));
        } else {
            f7 = 8.0f;
            i25 = 1;
        }
        if (ViewGroup.MarginLayoutParams.class.isInstance(aVar4)) {
            ((ViewGroup.MarginLayoutParams) aVar4).rightMargin = (int) TypedValue.applyDimension(i25, f7, resources.getDisplayMetrics());
        }
        if (ConstraintLayout.a.class.isInstance(aVar4)) {
            aVar4.f2054k = 0;
        }
        if (ConstraintLayout.a.class.isInstance(aVar4)) {
            aVar4.r = R.id.bh8;
        }
        if (ConstraintLayout.a.class.isInstance(aVar4)) {
            aVar4.p = R.id.dpy;
        }
        if (ConstraintLayout.a.class.isInstance(aVar4)) {
            aVar4.f2051h = 0;
        }
        if (ConstraintLayout.a.class.isInstance(aVar4)) {
            aVar4.I = 1;
        }
        a.a(widgetContainer18);
        if (widgetContainer18.getParent() == null) {
            constraintLayout3.addView(widgetContainer18, aVar4);
        }
        View widgetContainer19 = new WidgetContainer(context);
        widgetContainer19.setId(R.id.bh8);
        widgetContainer19.setClickable(true);
        widgetContainer19.setFocusable(true);
        ConstraintLayout.a aVar5 = new ConstraintLayout.a((int) TypedValue.applyDimension(1, 0.0f, resources.getDisplayMetrics()), -2);
        if (ConstraintLayout.a.class.isInstance(aVar5)) {
            aVar5.f2054k = 0;
        }
        if (ConstraintLayout.a.class.isInstance(aVar5)) {
            aVar5.r = R.id.eor;
        }
        if (ConstraintLayout.a.class.isInstance(aVar5)) {
            aVar5.p = R.id.bem;
        }
        if (ConstraintLayout.a.class.isInstance(aVar5)) {
            aVar5.f2051h = 0;
        }
        if (ConstraintLayout.a.class.isInstance(aVar5)) {
            aVar5.I = 1;
        }
        a.a(widgetContainer19);
        if (widgetContainer19.getParent() == null) {
            constraintLayout3.addView(widgetContainer19, aVar5);
        }
        View view5 = new View(context);
        view5.setId(R.id.eor);
        ConstraintLayout.a aVar6 = new ConstraintLayout.a((int) TypedValue.applyDimension(1, 0.0f, resources.getDisplayMetrics()), (int) TypedValue.applyDimension(0, 1.0f, resources.getDisplayMetrics()));
        if (ConstraintLayout.a.class.isInstance(aVar6)) {
            aVar6.s = 0;
        }
        if (ConstraintLayout.a.class.isInstance(aVar6)) {
            aVar6.p = R.id.bh8;
        }
        if (ConstraintLayout.a.class.isInstance(aVar6)) {
            i26 = 0;
            aVar6.f2051h = 0;
        } else {
            i26 = 0;
        }
        if (ConstraintLayout.a.class.isInstance(aVar6)) {
            aVar6.K = (int) TypedValue.applyDimension(i26, 1.0f, resources.getDisplayMetrics());
        }
        a.a(view5);
        if (view5.getParent() == null) {
            constraintLayout3.addView(view5, aVar6);
        }
        a.a(constraintLayout3);
        if (constraintLayout3.getParent() == null) {
            relativeLayout2.addView(constraintLayout3, layoutParams38);
        }
        ConstraintLayout constraintLayout4 = new ConstraintLayout(context);
        constraintLayout4.setId(R.id.cjw);
        RelativeLayout.LayoutParams layoutParams39 = new RelativeLayout.LayoutParams(-1, -2);
        if (RelativeLayout.LayoutParams.class.isInstance(layoutParams39)) {
            layoutParams39.addRule(3, R.id.eop);
        }
        if (RelativeLayout.LayoutParams.class.isInstance(layoutParams39)) {
            layoutParams39.addRule(16, R.id.fms);
        }
        View widgetContainer20 = new WidgetContainer(context);
        widgetContainer20.setId(R.id.cjv);
        ConstraintLayout.a aVar7 = new ConstraintLayout.a(-2, -2);
        if (ConstraintLayout.a.class.isInstance(aVar7)) {
            i27 = 0;
            aVar7.f2051h = 0;
        } else {
            i27 = 0;
        }
        if (ConstraintLayout.a.class.isInstance(aVar7)) {
            aVar7.q = i27;
        }
        a.a(widgetContainer20);
        if (widgetContainer20.getParent() == null) {
            constraintLayout4.addView(widgetContainer20, aVar7);
        }
        a.a(constraintLayout4);
        if (constraintLayout4.getParent() == null) {
            relativeLayout2.addView(constraintLayout4, layoutParams39);
        }
        View widgetContainer21 = new WidgetContainer(context);
        widgetContainer21.setId(R.id.cju);
        RelativeLayout.LayoutParams layoutParams40 = new RelativeLayout.LayoutParams(-2, -2);
        if (RelativeLayout.LayoutParams.class.isInstance(layoutParams40)) {
            layoutParams40.addRule(3, R.id.cjw);
        }
        a.a(widgetContainer21);
        if (widgetContainer21.getParent() == null) {
            relativeLayout2.addView(widgetContainer21, layoutParams40);
        }
        View widgetContainer22 = new WidgetContainer(context);
        widgetContainer22.setId(R.id.cdn);
        RelativeLayout.LayoutParams layoutParams41 = new RelativeLayout.LayoutParams(-2, -2);
        if (ViewGroup.MarginLayoutParams.class.isInstance(layoutParams41)) {
            i28 = 1;
            ((ViewGroup.MarginLayoutParams) layoutParams41).leftMargin = (int) TypedValue.applyDimension(1, 12.0f, resources.getDisplayMetrics());
        } else {
            i28 = 1;
        }
        if (ViewGroup.MarginLayoutParams.class.isInstance(layoutParams41)) {
            ((ViewGroup.MarginLayoutParams) layoutParams41).topMargin = (int) TypedValue.applyDimension(i28, 52.0f, resources.getDisplayMetrics());
        }
        if (RelativeLayout.LayoutParams.class.isInstance(layoutParams41)) {
            layoutParams41.addRule(6, R.id.cjw);
        }
        a.a(widgetContainer22);
        if (widgetContainer22.getParent() == null) {
            relativeLayout2.addView(widgetContainer22, layoutParams41);
        }
        View frameLayout15 = new FrameLayout(context);
        frameLayout15.setId(R.id.ao9);
        frameLayout15.setClickable(true);
        frameLayout15.setFocusable(true);
        RelativeLayout.LayoutParams layoutParams42 = new RelativeLayout.LayoutParams(-2, -2);
        if (RelativeLayout.LayoutParams.class.isInstance(layoutParams42)) {
            layoutParams42.addRule(3, R.id.eoo);
        }
        if (RelativeLayout.LayoutParams.class.isInstance(layoutParams42)) {
            i29 = -1;
            layoutParams42.addRule(20, -1);
        } else {
            i29 = -1;
        }
        if (RelativeLayout.LayoutParams.class.isInstance(layoutParams42)) {
            layoutParams42.addRule(9, i29);
        }
        if (ViewGroup.MarginLayoutParams.class.isInstance(layoutParams42)) {
            int i65 = Build.VERSION.SDK_INT;
            layoutParams42.setMarginStart((int) TypedValue.applyDimension(1, 3.0f, resources.getDisplayMetrics()));
        }
        if (ViewGroup.MarginLayoutParams.class.isInstance(layoutParams42)) {
            i30 = 1;
            ((ViewGroup.MarginLayoutParams) layoutParams42).leftMargin = (int) TypedValue.applyDimension(1, -1.0f, resources.getDisplayMetrics());
        } else {
            i30 = 1;
        }
        if (ViewGroup.MarginLayoutParams.class.isInstance(layoutParams42)) {
            ((ViewGroup.MarginLayoutParams) layoutParams42).topMargin = (int) TypedValue.applyDimension(i30, -13.0f, resources.getDisplayMetrics());
        }
        a.a(frameLayout15);
        if (frameLayout15.getParent() == null) {
            relativeLayout2.addView(frameLayout15, layoutParams42);
        }
        View frameLayout16 = new FrameLayout(context);
        frameLayout16.setId(R.id.eot);
        RelativeLayout.LayoutParams layoutParams43 = new RelativeLayout.LayoutParams(-2, -2);
        if (RelativeLayout.LayoutParams.class.isInstance(layoutParams43)) {
            layoutParams43.addRule(6, R.id.dk0);
        }
        if (ViewGroup.MarginLayoutParams.class.isInstance(layoutParams43)) {
            ((ViewGroup.MarginLayoutParams) layoutParams43).topMargin = (int) TypedValue.applyDimension(1, 8.0f, resources.getDisplayMetrics());
        }
        if (ViewGroup.MarginLayoutParams.class.isInstance(layoutParams43)) {
            int i66 = Build.VERSION.SDK_INT;
            f8 = 4.0f;
            i31 = 1;
            layoutParams43.setMarginEnd((int) TypedValue.applyDimension(1, 4.0f, resources.getDisplayMetrics()));
        } else {
            f8 = 4.0f;
            i31 = 1;
        }
        if (ViewGroup.MarginLayoutParams.class.isInstance(layoutParams43)) {
            ((ViewGroup.MarginLayoutParams) layoutParams43).rightMargin = (int) TypedValue.applyDimension(i31, f8, resources.getDisplayMetrics());
        }
        if (RelativeLayout.LayoutParams.class.isInstance(layoutParams43)) {
            layoutParams43.addRule(17, R.id.dk0);
        }
        if (RelativeLayout.LayoutParams.class.isInstance(layoutParams43)) {
            layoutParams43.addRule(1, R.id.dk0);
        }
        a.a(frameLayout16);
        if (frameLayout16.getParent() == null) {
            relativeLayout2.addView(frameLayout16, layoutParams43);
        }
        View frameLayout17 = new FrameLayout(context);
        frameLayout17.setId(R.id.d7i);
        RelativeLayout.LayoutParams layoutParams44 = new RelativeLayout.LayoutParams(-2, -2);
        if (RelativeLayout.LayoutParams.class.isInstance(layoutParams44)) {
            layoutParams44.addRule(3, R.id.ai6);
        }
        if (ViewGroup.MarginLayoutParams.class.isInstance(layoutParams44)) {
            ((ViewGroup.MarginLayoutParams) layoutParams44).topMargin = (int) TypedValue.applyDimension(1, 8.0f, resources.getDisplayMetrics());
        }
        if (ViewGroup.MarginLayoutParams.class.isInstance(layoutParams44)) {
            int i67 = Build.VERSION.SDK_INT;
            f9 = 8.0f;
            i32 = 1;
            layoutParams44.setMarginEnd((int) TypedValue.applyDimension(1, 8.0f, resources.getDisplayMetrics()));
        } else {
            f9 = 8.0f;
            i32 = 1;
        }
        if (ViewGroup.MarginLayoutParams.class.isInstance(layoutParams44)) {
            ((ViewGroup.MarginLayoutParams) layoutParams44).rightMargin = (int) TypedValue.applyDimension(i32, f9, resources.getDisplayMetrics());
        }
        if (RelativeLayout.LayoutParams.class.isInstance(layoutParams44)) {
            layoutParams44.addRule(i32, R.id.eot);
        }
        a.a(frameLayout17);
        if (frameLayout17.getParent() == null) {
            relativeLayout2.addView(frameLayout17, layoutParams44);
        }
        View frameLayout18 = new FrameLayout(context);
        frameLayout18.setId(R.id.d6o);
        RelativeLayout.LayoutParams layoutParams45 = new RelativeLayout.LayoutParams((int) TypedValue.applyDimension(1, 40.0f, resources.getDisplayMetrics()), (int) TypedValue.applyDimension(1, 40.0f, resources.getDisplayMetrics()));
        if (RelativeLayout.LayoutParams.class.isInstance(layoutParams45)) {
            layoutParams45.addRule(6, R.id.eot);
        }
        if (RelativeLayout.LayoutParams.class.isInstance(layoutParams45)) {
            layoutParams45.addRule(17, R.id.d7i);
        }
        if (RelativeLayout.LayoutParams.class.isInstance(layoutParams45)) {
            layoutParams45.addRule(1, R.id.d7i);
        }
        a.a(frameLayout18);
        if (frameLayout18.getParent() == null) {
            relativeLayout2.addView(frameLayout18, layoutParams45);
        }
        View frameLayout19 = new FrameLayout(context);
        frameLayout19.setId(R.id.b01);
        RelativeLayout.LayoutParams layoutParams46 = new RelativeLayout.LayoutParams(-2, -2);
        if (RelativeLayout.LayoutParams.class.isInstance(layoutParams46)) {
            layoutParams46.addRule(3, R.id.epk);
        }
        if (ViewGroup.MarginLayoutParams.class.isInstance(layoutParams46)) {
            int i68 = Build.VERSION.SDK_INT;
            f10 = 8.0f;
            i33 = 1;
            layoutParams46.setMarginStart((int) TypedValue.applyDimension(1, 8.0f, resources.getDisplayMetrics()));
        } else {
            f10 = 8.0f;
            i33 = 1;
        }
        if (ViewGroup.MarginLayoutParams.class.isInstance(layoutParams46)) {
            ((ViewGroup.MarginLayoutParams) layoutParams46).leftMargin = (int) TypedValue.applyDimension(i33, f10, resources.getDisplayMetrics());
        }
        a.a(frameLayout19);
        if (frameLayout19.getParent() == null) {
            relativeLayout2.addView(frameLayout19, layoutParams46);
        }
        View frameLayout20 = new FrameLayout(context);
        frameLayout20.setId(R.id.ccb);
        frameLayout20.setVisibility(8);
        ViewGroup.LayoutParams layoutParams47 = new RelativeLayout.LayoutParams(-1, -1);
        a.a(frameLayout20);
        if (frameLayout20.getParent() == null) {
            relativeLayout2.addView(frameLayout20, layoutParams47);
        }
        ShapeControllableView shapeControllableView = new ShapeControllableView(context);
        shapeControllableView.setId(R.id.dd7);
        RelativeLayout.LayoutParams layoutParams48 = new RelativeLayout.LayoutParams(-1, -2);
        if (RelativeLayout.LayoutParams.class.isInstance(layoutParams48)) {
            layoutParams48.addRule(6, R.id.clu);
        }
        if (RelativeLayout.LayoutParams.class.isInstance(layoutParams48)) {
            layoutParams48.addRule(12, -1);
        }
        com.bytedance.android.livesdk.ui.a.a.a("app:gradientColors", new a.b("2130903084", "array"), shapeControllableView, layoutParams48);
        com.bytedance.android.livesdk.ui.a.a.a("app:gradientOrientation", new a.c("vertical"), shapeControllableView, layoutParams48);
        com.bytedance.android.livesdk.ui.a.a.a("app:gradientPositions", new a.b("2130903085", "array"), shapeControllableView, layoutParams48);
        com.bytedance.android.livesdk.ui.a.a.a(shapeControllableView, layoutParams48);
        android.view.a.a(shapeControllableView);
        if (shapeControllableView.getParent() == null) {
            relativeLayout2.addView(shapeControllableView, layoutParams48);
        }
        View widgetContainer23 = new WidgetContainer(context);
        widgetContainer23.setId(R.id.clu);
        RelativeLayout.LayoutParams layoutParams49 = new RelativeLayout.LayoutParams(-1, (int) resources.getDimension(R.dimen.x_));
        if (RelativeLayout.LayoutParams.class.isInstance(layoutParams49)) {
            layoutParams49.addRule(11, -1);
        }
        if (RelativeLayout.LayoutParams.class.isInstance(layoutParams49)) {
            layoutParams49.addRule(12, -1);
        }
        if (ViewGroup.MarginLayoutParams.class.isInstance(layoutParams49)) {
            ((ViewGroup.MarginLayoutParams) layoutParams49).leftMargin = (int) resources.getDimension(R.dimen.yw);
        }
        if (ViewGroup.MarginLayoutParams.class.isInstance(layoutParams49)) {
            ((ViewGroup.MarginLayoutParams) layoutParams49).rightMargin = (int) resources.getDimension(R.dimen.yx);
        }
        if (ViewGroup.MarginLayoutParams.class.isInstance(layoutParams49)) {
            ((ViewGroup.MarginLayoutParams) layoutParams49).bottomMargin = (int) resources.getDimension(R.dimen.yy);
        }
        android.view.a.a(widgetContainer23);
        if (widgetContainer23.getParent() == null) {
            relativeLayout2.addView(widgetContainer23, layoutParams49);
        }
        View widgetContainer24 = new WidgetContainer(context);
        widgetContainer24.setId(R.id.dfs);
        widgetContainer24.setVisibility(8);
        RelativeLayout.LayoutParams layoutParams50 = new RelativeLayout.LayoutParams(-1, -2);
        if (RelativeLayout.LayoutParams.class.isInstance(layoutParams50)) {
            layoutParams50.addRule(12, -1);
        }
        if (ViewGroup.MarginLayoutParams.class.isInstance(layoutParams50)) {
            int i69 = Build.VERSION.SDK_INT;
            layoutParams50.setMarginStart((int) TypedValue.applyDimension(1, 12.0f, resources.getDisplayMetrics()));
        }
        if (ViewGroup.MarginLayoutParams.class.isInstance(layoutParams50)) {
            int i70 = Build.VERSION.SDK_INT;
            layoutParams50.setMarginEnd((int) TypedValue.applyDimension(1, 12.0f, resources.getDisplayMetrics()));
        }
        if (ViewGroup.MarginLayoutParams.class.isInstance(layoutParams50)) {
            ((ViewGroup.MarginLayoutParams) layoutParams50).bottomMargin = (int) TypedValue.applyDimension(1, 56.0f, resources.getDisplayMetrics());
        }
        android.view.a.a(widgetContainer24);
        if (widgetContainer24.getParent() == null) {
            relativeLayout2.addView(widgetContainer24, layoutParams50);
        }
        View frameLayout21 = new FrameLayout(context);
        frameLayout21.setId(R.id.ffh);
        ViewGroup.LayoutParams layoutParams51 = new RelativeLayout.LayoutParams(-1, -1);
        android.view.a.a(frameLayout21);
        if (frameLayout21.getParent() == null) {
            relativeLayout2.addView(frameLayout21, layoutParams51);
        }
        View widgetContainer25 = new WidgetContainer(context);
        widgetContainer25.setId(R.id.ene);
        RelativeLayout.LayoutParams layoutParams52 = new RelativeLayout.LayoutParams(-1, (int) TypedValue.applyDimension(1, 36.0f, resources.getDisplayMetrics()));
        if (RelativeLayout.LayoutParams.class.isInstance(layoutParams52)) {
            layoutParams52.addRule(11, -1);
        }
        if (RelativeLayout.LayoutParams.class.isInstance(layoutParams52)) {
            layoutParams52.addRule(12, -1);
        }
        if (ViewGroup.MarginLayoutParams.class.isInstance(layoutParams52)) {
            ((ViewGroup.MarginLayoutParams) layoutParams52).bottomMargin = (int) TypedValue.applyDimension(1, 8.0f, resources.getDisplayMetrics());
        }
        android.view.a.a(widgetContainer25);
        if (widgetContainer25.getParent() == null) {
            relativeLayout2.addView(widgetContainer25, layoutParams52);
        }
        View widgetContainer26 = new WidgetContainer(context);
        widgetContainer26.setId(R.id.a_i);
        RelativeLayout.LayoutParams layoutParams53 = new RelativeLayout.LayoutParams((int) TypedValue.applyDimension(1, 0.0f, resources.getDisplayMetrics()), (int) TypedValue.applyDimension(1, 0.0f, resources.getDisplayMetrics()));
        if (RelativeLayout.LayoutParams.class.isInstance(layoutParams53)) {
            layoutParams53.addRule(12, -1);
        }
        if (ViewGroup.MarginLayoutParams.class.isInstance(layoutParams53)) {
            int i71 = Build.VERSION.SDK_INT;
            f11 = 4.0f;
            i34 = 1;
            layoutParams53.setMarginStart((int) TypedValue.applyDimension(1, 4.0f, resources.getDisplayMetrics()));
        } else {
            f11 = 4.0f;
            i34 = 1;
        }
        if (ViewGroup.MarginLayoutParams.class.isInstance(layoutParams53)) {
            ((ViewGroup.MarginLayoutParams) layoutParams53).leftMargin = (int) TypedValue.applyDimension(i34, f11, resources.getDisplayMetrics());
        }
        if (RelativeLayout.LayoutParams.class.isInstance(layoutParams53)) {
            layoutParams53.addRule(0, R.id.ene);
        }
        android.view.a.a(widgetContainer26);
        if (widgetContainer26.getParent() == null) {
            relativeLayout2.addView(widgetContainer26, layoutParams53);
        }
        View frameLayout22 = new FrameLayout(context);
        frameLayout22.setId(R.id.bq9);
        ViewGroup.LayoutParams layoutParams54 = new RelativeLayout.LayoutParams(-1, -1);
        android.view.a.a(frameLayout22);
        if (frameLayout22.getParent() == null) {
            relativeLayout2.addView(frameLayout22, layoutParams54);
        }
        ViewStub viewStub = new ViewStub(context);
        viewStub.setId(R.id.o2);
        ViewGroup.LayoutParams layoutParams55 = new RelativeLayout.LayoutParams(-1, -1);
        viewStub.setInflatedId(-1);
        android.view.a.a(viewStub);
        if (viewStub.getParent() == null) {
            relativeLayout2.addView(viewStub, layoutParams55);
        }
        View frameLayout23 = new FrameLayout(context);
        frameLayout23.setId(R.id.fnn);
        frameLayout23.setPadding(frameLayout23.getPaddingLeft(), frameLayout23.getPaddingTop(), (int) TypedValue.applyDimension(1, 8.0f, resources.getDisplayMetrics()), frameLayout23.getPaddingBottom());
        RelativeLayout.LayoutParams layoutParams56 = new RelativeLayout.LayoutParams(-1, -1);
        if (RelativeLayout.LayoutParams.class.isInstance(layoutParams56)) {
            layoutParams56.addRule(3, R.id.epk);
        }
        android.view.a.a(frameLayout23);
        if (frameLayout23.getParent() == null) {
            relativeLayout2.addView(frameLayout23, layoutParams56);
        }
        ConstraintLayout constraintLayout5 = new ConstraintLayout(context);
        constraintLayout5.setId(R.id.ekx);
        RelativeLayout.LayoutParams layoutParams57 = new RelativeLayout.LayoutParams(-1, -2);
        if (RelativeLayout.LayoutParams.class.isInstance(layoutParams57)) {
            layoutParams57.addRule(10, -1);
        }
        View frameLayout24 = new FrameLayout(context);
        frameLayout24.setId(R.id.ekv);
        frameLayout24.setVisibility(8);
        ConstraintLayout.a aVar8 = new ConstraintLayout.a(-2, (int) TypedValue.applyDimension(1, 36.0f, resources.getDisplayMetrics()));
        if (ViewGroup.MarginLayoutParams.class.isInstance(aVar8)) {
            ((ViewGroup.MarginLayoutParams) aVar8).leftMargin = (int) TypedValue.applyDimension(1, 12.0f, resources.getDisplayMetrics());
        }
        if (ViewGroup.MarginLayoutParams.class.isInstance(aVar8)) {
            ((ViewGroup.MarginLayoutParams) aVar8).topMargin = (int) TypedValue.applyDimension(1, 8.0f, resources.getDisplayMetrics());
        }
        if (ConstraintLayout.a.class.isInstance(aVar8)) {
            i35 = 0;
            aVar8.f2047d = 0;
        } else {
            i35 = 0;
        }
        if (ConstraintLayout.a.class.isInstance(aVar8)) {
            aVar8.f2051h = i35;
        }
        android.view.a.a(frameLayout24);
        if (frameLayout24.getParent() == null) {
            constraintLayout5.addView(frameLayout24, aVar8);
        }
        View frameLayout25 = new FrameLayout(context);
        frameLayout25.setId(R.id.ekw);
        frameLayout25.setVisibility(8);
        ConstraintLayout.a aVar9 = new ConstraintLayout.a((int) TypedValue.applyDimension(1, 101.0f, resources.getDisplayMetrics()), (int) TypedValue.applyDimension(1, 36.0f, resources.getDisplayMetrics()));
        if (ViewGroup.MarginLayoutParams.class.isInstance(aVar9)) {
            ((ViewGroup.MarginLayoutParams) aVar9).rightMargin = (int) TypedValue.applyDimension(1, 12.0f, resources.getDisplayMetrics());
        }
        if (ConstraintLayout.a.class.isInstance(aVar9)) {
            aVar9.f2054k = R.id.ekv;
        }
        if (ConstraintLayout.a.class.isInstance(aVar9)) {
            aVar9.f2050g = 0;
        }
        if (ConstraintLayout.a.class.isInstance(aVar9)) {
            aVar9.f2051h = R.id.ekv;
        }
        android.view.a.a(frameLayout25);
        if (frameLayout25.getParent() == null) {
            constraintLayout5.addView(frameLayout25, aVar9);
        }
        android.view.a.a(constraintLayout5);
        if (constraintLayout5.getParent() == null) {
            relativeLayout2.addView(constraintLayout5, layoutParams57);
        }
        View widgetContainer27 = new WidgetContainer(context);
        widgetContainer27.setId(R.id.bce);
        RelativeLayout.LayoutParams layoutParams58 = new RelativeLayout.LayoutParams(-1, -2);
        if (RelativeLayout.LayoutParams.class.isInstance(layoutParams58)) {
            layoutParams58.addRule(3, R.id.epk);
        }
        android.view.a.a(widgetContainer27);
        if (widgetContainer27.getParent() == null) {
            relativeLayout2.addView(widgetContainer27, layoutParams58);
        }
        View frameLayout26 = new FrameLayout(context);
        frameLayout26.setId(R.id.dqc);
        RelativeLayout.LayoutParams layoutParams59 = new RelativeLayout.LayoutParams(-2, -2);
        if (RelativeLayout.LayoutParams.class.isInstance(layoutParams59)) {
            i36 = -1;
            layoutParams59.addRule(9, -1);
        } else {
            i36 = -1;
        }
        if (RelativeLayout.LayoutParams.class.isInstance(layoutParams59)) {
            layoutParams59.addRule(12, i36);
        }
        if (ViewGroup.MarginLayoutParams.class.isInstance(layoutParams59)) {
            i37 = 1;
            ((ViewGroup.MarginLayoutParams) layoutParams59).leftMargin = (int) TypedValue.applyDimension(1, 8.0f, resources.getDisplayMetrics());
        } else {
            i37 = 1;
        }
        if (ViewGroup.MarginLayoutParams.class.isInstance(layoutParams59)) {
            ((ViewGroup.MarginLayoutParams) layoutParams59).bottomMargin = (int) TypedValue.applyDimension(i37, 52.0f, resources.getDisplayMetrics());
        }
        android.view.a.a(frameLayout26);
        if (frameLayout26.getParent() == null) {
            relativeLayout2.addView(frameLayout26, layoutParams59);
        }
        View widgetContainer28 = new WidgetContainer(context);
        widgetContainer28.setId(R.id.ri);
        ViewGroup.LayoutParams layoutParams60 = new RelativeLayout.LayoutParams(-1, -1);
        android.view.a.a(widgetContainer28);
        if (widgetContainer28.getParent() == null) {
            relativeLayout2.addView(widgetContainer28, layoutParams60);
        }
        View frameLayout27 = new FrameLayout(context);
        frameLayout27.setId(R.id.csk);
        RelativeLayout.LayoutParams layoutParams61 = new RelativeLayout.LayoutParams(-1, (int) TypedValue.applyDimension(1, 220.0f, resources.getDisplayMetrics()));
        if (RelativeLayout.LayoutParams.class.isInstance(layoutParams61)) {
            layoutParams61.addRule(12, -1);
        }
        if (ViewGroup.MarginLayoutParams.class.isInstance(layoutParams61)) {
            ((ViewGroup.MarginLayoutParams) layoutParams61).bottomMargin = (int) resources.getDimension(R.dimen.w0);
        }
        android.view.a.a(frameLayout27);
        if (frameLayout27.getParent() == null) {
            relativeLayout2.addView(frameLayout27, layoutParams61);
        }
        View frameLayout28 = new FrameLayout(context);
        frameLayout28.setId(R.id.bbm);
        RelativeLayout.LayoutParams layoutParams62 = new RelativeLayout.LayoutParams(-1, (int) TypedValue.applyDimension(1, 64.0f, resources.getDisplayMetrics()));
        if (RelativeLayout.LayoutParams.class.isInstance(layoutParams62)) {
            layoutParams62.addRule(6, R.id.csk);
        }
        if (ViewGroup.MarginLayoutParams.class.isInstance(layoutParams62)) {
            ((ViewGroup.MarginLayoutParams) layoutParams62).topMargin = (int) TypedValue.applyDimension(1, 30.0f, resources.getDisplayMetrics());
        }
        android.view.a.a(frameLayout28);
        if (frameLayout28.getParent() == null) {
            relativeLayout2.addView(frameLayout28, layoutParams62);
        }
        View frameLayout29 = new FrameLayout(context);
        frameLayout29.setId(R.id.awx);
        RelativeLayout.LayoutParams layoutParams63 = new RelativeLayout.LayoutParams(-1, -1);
        if (RelativeLayout.LayoutParams.class.isInstance(layoutParams63)) {
            layoutParams63.addRule(12, -1);
        }
        android.view.a.a(frameLayout29);
        if (frameLayout29.getParent() == null) {
            relativeLayout2.addView(frameLayout29, layoutParams63);
        }
        View frameLayout30 = new FrameLayout(context);
        frameLayout30.setId(R.id.e65);
        RelativeLayout.LayoutParams layoutParams64 = new RelativeLayout.LayoutParams(-1, -1);
        if (RelativeLayout.LayoutParams.class.isInstance(layoutParams64)) {
            layoutParams64.addRule(2, R.id.ene);
        }
        android.view.a.a(frameLayout30);
        if (frameLayout30.getParent() == null) {
            relativeLayout2.addView(frameLayout30, layoutParams64);
        }
        View frameLayout31 = new FrameLayout(context);
        frameLayout31.setId(R.id.ffi);
        ViewGroup.LayoutParams layoutParams65 = new RelativeLayout.LayoutParams(-1, -1);
        android.view.a.a(frameLayout31);
        if (frameLayout31.getParent() == null) {
            relativeLayout2.addView(frameLayout31, layoutParams65);
        }
        View widgetContainer29 = new WidgetContainer(context);
        widgetContainer29.setId(R.id.bag);
        RelativeLayout.LayoutParams layoutParams66 = new RelativeLayout.LayoutParams(-2, -2);
        if (RelativeLayout.LayoutParams.class.isInstance(layoutParams66)) {
            layoutParams66.addRule(13, -1);
        }
        android.view.a.a(widgetContainer29);
        if (widgetContainer29.getParent() == null) {
            relativeLayout2.addView(widgetContainer29, layoutParams66);
        }
        View frameLayout32 = new FrameLayout(context);
        frameLayout32.setId(R.id.d9p);
        RelativeLayout.LayoutParams layoutParams67 = new RelativeLayout.LayoutParams(-2, -2);
        if (RelativeLayout.LayoutParams.class.isInstance(layoutParams67)) {
            layoutParams67.addRule(3, R.id.bce);
        }
        if (ViewGroup.MarginLayoutParams.class.isInstance(layoutParams67)) {
            int i72 = Build.VERSION.SDK_INT;
            f12 = 8.0f;
            i38 = 1;
            layoutParams67.setMarginStart((int) TypedValue.applyDimension(1, 8.0f, resources.getDisplayMetrics()));
        } else {
            f12 = 8.0f;
            i38 = 1;
        }
        if (ViewGroup.MarginLayoutParams.class.isInstance(layoutParams67)) {
            ((ViewGroup.MarginLayoutParams) layoutParams67).leftMargin = (int) TypedValue.applyDimension(i38, f12, resources.getDisplayMetrics());
        }
        if (ViewGroup.MarginLayoutParams.class.isInstance(layoutParams67)) {
            ((ViewGroup.MarginLayoutParams) layoutParams67).topMargin = (int) TypedValue.applyDimension(i38, 32.0f, resources.getDisplayMetrics());
        }
        android.view.a.a(frameLayout32);
        if (frameLayout32.getParent() == null) {
            relativeLayout2.addView(frameLayout32, layoutParams67);
        }
        View widgetContainer30 = new WidgetContainer(context);
        widgetContainer30.setId(R.id.ki);
        widgetContainer30.setVisibility(8);
        RelativeLayout.LayoutParams layoutParams68 = new RelativeLayout.LayoutParams(-1, -1);
        if (RelativeLayout.LayoutParams.class.isInstance(layoutParams68)) {
            layoutParams68.addRule(13, -1);
        }
        android.view.a.a(widgetContainer30);
        if (widgetContainer30.getParent() == null) {
            relativeLayout2.addView(widgetContainer30, layoutParams68);
        }
        android.view.a.a(relativeLayout2);
        if (relativeLayout2.getParent() == null) {
            frameLayout2.addView(relativeLayout2, layoutParams16);
        }
        View widgetContainer31 = new WidgetContainer(context);
        widgetContainer31.setId(R.id.afm);
        FrameLayout.LayoutParams layoutParams69 = new FrameLayout.LayoutParams(-2, -2);
        if (LinearLayout.LayoutParams.class.isInstance(layoutParams69)) {
            i39 = 17;
            ((LinearLayout.LayoutParams) layoutParams69).gravity = 17;
        } else {
            i39 = 17;
        }
        if (FrameLayout.LayoutParams.class.isInstance(layoutParams69)) {
            layoutParams69.gravity = i39;
        }
        if (DrawerLayout.d.class.isInstance(layoutParams69)) {
            ((DrawerLayout.d) layoutParams69).f2691a = i39;
        }
        android.view.a.a(widgetContainer31);
        if (widgetContainer31.getParent() == null) {
            frameLayout2.addView(widgetContainer31, layoutParams69);
        }
        LiveTextView liveTextView = new LiveTextView(context);
        liveTextView.setId(R.id.cdd);
        liveTextView.setText(R.string.gsl);
        liveTextView.setTextColor(resources.getColorStateList(R.color.wk));
        liveTextView.setTextSize(2, 15.0f);
        liveTextView.setVisibility(8);
        FrameLayout.LayoutParams layoutParams70 = new FrameLayout.LayoutParams(-2, -2);
        if (LinearLayout.LayoutParams.class.isInstance(layoutParams70)) {
            i40 = 17;
            ((LinearLayout.LayoutParams) layoutParams70).gravity = 17;
        } else {
            i40 = 17;
        }
        if (FrameLayout.LayoutParams.class.isInstance(layoutParams70)) {
            layoutParams70.gravity = i40;
        }
        if (DrawerLayout.d.class.isInstance(layoutParams70)) {
            ((DrawerLayout.d) layoutParams70).f2691a = i40;
        }
        android.view.a.a(liveTextView);
        if (liveTextView.getParent() == null) {
            frameLayout2.addView(liveTextView, layoutParams70);
        }
        View widgetContainer32 = new WidgetContainer(context);
        widgetContainer32.setId(R.id.b32);
        ViewGroup.LayoutParams layoutParams71 = new FrameLayout.LayoutParams(-1, -1);
        android.view.a.a(widgetContainer32);
        if (widgetContainer32.getParent() == null) {
            frameLayout2.addView(widgetContainer32, layoutParams71);
        }
        LinearLayout linearLayout = new LinearLayout(context);
        linearLayout.setId(R.id.cfi);
        linearLayout.setOrientation(1);
        linearLayout.setVisibility(8);
        FrameLayout.LayoutParams layoutParams72 = new FrameLayout.LayoutParams(-2, -2);
        if (LinearLayout.LayoutParams.class.isInstance(layoutParams72)) {
            i41 = 17;
            ((LinearLayout.LayoutParams) layoutParams72).gravity = 17;
        } else {
            i41 = 17;
        }
        if (FrameLayout.LayoutParams.class.isInstance(layoutParams72)) {
            layoutParams72.gravity = i41;
        }
        if (DrawerLayout.d.class.isInstance(layoutParams72)) {
            ((DrawerLayout.d) layoutParams72).f2691a = i41;
        }
        linearLayout.setGravity(1);
        AppCompatImageView appCompatImageView = new AppCompatImageView(context);
        appCompatImageView.setImageResource(2131234727);
        ViewGroup.LayoutParams layoutParams73 = new LinearLayout.LayoutParams((int) TypedValue.applyDimension(1, 80.0f, resources.getDisplayMetrics()), (int) TypedValue.applyDimension(1, 80.0f, resources.getDisplayMetrics()));
        android.view.a.a(appCompatImageView);
        if (appCompatImageView.getParent() == null) {
            linearLayout.addView(appCompatImageView, layoutParams73);
        }
        LiveTextView liveTextView2 = new LiveTextView(context);
        liveTextView2.setText(R.string.gsf);
        liveTextView2.setTextColor(resources.getColorStateList(R.color.wk));
        liveTextView2.setTextSize(2, 14.0f);
        LinearLayout.LayoutParams layoutParams74 = new LinearLayout.LayoutParams(-2, -2);
        if (ViewGroup.MarginLayoutParams.class.isInstance(layoutParams74)) {
            ((ViewGroup.MarginLayoutParams) layoutParams74).topMargin = (int) TypedValue.applyDimension(1, 8.0f, resources.getDisplayMetrics());
        }
        android.view.a.a(liveTextView2);
        if (liveTextView2.getParent() == null) {
            linearLayout.addView(liveTextView2, layoutParams74);
        }
        android.view.a.a(linearLayout);
        if (linearLayout.getParent() == null) {
            frameLayout2.addView(linearLayout, layoutParams72);
        }
        View frameLayout33 = new FrameLayout(context);
        frameLayout33.setId(R.id.aca);
        ViewGroup.LayoutParams layoutParams75 = new FrameLayout.LayoutParams(-1, -1);
        android.view.a.a(frameLayout33);
        if (frameLayout33.getParent() == null) {
            frameLayout2.addView(frameLayout33, layoutParams75);
        }
        View widgetContainer33 = new WidgetContainer(context);
        widgetContainer33.setId(R.id.bqf);
        widgetContainer33.setVisibility(8);
        FrameLayout.LayoutParams layoutParams76 = new FrameLayout.LayoutParams(-2, -2);
        if (LinearLayout.LayoutParams.class.isInstance(layoutParams76)) {
            i42 = 21;
            ((LinearLayout.LayoutParams) layoutParams76).gravity = 21;
        } else {
            i42 = 21;
        }
        if (FrameLayout.LayoutParams.class.isInstance(layoutParams76)) {
            layoutParams76.gravity = i42;
        }
        if (DrawerLayout.d.class.isInstance(layoutParams76)) {
            ((DrawerLayout.d) layoutParams76).f2691a = i42;
        }
        android.view.a.a(widgetContainer33);
        if (widgetContainer33.getParent() == null) {
            frameLayout2.addView(widgetContainer33, layoutParams76);
        }
        View disallowInterceptFrameLayout = new DisallowInterceptFrameLayout(context);
        disallowInterceptFrameLayout.setId(R.id.ead);
        FrameLayout.LayoutParams layoutParams77 = new FrameLayout.LayoutParams(-1, -2);
        if (LinearLayout.LayoutParams.class.isInstance(layoutParams77)) {
            ((LinearLayout.LayoutParams) layoutParams77).gravity = 80;
        }
        if (FrameLayout.LayoutParams.class.isInstance(layoutParams77)) {
            layoutParams77.gravity = 80;
        }
        if (DrawerLayout.d.class.isInstance(layoutParams77)) {
            ((DrawerLayout.d) layoutParams77).f2691a = 80;
        }
        android.view.a.a(disallowInterceptFrameLayout);
        if (disallowInterceptFrameLayout.getParent() == null) {
            frameLayout2.addView(disallowInterceptFrameLayout, layoutParams77);
        }
        View frameLayout34 = new FrameLayout(context);
        frameLayout34.setId(R.id.cne);
        ViewGroup.LayoutParams layoutParams78 = new FrameLayout.LayoutParams(-1, -1);
        android.view.a.a(frameLayout34);
        if (frameLayout34.getParent() == null) {
            frameLayout2.addView(frameLayout34, layoutParams78);
        }
        View frameLayout35 = new FrameLayout(context);
        frameLayout35.setId(R.id.bcz);
        frameLayout35.setBackgroundColor(resources.getColor(R.color.x9));
        frameLayout35.setVisibility(8);
        ViewGroup.LayoutParams layoutParams79 = new FrameLayout.LayoutParams(-1, -1);
        android.view.a.a(frameLayout35);
        if (frameLayout35.getParent() == null) {
            frameLayout2.addView(frameLayout35, layoutParams79);
        }
        android.view.a.a(frameLayout2);
        if (frameLayout2.getParent() == null) {
            frameLayout.addView(frameLayout2, layoutParams6);
        }
        View widgetContainer34 = new WidgetContainer(context);
        widgetContainer34.setId(R.id.ecn);
        FrameLayout.LayoutParams layoutParams80 = new FrameLayout.LayoutParams(-2, -2);
        if (LinearLayout.LayoutParams.class.isInstance(layoutParams80)) {
            i43 = 1;
            ((LinearLayout.LayoutParams) layoutParams80).gravity = 1;
        } else {
            i43 = 1;
        }
        if (FrameLayout.LayoutParams.class.isInstance(layoutParams80)) {
            layoutParams80.gravity = i43;
        }
        if (DrawerLayout.d.class.isInstance(layoutParams80)) {
            ((DrawerLayout.d) layoutParams80).f2691a = i43;
        }
        if (ViewGroup.MarginLayoutParams.class.isInstance(layoutParams80)) {
            ((ViewGroup.MarginLayoutParams) layoutParams80).topMargin = (int) TypedValue.applyDimension(i43, 200.0f, resources.getDisplayMetrics());
        }
        android.view.a.a(widgetContainer34);
        if (widgetContainer34.getParent() == null) {
            frameLayout.addView(widgetContainer34, layoutParams80);
        }
        View widgetContainer35 = new WidgetContainer(context);
        widgetContainer35.setId(R.id.d2e);
        ViewGroup.LayoutParams layoutParams81 = new FrameLayout.LayoutParams(-1, -1);
        android.view.a.a(widgetContainer35);
        if (widgetContainer35.getParent() == null) {
            frameLayout.addView(widgetContainer35, layoutParams81);
        }
        android.view.a.a(frameLayout);
        if (frameLayout.getParent() == null) {
            gestureDetectLayout.addView(frameLayout, a3);
        }
        View liveCenterContainerView = new LiveCenterContainerView(context);
        liveCenterContainerView.setId(R.id.cc5);
        liveCenterContainerView.setBackgroundColor(resources.getColor(R.color.a3));
        liveCenterContainerView.setVisibility(4);
        ViewGroup.LayoutParams a4 = android.view.a.a(gestureDetectLayout, -1, -1);
        android.view.a.a(liveCenterContainerView);
        if (liveCenterContainerView.getParent() == null) {
            gestureDetectLayout.addView(liveCenterContainerView, a4);
        }
        android.view.a.a(gestureDetectLayout);
        gestureDetectLayout.setLayoutParams(a2);
        if (viewGroup != null && z) {
            viewGroup.addView(gestureDetectLayout);
        }
        MethodCollector.o(1836);
        return gestureDetectLayout;
    }
}
