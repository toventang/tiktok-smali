package com.a.a;

import android.content.Context;
import android.content.res.Resources;
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
import com.bytedance.tux.badge.TuxAlertBadgeLayout;
import com.bytedance.tux.icon.TuxIconView;
import com.zhiliaoapp.musically.R;

public final class cd implements e {
    static {
        Covode.recordClassIndex(1994);
    }

    @Override // com.a.b.e
    public final View a(Context context, ViewGroup viewGroup, boolean z) {
        MethodCollector.i(346);
        Resources resources = context.getResources();
        TuxAlertBadgeLayout tuxAlertBadgeLayout = new TuxAlertBadgeLayout(context);
        tuxAlertBadgeLayout.setId(R.id.ax3);
        ViewGroup.MarginLayoutParams a2 = a.a(viewGroup, (int) TypedValue.applyDimension(1, 44.0f, resources.getDisplayMetrics()), (int) TypedValue.applyDimension(1, 44.0f, resources.getDisplayMetrics()));
        if (RelativeLayout.LayoutParams.class.isInstance(a2)) {
            ((RelativeLayout.LayoutParams) a2).addRule(21, -1);
        }
        TuxIconView tuxIconView = new TuxIconView(context);
        tuxIconView.setId(R.id.f2r);
        ViewGroup.MarginLayoutParams a3 = a.a(tuxAlertBadgeLayout, (int) TypedValue.applyDimension(1, 24.0f, resources.getDisplayMetrics()), (int) TypedValue.applyDimension(1, 24.0f, resources.getDisplayMetrics()));
        if (LinearLayout.LayoutParams.class.isInstance(a3)) {
            ((LinearLayout.LayoutParams) a3).gravity = 17;
        }
        if (FrameLayout.LayoutParams.class.isInstance(a3)) {
            ((FrameLayout.LayoutParams) a3).gravity = 17;
        }
        if (DrawerLayout.d.class.isInstance(a3)) {
            ((DrawerLayout.d) a3).f2691a = 17;
        }
        com.ss.android.ugc.aweme.tux.a.j.e.a("app:tux_icon", new a.b("2131755425", "raw"), tuxIconView, a3);
        com.ss.android.ugc.aweme.tux.a.j.e.a("app:tux_iconShadow", new a.c("true"), tuxIconView, a3);
        com.ss.android.ugc.aweme.tux.a.j.e.a("app:tux_tintColor", new a.b("2131099683", b.f37372a), tuxIconView, a3);
        com.ss.android.ugc.aweme.tux.a.j.e.a(tuxIconView, a3);
        android.view.a.a(tuxIconView);
        if (tuxIconView.getParent() == null) {
            tuxAlertBadgeLayout.addView(tuxIconView, a3);
        }
        android.view.a.a(tuxAlertBadgeLayout);
        tuxAlertBadgeLayout.setLayoutParams(a2);
        if (viewGroup != null && z) {
            viewGroup.addView(tuxAlertBadgeLayout);
        }
        MethodCollector.o(346);
        return tuxAlertBadgeLayout;
    }
}
