package com.ss.android.ugc.aweme.utils;

import android.app.Activity;
import android.content.Context;
import android.os.Build;
import android.view.Window;
import com.bytedance.common.utility.n;
import com.bytedance.covode.number.Covode;
import com.bytedance.ies.ugc.appcontext.d;
import com.ss.android.ugc.aweme.lancet.a.a;

public final class hh {
    static {
        Covode.recordClassIndex(93629);
    }

    public static boolean a() {
        if (Build.VERSION.SDK_INT >= 21) {
            return true;
        }
        return false;
    }

    public static int b() {
        int identifier = d.a().getResources().getIdentifier("status_bar_height", "dimen", "android");
        if (identifier > 0) {
            return d.a().getResources().getDimensionPixelSize(identifier);
        }
        return 0;
    }

    public static int c() {
        int i2;
        try {
            int identifier = d.a().getResources().getIdentifier("status_bar_height", "dimen", "android");
            if (identifier > 0) {
                i2 = d.a().getResources().getDimensionPixelSize(identifier);
            } else {
                i2 = 44;
            }
            return n.c(d.a(), (float) i2);
        } catch (Exception e2) {
            e2.printStackTrace();
            return 44;
        }
    }

    private static Context b(Activity activity) {
        Context applicationContext = activity.getApplicationContext();
        if (a.f107168c && applicationContext == null) {
            return a.f107166a;
        }
        return applicationContext;
    }

    public static void a(Activity activity) {
        activity.getWindow().setFlags(1024, 1024);
        try {
            Class<?> loadClass = b(activity).getClassLoader().loadClass("android.os.SystemProperties");
            if (((Integer) loadClass.getMethod("getInt", String.class, Integer.TYPE).invoke(loadClass, "ro.miui.notch", 0)).intValue() == 1 && Build.VERSION.SDK_INT < 28) {
                try {
                    Window.class.getMethod("addExtraFlags", Integer.TYPE).invoke(activity.getWindow(), 768);
                } catch (Exception e2) {
                    e2.printStackTrace();
                }
            }
        } catch (Exception e3) {
            e3.printStackTrace();
        }
    }

    public static void a(Activity activity, int i2) {
        if (Build.VERSION.SDK_INT >= 21) {
            activity.getWindow().setStatusBarColor(i2);
            return;
        }
        int i3 = Build.VERSION.SDK_INT;
        com.bytedance.ies.uikit.c.a.a(activity, i2);
    }

    public static void a(Activity activity, boolean z) {
        int i2;
        if (Build.VERSION.SDK_INT >= 23 && activity != null) {
            int systemUiVisibility = activity.getWindow().getDecorView().getSystemUiVisibility();
            if (z) {
                i2 = systemUiVisibility | 8192;
            } else {
                i2 = systemUiVisibility & -8193;
            }
            if (i2 != systemUiVisibility) {
                activity.getWindow().getDecorView().setSystemUiVisibility(i2);
            }
        }
    }
}
