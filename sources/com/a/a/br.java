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
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;
import androidx.drawerlayout.widget.DrawerLayout;
import com.a.b.a.a;
import com.a.b.e;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.bytedance.tux.icon.TuxIconView;
import com.bytedance.tux.input.TuxTextView;
import com.ss.android.ugc.aweme.discover.ui.SearchIntermediateView;
import com.ss.android.ugc.aweme.discover.ui.SearchScanView;
import com.ss.android.ugc.aweme.tux.a.j.f;
import com.ss.android.ugc.aweme.views.AutoRTLImageView;
import com.zhiliaoapp.musically.R;

public final class br implements e {
    static {
        Covode.recordClassIndex(1981);
    }

    @Override // com.a.b.e
    public final View a(Context context, ViewGroup viewGroup, boolean z) {
        int i2;
        int i3;
        int i4;
        float f2;
        int i5;
        MethodCollector.i(6002);
        Resources resources = context.getResources();
        LinearLayout linearLayout = new LinearLayout(context);
        linearLayout.setId(R.id.cio);
        linearLayout.setOrientation(1);
        ViewGroup.LayoutParams a2 = a.a(viewGroup, -1, -1);
        if (RelativeLayout.LayoutParams.class.isInstance(a2)) {
            ((RelativeLayout.LayoutParams) a2).addRule(15, -1);
        }
        LinearLayout linearLayout2 = new LinearLayout(context);
        linearLayout2.setBackgroundColor(resources.getColor(R.color.f159928l));
        linearLayout2.setOrientation(1);
        ViewGroup.LayoutParams layoutParams = new LinearLayout.LayoutParams(-1, -2);
        View view = new View(context);
        view.setId(R.id.b_u);
        ViewGroup.LayoutParams layoutParams2 = new LinearLayout.LayoutParams(-1, (int) TypedValue.applyDimension(1, 0.0f, resources.getDisplayMetrics()));
        a.a(view);
        if (view.getParent() == null) {
            linearLayout2.addView(view, layoutParams2);
        }
        LinearLayout linearLayout3 = new LinearLayout(context);
        linearLayout3.setId(R.id.ep_);
        linearLayout3.setOrientation(0);
        ViewGroup.LayoutParams layoutParams3 = new LinearLayout.LayoutParams(-1, (int) resources.getDimension(R.dimen.a0s));
        FrameLayout frameLayout = new FrameLayout(context);
        frameLayout.setId(R.id.c9q);
        ViewGroup.LayoutParams layoutParams4 = new LinearLayout.LayoutParams(-2, -1);
        AutoRTLImageView autoRTLImageView = new AutoRTLImageView(context);
        autoRTLImageView.setId(R.id.qc);
        autoRTLImageView.setPadding((int) TypedValue.applyDimension(1, 10.0f, resources.getDisplayMetrics()), (int) TypedValue.applyDimension(1, 10.0f, resources.getDisplayMetrics()), (int) TypedValue.applyDimension(1, 10.0f, resources.getDisplayMetrics()), (int) TypedValue.applyDimension(1, 10.0f, resources.getDisplayMetrics()));
        autoRTLImageView.setImageResource(R.drawable.ccg);
        autoRTLImageView.setVisibility(0);
        FrameLayout.LayoutParams layoutParams5 = new FrameLayout.LayoutParams((int) TypedValue.applyDimension(1, 44.0f, resources.getDisplayMetrics()), (int) TypedValue.applyDimension(1, 44.0f, resources.getDisplayMetrics()));
        if (LinearLayout.LayoutParams.class.isInstance(layoutParams5)) {
            ((LinearLayout.LayoutParams) layoutParams5).gravity = 16;
        }
        if (FrameLayout.LayoutParams.class.isInstance(layoutParams5)) {
            layoutParams5.gravity = 16;
        }
        if (DrawerLayout.d.class.isInstance(layoutParams5)) {
            ((DrawerLayout.d) layoutParams5).f2691a = 16;
        }
        if (ViewGroup.MarginLayoutParams.class.isInstance(layoutParams5)) {
            int i6 = Build.VERSION.SDK_INT;
            layoutParams5.setMarginStart((int) TypedValue.applyDimension(1, 8.0f, resources.getDisplayMetrics()));
        }
        if (ViewGroup.MarginLayoutParams.class.isInstance(layoutParams5)) {
            ((ViewGroup.MarginLayoutParams) layoutParams5).leftMargin = (int) TypedValue.applyDimension(1, 8.0f, resources.getDisplayMetrics());
        }
        a.a(autoRTLImageView);
        if (autoRTLImageView.getParent() == null) {
            frameLayout.addView(autoRTLImageView, layoutParams5);
        }
        SearchScanView searchScanView = new SearchScanView(context);
        searchScanView.setId(R.id.dvl);
        searchScanView.setVisibility(8);
        FrameLayout.LayoutParams layoutParams6 = new FrameLayout.LayoutParams(-2, -1);
        if (RelativeLayout.LayoutParams.class.isInstance(layoutParams6)) {
            ((RelativeLayout.LayoutParams) layoutParams6).addRule(15, -1);
        }
        if (ViewGroup.MarginLayoutParams.class.isInstance(layoutParams6)) {
            int i7 = Build.VERSION.SDK_INT;
            layoutParams6.setMarginEnd((int) TypedValue.applyDimension(1, 2.0f, resources.getDisplayMetrics()));
        }
        if (ViewGroup.MarginLayoutParams.class.isInstance(layoutParams6)) {
            ((ViewGroup.MarginLayoutParams) layoutParams6).rightMargin = (int) TypedValue.applyDimension(1, 2.0f, resources.getDisplayMetrics());
        }
        a.a(searchScanView);
        if (searchScanView.getParent() == null) {
            frameLayout.addView(searchScanView, layoutParams6);
        }
        TuxIconView tuxIconView = new TuxIconView(context);
        tuxIconView.setId(R.id.he);
        tuxIconView.setVisibility(8);
        FrameLayout.LayoutParams layoutParams7 = new FrameLayout.LayoutParams((int) TypedValue.applyDimension(1, 48.0f, resources.getDisplayMetrics()), (int) TypedValue.applyDimension(1, 48.0f, resources.getDisplayMetrics()));
        if (LinearLayout.LayoutParams.class.isInstance(layoutParams7)) {
            ((LinearLayout.LayoutParams) layoutParams7).gravity = 17;
        }
        if (FrameLayout.LayoutParams.class.isInstance(layoutParams7)) {
            layoutParams7.gravity = 17;
        }
        if (DrawerLayout.d.class.isInstance(layoutParams7)) {
            ((DrawerLayout.d) layoutParams7).f2691a = 17;
        }
        com.ss.android.ugc.aweme.tux.a.j.e.a("app:tux_iconWidth", new a.d("24", "dp"), tuxIconView, layoutParams7);
        com.ss.android.ugc.aweme.tux.a.j.e.a("app:tux_iconHeight", new a.d("24", "dp"), tuxIconView, layoutParams7);
        com.ss.android.ugc.aweme.tux.a.j.e.a("app:tux_icon", new a.b("2131755437", "raw"), tuxIconView, layoutParams7);
        com.ss.android.ugc.aweme.tux.a.j.e.a(tuxIconView, layoutParams7);
        android.view.a.a(tuxIconView);
        if (tuxIconView.getParent() == null) {
            frameLayout.addView(tuxIconView, layoutParams7);
        }
        android.view.a.a(frameLayout);
        if (frameLayout.getParent() == null) {
            linearLayout3.addView(frameLayout, layoutParams4);
        }
        View a3 = com.a.b.a.a(context, R.layout.ax2, linearLayout3, false, 0);
        a3.setId(R.id.do7);
        LinearLayout.LayoutParams layoutParams8 = new LinearLayout.LayoutParams((int) TypedValue.applyDimension(1, 0.0f, resources.getDisplayMetrics()), -2);
        if (RelativeLayout.LayoutParams.class.isInstance(layoutParams8)) {
            i2 = -1;
            ((RelativeLayout.LayoutParams) layoutParams8).addRule(20, -1);
        } else {
            i2 = -1;
        }
        if (RelativeLayout.LayoutParams.class.isInstance(layoutParams8)) {
            ((RelativeLayout.LayoutParams) layoutParams8).addRule(9, i2);
        }
        if (RelativeLayout.LayoutParams.class.isInstance(layoutParams8)) {
            ((RelativeLayout.LayoutParams) layoutParams8).addRule(15, i2);
        }
        if (LinearLayout.LayoutParams.class.isInstance(layoutParams8)) {
            i3 = 16;
            layoutParams8.gravity = 16;
        } else {
            i3 = 16;
        }
        if (FrameLayout.LayoutParams.class.isInstance(layoutParams8)) {
            ((FrameLayout.LayoutParams) layoutParams8).gravity = i3;
        }
        if (DrawerLayout.d.class.isInstance(layoutParams8)) {
            ((DrawerLayout.d) layoutParams8).f2691a = i3;
        }
        if (LinearLayout.LayoutParams.class.isInstance(layoutParams8)) {
            layoutParams8.weight = 1.0f;
        }
        if (a3.getParent() == null) {
            linearLayout3.addView(a3, layoutParams8);
        }
        FrameLayout frameLayout2 = new FrameLayout(context);
        frameLayout2.setId(R.id.dna);
        ViewGroup.LayoutParams layoutParams9 = new LinearLayout.LayoutParams(-2, -1);
        com.bytedance.ies.dmt.ui.widget.AutoRTLImageView autoRTLImageView2 = new com.bytedance.ies.dmt.ui.widget.AutoRTLImageView(context);
        autoRTLImageView2.setId(R.id.qe);
        autoRTLImageView2.setPadding((int) TypedValue.applyDimension(1, 4.0f, resources.getDisplayMetrics()), autoRTLImageView2.getPaddingTop(), autoRTLImageView2.getPaddingRight(), autoRTLImageView2.getPaddingBottom());
        autoRTLImageView2.setPadding((int) TypedValue.applyDimension(1, 4.0f, resources.getDisplayMetrics()), autoRTLImageView2.getPaddingTop(), autoRTLImageView2.getPaddingRight(), autoRTLImageView2.getPaddingBottom());
        autoRTLImageView2.setPadding(autoRTLImageView2.getPaddingLeft(), autoRTLImageView2.getPaddingTop(), (int) TypedValue.applyDimension(1, 16.0f, resources.getDisplayMetrics()), autoRTLImageView2.getPaddingBottom());
        autoRTLImageView2.setPadding(autoRTLImageView2.getPaddingLeft(), autoRTLImageView2.getPaddingTop(), (int) TypedValue.applyDimension(1, 16.0f, resources.getDisplayMetrics()), autoRTLImageView2.getPaddingBottom());
        autoRTLImageView2.setScaleType(ImageView.ScaleType.CENTER_INSIDE);
        autoRTLImageView2.setVisibility(8);
        autoRTLImageView2.setImageResource(R.drawable.a5o);
        FrameLayout.LayoutParams layoutParams10 = new FrameLayout.LayoutParams((int) TypedValue.applyDimension(1, 44.0f, resources.getDisplayMetrics()), -1);
        if (RelativeLayout.LayoutParams.class.isInstance(layoutParams10)) {
            ((RelativeLayout.LayoutParams) layoutParams10).addRule(21, -1);
        }
        if (RelativeLayout.LayoutParams.class.isInstance(layoutParams10)) {
            ((RelativeLayout.LayoutParams) layoutParams10).addRule(11, -1);
        }
        if (LinearLayout.LayoutParams.class.isInstance(layoutParams10)) {
            i4 = 17;
            ((LinearLayout.LayoutParams) layoutParams10).gravity = 17;
        } else {
            i4 = 17;
        }
        if (FrameLayout.LayoutParams.class.isInstance(layoutParams10)) {
            layoutParams10.gravity = i4;
        }
        if (DrawerLayout.d.class.isInstance(layoutParams10)) {
            ((DrawerLayout.d) layoutParams10).f2691a = i4;
        }
        android.view.a.a(autoRTLImageView2);
        if (autoRTLImageView2.getParent() == null) {
            frameLayout2.addView(autoRTLImageView2, layoutParams10);
        }
        SearchScanView searchScanView2 = new SearchScanView(context);
        searchScanView2.setId(R.id.dvm);
        searchScanView2.setVisibility(0);
        FrameLayout.LayoutParams layoutParams11 = new FrameLayout.LayoutParams(-2, -1);
        if (RelativeLayout.LayoutParams.class.isInstance(layoutParams11)) {
            ((RelativeLayout.LayoutParams) layoutParams11).addRule(15, -1);
        }
        if (ViewGroup.MarginLayoutParams.class.isInstance(layoutParams11)) {
            int i8 = Build.VERSION.SDK_INT;
            f2 = 2.0f;
            layoutParams11.setMarginEnd((int) TypedValue.applyDimension(1, 2.0f, resources.getDisplayMetrics()));
        } else {
            f2 = 2.0f;
        }
        if (ViewGroup.MarginLayoutParams.class.isInstance(layoutParams11)) {
            ((ViewGroup.MarginLayoutParams) layoutParams11).rightMargin = (int) TypedValue.applyDimension(1, f2, resources.getDisplayMetrics());
        }
        android.view.a.a(searchScanView2);
        if (searchScanView2.getParent() == null) {
            frameLayout2.addView(searchScanView2, layoutParams11);
        }
        android.view.a.a(frameLayout2);
        if (frameLayout2.getParent() == null) {
            linearLayout3.addView(frameLayout2, layoutParams9);
        }
        TuxTextView tuxTextView = new TuxTextView(context);
        tuxTextView.setId(R.id.f6o);
        if (TextView.class.isInstance(tuxTextView)) {
            android.view.a.a(tuxTextView, (int) TypedValue.applyDimension(1, 64.0f, resources.getDisplayMetrics()));
        } else {
            tuxTextView.setMinimumWidth((int) TypedValue.applyDimension(1, 64.0f, resources.getDisplayMetrics()));
        }
        tuxTextView.setPadding((int) TypedValue.applyDimension(1, 16.0f, resources.getDisplayMetrics()), tuxTextView.getPaddingTop(), tuxTextView.getPaddingRight(), tuxTextView.getPaddingBottom());
        tuxTextView.setPadding(tuxTextView.getPaddingLeft(), tuxTextView.getPaddingTop(), (int) TypedValue.applyDimension(1, 16.0f, resources.getDisplayMetrics()), tuxTextView.getPaddingBottom());
        tuxTextView.setText(R.string.fhf);
        tuxTextView.setTextColor(resources.getColorStateList(R.color.bh));
        tuxTextView.setVisibility(8);
        LinearLayout.LayoutParams layoutParams12 = new LinearLayout.LayoutParams(-2, -1);
        if (LinearLayout.LayoutParams.class.isInstance(layoutParams12)) {
            i5 = 16;
            layoutParams12.gravity = 16;
        } else {
            i5 = 16;
        }
        if (FrameLayout.LayoutParams.class.isInstance(layoutParams12)) {
            ((FrameLayout.LayoutParams) layoutParams12).gravity = i5;
        }
        if (DrawerLayout.d.class.isInstance(layoutParams12)) {
            ((DrawerLayout.d) layoutParams12).f2691a = i5;
        }
        tuxTextView.setGravity(17);
        f.a("app:tux_font", new a.c("H4_Regular"), tuxTextView, layoutParams12);
        f.a(tuxTextView, layoutParams12);
        android.view.a.a(tuxTextView);
        if (tuxTextView.getParent() == null) {
            linearLayout3.addView(tuxTextView, layoutParams12);
        }
        android.view.a.a(linearLayout3);
        if (linearLayout3.getParent() == null) {
            linearLayout2.addView(linearLayout3, layoutParams3);
        }
        View view2 = new View(context);
        view2.setId(R.id.cai);
        TypedArray obtainStyledAttributes = context.getTheme().obtainStyledAttributes(new int[]{R.attr.an});
        view2.setBackgroundColor(obtainStyledAttributes.getColor(0, 0));
        obtainStyledAttributes.recycle();
        ViewGroup.LayoutParams layoutParams13 = new LinearLayout.LayoutParams(-1, (int) TypedValue.applyDimension(1, 0.5f, resources.getDisplayMetrics()));
        android.view.a.a(view2);
        if (view2.getParent() == null) {
            linearLayout2.addView(view2, layoutParams13);
        }
        android.view.a.a(linearLayout2);
        if (linearLayout2.getParent() == null) {
            linearLayout.addView(linearLayout2, layoutParams);
        }
        FrameLayout frameLayout3 = new FrameLayout(context);
        frameLayout3.setBackgroundColor(resources.getColor(R.color.f159928l));
        ViewGroup.LayoutParams layoutParams14 = new LinearLayout.LayoutParams(-1, -1);
        FrameLayout frameLayout4 = new FrameLayout(context);
        frameLayout4.setId(R.id.b94);
        FrameLayout.LayoutParams layoutParams15 = new FrameLayout.LayoutParams(-1, -1);
        View a4 = com.a.b.a.a(context, R.layout.y1, frameLayout4, false, 0);
        if (a4.getParent() == null) {
            frameLayout4.addView(a4);
        }
        android.view.a.a(frameLayout4);
        if (frameLayout4.getParent() == null) {
            frameLayout3.addView(frameLayout4, layoutParams15);
        }
        SearchIntermediateView searchIntermediateView = new SearchIntermediateView(context);
        searchIntermediateView.setId(R.id.dv4);
        FrameLayout.LayoutParams layoutParams16 = new FrameLayout.LayoutParams(-1, -1);
        android.view.a.a(searchIntermediateView);
        if (searchIntermediateView.getParent() == null) {
            frameLayout3.addView(searchIntermediateView, layoutParams16);
        }
        android.view.a.a(frameLayout3);
        if (frameLayout3.getParent() == null) {
            linearLayout.addView(frameLayout3, layoutParams14);
        }
        android.view.a.a(linearLayout);
        linearLayout.setLayoutParams(a2);
        if (viewGroup != null && z) {
            viewGroup.addView(linearLayout);
        }
        MethodCollector.o(6002);
        return linearLayout;
    }
}
