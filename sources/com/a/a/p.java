package com.a.a;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.view.a;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import androidx.drawerlayout.widget.DrawerLayout;
import com.a.b.e;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.zhiliaoapp.musically.R;

public final class p implements e {
    static {
        Covode.recordClassIndex(2021);
    }

    @Override // com.a.b.e
    public final View a(Context context, ViewGroup viewGroup, boolean z) {
        MethodCollector.i(1820);
        context.getResources();
        FrameLayout frameLayout = new FrameLayout(context);
        ViewGroup.MarginLayoutParams a2 = a.a(viewGroup, -1, -2);
        View a3 = com.a.b.a.a(context, R.layout.po, frameLayout, false, R.layout.pv);
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-1, -2);
        if (a3.getParent() == null) {
            frameLayout.addView(a3, layoutParams);
        }
        View a4 = com.a.b.a.a(context, R.layout.pp, frameLayout, false, R.layout.pv);
        FrameLayout.LayoutParams layoutParams2 = new FrameLayout.LayoutParams(-1, -2);
        if (LinearLayout.LayoutParams.class.isInstance(layoutParams2)) {
            ((LinearLayout.LayoutParams) layoutParams2).gravity = 48;
        }
        if (FrameLayout.LayoutParams.class.isInstance(layoutParams2)) {
            layoutParams2.gravity = 48;
        }
        if (DrawerLayout.d.class.isInstance(layoutParams2)) {
            ((DrawerLayout.d) layoutParams2).f2691a = 48;
        }
        if (a4.getParent() == null) {
            frameLayout.addView(a4, layoutParams2);
        }
        a.a(frameLayout);
        frameLayout.setLayoutParams(a2);
        if (viewGroup != null && z) {
            viewGroup.addView(frameLayout);
        }
        MethodCollector.o(1820);
        return frameLayout;
    }
}
