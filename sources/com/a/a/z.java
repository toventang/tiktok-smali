package com.a.a;

import android.content.Context;
import android.content.res.Resources;
import android.util.TypedValue;
import android.view.View;
import android.view.ViewGroup;
import android.view.a;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import androidx.drawerlayout.widget.DrawerLayout;
import com.a.b.a.a;
import com.a.b.e;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.bytedance.tux.input.TuxTextView;
import com.bytedance.tux.widget.FlowLayout;
import com.ss.android.ugc.aweme.ecommerce.review.view.ViewMoreText;
import com.ss.android.ugc.aweme.tux.a.j.f;
import com.zhiliaoapp.musically.R;

public final class z implements e {
    static {
        Covode.recordClassIndex(2031);
    }

    @Override // com.a.b.e
    public final View a(Context context, ViewGroup viewGroup, boolean z) {
        MethodCollector.i(766);
        Resources resources = context.getResources();
        LinearLayout linearLayout = new LinearLayout(context);
        linearLayout.setOrientation(1);
        ViewGroup.MarginLayoutParams a2 = a.a(viewGroup, -1, -1);
        TuxTextView tuxTextView = new TuxTextView(context);
        tuxTextView.setId(R.id.dmv);
        tuxTextView.setTextColor(resources.getColorStateList(R.color.c5));
        tuxTextView.setVisibility(8);
        tuxTextView.setTextAlignment(5);
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-1, -2);
        f.a("app:tux_font", new a.c("P2_Semibold"), tuxTextView, layoutParams);
        if (ViewGroup.MarginLayoutParams.class.isInstance(layoutParams)) {
            ((ViewGroup.MarginLayoutParams) layoutParams).topMargin = (int) TypedValue.applyDimension(1, 8.0f, resources.getDisplayMetrics());
        }
        if (ViewGroup.MarginLayoutParams.class.isInstance(layoutParams)) {
            ((ViewGroup.MarginLayoutParams) layoutParams).bottomMargin = (int) TypedValue.applyDimension(1, 4.0f, resources.getDisplayMetrics());
        }
        tuxTextView.setGravity(8388611);
        f.a(tuxTextView, layoutParams);
        android.view.a.a(tuxTextView);
        if (tuxTextView.getParent() == null) {
            linearLayout.addView(tuxTextView, layoutParams);
        }
        ViewMoreText viewMoreText = new ViewMoreText(context);
        viewMoreText.setId(R.id.dmm);
        LinearLayout.LayoutParams layoutParams2 = new LinearLayout.LayoutParams(-1, -2);
        if (ViewGroup.MarginLayoutParams.class.isInstance(layoutParams2)) {
            ((ViewGroup.MarginLayoutParams) layoutParams2).bottomMargin = (int) TypedValue.applyDimension(1, 8.0f, resources.getDisplayMetrics());
        }
        if (LinearLayout.LayoutParams.class.isInstance(layoutParams2)) {
            layoutParams2.gravity = 8388611;
        }
        if (FrameLayout.LayoutParams.class.isInstance(layoutParams2)) {
            ((FrameLayout.LayoutParams) layoutParams2).gravity = 8388611;
        }
        if (DrawerLayout.d.class.isInstance(layoutParams2)) {
            ((DrawerLayout.d) layoutParams2).f2691a = 8388611;
        }
        android.view.a.a(viewMoreText);
        if (viewMoreText.getParent() == null) {
            linearLayout.addView(viewMoreText, layoutParams2);
        }
        FlowLayout flowLayout = new FlowLayout(context);
        flowLayout.setId(R.id.dms);
        flowLayout.setVisibility(8);
        LinearLayout.LayoutParams layoutParams3 = new LinearLayout.LayoutParams(-1, -2);
        android.view.a.a(flowLayout);
        if (flowLayout.getParent() == null) {
            linearLayout.addView(flowLayout, layoutParams3);
        }
        ViewMoreText viewMoreText2 = new ViewMoreText(context);
        viewMoreText2.setId(R.id.f159974dmt);
        viewMoreText2.setBackgroundResource(R.drawable.y2);
        viewMoreText2.setVisibility(8);
        viewMoreText2.setPadding((int) TypedValue.applyDimension(1, 16.0f, resources.getDisplayMetrics()), viewMoreText2.getPaddingTop(), viewMoreText2.getPaddingRight(), viewMoreText2.getPaddingBottom());
        viewMoreText2.setPadding(viewMoreText2.getPaddingLeft(), viewMoreText2.getPaddingTop(), (int) TypedValue.applyDimension(1, 16.0f, resources.getDisplayMetrics()), viewMoreText2.getPaddingBottom());
        viewMoreText2.setPadding(viewMoreText2.getPaddingLeft(), (int) TypedValue.applyDimension(1, 12.0f, resources.getDisplayMetrics()), viewMoreText2.getPaddingRight(), viewMoreText2.getPaddingBottom());
        viewMoreText2.setPadding(viewMoreText2.getPaddingLeft(), viewMoreText2.getPaddingTop(), viewMoreText2.getPaddingRight(), (int) TypedValue.applyDimension(1, 12.0f, resources.getDisplayMetrics()));
        LinearLayout.LayoutParams layoutParams4 = new LinearLayout.LayoutParams(-1, -2);
        if (ViewGroup.MarginLayoutParams.class.isInstance(layoutParams4)) {
            ((ViewGroup.MarginLayoutParams) layoutParams4).bottomMargin = (int) TypedValue.applyDimension(1, 8.0f, resources.getDisplayMetrics());
        }
        android.view.a.a(viewMoreText2);
        if (viewMoreText2.getParent() == null) {
            linearLayout.addView(viewMoreText2, layoutParams4);
        }
        android.view.a.a(linearLayout);
        linearLayout.setLayoutParams(a2);
        if (viewGroup != null && z) {
            viewGroup.addView(linearLayout);
        }
        MethodCollector.o(766);
        return linearLayout;
    }
}
