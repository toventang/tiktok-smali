package com.a.a;

import android.content.Context;
import android.content.res.Resources;
import android.util.TypedValue;
import android.view.View;
import android.view.ViewGroup;
import android.view.a;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.drawerlayout.widget.DrawerLayout;
import com.a.b.e;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.zhiliaoapp.musically.R;

public final class aj implements e {
    static {
        Covode.recordClassIndex(1946);
    }

    @Override // com.a.b.e
    public final View a(Context context, ViewGroup viewGroup, boolean z) {
        MethodCollector.i(314);
        Resources resources = context.getResources();
        if (viewGroup == null || !z) {
            IllegalStateException illegalStateException = new IllegalStateException("merge tag container should not be null attach should not be false");
            MethodCollector.o(314);
            throw illegalStateException;
        }
        LinearLayout linearLayout = new LinearLayout(context);
        linearLayout.setId(R.id.eoc);
        linearLayout.setOrientation(1);
        ViewGroup.LayoutParams a2 = a.a(viewGroup, -1, (int) TypedValue.applyDimension(0, 0.0f, resources.getDisplayMetrics()));
        if (LinearLayout.LayoutParams.class.isInstance(a2)) {
            ((LinearLayout.LayoutParams) a2).gravity = 48;
        }
        if (FrameLayout.LayoutParams.class.isInstance(a2)) {
            ((FrameLayout.LayoutParams) a2).gravity = 48;
        }
        if (DrawerLayout.d.class.isInstance(a2)) {
            ((DrawerLayout.d) a2).f2691a = 48;
        }
        View view = new View(context);
        view.setId(R.id.eob);
        view.setBackgroundColor(resources.getColor(R.color.a2));
        ViewGroup.LayoutParams layoutParams = new LinearLayout.LayoutParams(-1, (int) TypedValue.applyDimension(0, 0.0f, resources.getDisplayMetrics()));
        a.a(view);
        if (view.getParent() == null) {
            linearLayout.addView(view, layoutParams);
        }
        FrameLayout frameLayout = new FrameLayout(context);
        ViewGroup.LayoutParams layoutParams2 = new LinearLayout.LayoutParams(-1, -2);
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
        a.a(frameLayout);
        if (frameLayout.getParent() == null) {
            linearLayout.addView(frameLayout, layoutParams2);
        }
        a.a(linearLayout);
        if (linearLayout.getParent() == null) {
            viewGroup.addView(linearLayout, a2);
        }
        LinearLayout linearLayout2 = new LinearLayout(context);
        linearLayout2.setId(R.id.vk);
        linearLayout2.setOrientation(1);
        ViewGroup.LayoutParams a3 = a.a(viewGroup, -1, (int) TypedValue.applyDimension(0, 0.0f, resources.getDisplayMetrics()));
        if (LinearLayout.LayoutParams.class.isInstance(a3)) {
            ((LinearLayout.LayoutParams) a3).gravity = 80;
        }
        if (FrameLayout.LayoutParams.class.isInstance(a3)) {
            ((FrameLayout.LayoutParams) a3).gravity = 80;
        }
        if (DrawerLayout.d.class.isInstance(a3)) {
            ((DrawerLayout.d) a3).f2691a = 80;
        }
        FrameLayout frameLayout2 = new FrameLayout(context);
        ViewGroup.LayoutParams layoutParams5 = new LinearLayout.LayoutParams(-1, -2);
        AppCompatImageView appCompatImageView3 = new AppCompatImageView(context);
        appCompatImageView3.setImageResource(2131233105);
        FrameLayout.LayoutParams layoutParams6 = new FrameLayout.LayoutParams(-2, -2);
        if (LinearLayout.LayoutParams.class.isInstance(layoutParams6)) {
            ((LinearLayout.LayoutParams) layoutParams6).gravity = 83;
        }
        if (FrameLayout.LayoutParams.class.isInstance(layoutParams6)) {
            layoutParams6.gravity = 83;
        }
        if (DrawerLayout.d.class.isInstance(layoutParams6)) {
            ((DrawerLayout.d) layoutParams6).f2691a = 83;
        }
        a.a(appCompatImageView3);
        if (appCompatImageView3.getParent() == null) {
            frameLayout2.addView(appCompatImageView3, layoutParams6);
        }
        AppCompatImageView appCompatImageView4 = new AppCompatImageView(context);
        appCompatImageView4.setImageResource(2131233106);
        FrameLayout.LayoutParams layoutParams7 = new FrameLayout.LayoutParams(-2, -2);
        if (LinearLayout.LayoutParams.class.isInstance(layoutParams7)) {
            ((LinearLayout.LayoutParams) layoutParams7).gravity = 85;
        }
        if (FrameLayout.LayoutParams.class.isInstance(layoutParams7)) {
            layoutParams7.gravity = 85;
        }
        if (DrawerLayout.d.class.isInstance(layoutParams7)) {
            ((DrawerLayout.d) layoutParams7).f2691a = 85;
        }
        a.a(appCompatImageView4);
        if (appCompatImageView4.getParent() == null) {
            frameLayout2.addView(appCompatImageView4, layoutParams7);
        }
        a.a(frameLayout2);
        if (frameLayout2.getParent() == null) {
            linearLayout2.addView(frameLayout2, layoutParams5);
        }
        View view2 = new View(context);
        view2.setId(R.id.vj);
        view2.setBackgroundColor(resources.getColor(R.color.a2));
        ViewGroup.LayoutParams layoutParams8 = new LinearLayout.LayoutParams(-1, (int) TypedValue.applyDimension(0, 0.0f, resources.getDisplayMetrics()));
        a.a(view2);
        if (view2.getParent() == null) {
            linearLayout2.addView(view2, layoutParams8);
        }
        a.a(linearLayout2);
        if (linearLayout2.getParent() == null) {
            viewGroup.addView(linearLayout2, a3);
        }
        MethodCollector.o(314);
        return viewGroup;
    }
}
