package com.bytedance.android.livesdk.toolbar;

import android.view.View;
import android.view.ViewGroup;
import com.bytedance.android.live.core.f.y;
import com.bytedance.covode.number.Covode;
import h.f.b.l;
import java.util.Objects;

public final class a {
    static {
        Covode.recordClassIndex(12780);
    }

    public static final void a(View view) {
        l.d(view, "");
        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        Objects.requireNonNull(layoutParams, "null cannot be cast to non-null type android.view.ViewGroup.MarginLayoutParams");
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams;
        marginLayoutParams.height = y.a(36.0f);
        marginLayoutParams.width = y.a(44.0f);
        marginLayoutParams.setMarginStart(0);
        marginLayoutParams.setMarginEnd(0);
        view.setLayoutParams(marginLayoutParams);
    }
}
