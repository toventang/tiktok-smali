package com.a.a;

import android.content.Context;
import android.content.res.Resources;
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
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.zhiliaoapp.musically.R;

public final class h implements e {
    static {
        Covode.recordClassIndex(2013);
    }

    @Override // com.a.b.e
    public final View a(Context context, ViewGroup viewGroup, boolean z) {
        MethodCollector.i(2206);
        Resources resources = context.getResources();
        LinearLayout linearLayout = new LinearLayout(context);
        linearLayout.setOrientation(1);
        linearLayout.setBackgroundColor(resources.getColor(R.color.f159928l));
        ViewGroup.LayoutParams a2 = a.a(viewGroup, -1, -1);
        FrameLayout frameLayout = new FrameLayout(context);
        frameLayout.setId(R.id.e4s);
        frameLayout.setBackgroundColor(resources.getColor(R.color.f159927k));
        ViewGroup.LayoutParams layoutParams = new LinearLayout.LayoutParams(-1, (int) TypedValue.applyDimension(1, 375.0f, resources.getDisplayMetrics()));
        AppCompatImageView appCompatImageView = new AppCompatImageView(context);
        appCompatImageView.setImageResource(R.drawable.yy);
        FrameLayout.LayoutParams layoutParams2 = new FrameLayout.LayoutParams((int) TypedValue.applyDimension(1, 72.0f, resources.getDisplayMetrics()), (int) TypedValue.applyDimension(1, 72.0f, resources.getDisplayMetrics()));
        if (LinearLayout.LayoutParams.class.isInstance(layoutParams2)) {
            ((LinearLayout.LayoutParams) layoutParams2).gravity = 17;
        }
        if (FrameLayout.LayoutParams.class.isInstance(layoutParams2)) {
            layoutParams2.gravity = 17;
        }
        if (DrawerLayout.d.class.isInstance(layoutParams2)) {
            ((DrawerLayout.d) layoutParams2).f2691a = 17;
        }
        a.a(appCompatImageView);
        if (appCompatImageView.getParent() == null) {
            frameLayout.addView(appCompatImageView, layoutParams2);
        }
        a.a(frameLayout);
        if (frameLayout.getParent() == null) {
            linearLayout.addView(frameLayout, layoutParams);
        }
        View view = new View(context);
        view.setBackgroundColor(resources.getColor(R.color.f159927k));
        LinearLayout.LayoutParams layoutParams3 = new LinearLayout.LayoutParams(-1, (int) TypedValue.applyDimension(1, 16.0f, resources.getDisplayMetrics()));
        if (ViewGroup.MarginLayoutParams.class.isInstance(layoutParams3)) {
            ((ViewGroup.MarginLayoutParams) layoutParams3).leftMargin = (int) resources.getDimension(R.dimen.fj);
        }
        if (ViewGroup.MarginLayoutParams.class.isInstance(layoutParams3)) {
            ((ViewGroup.MarginLayoutParams) layoutParams3).topMargin = (int) TypedValue.applyDimension(1, 20.0f, resources.getDisplayMetrics());
        }
        if (ViewGroup.MarginLayoutParams.class.isInstance(layoutParams3)) {
            ((ViewGroup.MarginLayoutParams) layoutParams3).rightMargin = (int) resources.getDimension(R.dimen.fj);
        }
        a.a(view);
        if (view.getParent() == null) {
            linearLayout.addView(view, layoutParams3);
        }
        View view2 = new View(context);
        view2.setBackgroundColor(resources.getColor(R.color.f159927k));
        LinearLayout.LayoutParams layoutParams4 = new LinearLayout.LayoutParams(-1, (int) TypedValue.applyDimension(1, 16.0f, resources.getDisplayMetrics()));
        if (ViewGroup.MarginLayoutParams.class.isInstance(layoutParams4)) {
            int i2 = Build.VERSION.SDK_INT;
            layoutParams4.setMarginStart((int) resources.getDimension(R.dimen.fj));
        }
        if (ViewGroup.MarginLayoutParams.class.isInstance(layoutParams4)) {
            ((ViewGroup.MarginLayoutParams) layoutParams4).leftMargin = (int) resources.getDimension(R.dimen.fj);
        }
        if (ViewGroup.MarginLayoutParams.class.isInstance(layoutParams4)) {
            ((ViewGroup.MarginLayoutParams) layoutParams4).topMargin = (int) TypedValue.applyDimension(1, 20.0f, resources.getDisplayMetrics());
        }
        if (ViewGroup.MarginLayoutParams.class.isInstance(layoutParams4)) {
            int i3 = Build.VERSION.SDK_INT;
            layoutParams4.setMarginEnd((int) TypedValue.applyDimension(1, 116.0f, resources.getDisplayMetrics()));
        }
        if (ViewGroup.MarginLayoutParams.class.isInstance(layoutParams4)) {
            ((ViewGroup.MarginLayoutParams) layoutParams4).rightMargin = (int) TypedValue.applyDimension(1, 116.0f, resources.getDisplayMetrics());
        }
        a.a(view2);
        if (view2.getParent() == null) {
            linearLayout.addView(view2, layoutParams4);
        }
        FrameLayout frameLayout2 = new FrameLayout(context);
        LinearLayout.LayoutParams layoutParams5 = new LinearLayout.LayoutParams(-1, (int) TypedValue.applyDimension(1, 16.0f, resources.getDisplayMetrics()));
        if (ViewGroup.MarginLayoutParams.class.isInstance(layoutParams5)) {
            int i4 = Build.VERSION.SDK_INT;
            layoutParams5.setMarginStart((int) resources.getDimension(R.dimen.fj));
        }
        if (ViewGroup.MarginLayoutParams.class.isInstance(layoutParams5)) {
            ((ViewGroup.MarginLayoutParams) layoutParams5).leftMargin = (int) resources.getDimension(R.dimen.fj);
        }
        if (ViewGroup.MarginLayoutParams.class.isInstance(layoutParams5)) {
            ((ViewGroup.MarginLayoutParams) layoutParams5).topMargin = (int) TypedValue.applyDimension(1, 20.0f, resources.getDisplayMetrics());
        }
        if (ViewGroup.MarginLayoutParams.class.isInstance(layoutParams5)) {
            int i5 = Build.VERSION.SDK_INT;
            layoutParams5.setMarginEnd((int) resources.getDimension(R.dimen.fj));
        }
        if (ViewGroup.MarginLayoutParams.class.isInstance(layoutParams5)) {
            ((ViewGroup.MarginLayoutParams) layoutParams5).rightMargin = (int) resources.getDimension(R.dimen.fj);
        }
        View view3 = new View(context);
        view3.setBackgroundColor(resources.getColor(R.color.f159927k));
        FrameLayout.LayoutParams layoutParams6 = new FrameLayout.LayoutParams((int) TypedValue.applyDimension(1, 88.0f, resources.getDisplayMetrics()), (int) TypedValue.applyDimension(1, 16.0f, resources.getDisplayMetrics()));
        a.a(view3);
        if (view3.getParent() == null) {
            frameLayout2.addView(view3, layoutParams6);
        }
        View view4 = new View(context);
        view4.setBackgroundColor(resources.getColor(R.color.f159927k));
        FrameLayout.LayoutParams layoutParams7 = new FrameLayout.LayoutParams((int) TypedValue.applyDimension(1, 42.0f, resources.getDisplayMetrics()), (int) TypedValue.applyDimension(1, 16.0f, resources.getDisplayMetrics()));
        if (LinearLayout.LayoutParams.class.isInstance(layoutParams7)) {
            ((LinearLayout.LayoutParams) layoutParams7).gravity = 8388613;
        }
        if (FrameLayout.LayoutParams.class.isInstance(layoutParams7)) {
            layoutParams7.gravity = 8388613;
        }
        if (DrawerLayout.d.class.isInstance(layoutParams7)) {
            ((DrawerLayout.d) layoutParams7).f2691a = 8388613;
        }
        a.a(view4);
        if (view4.getParent() == null) {
            frameLayout2.addView(view4, layoutParams7);
        }
        a.a(frameLayout2);
        if (frameLayout2.getParent() == null) {
            linearLayout.addView(frameLayout2, layoutParams5);
        }
        View view5 = new View(context);
        view5.setBackgroundColor(resources.getColor(R.color.f159927k));
        LinearLayout.LayoutParams layoutParams8 = new LinearLayout.LayoutParams(-1, (int) TypedValue.applyDimension(1, 1.0f, resources.getDisplayMetrics()));
        if (LinearLayout.LayoutParams.class.isInstance(layoutParams8)) {
            layoutParams8.gravity = 8388613;
        }
        if (FrameLayout.LayoutParams.class.isInstance(layoutParams8)) {
            ((FrameLayout.LayoutParams) layoutParams8).gravity = 8388613;
        }
        if (DrawerLayout.d.class.isInstance(layoutParams8)) {
            ((DrawerLayout.d) layoutParams8).f2691a = 8388613;
        }
        if (ViewGroup.MarginLayoutParams.class.isInstance(layoutParams8)) {
            ((ViewGroup.MarginLayoutParams) layoutParams8).leftMargin = (int) resources.getDimension(R.dimen.fj);
        }
        if (ViewGroup.MarginLayoutParams.class.isInstance(layoutParams8)) {
            ((ViewGroup.MarginLayoutParams) layoutParams8).topMargin = (int) TypedValue.applyDimension(1, 20.0f, resources.getDisplayMetrics());
        }
        if (ViewGroup.MarginLayoutParams.class.isInstance(layoutParams8)) {
            ((ViewGroup.MarginLayoutParams) layoutParams8).rightMargin = (int) resources.getDimension(R.dimen.fj);
        }
        a.a(view5);
        if (view5.getParent() == null) {
            linearLayout.addView(view5, layoutParams8);
        }
        FrameLayout frameLayout3 = new FrameLayout(context);
        LinearLayout.LayoutParams layoutParams9 = new LinearLayout.LayoutParams(-1, (int) TypedValue.applyDimension(1, 16.0f, resources.getDisplayMetrics()));
        if (ViewGroup.MarginLayoutParams.class.isInstance(layoutParams9)) {
            int i6 = Build.VERSION.SDK_INT;
            layoutParams9.setMarginStart((int) resources.getDimension(R.dimen.fj));
        }
        if (ViewGroup.MarginLayoutParams.class.isInstance(layoutParams9)) {
            ((ViewGroup.MarginLayoutParams) layoutParams9).leftMargin = (int) resources.getDimension(R.dimen.fj);
        }
        if (ViewGroup.MarginLayoutParams.class.isInstance(layoutParams9)) {
            ((ViewGroup.MarginLayoutParams) layoutParams9).topMargin = (int) TypedValue.applyDimension(1, 20.0f, resources.getDisplayMetrics());
        }
        if (ViewGroup.MarginLayoutParams.class.isInstance(layoutParams9)) {
            int i7 = Build.VERSION.SDK_INT;
            layoutParams9.setMarginEnd((int) resources.getDimension(R.dimen.fj));
        }
        if (ViewGroup.MarginLayoutParams.class.isInstance(layoutParams9)) {
            ((ViewGroup.MarginLayoutParams) layoutParams9).rightMargin = (int) resources.getDimension(R.dimen.fj);
        }
        View view6 = new View(context);
        view6.setBackgroundColor(resources.getColor(R.color.f159927k));
        FrameLayout.LayoutParams layoutParams10 = new FrameLayout.LayoutParams((int) TypedValue.applyDimension(1, 44.0f, resources.getDisplayMetrics()), (int) TypedValue.applyDimension(1, 16.0f, resources.getDisplayMetrics()));
        a.a(view6);
        if (view6.getParent() == null) {
            frameLayout3.addView(view6, layoutParams10);
        }
        View view7 = new View(context);
        view7.setBackgroundColor(resources.getColor(R.color.f159927k));
        FrameLayout.LayoutParams layoutParams11 = new FrameLayout.LayoutParams((int) TypedValue.applyDimension(1, 105.0f, resources.getDisplayMetrics()), (int) TypedValue.applyDimension(1, 16.0f, resources.getDisplayMetrics()));
        if (LinearLayout.LayoutParams.class.isInstance(layoutParams11)) {
            ((LinearLayout.LayoutParams) layoutParams11).gravity = 8388613;
        }
        if (FrameLayout.LayoutParams.class.isInstance(layoutParams11)) {
            layoutParams11.gravity = 8388613;
        }
        if (DrawerLayout.d.class.isInstance(layoutParams11)) {
            ((DrawerLayout.d) layoutParams11).f2691a = 8388613;
        }
        a.a(view7);
        if (view7.getParent() == null) {
            frameLayout3.addView(view7, layoutParams11);
        }
        a.a(frameLayout3);
        if (frameLayout3.getParent() == null) {
            linearLayout.addView(frameLayout3, layoutParams9);
        }
        FrameLayout frameLayout4 = new FrameLayout(context);
        LinearLayout.LayoutParams layoutParams12 = new LinearLayout.LayoutParams(-1, (int) TypedValue.applyDimension(1, 16.0f, resources.getDisplayMetrics()));
        if (ViewGroup.MarginLayoutParams.class.isInstance(layoutParams12)) {
            int i8 = Build.VERSION.SDK_INT;
            layoutParams12.setMarginStart((int) resources.getDimension(R.dimen.fj));
        }
        if (ViewGroup.MarginLayoutParams.class.isInstance(layoutParams12)) {
            ((ViewGroup.MarginLayoutParams) layoutParams12).leftMargin = (int) resources.getDimension(R.dimen.fj);
        }
        if (ViewGroup.MarginLayoutParams.class.isInstance(layoutParams12)) {
            ((ViewGroup.MarginLayoutParams) layoutParams12).topMargin = (int) TypedValue.applyDimension(1, 20.0f, resources.getDisplayMetrics());
        }
        if (ViewGroup.MarginLayoutParams.class.isInstance(layoutParams12)) {
            int i9 = Build.VERSION.SDK_INT;
            layoutParams12.setMarginEnd((int) resources.getDimension(R.dimen.fj));
        }
        if (ViewGroup.MarginLayoutParams.class.isInstance(layoutParams12)) {
            ((ViewGroup.MarginLayoutParams) layoutParams12).rightMargin = (int) resources.getDimension(R.dimen.fj);
        }
        View view8 = new View(context);
        view8.setBackgroundColor(resources.getColor(R.color.f159927k));
        FrameLayout.LayoutParams layoutParams13 = new FrameLayout.LayoutParams((int) TypedValue.applyDimension(1, 44.0f, resources.getDisplayMetrics()), (int) TypedValue.applyDimension(1, 16.0f, resources.getDisplayMetrics()));
        a.a(view8);
        if (view8.getParent() == null) {
            frameLayout4.addView(view8, layoutParams13);
        }
        View view9 = new View(context);
        view9.setBackgroundColor(resources.getColor(R.color.f159927k));
        FrameLayout.LayoutParams layoutParams14 = new FrameLayout.LayoutParams((int) TypedValue.applyDimension(1, 88.0f, resources.getDisplayMetrics()), (int) TypedValue.applyDimension(1, 16.0f, resources.getDisplayMetrics()));
        if (LinearLayout.LayoutParams.class.isInstance(layoutParams14)) {
            ((LinearLayout.LayoutParams) layoutParams14).gravity = 8388613;
        }
        if (FrameLayout.LayoutParams.class.isInstance(layoutParams14)) {
            layoutParams14.gravity = 8388613;
        }
        if (DrawerLayout.d.class.isInstance(layoutParams14)) {
            ((DrawerLayout.d) layoutParams14).f2691a = 8388613;
        }
        a.a(view9);
        if (view9.getParent() == null) {
            frameLayout4.addView(view9, layoutParams14);
        }
        a.a(frameLayout4);
        if (frameLayout4.getParent() == null) {
            linearLayout.addView(frameLayout4, layoutParams12);
        }
        FrameLayout frameLayout5 = new FrameLayout(context);
        LinearLayout.LayoutParams layoutParams15 = new LinearLayout.LayoutParams(-1, (int) TypedValue.applyDimension(1, 16.0f, resources.getDisplayMetrics()));
        if (ViewGroup.MarginLayoutParams.class.isInstance(layoutParams15)) {
            int i10 = Build.VERSION.SDK_INT;
            layoutParams15.setMarginStart((int) resources.getDimension(R.dimen.fj));
        }
        if (ViewGroup.MarginLayoutParams.class.isInstance(layoutParams15)) {
            ((ViewGroup.MarginLayoutParams) layoutParams15).leftMargin = (int) resources.getDimension(R.dimen.fj);
        }
        if (ViewGroup.MarginLayoutParams.class.isInstance(layoutParams15)) {
            ((ViewGroup.MarginLayoutParams) layoutParams15).topMargin = (int) resources.getDimension(R.dimen.fj);
        }
        if (ViewGroup.MarginLayoutParams.class.isInstance(layoutParams15)) {
            int i11 = Build.VERSION.SDK_INT;
            layoutParams15.setMarginEnd((int) resources.getDimension(R.dimen.fj));
        }
        if (ViewGroup.MarginLayoutParams.class.isInstance(layoutParams15)) {
            ((ViewGroup.MarginLayoutParams) layoutParams15).rightMargin = (int) resources.getDimension(R.dimen.fj);
        }
        View view10 = new View(context);
        view10.setBackgroundColor(resources.getColor(R.color.f159927k));
        FrameLayout.LayoutParams layoutParams16 = new FrameLayout.LayoutParams((int) TypedValue.applyDimension(1, 44.0f, resources.getDisplayMetrics()), (int) TypedValue.applyDimension(1, 16.0f, resources.getDisplayMetrics()));
        a.a(view10);
        if (view10.getParent() == null) {
            frameLayout5.addView(view10, layoutParams16);
        }
        View view11 = new View(context);
        view11.setBackgroundColor(resources.getColor(R.color.f159927k));
        FrameLayout.LayoutParams layoutParams17 = new FrameLayout.LayoutParams((int) TypedValue.applyDimension(1, 132.0f, resources.getDisplayMetrics()), (int) TypedValue.applyDimension(1, 16.0f, resources.getDisplayMetrics()));
        if (LinearLayout.LayoutParams.class.isInstance(layoutParams17)) {
            ((LinearLayout.LayoutParams) layoutParams17).gravity = 8388613;
        }
        if (FrameLayout.LayoutParams.class.isInstance(layoutParams17)) {
            layoutParams17.gravity = 8388613;
        }
        if (DrawerLayout.d.class.isInstance(layoutParams17)) {
            ((DrawerLayout.d) layoutParams17).f2691a = 8388613;
        }
        a.a(view11);
        if (view11.getParent() == null) {
            frameLayout5.addView(view11, layoutParams17);
        }
        a.a(frameLayout5);
        if (frameLayout5.getParent() == null) {
            linearLayout.addView(frameLayout5, layoutParams15);
        }
        View view12 = new View(context);
        view12.setBackgroundColor(resources.getColor(R.color.f159927k));
        LinearLayout.LayoutParams layoutParams18 = new LinearLayout.LayoutParams(-1, (int) TypedValue.applyDimension(1, 1.0f, resources.getDisplayMetrics()));
        if (LinearLayout.LayoutParams.class.isInstance(layoutParams18)) {
            layoutParams18.gravity = 8388613;
        }
        if (FrameLayout.LayoutParams.class.isInstance(layoutParams18)) {
            ((FrameLayout.LayoutParams) layoutParams18).gravity = 8388613;
        }
        if (DrawerLayout.d.class.isInstance(layoutParams18)) {
            ((DrawerLayout.d) layoutParams18).f2691a = 8388613;
        }
        if (ViewGroup.MarginLayoutParams.class.isInstance(layoutParams18)) {
            ((ViewGroup.MarginLayoutParams) layoutParams18).leftMargin = (int) resources.getDimension(R.dimen.fj);
        }
        if (ViewGroup.MarginLayoutParams.class.isInstance(layoutParams18)) {
            ((ViewGroup.MarginLayoutParams) layoutParams18).topMargin = (int) TypedValue.applyDimension(1, 20.0f, resources.getDisplayMetrics());
        }
        if (ViewGroup.MarginLayoutParams.class.isInstance(layoutParams18)) {
            ((ViewGroup.MarginLayoutParams) layoutParams18).rightMargin = (int) resources.getDimension(R.dimen.fj);
        }
        a.a(view12);
        if (view12.getParent() == null) {
            linearLayout.addView(view12, layoutParams18);
        }
        View view13 = new View(context);
        view13.setBackgroundColor(resources.getColor(R.color.f159927k));
        LinearLayout.LayoutParams layoutParams19 = new LinearLayout.LayoutParams((int) TypedValue.applyDimension(1, 142.0f, resources.getDisplayMetrics()), (int) TypedValue.applyDimension(1, 16.0f, resources.getDisplayMetrics()));
        if (ViewGroup.MarginLayoutParams.class.isInstance(layoutParams19)) {
            ((ViewGroup.MarginLayoutParams) layoutParams19).leftMargin = (int) resources.getDimension(R.dimen.fj);
        }
        if (ViewGroup.MarginLayoutParams.class.isInstance(layoutParams19)) {
            ((ViewGroup.MarginLayoutParams) layoutParams19).topMargin = (int) resources.getDimension(R.dimen.fj);
        }
        if (ViewGroup.MarginLayoutParams.class.isInstance(layoutParams19)) {
            ((ViewGroup.MarginLayoutParams) layoutParams19).rightMargin = (int) resources.getDimension(R.dimen.fj);
        }
        a.a(view13);
        if (view13.getParent() == null) {
            linearLayout.addView(view13, layoutParams19);
        }
        a.a(linearLayout);
        linearLayout.setLayoutParams(a2);
        if (viewGroup != null && z) {
            viewGroup.addView(linearLayout);
        }
        MethodCollector.o(2206);
        return linearLayout;
    }
}
