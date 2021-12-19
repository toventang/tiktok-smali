package com.ss.android.ugc.aweme.account.util;

import android.view.View;
import android.view.ViewGroup;
import com.bytedance.covode.number.Covode;

public final class k {

    /* renamed from: a  reason: collision with root package name */
    public static final k f65490a = new k();

    private k() {
    }

    static {
        Covode.recordClassIndex(40275);
    }

    public static final void a(View view, int i2, int i3) {
        if (view != null) {
            ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
            layoutParams.height = i3;
            layoutParams.width = i2;
            view.setLayoutParams(layoutParams);
        }
    }
}
