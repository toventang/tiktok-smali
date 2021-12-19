package com.ss.android.ugc.aweme.ecommerce.util;

import android.os.Build;
import android.view.View;
import android.view.Window;
import com.bytedance.common.utility.c;
import com.bytedance.covode.number.Covode;
import com.gyf.barlibrary.FlymeOSStatusBarFontUtils;
import com.gyf.barlibrary.OSUtils;
import h.f.b.l;

public final class o {
    static {
        Covode.recordClassIndex(55058);
    }

    public static final void a(Window window) {
        if (window != null) {
            b(window);
            if (OSUtils.isMIUI6Later()) {
                c.a(window);
            }
            if (OSUtils.isFlymeOS4Later()) {
                FlymeOSStatusBarFontUtils.setStatusBarDarkIcon(window, true);
            }
        }
    }

    private static void b(Window window) {
        l.d(window, "");
        if (Build.VERSION.SDK_INT >= 23) {
            View decorView = window.getDecorView();
            l.b(decorView, "");
            decorView.setSystemUiVisibility(decorView.getSystemUiVisibility() | 8192);
        }
    }
}
