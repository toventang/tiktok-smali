package com.ss.android.ugc.aweme.utils;

import android.app.Activity;
import android.os.Build;
import android.view.View;
import android.view.Window;
import com.bytedance.covode.number.Covode;
import com.gyf.barlibrary.FlymeOSStatusBarFontUtils;
import com.gyf.barlibrary.OSUtils;
import h.f.b.l;
import java.lang.reflect.Method;

public final class hg {

    /* renamed from: a  reason: collision with root package name */
    public static final hg f143063a = new hg();

    private hg() {
    }

    static {
        Covode.recordClassIndex(93628);
    }

    private static void a(boolean z, Window window) {
        int i2;
        try {
            Class<?> cls = window.getClass();
            Class<?> cls2 = Class.forName("android.view.MiuiWindowManager$LayoutParams");
            int i3 = cls2.getField("EXTRA_FLAG_STATUS_BAR_DARK_MODE").getInt(cls2);
            Method method = cls.getMethod("setExtraFlags", Integer.TYPE, Integer.TYPE);
            Object[] objArr = new Object[2];
            if (z) {
                i2 = i3;
            } else {
                i2 = 0;
            }
            objArr[0] = Integer.valueOf(i2);
            objArr[1] = Integer.valueOf(i3);
            method.invoke(window, objArr);
        } catch (Throwable unused) {
        }
    }

    public static void a(Activity activity, Window window, boolean z) {
        if (activity != null && window != null) {
            try {
                if (Build.VERSION.SDK_INT >= 23) {
                    View decorView = window.getDecorView();
                    l.b(decorView, "");
                    int systemUiVisibility = decorView.getSystemUiVisibility();
                    if (!z) {
                        decorView.setSystemUiVisibility(systemUiVisibility & -8193);
                    } else {
                        decorView.setSystemUiVisibility(systemUiVisibility | 8192);
                    }
                    window.clearFlags(67108864);
                    window.addFlags(Integer.MIN_VALUE);
                }
                if (OSUtils.isMIUI6Later()) {
                    a(z, window);
                }
                if (OSUtils.isFlymeOS4Later()) {
                    FlymeOSStatusBarFontUtils.setStatusBarDarkIcon(activity, z);
                }
            } catch (Throwable unused) {
            }
        }
    }
}
