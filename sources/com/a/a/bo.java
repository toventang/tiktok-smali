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
import com.bytedance.ies.xelement.pickview.b.b;
import com.bytedance.tux.icon.TuxIconView;
import com.bytedance.tux.input.TuxTextView;
import com.ss.android.ugc.aweme.tux.a.j.f;
import com.zhiliaoapp.musically.R;

public final class bo implements e {
    static {
        Covode.recordClassIndex(1978);
    }

    @Override // com.a.b.e
    public final View a(Context context, ViewGroup viewGroup, boolean z) {
        MethodCollector.i(3819);
        Resources resources = context.getResources();
        LinearLayout linearLayout = new LinearLayout(context);
        linearLayout.setOrientation(0);
        linearLayout.setPadding((int) TypedValue.applyDimension(1, 12.0f, resources.getDisplayMetrics()), linearLayout.getPaddingTop(), linearLayout.getPaddingRight(), linearLayout.getPaddingBottom());
        linearLayout.setPadding(linearLayout.getPaddingLeft(), (int) TypedValue.applyDimension(1, 7.0f, resources.getDisplayMetrics()), linearLayout.getPaddingRight(), linearLayout.getPaddingBottom());
        linearLayout.setId(R.id.c65);
        linearLayout.setPadding(linearLayout.getPaddingLeft(), linearLayout.getPaddingTop(), (int) TypedValue.applyDimension(1, 12.0f, resources.getDisplayMetrics()), linearLayout.getPaddingBottom());
        linearLayout.setPadding(linearLayout.getPaddingLeft(), linearLayout.getPaddingTop(), linearLayout.getPaddingRight(), (int) TypedValue.applyDimension(1, 7.0f, resources.getDisplayMetrics()));
        ViewGroup.MarginLayoutParams a2 = a.a(viewGroup, -1, -2);
        if (RelativeLayout.LayoutParams.class.isInstance(a2)) {
            ((RelativeLayout.LayoutParams) a2).addRule(15, -1);
        }
        linearLayout.setGravity(16);
        TuxIconView tuxIconView = new TuxIconView(context);
        tuxIconView.setAlpha(0.75f);
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams((int) TypedValue.applyDimension(1, 16.0f, resources.getDisplayMetrics()), (int) TypedValue.applyDimension(1, 16.0f, resources.getDisplayMetrics()));
        com.ss.android.ugc.aweme.tux.a.j.e.a("app:tux_icon", new a.b("2131755394", "raw"), tuxIconView, layoutParams);
        com.ss.android.ugc.aweme.tux.a.j.e.a("app:tux_tintColor", new a.b("2131099683", b.f37372a), tuxIconView, layoutParams);
        com.ss.android.ugc.aweme.tux.a.j.e.a("app:tux_iconHeight", new a.d("16", "dp"), tuxIconView, layoutParams);
        com.ss.android.ugc.aweme.tux.a.j.e.a("app:tux_iconWidth", new a.d("16", "dp"), tuxIconView, layoutParams);
        if (LinearLayout.LayoutParams.class.isInstance(layoutParams)) {
            layoutParams.gravity = 17;
        }
        if (FrameLayout.LayoutParams.class.isInstance(layoutParams)) {
            ((FrameLayout.LayoutParams) layoutParams).gravity = 17;
        }
        if (DrawerLayout.d.class.isInstance(layoutParams)) {
            ((DrawerLayout.d) layoutParams).f2691a = 17;
        }
        com.ss.android.ugc.aweme.tux.a.j.e.a(tuxIconView, layoutParams);
        android.view.a.a(tuxIconView);
        if (tuxIconView.getParent() == null) {
            linearLayout.addView(tuxIconView, layoutParams);
        }
        TuxTextView tuxTextView = new TuxTextView(context);
        tuxTextView.setId(R.id.f0l);
        tuxTextView.setTextSize(1, 15.0f);
        tuxTextView.setAlpha(0.75f);
        tuxTextView.setLines(1);
        tuxTextView.setEllipsize(TextUtils.TruncateAt.END);
        tuxTextView.setTextColor(resources.getColorStateList(R.color.a9));
        LinearLayout.LayoutParams layoutParams2 = new LinearLayout.LayoutParams(-2, -2);
        if (ViewGroup.MarginLayoutParams.class.isInstance(layoutParams2)) {
            int i2 = Build.VERSION.SDK_INT;
            layoutParams2.setMarginStart((int) TypedValue.applyDimension(1, 9.0f, resources.getDisplayMetrics()));
        }
        f.a("app:tux_font", new a.c("H4_Regular"), tuxTextView, layoutParams2);
        if (LinearLayout.LayoutParams.class.isInstance(layoutParams2)) {
            layoutParams2.weight = 1.0f;
        }
        f.a(tuxTextView, layoutParams2);
        android.view.a.a(tuxTextView);
        if (tuxTextView.getParent() == null) {
            linearLayout.addView(tuxTextView, layoutParams2);
        }
        TuxTextView tuxTextView2 = new TuxTextView(context);
        tuxTextView2.setId(R.id.f0m);
        tuxTextView2.setBackgroundResource(R.drawable.a54);
        tuxTextView2.setPadding((int) TypedValue.applyDimension(1, 12.0f, resources.getDisplayMetrics()), tuxTextView2.getPaddingTop(), tuxTextView2.getPaddingRight(), tuxTextView2.getPaddingBottom());
        tuxTextView2.setPadding(tuxTextView2.getPaddingLeft(), (int) TypedValue.applyDimension(1, 8.0f, resources.getDisplayMetrics()), tuxTextView2.getPaddingRight(), tuxTextView2.getPaddingBottom());
        tuxTextView2.setPadding(tuxTextView2.getPaddingLeft(), tuxTextView2.getPaddingTop(), (int) TypedValue.applyDimension(1, 12.0f, resources.getDisplayMetrics()), tuxTextView2.getPaddingBottom());
        tuxTextView2.setPadding(tuxTextView2.getPaddingLeft(), tuxTextView2.getPaddingTop(), tuxTextView2.getPaddingRight(), (int) TypedValue.applyDimension(1, 8.0f, resources.getDisplayMetrics()));
        tuxTextView2.setTextColor(resources.getColorStateList(R.color.a9));
        tuxTextView2.setText(R.string.d5v);
        LinearLayout.LayoutParams layoutParams3 = new LinearLayout.LayoutParams(-2, -2);
        f.a("app:tux_font", new a.c("P1_Semibold"), tuxTextView2, layoutParams3);
        f.a(tuxTextView2, layoutParams3);
        android.view.a.a(tuxTextView2);
        if (tuxTextView2.getParent() == null) {
            linearLayout.addView(tuxTextView2, layoutParams3);
        }
        android.view.a.a(linearLayout);
        linearLayout.setLayoutParams(a2);
        if (viewGroup != null && z) {
            viewGroup.addView(linearLayout);
        }
        MethodCollector.o(3819);
        return linearLayout;
    }
}
