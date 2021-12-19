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
import android.widget.RelativeLayout;
import androidx.drawerlayout.widget.DrawerLayout;
import com.a.b.a.a;
import com.a.b.e;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.bytedance.lighten.loader.SmartCircleImageView;
import com.ss.android.ugc.aweme.feed.widget.PeriscopeLayout;
import com.zhiliaoapp.musically.R;

public final class aw implements e {
    static {
        Covode.recordClassIndex(1959);
    }

    @Override // com.a.b.e
    public final View a(Context context, ViewGroup viewGroup, boolean z) {
        int i2;
        MethodCollector.i(1791);
        Resources resources = context.getResources();
        RelativeLayout relativeLayout = new RelativeLayout(context);
        ViewGroup.LayoutParams a2 = a.a(viewGroup, -2, -2);
        View view = new View(context);
        view.setId(R.id.cr0);
        RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams((int) TypedValue.applyDimension(1, 6.0f, resources.getDisplayMetrics()), (int) TypedValue.applyDimension(1, 49.0f, resources.getDisplayMetrics()));
        if (RelativeLayout.LayoutParams.class.isInstance(layoutParams)) {
            layoutParams.addRule(21, -1);
        }
        if (RelativeLayout.LayoutParams.class.isInstance(layoutParams)) {
            layoutParams.addRule(11, -1);
        }
        if (RelativeLayout.LayoutParams.class.isInstance(layoutParams)) {
            layoutParams.addRule(12, -1);
        }
        a.a(view);
        if (view.getParent() == null) {
            relativeLayout.addView(view, layoutParams);
        }
        View periscopeLayout = new PeriscopeLayout(context);
        periscopeLayout.setId(R.id.cwj);
        RelativeLayout.LayoutParams layoutParams2 = new RelativeLayout.LayoutParams((int) TypedValue.applyDimension(1, 95.0f, resources.getDisplayMetrics()), (int) TypedValue.applyDimension(1, 95.0f, resources.getDisplayMetrics()));
        if (RelativeLayout.LayoutParams.class.isInstance(layoutParams2)) {
            layoutParams2.addRule(21, -1);
        }
        if (RelativeLayout.LayoutParams.class.isInstance(layoutParams2)) {
            layoutParams2.addRule(11, -1);
        }
        if (RelativeLayout.LayoutParams.class.isInstance(layoutParams2)) {
            layoutParams2.addRule(12, -1);
        }
        if (ViewGroup.MarginLayoutParams.class.isInstance(layoutParams2)) {
            int i3 = Build.VERSION.SDK_INT;
            layoutParams2.setMarginEnd((int) TypedValue.applyDimension(1, 21.0f, resources.getDisplayMetrics()));
        }
        if (ViewGroup.MarginLayoutParams.class.isInstance(layoutParams2)) {
            ((ViewGroup.MarginLayoutParams) layoutParams2).rightMargin = (int) TypedValue.applyDimension(1, 21.0f, resources.getDisplayMetrics());
        }
        if (ViewGroup.MarginLayoutParams.class.isInstance(layoutParams2)) {
            ((ViewGroup.MarginLayoutParams) layoutParams2).bottomMargin = (int) TypedValue.applyDimension(1, -22.0f, resources.getDisplayMetrics());
        }
        a.a(periscopeLayout);
        if (periscopeLayout.getParent() == null) {
            relativeLayout.addView(periscopeLayout, layoutParams2);
        }
        FrameLayout frameLayout = new FrameLayout(context);
        frameLayout.setId(R.id.cpu);
        frameLayout.setFocusable(false);
        frameLayout.setFocusableInTouchMode(false);
        RelativeLayout.LayoutParams layoutParams3 = new RelativeLayout.LayoutParams((int) TypedValue.applyDimension(1, 49.0f, resources.getDisplayMetrics()), (int) TypedValue.applyDimension(1, 49.0f, resources.getDisplayMetrics()));
        if (RelativeLayout.LayoutParams.class.isInstance(layoutParams3)) {
            i2 = R.id.cr0;
            layoutParams3.addRule(0, R.id.cr0);
        } else {
            i2 = R.id.cr0;
        }
        if (RelativeLayout.LayoutParams.class.isInstance(layoutParams3)) {
            layoutParams3.addRule(16, i2);
        }
        if (RelativeLayout.LayoutParams.class.isInstance(layoutParams3)) {
            layoutParams3.addRule(12, -1);
        }
        if (ViewGroup.MarginLayoutParams.class.isInstance(layoutParams3)) {
            ((ViewGroup.MarginLayoutParams) layoutParams3).bottomMargin = (int) TypedValue.applyDimension(1, 1.5f, resources.getDisplayMetrics());
        }
        SmartCircleImageView smartCircleImageView = new SmartCircleImageView(context);
        smartCircleImageView.setId(R.id.cpt);
        smartCircleImageView.setFocusable(false);
        smartCircleImageView.setFocusableInTouchMode(false);
        FrameLayout.LayoutParams layoutParams4 = new FrameLayout.LayoutParams((int) resources.getDimension(R.dimen.fw), (int) resources.getDimension(R.dimen.fw));
        com.a.a.a.a.a aVar = new com.a.a.a.a.a();
        aVar.a("app:placeholderImage", new a.b("2131233114", "drawable"), smartCircleImageView, layoutParams4);
        aVar.a(smartCircleImageView, layoutParams4);
        android.view.a.a(smartCircleImageView);
        if (smartCircleImageView.getParent() == null) {
            frameLayout.addView(smartCircleImageView, layoutParams4);
        }
        SmartCircleImageView smartCircleImageView2 = new SmartCircleImageView(context);
        smartCircleImageView2.setId(R.id.d0c);
        smartCircleImageView2.setFocusable(false);
        smartCircleImageView2.setFocusableInTouchMode(false);
        smartCircleImageView2.setVisibility(8);
        FrameLayout.LayoutParams layoutParams5 = new FrameLayout.LayoutParams((int) TypedValue.applyDimension(1, 27.0f, resources.getDisplayMetrics()), (int) TypedValue.applyDimension(1, 27.0f, resources.getDisplayMetrics()));
        if (LinearLayout.LayoutParams.class.isInstance(layoutParams5)) {
            ((LinearLayout.LayoutParams) layoutParams5).gravity = 17;
        }
        if (FrameLayout.LayoutParams.class.isInstance(layoutParams5)) {
            layoutParams5.gravity = 17;
        }
        if (DrawerLayout.d.class.isInstance(layoutParams5)) {
            ((DrawerLayout.d) layoutParams5).f2691a = 17;
        }
        android.view.a.a(smartCircleImageView2);
        if (smartCircleImageView2.getParent() == null) {
            frameLayout.addView(smartCircleImageView2, layoutParams5);
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
        MethodCollector.o(1791);
        return relativeLayout;
    }
}
