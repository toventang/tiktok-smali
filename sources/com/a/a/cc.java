package com.a.a;

import android.content.Context;
import android.content.res.Resources;
import android.os.Build;
import android.util.TypedValue;
import android.view.View;
import android.view.ViewGroup;
import android.view.a;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.drawerlayout.widget.DrawerLayout;
import com.a.b.a.a;
import com.a.b.e;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.bytedance.tux.input.TuxTextView;
import com.ss.android.ugc.aweme.base.ui.AnimatedImageView;
import com.ss.android.ugc.aweme.tux.a.j.f;
import com.zhiliaoapp.musically.R;

public final class cc implements e {
    static {
        Covode.recordClassIndex(1993);
    }

    @Override // com.a.b.e
    public final View a(Context context, ViewGroup viewGroup, boolean z) {
        int i2;
        int i3;
        MethodCollector.i(1333);
        Resources resources = context.getResources();
        RelativeLayout relativeLayout = new RelativeLayout(context);
        relativeLayout.setId(R.id.eip);
        relativeLayout.setVisibility(8);
        ViewGroup.LayoutParams a2 = a.a(viewGroup, -1, -2);
        RelativeLayout relativeLayout2 = new RelativeLayout(context);
        relativeLayout2.setId(R.id.eio);
        RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(-2, (int) TypedValue.applyDimension(1, 44.0f, resources.getDisplayMetrics()));
        if (RelativeLayout.LayoutParams.class.isInstance(layoutParams)) {
            layoutParams.addRule(13, -1);
        }
        if (LinearLayout.LayoutParams.class.isInstance(layoutParams)) {
            ((LinearLayout.LayoutParams) layoutParams).gravity = 17;
        }
        if (FrameLayout.LayoutParams.class.isInstance(layoutParams)) {
            ((FrameLayout.LayoutParams) layoutParams).gravity = 17;
        }
        if (DrawerLayout.d.class.isInstance(layoutParams)) {
            ((DrawerLayout.d) layoutParams).f2691a = 17;
        }
        relativeLayout2.setGravity(17);
        AppCompatImageView appCompatImageView = new AppCompatImageView(context);
        appCompatImageView.setId(R.id.bi7);
        appCompatImageView.setImageResource(2131232130);
        RelativeLayout.LayoutParams layoutParams2 = new RelativeLayout.LayoutParams((int) TypedValue.applyDimension(1, 20.0f, resources.getDisplayMetrics()), (int) TypedValue.applyDimension(1, 20.0f, resources.getDisplayMetrics()));
        a.a(appCompatImageView);
        if (appCompatImageView.getParent() == null) {
            relativeLayout2.addView(appCompatImageView, layoutParams2);
        }
        TuxTextView tuxTextView = new TuxTextView(context);
        tuxTextView.setId(R.id.f9l);
        tuxTextView.setShadowLayer(tuxTextView.getShadowRadius(), tuxTextView.getShadowDx(), tuxTextView.getShadowDy(), resources.getColor(R.color.bo));
        tuxTextView.setShadowLayer(tuxTextView.getShadowRadius(), tuxTextView.getShadowDx(), 2.0f, tuxTextView.getShadowColor());
        tuxTextView.setShadowLayer(2.0f, tuxTextView.getShadowDx(), tuxTextView.getShadowDy(), tuxTextView.getShadowColor());
        tuxTextView.setText(R.string.atx);
        tuxTextView.setTextColor(resources.getColorStateList(R.color.a_));
        RelativeLayout.LayoutParams layoutParams3 = new RelativeLayout.LayoutParams(-2, (int) TypedValue.applyDimension(1, 20.0f, resources.getDisplayMetrics()));
        if (LinearLayout.LayoutParams.class.isInstance(layoutParams3)) {
            ((LinearLayout.LayoutParams) layoutParams3).gravity = 16;
        }
        if (FrameLayout.LayoutParams.class.isInstance(layoutParams3)) {
            ((FrameLayout.LayoutParams) layoutParams3).gravity = 16;
        }
        if (DrawerLayout.d.class.isInstance(layoutParams3)) {
            ((DrawerLayout.d) layoutParams3).f2691a = 16;
        }
        if (ViewGroup.MarginLayoutParams.class.isInstance(layoutParams3)) {
            int i4 = Build.VERSION.SDK_INT;
            layoutParams3.setMarginStart((int) TypedValue.applyDimension(1, 4.0f, resources.getDisplayMetrics()));
        }
        if (ViewGroup.MarginLayoutParams.class.isInstance(layoutParams3)) {
            ((ViewGroup.MarginLayoutParams) layoutParams3).leftMargin = (int) TypedValue.applyDimension(1, 4.0f, resources.getDisplayMetrics());
        }
        if (RelativeLayout.LayoutParams.class.isInstance(layoutParams3)) {
            i2 = R.id.bi7;
            layoutParams3.addRule(17, R.id.bi7);
        } else {
            i2 = R.id.bi7;
        }
        if (RelativeLayout.LayoutParams.class.isInstance(layoutParams3)) {
            layoutParams3.addRule(1, i2);
        }
        tuxTextView.setGravity(17);
        f.a("app:tux_font", new a.c("H4_Bold"), tuxTextView, layoutParams3);
        f.a(tuxTextView, layoutParams3);
        android.view.a.a(tuxTextView);
        if (tuxTextView.getParent() == null) {
            relativeLayout2.addView(tuxTextView, layoutParams3);
        }
        android.view.a.a(relativeLayout2);
        if (relativeLayout2.getParent() == null) {
            relativeLayout.addView(relativeLayout2, layoutParams);
        }
        AnimatedImageView animatedImageView = new AnimatedImageView(context);
        animatedImageView.setId(R.id.eil);
        animatedImageView.setScaleType(ImageView.ScaleType.CENTER_INSIDE);
        animatedImageView.setVisibility(8);
        RelativeLayout.LayoutParams layoutParams4 = new RelativeLayout.LayoutParams((int) TypedValue.applyDimension(1, 56.0f, resources.getDisplayMetrics()), (int) TypedValue.applyDimension(1, 56.0f, resources.getDisplayMetrics()));
        if (RelativeLayout.LayoutParams.class.isInstance(layoutParams4)) {
            i3 = -1;
            layoutParams4.addRule(21, -1);
        } else {
            i3 = -1;
        }
        if (RelativeLayout.LayoutParams.class.isInstance(layoutParams4)) {
            layoutParams4.addRule(11, i3);
        }
        if (ViewGroup.MarginLayoutParams.class.isInstance(layoutParams4)) {
            layoutParams4.setMargins((int) TypedValue.applyDimension(1, 8.0f, resources.getDisplayMetrics()), (int) TypedValue.applyDimension(1, 8.0f, resources.getDisplayMetrics()), (int) TypedValue.applyDimension(1, 8.0f, resources.getDisplayMetrics()), (int) TypedValue.applyDimension(1, 8.0f, resources.getDisplayMetrics()));
        }
        android.view.a.a(animatedImageView);
        if (animatedImageView.getParent() == null) {
            relativeLayout.addView(animatedImageView, layoutParams4);
        }
        android.view.a.a(relativeLayout);
        relativeLayout.setLayoutParams(a2);
        if (viewGroup != null && z) {
            viewGroup.addView(relativeLayout);
        }
        MethodCollector.o(1333);
        return relativeLayout;
    }
}
