package com.a.a;

import android.content.Context;
import android.content.res.Resources;
import android.util.TypedValue;
import android.view.SurfaceView;
import android.view.View;
import android.view.ViewGroup;
import android.view.a;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import androidx.drawerlayout.widget.DrawerLayout;
import com.a.b.e;
import com.bytedance.android.livesdk.widget.LiveVerticalViewPager;
import com.bytedance.android.livesdk.widget.SafeFrameLayout;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.zhiliaoapp.musically.R;

public final class cn implements e {
    static {
        Covode.recordClassIndex(2004);
    }

    @Override // com.a.b.e
    public final View a(Context context, ViewGroup viewGroup, boolean z) {
        MethodCollector.i(1230);
        Resources resources = context.getResources();
        SafeFrameLayout safeFrameLayout = new SafeFrameLayout(context);
        safeFrameLayout.setId(R.id.ad7);
        safeFrameLayout.setBackgroundColor(resources.getColor(R.color.a2));
        safeFrameLayout.setKeepScreenOn(true);
        ViewGroup.MarginLayoutParams a2 = a.a(viewGroup, -1, -1);
        SurfaceView surfaceView = new SurfaceView(context);
        surfaceView.setVisibility(8);
        ViewGroup.MarginLayoutParams a3 = a.a(safeFrameLayout, (int) TypedValue.applyDimension(1, 0.0f, resources.getDisplayMetrics()), (int) TypedValue.applyDimension(1, 0.0f, resources.getDisplayMetrics()));
        a.a(surfaceView);
        if (surfaceView.getParent() == null) {
            safeFrameLayout.addView(surfaceView, a3);
        }
        LiveVerticalViewPager liveVerticalViewPager = new LiveVerticalViewPager(context);
        liveVerticalViewPager.setId(R.id.fk_);
        ViewGroup.MarginLayoutParams a4 = a.a(safeFrameLayout, -1, -1);
        a.a(liveVerticalViewPager);
        if (liveVerticalViewPager.getParent() == null) {
            safeFrameLayout.addView(liveVerticalViewPager, a4);
        }
        View a5 = com.a.b.a.a(context, R.layout.be1, safeFrameLayout, false, R.layout.b9o);
        a5.setId(R.id.qj);
        a5.setVisibility(8);
        ViewGroup.MarginLayoutParams a6 = a.a(safeFrameLayout, -2, (int) TypedValue.applyDimension(1, 26.0f, resources.getDisplayMetrics()));
        if (LinearLayout.LayoutParams.class.isInstance(a6)) {
            ((LinearLayout.LayoutParams) a6).gravity = 8388691;
        }
        if (FrameLayout.LayoutParams.class.isInstance(a6)) {
            ((FrameLayout.LayoutParams) a6).gravity = 8388691;
        }
        if (DrawerLayout.d.class.isInstance(a6)) {
            ((DrawerLayout.d) a6).f2691a = 8388691;
        }
        if (ViewGroup.MarginLayoutParams.class.isInstance(a6)) {
            a6.bottomMargin = (int) TypedValue.applyDimension(1, 52.0f, resources.getDisplayMetrics());
        }
        if (a5.getParent() == null) {
            safeFrameLayout.addView(a5, a6);
        }
        a.a(safeFrameLayout);
        safeFrameLayout.setLayoutParams(a2);
        if (viewGroup != null && z) {
            viewGroup.addView(safeFrameLayout);
        }
        MethodCollector.o(1230);
        return safeFrameLayout;
    }
}
