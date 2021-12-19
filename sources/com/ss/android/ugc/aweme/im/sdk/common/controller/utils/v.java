package com.ss.android.ugc.aweme.im.sdk.common.controller.utils;

import android.os.Build;
import android.view.View;
import com.bytedance.covode.number.Covode;
import com.zhiliaoapp.musically.R;
import h.f.b.l;

public final class v {

    /* renamed from: a  reason: collision with root package name */
    public static final v f102447a = new v();

    private v() {
    }

    static {
        Covode.recordClassIndex(65585);
    }

    public static final void a(View view) {
        l.d(view, "");
        a(view, R.drawable.aq8, R.color.f159928l);
    }

    public static final void a(View view, int i2, int i3) {
        l.d(view, "");
        if (Build.VERSION.SDK_INT < 21) {
            ae.a(view);
            view.setBackground(view.getResources().getDrawable(i3));
            return;
        }
        view.setBackground(view.getResources().getDrawable(i2));
    }
}
