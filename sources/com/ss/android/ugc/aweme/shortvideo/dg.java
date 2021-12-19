package com.ss.android.ugc.aweme.shortvideo;

import android.content.Context;
import android.os.Build;
import android.view.View;
import android.widget.FrameLayout;
import com.bytedance.covode.number.Covode;

public final class dg {
    static {
        Covode.recordClassIndex(82952);
    }

    public static boolean a(int i2, int i3) {
        if (i3 * 9 >= i2 * 16) {
            return true;
        }
        double d2 = (double) i3;
        double d3 = (double) i2;
        Double.isNaN(d2);
        Double.isNaN(d3);
        if (Math.abs((d2 / d3) - 1.7777777910232544d) < 0.1d) {
            return true;
        }
        return false;
    }

    public static void a(View view, int i2, int i3) {
        Context context = view.getContext();
        int e2 = dh.e(context);
        int b2 = dh.b(context);
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-1, -1);
        if (e2 * 9 < b2 * 16 || i2 >= i3) {
            layoutParams.width = b2;
            layoutParams.height = e2;
            layoutParams.topMargin = 0;
            layoutParams.leftMargin = 0;
        } else {
            layoutParams.width = (i2 * e2) / i3;
            layoutParams.height = e2;
            layoutParams.leftMargin = (b2 - layoutParams.width) / 2;
            layoutParams.topMargin = 0;
        }
        int i4 = Build.VERSION.SDK_INT;
        layoutParams.setMarginStart(layoutParams.leftMargin);
        view.setLayoutParams(layoutParams);
    }
}
