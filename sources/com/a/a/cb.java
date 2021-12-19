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
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;
import androidx.drawerlayout.widget.DrawerLayout;
import com.a.b.a.a;
import com.a.b.e;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.bytedance.tux.input.TuxTextView;
import com.ss.android.ugc.aweme.tux.a.j.f;
import com.zhiliaoapp.musically.R;

public final class cb implements e {
    static {
        Covode.recordClassIndex(1992);
    }

    @Override // com.a.b.e
    public final View a(Context context, ViewGroup viewGroup, boolean z) {
        MethodCollector.i(1215);
        Resources resources = context.getResources();
        LinearLayout linearLayout = new LinearLayout(context);
        linearLayout.setOrientation(0);
        ViewGroup.MarginLayoutParams a2 = a.a(viewGroup, -2, -2);
        TuxTextView tuxTextView = new TuxTextView(context);
        tuxTextView.setPadding((int) TypedValue.applyDimension(1, 12.0f, resources.getDisplayMetrics()), tuxTextView.getPaddingTop(), tuxTextView.getPaddingRight(), tuxTextView.getPaddingBottom());
        tuxTextView.setPadding(tuxTextView.getPaddingLeft(), tuxTextView.getPaddingTop(), (int) TypedValue.applyDimension(1, 12.0f, resources.getDisplayMetrics()), tuxTextView.getPaddingBottom());
        if (TextView.class.isInstance(tuxTextView)) {
            a.a(tuxTextView, (int) TypedValue.applyDimension(1, 53.0f, resources.getDisplayMetrics()));
        } else {
            tuxTextView.setMinimumWidth((int) TypedValue.applyDimension(1, 53.0f, resources.getDisplayMetrics()));
        }
        tuxTextView.setLines(1);
        tuxTextView.setAlpha(0.6f);
        tuxTextView.setTextColor(resources.getColorStateList(R.color.f159928l));
        tuxTextView.setId(16908308);
        tuxTextView.setText(R.string.gk2);
        tuxTextView.setVisibility(0);
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-2, (int) TypedValue.applyDimension(1, 58.0f, resources.getDisplayMetrics()));
        tuxTextView.setGravity(17);
        if (RelativeLayout.LayoutParams.class.isInstance(layoutParams)) {
            ((RelativeLayout.LayoutParams) layoutParams).addRule(15, -1);
        }
        if (LinearLayout.LayoutParams.class.isInstance(layoutParams)) {
            layoutParams.gravity = 17;
        }
        if (FrameLayout.LayoutParams.class.isInstance(layoutParams)) {
            ((FrameLayout.LayoutParams) layoutParams).gravity = 17;
        }
        if (DrawerLayout.d.class.isInstance(layoutParams)) {
            ((DrawerLayout.d) layoutParams).f2691a = 17;
        }
        f.a("app:tux_font", new a.c("H3_Semibold"), tuxTextView, layoutParams);
        f.a(tuxTextView, layoutParams);
        android.view.a.a(tuxTextView);
        if (tuxTextView.getParent() == null) {
            linearLayout.addView(tuxTextView, layoutParams);
        }
        ViewStub viewStub = new ViewStub(context);
        viewStub.setId(R.id.b8l);
        viewStub.setInflatedId(R.id.b8k);
        viewStub.setLayoutResource(R.layout.a40);
        LinearLayout.LayoutParams layoutParams2 = new LinearLayout.LayoutParams(-1, -2);
        android.view.a.a(viewStub);
        if (viewStub.getParent() == null) {
            linearLayout.addView(viewStub, layoutParams2);
        }
        ViewStub viewStub2 = new ViewStub(context);
        viewStub2.setId(R.id.f8u);
        viewStub2.setInflatedId(R.id.f8q);
        viewStub2.setLayoutResource(R.layout.a43);
        LinearLayout.LayoutParams layoutParams3 = new LinearLayout.LayoutParams((int) TypedValue.applyDimension(1, 8.0f, resources.getDisplayMetrics()), (int) TypedValue.applyDimension(1, 8.0f, resources.getDisplayMetrics()));
        if (ViewGroup.MarginLayoutParams.class.isInstance(layoutParams3)) {
            ((ViewGroup.MarginLayoutParams) layoutParams3).leftMargin = (int) TypedValue.applyDimension(1, -12.0f, resources.getDisplayMetrics());
        }
        if (ViewGroup.MarginLayoutParams.class.isInstance(layoutParams3)) {
            int i2 = Build.VERSION.SDK_INT;
            layoutParams3.setMarginStart((int) TypedValue.applyDimension(1, -12.0f, resources.getDisplayMetrics()));
        }
        if (ViewGroup.MarginLayoutParams.class.isInstance(layoutParams3)) {
            ((ViewGroup.MarginLayoutParams) layoutParams3).topMargin = (int) TypedValue.applyDimension(1, 17.0f, resources.getDisplayMetrics());
        }
        android.view.a.a(viewStub2);
        if (viewStub2.getParent() == null) {
            linearLayout.addView(viewStub2, layoutParams3);
        }
        ViewStub viewStub3 = new ViewStub(context);
        viewStub3.setId(R.id.f8s);
        viewStub3.setInflatedId(R.id.f8r);
        viewStub3.setLayoutResource(R.layout.a41);
        if (TextView.class.isInstance(viewStub3)) {
            android.view.a.a(viewStub3, (int) TypedValue.applyDimension(1, 16.0f, resources.getDisplayMetrics()));
        } else {
            viewStub3.setMinimumWidth((int) TypedValue.applyDimension(1, 16.0f, resources.getDisplayMetrics()));
        }
        viewStub3.setPadding((int) TypedValue.applyDimension(1, 5.0f, resources.getDisplayMetrics()), viewStub3.getPaddingTop(), viewStub3.getPaddingRight(), viewStub3.getPaddingBottom());
        viewStub3.setPadding(viewStub3.getPaddingLeft(), viewStub3.getPaddingTop(), (int) TypedValue.applyDimension(1, 5.0f, resources.getDisplayMetrics()), viewStub3.getPaddingBottom());
        LinearLayout.LayoutParams layoutParams4 = new LinearLayout.LayoutParams(-2, (int) TypedValue.applyDimension(1, 15.0f, resources.getDisplayMetrics()));
        if (ViewGroup.MarginLayoutParams.class.isInstance(layoutParams4)) {
            ((ViewGroup.MarginLayoutParams) layoutParams4).leftMargin = (int) TypedValue.applyDimension(1, -8.0f, resources.getDisplayMetrics());
        }
        if (ViewGroup.MarginLayoutParams.class.isInstance(layoutParams4)) {
            int i3 = Build.VERSION.SDK_INT;
            layoutParams4.setMarginStart((int) TypedValue.applyDimension(1, -8.0f, resources.getDisplayMetrics()));
        }
        if (ViewGroup.MarginLayoutParams.class.isInstance(layoutParams4)) {
            ((ViewGroup.MarginLayoutParams) layoutParams4).topMargin = (int) TypedValue.applyDimension(1, 13.0f, resources.getDisplayMetrics());
        }
        android.view.a.a(viewStub3);
        if (viewStub3.getParent() == null) {
            linearLayout.addView(viewStub3, layoutParams4);
        }
        ViewStub viewStub4 = new ViewStub(context);
        viewStub4.setId(R.id.f8t);
        viewStub4.setInflatedId(R.id.ce8);
        viewStub4.setLayoutResource(R.layout.a42);
        viewStub4.setPadding((int) TypedValue.applyDimension(1, 4.0f, resources.getDisplayMetrics()), viewStub4.getPaddingTop(), viewStub4.getPaddingRight(), viewStub4.getPaddingBottom());
        viewStub4.setPadding(viewStub4.getPaddingLeft(), viewStub4.getPaddingTop(), (int) TypedValue.applyDimension(1, 4.0f, resources.getDisplayMetrics()), viewStub4.getPaddingBottom());
        LinearLayout.LayoutParams layoutParams5 = new LinearLayout.LayoutParams(-2, (int) TypedValue.applyDimension(1, 14.0f, resources.getDisplayMetrics()));
        if (ViewGroup.MarginLayoutParams.class.isInstance(layoutParams5)) {
            ((ViewGroup.MarginLayoutParams) layoutParams5).leftMargin = (int) TypedValue.applyDimension(1, -18.0f, resources.getDisplayMetrics());
        }
        if (ViewGroup.MarginLayoutParams.class.isInstance(layoutParams5)) {
            int i4 = Build.VERSION.SDK_INT;
            layoutParams5.setMarginStart((int) TypedValue.applyDimension(1, -18.0f, resources.getDisplayMetrics()));
        }
        if (ViewGroup.MarginLayoutParams.class.isInstance(layoutParams5)) {
            ((ViewGroup.MarginLayoutParams) layoutParams5).topMargin = (int) TypedValue.applyDimension(1, 13.0f, resources.getDisplayMetrics());
        }
        android.view.a.a(viewStub4);
        if (viewStub4.getParent() == null) {
            linearLayout.addView(viewStub4, layoutParams5);
        }
        android.view.a.a(linearLayout);
        linearLayout.setLayoutParams(a2);
        if (viewGroup != null && z) {
            viewGroup.addView(linearLayout);
        }
        MethodCollector.o(1215);
        return linearLayout;
    }
}
