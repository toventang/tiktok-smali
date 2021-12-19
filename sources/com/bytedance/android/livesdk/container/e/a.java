package com.bytedance.android.livesdk.container.e;

import android.view.View;
import android.view.ViewGroup;
import com.bytedance.covode.number.Covode;
import h.f.b.l;

public final class a {
    static {
        Covode.recordClassIndex(9311);
    }

    public static final void a(View view, int i2) {
        l.d(view, "");
        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        if (layoutParams != null) {
            layoutParams.height = i2;
            view.setLayoutParams(layoutParams);
            view.requestLayout();
        }
    }
}
