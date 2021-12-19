package com.bytedance.ies.bullet.ui.common.d;

import android.app.Activity;
import android.content.Context;
import android.os.Build;
import android.view.View;
import android.view.Window;
import android.view.WindowManager;
import com.bytedance.covode.number.Covode;
import com.gyf.barlibrary.FlymeOSStatusBarFontUtils;
import com.gyf.barlibrary.OSUtils;
import com.ss.android.ugc.aweme.lancet.a.a;
import h.f.b.l;
import h.w;
import java.lang.reflect.Field;
import java.lang.reflect.Method;

public final class d {

    /* renamed from: a  reason: collision with root package name */
    public static final d f33103a = new d();

    /* renamed from: b  reason: collision with root package name */
    private static final int f33104b = f33104b;

    /* renamed from: c  reason: collision with root package name */
    private static final int f33105c = f33105c;

    private d() {
    }

    public static boolean a() {
        if (Build.VERSION.SDK_INT >= 21) {
            return true;
        }
        return false;
    }

    static {
        Covode.recordClassIndex(19765);
    }

    private static Context b(Activity activity) {
        Context applicationContext = activity.getApplicationContext();
        if (a.f107168c && applicationContext == null) {
            return a.f107166a;
        }
        return applicationContext;
    }

    public static int a(Context context) {
        l.c(context, "");
        int identifier = context.getResources().getIdentifier("status_bar_height", "dimen", "android");
        if (identifier > 0) {
            return context.getResources().getDimensionPixelSize(identifier);
        }
        return 0;
    }

    public static void a(Window window) {
        if (window != null && Build.VERSION.SDK_INT >= 28) {
            WindowManager.LayoutParams attributes = window.getAttributes();
            attributes.layoutInDisplayCutoutMode = 1;
            window.setAttributes(attributes);
        }
    }

    public static void a(Activity activity) {
        l.c(activity, "");
        activity.getWindow().setFlags(1024, 1024);
        try {
            Context b2 = b(activity);
            l.a((Object) b2, "");
            Class<?> loadClass = b2.getClassLoader().loadClass("android.os.SystemProperties");
            Method method = loadClass.getMethod("getInt", String.class, Integer.TYPE);
            l.a((Object) method, "");
            Object invoke = method.invoke(loadClass, "ro.miui.notch", 0);
            if (invoke == null) {
                throw new w("null cannot be cast to non-null type");
            } else if (((Integer) invoke).intValue() == 1 && Build.VERSION.SDK_INT < 28) {
                int i2 = f33104b | f33105c;
                try {
                    Class[] clsArr = new Class[1];
                    Class cls = Integer.TYPE;
                    if (cls == null) {
                        l.a();
                    }
                    clsArr[0] = cls;
                    Method method2 = Window.class.getMethod("addExtraFlags", clsArr);
                    l.a((Object) method2, "");
                    method2.invoke(activity.getWindow(), Integer.valueOf(i2));
                } catch (Exception e2) {
                    e2.printStackTrace();
                }
            }
        } catch (Exception e3) {
            e3.printStackTrace();
        }
    }

    public static void a(Activity activity, int i2) {
        l.c(activity, "");
        if (Build.VERSION.SDK_INT >= 23) {
            activity.getWindow().clearFlags(67108864);
            activity.getWindow().addFlags(Integer.MIN_VALUE);
            Window window = activity.getWindow();
            l.a((Object) window, "");
            window.setStatusBarColor(i2);
            View findViewById = activity.getWindow().findViewById(16908290);
            l.a((Object) findViewById, "");
            if (findViewById != null) {
                findViewById.setForeground(null);
            }
        } else if (Build.VERSION.SDK_INT >= 21) {
            Window window2 = activity.getWindow();
            l.a((Object) window2, "");
            window2.setStatusBarColor(i2);
        } else {
            int i3 = Build.VERSION.SDK_INT;
            com.bytedance.ies.uikit.c.a.a(activity, i2);
        }
    }

    private static void a(boolean z, Window window) {
        int i2;
        try {
            Class<?> cls = window.getClass();
            Class<?> cls2 = Class.forName("android.view.MiuiWindowManager$LayoutParams");
            l.a((Object) cls2, "");
            Field field = cls2.getField("EXTRA_FLAG_STATUS_BAR_DARK_MODE");
            l.a((Object) field, "");
            int i3 = field.getInt(cls2);
            Method method = cls.getMethod("setExtraFlags", Integer.TYPE, Integer.TYPE);
            l.a((Object) method, "");
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
        if (window != null) {
            try {
                if (Build.VERSION.SDK_INT >= 23) {
                    View decorView = window.getDecorView();
                    l.a((Object) decorView, "");
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
