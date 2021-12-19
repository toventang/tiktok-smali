package com.a.a;

import android.content.Context;
import android.content.res.Resources;
import android.os.Build;
import android.util.TypedValue;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewStub;
import android.view.a;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.drawerlayout.widget.DrawerLayout;
import com.a.b.a.a;
import com.a.b.e;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.bytedance.ies.dmt.ui.widget.DmtStatusView;
import com.bytedance.tux.input.TuxTextView;
import com.ss.android.ugc.aweme.tux.a.j.f;
import com.ss.android.ugc.aweme.views.FpsRecyclerView;
import com.zhiliaoapp.musically.R;

public final class b implements e {
    static {
        Covode.recordClassIndex(1963);
    }

    @Override // com.a.b.e
    public final View a(Context context, ViewGroup viewGroup, boolean z) {
        int i2;
        int i3;
        MethodCollector.i(1087);
        Resources resources = context.getResources();
        FrameLayout frameLayout = new FrameLayout(context);
        frameLayout.setId(R.id.b4w);
        ViewGroup.LayoutParams a2 = a.a(viewGroup, -1, -1);
        ViewStub viewStub = new ViewStub(context);
        viewStub.setId(R.id.ab8);
        ViewGroup.LayoutParams layoutParams = new FrameLayout.LayoutParams(-1, -1);
        viewStub.setInflatedId(-1);
        a.a(viewStub);
        if (viewStub.getParent() == null) {
            frameLayout.addView(viewStub, layoutParams);
        }
        LinearLayout linearLayout = new LinearLayout(context);
        linearLayout.setId(R.id.ch6);
        linearLayout.setOrientation(1);
        ViewGroup.LayoutParams layoutParams2 = new FrameLayout.LayoutParams(-1, -1);
        View frameLayout2 = new FrameLayout(context);
        frameLayout2.setId(R.id.bf6);
        ViewGroup.LayoutParams layoutParams3 = new LinearLayout.LayoutParams(-1, -2);
        a.a(frameLayout2);
        if (frameLayout2.getParent() == null) {
            linearLayout.addView(frameLayout2, layoutParams3);
        }
        TuxTextView tuxTextView = new TuxTextView(context);
        tuxTextView.setId(R.id.title);
        tuxTextView.setTextColor(resources.getColorStateList(R.color.bx));
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
            ((ViewGroup.MarginLayoutParams) layoutParams4).topMargin = (int) TypedValue.applyDimension(1, 12.0f, resources.getDisplayMetrics());
        }
        if (ViewGroup.MarginLayoutParams.class.isInstance(layoutParams4)) {
            ((ViewGroup.MarginLayoutParams) layoutParams4).bottomMargin = (int) TypedValue.applyDimension(1, 12.0f, resources.getDisplayMetrics());
        }
        tuxTextView.setGravity(17);
        f.a("app:tux_font", new a.c("P3_Semibold"), tuxTextView, layoutParams4);
        f.a(tuxTextView, layoutParams4);
        android.view.a.a(tuxTextView);
        if (tuxTextView.getParent() == null) {
            linearLayout.addView(tuxTextView, layoutParams4);
        }
        TuxTextView tuxTextView2 = new TuxTextView(context);
        tuxTextView2.setTextColor(resources.getColorStateList(R.color.c5));
        tuxTextView2.setText(R.string.amy);
        tuxTextView2.setVisibility(8);
        tuxTextView2.setId(R.id.a_z);
        LinearLayout.LayoutParams layoutParams5 = new LinearLayout.LayoutParams(-2, -2);
        if (LinearLayout.LayoutParams.class.isInstance(layoutParams5)) {
            layoutParams5.gravity = 1;
        }
        if (FrameLayout.LayoutParams.class.isInstance(layoutParams5)) {
            ((FrameLayout.LayoutParams) layoutParams5).gravity = 1;
        }
        if (DrawerLayout.d.class.isInstance(layoutParams5)) {
            ((DrawerLayout.d) layoutParams5).f2691a = 1;
        }
        tuxTextView2.setGravity(17);
        if (ViewGroup.MarginLayoutParams.class.isInstance(layoutParams5)) {
            int i4 = Build.VERSION.SDK_INT;
            layoutParams5.setMarginStart((int) TypedValue.applyDimension(1, 48.0f, resources.getDisplayMetrics()));
        }
        if (ViewGroup.MarginLayoutParams.class.isInstance(layoutParams5)) {
            int i5 = Build.VERSION.SDK_INT;
            layoutParams5.setMarginEnd((int) TypedValue.applyDimension(1, 48.0f, resources.getDisplayMetrics()));
        }
        if (ViewGroup.MarginLayoutParams.class.isInstance(layoutParams5)) {
            ((ViewGroup.MarginLayoutParams) layoutParams5).bottomMargin = (int) TypedValue.applyDimension(1, 4.0f, resources.getDisplayMetrics());
        }
        f.a("app:tux_font", new a.c("P3_Bold"), tuxTextView2, layoutParams5);
        f.a(tuxTextView2, layoutParams5);
        android.view.a.a(tuxTextView2);
        if (tuxTextView2.getParent() == null) {
            linearLayout.addView(tuxTextView2, layoutParams5);
        }
        View a3 = com.a.b.a.a(context, R.layout.jd, linearLayout, false, 0);
        a3.setId(R.id.ao4);
        a3.setVisibility(8);
        if (a3.getParent() == null) {
            linearLayout.addView(a3);
        }
        LinearLayout linearLayout2 = new LinearLayout(context);
        linearLayout2.setId(R.id.b4x);
        linearLayout2.setOrientation(1);
        LinearLayout.LayoutParams layoutParams6 = new LinearLayout.LayoutParams(-1, (int) TypedValue.applyDimension(1, 0.0f, resources.getDisplayMetrics()));
        if (LinearLayout.LayoutParams.class.isInstance(layoutParams6)) {
            layoutParams6.weight = 1.0f;
        }
        View fpsRecyclerView = new FpsRecyclerView(context);
        fpsRecyclerView.setId(R.id.djj);
        fpsRecyclerView.setOverScrollMode(2);
        ViewGroup.LayoutParams layoutParams7 = new LinearLayout.LayoutParams(-1, -2);
        android.view.a.a(fpsRecyclerView);
        if (fpsRecyclerView.getParent() == null) {
            linearLayout2.addView(fpsRecyclerView, layoutParams7);
        }
        View dmtStatusView = new DmtStatusView(context);
        dmtStatusView.setId(R.id.e_o);
        LinearLayout.LayoutParams layoutParams8 = new LinearLayout.LayoutParams(-1, -1);
        if (ViewGroup.MarginLayoutParams.class.isInstance(layoutParams8)) {
            int i6 = Build.VERSION.SDK_INT;
            layoutParams8.setMarginStart((int) TypedValue.applyDimension(1, 32.0f, resources.getDisplayMetrics()));
        }
        if (ViewGroup.MarginLayoutParams.class.isInstance(layoutParams8)) {
            int i7 = Build.VERSION.SDK_INT;
            layoutParams8.setMarginEnd((int) TypedValue.applyDimension(1, 32.0f, resources.getDisplayMetrics()));
        }
        android.view.a.a(dmtStatusView);
        if (dmtStatusView.getParent() == null) {
            linearLayout2.addView(dmtStatusView, layoutParams8);
        }
        LinearLayout linearLayout3 = new LinearLayout(context);
        linearLayout3.setId(R.id.b8v);
        linearLayout3.setOrientation(1);
        linearLayout3.setVisibility(8);
        LinearLayout.LayoutParams layoutParams9 = new LinearLayout.LayoutParams(-1, -1);
        if (LinearLayout.LayoutParams.class.isInstance(layoutParams9)) {
            i2 = 17;
            layoutParams9.gravity = 17;
        } else {
            i2 = 17;
        }
        if (FrameLayout.LayoutParams.class.isInstance(layoutParams9)) {
            ((FrameLayout.LayoutParams) layoutParams9).gravity = i2;
        }
        if (DrawerLayout.d.class.isInstance(layoutParams9)) {
            ((DrawerLayout.d) layoutParams9).f2691a = i2;
        }
        linearLayout3.setGravity(i2);
        AppCompatImageView appCompatImageView = new AppCompatImageView(context);
        appCompatImageView.setImageResource(2131231220);
        LinearLayout.LayoutParams layoutParams10 = new LinearLayout.LayoutParams((int) TypedValue.applyDimension(1, 49.0f, resources.getDisplayMetrics()), (int) TypedValue.applyDimension(1, 49.0f, resources.getDisplayMetrics()));
        android.view.a.a(appCompatImageView);
        if (appCompatImageView.getParent() == null) {
            linearLayout3.addView(appCompatImageView, layoutParams10);
        }
        TuxTextView tuxTextView3 = new TuxTextView(context);
        tuxTextView3.setText(R.string.nz);
        LinearLayout.LayoutParams layoutParams11 = new LinearLayout.LayoutParams(-2, -2);
        if (ViewGroup.MarginLayoutParams.class.isInstance(layoutParams11)) {
            ((ViewGroup.MarginLayoutParams) layoutParams11).topMargin = (int) TypedValue.applyDimension(1, 25.0f, resources.getDisplayMetrics());
        }
        f.a("app:tux_font", new a.c("P1_Regular"), tuxTextView3, layoutParams11);
        f.a(tuxTextView3, layoutParams11);
        android.view.a.a(tuxTextView3);
        if (tuxTextView3.getParent() == null) {
            linearLayout3.addView(tuxTextView3, layoutParams11);
        }
        android.view.a.a(linearLayout3);
        if (linearLayout3.getParent() == null) {
            linearLayout2.addView(linearLayout3, layoutParams9);
        }
        TuxTextView tuxTextView4 = new TuxTextView(context);
        tuxTextView4.setId(R.id.a9z);
        tuxTextView4.setTextColor(resources.getColorStateList(R.color.c5));
        tuxTextView4.setText(R.string.amq);
        tuxTextView4.setVisibility(8);
        LinearLayout.LayoutParams layoutParams12 = new LinearLayout.LayoutParams(-1, -1);
        if (LinearLayout.LayoutParams.class.isInstance(layoutParams12)) {
            i3 = 17;
            layoutParams12.gravity = 17;
        } else {
            i3 = 17;
        }
        if (FrameLayout.LayoutParams.class.isInstance(layoutParams12)) {
            ((FrameLayout.LayoutParams) layoutParams12).gravity = i3;
        }
        if (DrawerLayout.d.class.isInstance(layoutParams12)) {
            ((DrawerLayout.d) layoutParams12).f2691a = i3;
        }
        tuxTextView4.setGravity(i3);
        f.a("app:tux_font", new a.c("P1_Regular"), tuxTextView4, layoutParams12);
        f.a(tuxTextView4, layoutParams12);
        android.view.a.a(tuxTextView4);
        if (tuxTextView4.getParent() == null) {
            linearLayout2.addView(tuxTextView4, layoutParams12);
        }
        android.view.a.a(linearLayout2);
        if (linearLayout2.getParent() == null) {
            linearLayout.addView(linearLayout2, layoutParams6);
        }
        View view = new View(context);
        view.setId(R.id.a_4);
        view.setBackgroundColor(resources.getColor(R.color.b2));
        ViewGroup.LayoutParams layoutParams13 = new LinearLayout.LayoutParams(-1, (int) TypedValue.applyDimension(0, 1.0f, resources.getDisplayMetrics()));
        android.view.a.a(view);
        if (view.getParent() == null) {
            linearLayout.addView(view, layoutParams13);
        }
        LinearLayout linearLayout4 = new LinearLayout(context);
        linearLayout4.setId(R.id.d1l);
        linearLayout4.setOrientation(1);
        linearLayout4.setVisibility(8);
        ViewGroup.LayoutParams layoutParams14 = new LinearLayout.LayoutParams(-1, (int) TypedValue.applyDimension(1, 40.0f, resources.getDisplayMetrics()));
        android.view.a.a(linearLayout4);
        if (linearLayout4.getParent() == null) {
            linearLayout.addView(linearLayout4, layoutParams14);
        }
        View a4 = com.a.b.a.a(context, R.layout.i5, linearLayout, false, 0);
        a4.setId(R.id.a_0);
        LinearLayout.LayoutParams layoutParams15 = new LinearLayout.LayoutParams(-1, -2);
        if (LinearLayout.LayoutParams.class.isInstance(layoutParams15)) {
            layoutParams15.gravity = 80;
        }
        if (FrameLayout.LayoutParams.class.isInstance(layoutParams15)) {
            ((FrameLayout.LayoutParams) layoutParams15).gravity = 80;
        }
        if (DrawerLayout.d.class.isInstance(layoutParams15)) {
            ((DrawerLayout.d) layoutParams15).f2691a = 80;
        }
        if (a4.getParent() == null) {
            linearLayout.addView(a4, layoutParams15);
        }
        LinearLayout linearLayout5 = new LinearLayout(context);
        linearLayout5.setId(R.id.rw);
        linearLayout5.setOrientation(0);
        linearLayout5.setVisibility(8);
        ViewGroup.LayoutParams layoutParams16 = new LinearLayout.LayoutParams(-1, (int) TypedValue.applyDimension(1, 56.0f, resources.getDisplayMetrics()));
        TuxTextView tuxTextView5 = new TuxTextView(context);
        tuxTextView5.setId(R.id.rx);
        tuxTextView5.setText(R.string.ak0);
        tuxTextView5.setTextColor(resources.getColorStateList(R.color.bz));
        LinearLayout.LayoutParams layoutParams17 = new LinearLayout.LayoutParams((int) TypedValue.applyDimension(1, 0.0f, resources.getDisplayMetrics()), -1);
        if (LinearLayout.LayoutParams.class.isInstance(layoutParams17)) {
            layoutParams17.weight = 1.0f;
        }
        tuxTextView5.setGravity(17);
        f.a("app:tux_font", new a.c("H4_Semibold"), tuxTextView5, layoutParams17);
        f.a(tuxTextView5, layoutParams17);
        android.view.a.a(tuxTextView5);
        if (tuxTextView5.getParent() == null) {
            linearLayout5.addView(tuxTextView5, layoutParams17);
        }
        View view2 = new View(context);
        view2.setBackgroundColor(resources.getColor(R.color.b3));
        LinearLayout.LayoutParams layoutParams18 = new LinearLayout.LayoutParams((int) TypedValue.applyDimension(0, 1.0f, resources.getDisplayMetrics()), (int) TypedValue.applyDimension(1, 25.0f, resources.getDisplayMetrics()));
        if (LinearLayout.LayoutParams.class.isInstance(layoutParams18)) {
            layoutParams18.gravity = 16;
        }
        if (FrameLayout.LayoutParams.class.isInstance(layoutParams18)) {
            ((FrameLayout.LayoutParams) layoutParams18).gravity = 16;
        }
        if (DrawerLayout.d.class.isInstance(layoutParams18)) {
            ((DrawerLayout.d) layoutParams18).f2691a = 16;
        }
        android.view.a.a(view2);
        if (view2.getParent() == null) {
            linearLayout5.addView(view2, layoutParams18);
        }
        TuxTextView tuxTextView6 = new TuxTextView(context);
        tuxTextView6.setId(R.id.s0);
        tuxTextView6.setText(R.string.ak4);
        tuxTextView6.setTextColor(resources.getColorStateList(R.color.bz));
        LinearLayout.LayoutParams layoutParams19 = new LinearLayout.LayoutParams((int) TypedValue.applyDimension(1, 0.0f, resources.getDisplayMetrics()), -1);
        if (LinearLayout.LayoutParams.class.isInstance(layoutParams19)) {
            layoutParams19.weight = 1.0f;
        }
        tuxTextView6.setGravity(17);
        f.a("app:tux_font", new a.c("H4_Semibold"), tuxTextView6, layoutParams19);
        f.a(tuxTextView6, layoutParams19);
        android.view.a.a(tuxTextView6);
        if (tuxTextView6.getParent() == null) {
            linearLayout5.addView(tuxTextView6, layoutParams19);
        }
        android.view.a.a(linearLayout5);
        if (linearLayout5.getParent() == null) {
            linearLayout.addView(linearLayout5, layoutParams16);
        }
        android.view.a.a(linearLayout);
        if (linearLayout.getParent() == null) {
            frameLayout.addView(linearLayout, layoutParams2);
        }
        View frameLayout3 = new FrameLayout(context);
        frameLayout3.setId(R.id.ad8);
        FrameLayout.LayoutParams layoutParams20 = new FrameLayout.LayoutParams(-1, -2);
        if (LinearLayout.LayoutParams.class.isInstance(layoutParams20)) {
            ((LinearLayout.LayoutParams) layoutParams20).gravity = 80;
        }
        if (FrameLayout.LayoutParams.class.isInstance(layoutParams20)) {
            layoutParams20.gravity = 80;
        }
        if (DrawerLayout.d.class.isInstance(layoutParams20)) {
            ((DrawerLayout.d) layoutParams20).f2691a = 80;
        }
        if (ViewGroup.MarginLayoutParams.class.isInstance(layoutParams20)) {
            ((ViewGroup.MarginLayoutParams) layoutParams20).bottomMargin = (int) TypedValue.applyDimension(1, 52.0f, resources.getDisplayMetrics());
        }
        android.view.a.a(frameLayout3);
        if (frameLayout3.getParent() == null) {
            frameLayout.addView(frameLayout3, layoutParams20);
        }
        AppCompatImageView appCompatImageView2 = new AppCompatImageView(context);
        appCompatImageView2.setId(R.id.ru);
        appCompatImageView2.setPadding((int) TypedValue.applyDimension(1, 12.0f, resources.getDisplayMetrics()), (int) TypedValue.applyDimension(1, 12.0f, resources.getDisplayMetrics()), (int) TypedValue.applyDimension(1, 12.0f, resources.getDisplayMetrics()), (int) TypedValue.applyDimension(1, 12.0f, resources.getDisplayMetrics()));
        appCompatImageView2.setScaleType(ImageView.ScaleType.FIT_CENTER);
        appCompatImageView2.setImageResource(2131231190);
        appCompatImageView2.setVisibility(8);
        FrameLayout.LayoutParams layoutParams21 = new FrameLayout.LayoutParams((int) TypedValue.applyDimension(1, 44.0f, resources.getDisplayMetrics()), (int) TypedValue.applyDimension(1, 44.0f, resources.getDisplayMetrics()));
        if (LinearLayout.LayoutParams.class.isInstance(layoutParams21)) {
            ((LinearLayout.LayoutParams) layoutParams21).gravity = 8388611;
        }
        if (FrameLayout.LayoutParams.class.isInstance(layoutParams21)) {
            layoutParams21.gravity = 8388611;
        }
        if (DrawerLayout.d.class.isInstance(layoutParams21)) {
            ((DrawerLayout.d) layoutParams21).f2691a = 8388611;
        }
        if (ViewGroup.MarginLayoutParams.class.isInstance(layoutParams21)) {
            ((ViewGroup.MarginLayoutParams) layoutParams21).topMargin = (int) TypedValue.applyDimension(1, 2.0f, resources.getDisplayMetrics());
        }
        if (ViewGroup.MarginLayoutParams.class.isInstance(layoutParams21)) {
            int i8 = Build.VERSION.SDK_INT;
            layoutParams21.setMarginStart((int) TypedValue.applyDimension(1, 4.0f, resources.getDisplayMetrics()));
        }
        android.view.a.a(appCompatImageView2);
        if (appCompatImageView2.getParent() == null) {
            frameLayout.addView(appCompatImageView2, layoutParams21);
        }
        TuxTextView tuxTextView7 = new TuxTextView(context);
        tuxTextView7.setId(R.id.ry);
        tuxTextView7.setText(R.string.ak3);
        tuxTextView7.setVisibility(8);
        FrameLayout.LayoutParams layoutParams22 = new FrameLayout.LayoutParams(-2, -2);
        if (ViewGroup.MarginLayoutParams.class.isInstance(layoutParams22)) {
            int i9 = Build.VERSION.SDK_INT;
            layoutParams22.setMarginEnd((int) TypedValue.applyDimension(1, 16.0f, resources.getDisplayMetrics()));
        }
        if (ViewGroup.MarginLayoutParams.class.isInstance(layoutParams22)) {
            ((ViewGroup.MarginLayoutParams) layoutParams22).topMargin = (int) TypedValue.applyDimension(1, 11.0f, resources.getDisplayMetrics());
        }
        if (LinearLayout.LayoutParams.class.isInstance(layoutParams22)) {
            ((LinearLayout.LayoutParams) layoutParams22).gravity = 8388613;
        }
        if (FrameLayout.LayoutParams.class.isInstance(layoutParams22)) {
            layoutParams22.gravity = 8388613;
        }
        if (DrawerLayout.d.class.isInstance(layoutParams22)) {
            ((DrawerLayout.d) layoutParams22).f2691a = 8388613;
        }
        f.a("app:tux_font", new a.c("P1_Semibold"), tuxTextView7, layoutParams22);
        f.a(tuxTextView7, layoutParams22);
        android.view.a.a(tuxTextView7);
        if (tuxTextView7.getParent() == null) {
            frameLayout.addView(tuxTextView7, layoutParams22);
        }
        android.view.a.a(frameLayout);
        frameLayout.setLayoutParams(a2);
        if (viewGroup != null && z) {
            viewGroup.addView(frameLayout);
        }
        MethodCollector.o(1087);
        return frameLayout;
    }
}
