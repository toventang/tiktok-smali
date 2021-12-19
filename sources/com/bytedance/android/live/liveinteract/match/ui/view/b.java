package com.bytedance.android.live.liveinteract.match.ui.view;

import android.view.View;
import android.view.ViewGroup;
import com.bytedance.covode.number.Covode;
import h.f.b.l;

public final class b {
    static {
        Covode.recordClassIndex(5872);
    }

    public static final void a(View view, int i2) {
        l.d(view, "");
        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        if (layoutParams != null) {
            layoutParams.width = i2;
            view.setLayoutParams(layoutParams);
        }
    }
}
