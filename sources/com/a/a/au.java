package com.a.a;

import android.content.Context;
import android.content.res.Resources;
import android.os.Build;
import android.text.TextUtils;
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
import com.bytedance.tux.icon.TuxIconView;
import com.bytedance.tux.input.TuxTextView;
import com.ss.android.ugc.aweme.tux.a.j.f;
import com.zhiliaoapp.musically.R;

public final class au implements e {
    static {
        Covode.recordClassIndex(1957);
    }

    @Override // com.a.b.e
    public final View a(Context context, ViewGroup viewGroup, boolean z) {
        int i2;
        int i3;
        MethodCollector.i(3022);
        Resources resources = context.getResources();
        RelativeLayout relativeLayout = new RelativeLayout(context);
        relativeLayout.setBackgroundColor(resources.getColor(R.color.bl));
        ViewGroup.LayoutParams a2 = a.a(viewGroup, -1, -1);
        TuxIconView tuxIconView = new TuxIconView(context);
        tuxIconView.setId(R.id.e0z);
        RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams((int) TypedValue.applyDimension(1, 16.0f, resources.getDisplayMetrics()), (int) TypedValue.applyDimension(1, 16.0f, resources.getDisplayMetrics()));
        if (RelativeLayout.LayoutParams.class.isInstance(layoutParams)) {
            layoutParams.addRule(15, -1);
        }
        if (ViewGroup.MarginLayoutParams.class.isInstance(layoutParams)) {
            int i4 = Build.VERSION.SDK_INT;
            layoutParams.setMarginStart((int) TypedValue.applyDimension(1, 12.0f, resources.getDisplayMetrics()));
        }
        com.ss.android.ugc.aweme.tux.a.j.e.a("app:tux_icon", new a.b("2131755526", "raw"), tuxIconView, layoutParams);
        com.ss.android.ugc.aweme.tux.a.j.e.a("app:tux_iconHeight", new a.d("16", "dp"), tuxIconView, layoutParams);
        com.ss.android.ugc.aweme.tux.a.j.e.a("app:tux_iconWidth", new a.d("16", "dp"), tuxIconView, layoutParams);
        com.ss.android.ugc.aweme.tux.a.j.e.a("app:tux_tintColor", new a.b("2130968613", "attr"), tuxIconView, layoutParams);
        com.ss.android.ugc.aweme.tux.a.j.e.a(tuxIconView, layoutParams);
        android.view.a.a(tuxIconView);
        if (tuxIconView.getParent() == null) {
            relativeLayout.addView(tuxIconView, layoutParams);
        }
        TuxTextView tuxTextView = new TuxTextView(context);
        tuxTextView.setText(R.string.ca2);
        tuxTextView.setTextColor(resources.getColorStateList(R.color.a9));
        tuxTextView.setId(R.id.e0q);
        tuxTextView.setMaxLines(1);
        tuxTextView.setEllipsize(TextUtils.TruncateAt.END);
        RelativeLayout.LayoutParams layoutParams2 = new RelativeLayout.LayoutParams(-1, -2);
        if (RelativeLayout.LayoutParams.class.isInstance(layoutParams2)) {
            layoutParams2.addRule(15, -1);
        }
        if (ViewGroup.MarginLayoutParams.class.isInstance(layoutParams2)) {
            int i5 = Build.VERSION.SDK_INT;
            layoutParams2.setMarginStart((int) TypedValue.applyDimension(1, 8.0f, resources.getDisplayMetrics()));
        }
        if (RelativeLayout.LayoutParams.class.isInstance(layoutParams2)) {
            layoutParams2.addRule(17, R.id.e0z);
        }
        if (RelativeLayout.LayoutParams.class.isInstance(layoutParams2)) {
            layoutParams2.addRule(16, R.id.dn4);
        }
        if (ViewGroup.MarginLayoutParams.class.isInstance(layoutParams2)) {
            int i6 = Build.VERSION.SDK_INT;
            layoutParams2.setMarginEnd((int) TypedValue.applyDimension(1, 20.0f, resources.getDisplayMetrics()));
        }
        f.a("app:tux_font", new a.c("P2_Semibold"), tuxTextView, layoutParams2);
        f.a(tuxTextView, layoutParams2);
        android.view.a.a(tuxTextView);
        if (tuxTextView.getParent() == null) {
            relativeLayout.addView(tuxTextView, layoutParams2);
        }
        FrameLayout frameLayout = new FrameLayout(context);
        frameLayout.setId(R.id.dn4);
        RelativeLayout.LayoutParams layoutParams3 = new RelativeLayout.LayoutParams(-2, -2);
        if (ViewGroup.MarginLayoutParams.class.isInstance(layoutParams3)) {
            int i7 = Build.VERSION.SDK_INT;
            layoutParams3.setMarginEnd((int) TypedValue.applyDimension(1, 12.0f, resources.getDisplayMetrics()));
        }
        if (RelativeLayout.LayoutParams.class.isInstance(layoutParams3)) {
            i2 = -1;
            layoutParams3.addRule(15, -1);
        } else {
            i2 = -1;
        }
        if (RelativeLayout.LayoutParams.class.isInstance(layoutParams3)) {
            layoutParams3.addRule(21, i2);
        }
        TuxIconView tuxIconView2 = new TuxIconView(context);
        tuxIconView2.setId(R.id.awu);
        FrameLayout.LayoutParams layoutParams4 = new FrameLayout.LayoutParams((int) TypedValue.applyDimension(1, 18.0f, resources.getDisplayMetrics()), (int) TypedValue.applyDimension(1, 18.0f, resources.getDisplayMetrics()));
        if (LinearLayout.LayoutParams.class.isInstance(layoutParams4)) {
            i3 = 16;
            ((LinearLayout.LayoutParams) layoutParams4).gravity = 16;
        } else {
            i3 = 16;
        }
        if (FrameLayout.LayoutParams.class.isInstance(layoutParams4)) {
            layoutParams4.gravity = i3;
        }
        if (DrawerLayout.d.class.isInstance(layoutParams4)) {
            ((DrawerLayout.d) layoutParams4).f2691a = i3;
        }
        com.ss.android.ugc.aweme.tux.a.j.e.a("app:tux_icon", new a.b("2131755199", "raw"), tuxIconView2, layoutParams4);
        com.ss.android.ugc.aweme.tux.a.j.e.a("app:tux_tintColor", new a.b("2130968613", "attr"), tuxIconView2, layoutParams4);
        com.ss.android.ugc.aweme.tux.a.j.e.a(tuxIconView2, layoutParams4);
        android.view.a.a(tuxIconView2);
        if (tuxIconView2.getParent() == null) {
            frameLayout.addView(tuxIconView2, layoutParams4);
        }
        TuxTextView tuxTextView2 = new TuxTextView(context);
        tuxTextView2.setId(R.id.fbl);
        tuxTextView2.setText(R.string.h4_);
        tuxTextView2.setTextColor(resources.getColorStateList(R.color.a9));
        FrameLayout.LayoutParams layoutParams5 = new FrameLayout.LayoutParams(-2, -1);
        f.a("app:tux_font", new a.c("P2_Semibold"), tuxTextView2, layoutParams5);
        f.a(tuxTextView2, layoutParams5);
        android.view.a.a(tuxTextView2);
        if (tuxTextView2.getParent() == null) {
            frameLayout.addView(tuxTextView2, layoutParams5);
        }
        android.view.a.a(frameLayout);
        if (frameLayout.getParent() == null) {
            relativeLayout.addView(frameLayout, layoutParams3);
        }
        android.view.a.a(relativeLayout);
        relativeLayout.setLayoutParams(a2);
        if (viewGroup != null && z) {
            viewGroup.addView(relativeLayout);
        }
        MethodCollector.o(3022);
        return relativeLayout;
    }
}
