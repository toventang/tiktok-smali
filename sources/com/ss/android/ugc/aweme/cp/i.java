package com.ss.android.ugc.aweme.cp;

import android.view.View;
import android.view.ViewGroup;
import com.bytedance.covode.number.Covode;
import h.f.b.l;

public final class i {
    static {
        Covode.recordClassIndex(48531);
    }

    public static final void a(View view, int i2, int i3) {
        l.d(view, "");
        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        layoutParams.width = i2;
        layoutParams.height = i3;
        view.setLayoutParams(layoutParams);
    }
}
