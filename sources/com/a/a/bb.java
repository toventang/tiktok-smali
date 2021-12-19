package com.a.a;

import android.content.Context;
import android.content.res.Resources;
import android.os.Build;
import android.text.TextUtils;
import android.util.TypedValue;
import android.view.View;
import android.view.ViewGroup;
import android.view.a;
import android.widget.LinearLayout;
import androidx.appcompat.widget.AppCompatImageView;
import com.a.b.a.a;
import com.a.b.e;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.bytedance.tux.input.TuxTextView;
import com.ss.android.ugc.aweme.feed.widget.MarqueeView;
import com.ss.android.ugc.aweme.tux.a.j.f;
import com.zhiliaoapp.musically.R;

public final class bb implements e {
    static {
        Covode.recordClassIndex(1965);
    }

    @Override // com.a.b.e
    public final View a(Context context, ViewGroup viewGroup, boolean z) {
        MethodCollector.i(5424);
        Resources resources = context.getResources();
        LinearLayout linearLayout = new LinearLayout(context);
        linearLayout.setId(R.id.cr_);
        linearLayout.setOrientation(0);
        ViewGroup.MarginLayoutParams a2 = a.a(viewGroup, -2, -2);
        linearLayout.setGravity(16);
        AppCompatImageView appCompatImageView = new AppCompatImageView(context);
        appCompatImageView.setId(R.id.cqi);
        appCompatImageView.setAlpha(0.9f);
        appCompatImageView.setImageResource(2131233112);
        appCompatImageView.setVisibility(8);
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-2, -2);
        if (ViewGroup.MarginLayoutParams.class.isInstance(layoutParams)) {
            int i2 = Build.VERSION.SDK_INT;
            layoutParams.setMarginEnd((int) TypedValue.applyDimension(1, 2.0f, resources.getDisplayMetrics()));
        }
        if (ViewGroup.MarginLayoutParams.class.isInstance(layoutParams)) {
            ((ViewGroup.MarginLayoutParams) layoutParams).rightMargin = (int) TypedValue.applyDimension(1, 1.0f, resources.getDisplayMetrics());
        }
        a.a(appCompatImageView);
        if (appCompatImageView.getParent() == null) {
            linearLayout.addView(appCompatImageView, layoutParams);
        }
        TuxTextView tuxTextView = new TuxTextView(context);
        tuxTextView.setId(R.id.cqq);
        tuxTextView.setShadowLayer(tuxTextView.getShadowRadius(), tuxTextView.getShadowDx(), tuxTextView.getShadowDy(), resources.getColor(R.color.bo));
        tuxTextView.setShadowLayer(tuxTextView.getShadowRadius(), 0.0f, tuxTextView.getShadowDy(), tuxTextView.getShadowColor());
        tuxTextView.setShadowLayer(tuxTextView.getShadowRadius(), tuxTextView.getShadowDx(), 2.0f, tuxTextView.getShadowColor());
        tuxTextView.setShadowLayer(2.0f, tuxTextView.getShadowDx(), tuxTextView.getShadowDy(), tuxTextView.getShadowColor());
        tuxTextView.setText(R.string.dnm);
        tuxTextView.setMaxWidth((int) TypedValue.applyDimension(1, 149.0f, resources.getDisplayMetrics()));
        tuxTextView.setEllipsize(TextUtils.TruncateAt.END);
        tuxTextView.setMaxLines(1);
        tuxTextView.setTextColor(resources.getColorStateList(R.color.bm));
        tuxTextView.setVisibility(8);
        LinearLayout.LayoutParams layoutParams2 = new LinearLayout.LayoutParams(-2, -2);
        f.a("app:tux_font", new a.c("H4_Bold"), tuxTextView, layoutParams2);
        f.a(tuxTextView, layoutParams2);
        android.view.a.a(tuxTextView);
        if (tuxTextView.getParent() == null) {
            linearLayout.addView(tuxTextView, layoutParams2);
        }
        MarqueeView marqueeView = new MarqueeView(context);
        marqueeView.setId(R.id.crb);
        marqueeView.setSpeed((int) TypedValue.applyDimension(1, 25.0f, resources.getDisplayMetrics()));
        marqueeView.setTextColor(resources.getColor(R.color.a9));
        marqueeView.setTextShadow(resources.getColor(R.color.bl));
        marqueeView.setTextSize((int) TypedValue.applyDimension(2, 14.0f, resources.getDisplayMetrics()));
        LinearLayout.LayoutParams layoutParams3 = new LinearLayout.LayoutParams(-1, -2);
        if (ViewGroup.MarginLayoutParams.class.isInstance(layoutParams3)) {
            ((ViewGroup.MarginLayoutParams) layoutParams3).leftMargin = (int) TypedValue.applyDimension(1, 4.0f, resources.getDisplayMetrics());
        }
        if (ViewGroup.MarginLayoutParams.class.isInstance(layoutParams3)) {
            int i3 = Build.VERSION.SDK_INT;
            layoutParams3.setMarginStart((int) TypedValue.applyDimension(1, 4.0f, resources.getDisplayMetrics()));
        }
        android.view.a.a(marqueeView);
        if (marqueeView.getParent() == null) {
            linearLayout.addView(marqueeView, layoutParams3);
        }
        TuxTextView tuxTextView2 = new TuxTextView(context);
        tuxTextView2.setId(R.id.crd);
        tuxTextView2.setTextColor(resources.getColorStateList(R.color.a9));
        tuxTextView2.setShadowLayer(tuxTextView2.getShadowRadius(), tuxTextView2.getShadowDx(), tuxTextView2.getShadowDy(), resources.getColor(R.color.bl));
        tuxTextView2.setMaxWidth((int) TypedValue.applyDimension(1, 360.0f, resources.getDisplayMetrics()));
        tuxTextView2.setEllipsize(TextUtils.TruncateAt.END);
        tuxTextView2.setMaxLines(1);
        tuxTextView2.setVisibility(8);
        LinearLayout.LayoutParams layoutParams4 = new LinearLayout.LayoutParams(-2, -2);
        if (ViewGroup.MarginLayoutParams.class.isInstance(layoutParams4)) {
            ((ViewGroup.MarginLayoutParams) layoutParams4).leftMargin = (int) TypedValue.applyDimension(1, 4.0f, resources.getDisplayMetrics());
        }
        if (ViewGroup.MarginLayoutParams.class.isInstance(layoutParams4)) {
            int i4 = Build.VERSION.SDK_INT;
            layoutParams4.setMarginStart((int) TypedValue.applyDimension(1, 4.0f, resources.getDisplayMetrics()));
        }
        f.a("app:tux_font", new a.c("P1_Regular"), tuxTextView2, layoutParams4);
        f.a(tuxTextView2, layoutParams4);
        android.view.a.a(tuxTextView2);
        if (tuxTextView2.getParent() == null) {
            linearLayout.addView(tuxTextView2, layoutParams4);
        }
        android.view.a.a(linearLayout);
        linearLayout.setLayoutParams(a2);
        if (viewGroup != null && z) {
            viewGroup.addView(linearLayout);
        }
        MethodCollector.o(5424);
        return linearLayout;
    }
}
