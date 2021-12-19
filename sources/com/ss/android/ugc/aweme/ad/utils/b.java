package com.ss.android.ugc.aweme.ad.utils;

import android.animation.ValueAnimator;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.aweme.commercialize.uikit.a.a;
import h.f.b.l;
import java.util.Objects;

public final class b {

    /* renamed from: a  reason: collision with root package name */
    public static final b f66165a = new b();

    private b() {
    }

    static {
        Covode.recordClassIndex(40675);
    }

    public static void a(View view, int i2, int i3, boolean z) {
        if (view != null) {
            ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
            Objects.requireNonNull(layoutParams, "null cannot be cast to non-null type android.widget.FrameLayout.LayoutParams");
            int i4 = ((FrameLayout.LayoutParams) layoutParams).bottomMargin;
            if (z) {
                if (i4 < 0) {
                    ValueAnimator a2 = a.a(view, i4, i2, i3);
                    l.b(a2, "");
                    a2.start();
                }
            } else if (i4 >= 0) {
                ValueAnimator a3 = a.a(view, i4, i2, i3);
                l.b(a3, "");
                a3.start();
            }
        }
    }
}
