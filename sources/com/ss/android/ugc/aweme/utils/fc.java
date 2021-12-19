package com.ss.android.ugc.aweme.utils;

import android.app.Activity;
import android.os.Build;
import android.view.View;
import android.view.Window;
import android.view.WindowInsets;
import com.bytedance.covode.number.Covode;
import h.f.b.l;
import h.z;

public final class fc {

    /* renamed from: a  reason: collision with root package name */
    public static final fc f142902a = new fc();

    private fc() {
    }

    static {
        Covode.recordClassIndex(93510);
    }

    public static final void a(Window window) {
        l.d(window, "");
        a(window, -16777216, false);
    }

    public static final void b(Activity activity) {
        l.d(activity, "");
        d(activity);
    }

    public static int a(View view) {
        if (view == null) {
            return 0;
        }
        int[] iArr = new int[2];
        view.getLocationOnScreen(iArr);
        return view.getHeight() + iArr[1];
    }

    private static z d(Activity activity) {
        l.d(activity, "");
        Window window = activity.getWindow();
        if (window == null) {
            return null;
        }
        l.d(window, "");
        a(window, -1, true);
        return z.f158842a;
    }

    public static final z a(Activity activity) {
        l.d(activity, "");
        Window window = activity.getWindow();
        if (window == null) {
            return null;
        }
        a(window);
        return z.f158842a;
    }

    public static final int c(Activity activity) {
        l.d(activity, "");
        if (Build.VERSION.SDK_INT > 28) {
            try {
                Window window = activity.getWindow();
                l.b(window, "");
                View decorView = window.getDecorView();
                l.b(decorView, "");
                WindowInsets rootWindowInsets = decorView.getRootWindowInsets();
                l.b(rootWindowInsets, "");
                int i2 = rootWindowInsets.getTappableElementInsets().bottom;
                if (i2 >= 0) {
                    if (i2 > 0) {
                        return 1;
                    }
                    return 0;
                }
            } catch (Exception unused) {
            }
        }
        return -1;
    }

    private static void a(Window window, boolean z) {
        int i2;
        l.d(window, "");
        if (Build.VERSION.SDK_INT >= 26) {
            View decorView = window.getDecorView();
            l.b(decorView, "");
            int systemUiVisibility = decorView.getSystemUiVisibility();
            if (z) {
                window.clearFlags(134217728);
                window.addFlags(Integer.MIN_VALUE);
                i2 = systemUiVisibility | 16;
            } else {
                i2 = systemUiVisibility & -17;
            }
            if (i2 != systemUiVisibility) {
                View decorView2 = window.getDecorView();
                l.b(decorView2, "");
                decorView2.setSystemUiVisibility(i2);
            }
        }
    }

    private static void a(Window window, int i2, boolean z) {
        if (Build.VERSION.SDK_INT >= 26) {
            window.setNavigationBarColor(i2);
            a(window, z);
        }
    }
}
