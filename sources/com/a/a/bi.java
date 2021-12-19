package com.a.a;

import android.content.Context;
import android.content.res.Resources;
import android.util.TypedValue;
import android.view.View;
import android.view.ViewGroup;
import android.view.a;
import android.widget.LinearLayout;
import com.a.b.a.a;
import com.a.b.e;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.bytedance.tux.icon.TuxIconView;
import com.bytedance.tux.input.TuxTextView;
import com.ss.android.ugc.aweme.tux.a.j.f;
import com.zhiliaoapp.musically.R;

public final class bi implements e {
    static {
        Covode.recordClassIndex(1972);
    }

    @Override // com.a.b.e
    public final View a(Context context, ViewGroup viewGroup, boolean z) {
        MethodCollector.i(1048);
        Resources resources = context.getResources();
        LinearLayout linearLayout = new LinearLayout(context);
        linearLayout.setId(R.id.a2w);
        linearLayout.setBackgroundResource(R.drawable.a0j);
        linearLayout.setOrientation(0);
        linearLayout.setPadding((int) TypedValue.applyDimension(1, 16.0f, resources.getDisplayMetrics()), (int) TypedValue.applyDimension(1, 16.0f, resources.getDisplayMetrics()), (int) TypedValue.applyDimension(1, 16.0f, resources.getDisplayMetrics()), (int) TypedValue.applyDimension(1, 16.0f, resources.getDisplayMetrics()));
        ViewGroup.MarginLayoutParams a2 = a.a(viewGroup, -1, -2);
        if (ViewGroup.MarginLayoutParams.class.isInstance(a2)) {
            a2.leftMargin = (int) TypedValue.applyDimension(1, 12.0f, resources.getDisplayMetrics());
        }
        if (ViewGroup.MarginLayoutParams.class.isInstance(a2)) {
            a2.topMargin = (int) TypedValue.applyDimension(1, 94.0f, resources.getDisplayMetrics());
        }
        if (ViewGroup.MarginLayoutParams.class.isInstance(a2)) {
            a2.rightMargin = (int) TypedValue.applyDimension(1, 12.0f, resources.getDisplayMetrics());
        }
        linearLayout.setGravity(16);
        TuxIconView tuxIconView = new TuxIconView(context);
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams((int) TypedValue.applyDimension(1, 24.0f, resources.getDisplayMetrics()), (int) TypedValue.applyDimension(1, 24.0f, resources.getDisplayMetrics()));
        com.ss.android.ugc.aweme.tux.a.j.e.a("app:tux_icon", new a.b("2131755303", "raw"), tuxIconView, layoutParams);
        com.ss.android.ugc.aweme.tux.a.j.e.a("app:tux_tintColor", new a.b("2130968613", "attr"), tuxIconView, layoutParams);
        com.ss.android.ugc.aweme.tux.a.j.e.a(tuxIconView, layoutParams);
        android.view.a.a(tuxIconView);
        if (tuxIconView.getParent() == null) {
            linearLayout.addView(tuxIconView, layoutParams);
        }
        TuxTextView tuxTextView = new TuxTextView(context);
        tuxTextView.setId(R.id.a2y);
        tuxTextView.setTextColor(resources.getColorStateList(R.color.a9));
        LinearLayout.LayoutParams layoutParams2 = new LinearLayout.LayoutParams((int) TypedValue.applyDimension(1, 0.0f, resources.getDisplayMetrics()), -2);
        if (ViewGroup.MarginLayoutParams.class.isInstance(layoutParams2)) {
            ((ViewGroup.MarginLayoutParams) layoutParams2).leftMargin = (int) TypedValue.applyDimension(1, 12.0f, resources.getDisplayMetrics());
        }
        if (ViewGroup.MarginLayoutParams.class.isInstance(layoutParams2)) {
            ((ViewGroup.MarginLayoutParams) layoutParams2).rightMargin = (int) TypedValue.applyDimension(1, 12.0f, resources.getDisplayMetrics());
        }
        if (LinearLayout.LayoutParams.class.isInstance(layoutParams2)) {
            layoutParams2.weight = 1.0f;
        }
        f.a("app:tux_font", new a.c("P2_Regular"), tuxTextView, layoutParams2);
        f.a(tuxTextView, layoutParams2);
        android.view.a.a(tuxTextView);
        if (tuxTextView.getParent() == null) {
            linearLayout.addView(tuxTextView, layoutParams2);
        }
        TuxIconView tuxIconView2 = new TuxIconView(context);
        tuxIconView2.setId(R.id.a2x);
        LinearLayout.LayoutParams layoutParams3 = new LinearLayout.LayoutParams((int) TypedValue.applyDimension(1, 24.0f, resources.getDisplayMetrics()), (int) TypedValue.applyDimension(1, 24.0f, resources.getDisplayMetrics()));
        com.ss.android.ugc.aweme.tux.a.j.e.a("app:tux_icon", new a.b("2131755559", "raw"), tuxIconView2, layoutParams3);
        com.ss.android.ugc.aweme.tux.a.j.e.a("app:tux_tintColor", new a.b("2130968616", "attr"), tuxIconView2, layoutParams3);
        com.ss.android.ugc.aweme.tux.a.j.e.a(tuxIconView2, layoutParams3);
        android.view.a.a(tuxIconView2);
        if (tuxIconView2.getParent() == null) {
            linearLayout.addView(tuxIconView2, layoutParams3);
        }
        android.view.a.a(linearLayout);
        linearLayout.setLayoutParams(a2);
        if (viewGroup != null && z) {
            viewGroup.addView(linearLayout);
        }
        MethodCollector.o(1048);
        return linearLayout;
    }
}
