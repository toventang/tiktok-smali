package com.bytedance.ies.dmt.ui.widget.tablayout;

import android.view.ViewGroup;
import android.widget.LinearLayout;
import androidx.core.h.v;
import com.bytedance.covode.number.Covode;
import com.bytedance.ies.dmt.ui.widget.tablayout.DmtTabLayout;
import h.f.b.l;
import h.g.a;
import java.util.Objects;

public final class b {

    /* renamed from: a  reason: collision with root package name */
    public static final b f33777a = new b();

    private b() {
    }

    static {
        Covode.recordClassIndex(20059);
    }

    public static final void a(DmtTabLayout dmtTabLayout) {
        int measuredWidth;
        l.d(dmtTabLayout, "");
        if (dmtTabLayout.getTabMode() == 0 && dmtTabLayout.getTabCount() > 5) {
            int min = Math.min(dmtTabLayout.getTabCount(), 5);
            int i2 = 0;
            for (int i3 = 0; i3 < min; i3++) {
                DmtTabLayout.f b2 = dmtTabLayout.b(i3);
                if (b2 == null) {
                    l.b();
                }
                l.b(b2, "");
                DmtTabLayout.h hVar = b2.f33756i;
                l.b(hVar, "");
                if (hVar.getVisibility() == 0) {
                    i2 += hVar.getMeasuredWidth();
                }
            }
            DmtTabLayout.f b3 = dmtTabLayout.b(5);
            if (b3 == null) {
                l.b();
            }
            l.b(b3, "");
            DmtTabLayout.h hVar2 = b3.f33756i;
            l.b(hVar2, "");
            double measuredWidth2 = (double) hVar2.getMeasuredWidth();
            Double.isNaN(measuredWidth2);
            int a2 = i2 + a.a(measuredWidth2 * 0.5d);
            if (a2 > 0 && a2 < (measuredWidth = dmtTabLayout.getMeasuredWidth() - dmtTabLayout.getTabStripLeftPadding())) {
                float f2 = ((float) measuredWidth) / 5.5f;
                int tabCount = dmtTabLayout.getTabCount();
                for (int i4 = 0; i4 < tabCount; i4++) {
                    DmtTabLayout.f b4 = dmtTabLayout.b(i4);
                    if (b4 == null) {
                        l.b();
                    }
                    l.b(b4, "");
                    DmtTabLayout.h hVar3 = b4.f33756i;
                    l.b(hVar3, "");
                    if (hVar3.getVisibility() == 0) {
                        ViewGroup.LayoutParams layoutParams = hVar3.getLayoutParams();
                        Objects.requireNonNull(layoutParams, "null cannot be cast to non-null type android.widget.LinearLayout.LayoutParams");
                        LinearLayout.LayoutParams layoutParams2 = (LinearLayout.LayoutParams) layoutParams;
                        layoutParams2.width = (int) f2;
                        layoutParams2.weight = 0.0f;
                        if (dmtTabLayout.q) {
                            layoutParams2.leftMargin = 0;
                            layoutParams2.rightMargin = 0;
                        }
                        hVar3.setLayoutParams(layoutParams2);
                        v.a(hVar3, 0, hVar3.getPaddingTop(), 0, hVar3.getPaddingBottom());
                    }
                }
            }
        }
    }
}
