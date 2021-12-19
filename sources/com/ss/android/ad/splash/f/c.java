package com.ss.android.ad.splash.f;

import android.app.Activity;
import android.content.Context;
import android.content.ContextWrapper;
import android.os.Build;
import android.text.TextUtils;
import android.view.DisplayCutout;
import android.view.View;
import android.view.ViewParent;
import android.view.Window;
import android.view.WindowInsets;
import com.bytedance.covode.number.Covode;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.List;

public final class c {

    /* renamed from: a  reason: collision with root package name */
    public static Boolean f58945a;

    /* renamed from: b  reason: collision with root package name */
    public static List<String> f58946b;

    static {
        Covode.recordClassIndex(36469);
    }

    public static boolean a(String str) {
        String lowerCase = Build.BRAND.toLowerCase();
        if (!TextUtils.isEmpty(lowerCase)) {
            return lowerCase.equals(str);
        }
        return false;
    }

    public static boolean f(View view) {
        if (view != null && view.isAttachedToWindow()) {
            WindowInsets rootWindowInsets = view.getRootWindowInsets();
            if (rootWindowInsets == null) {
                g.e("View#getRootWindowInsets() returned null");
                return false;
            }
            DisplayCutout displayCutout = rootWindowInsets.getDisplayCutout();
            if (displayCutout == null) {
                g.d("WindowInsets#getDisplayCutout() returned null");
                return false;
            } else if (displayCutout.getSafeInsetTop() > 0) {
                return true;
            }
        }
        return false;
    }

    public static boolean g(View view) {
        Activity i2;
        boolean z = false;
        if (view == null || (i2 = i(view)) == null) {
            return false;
        }
        Window window = i2.getWindow();
        if ((window.getAttributes().flags & 1024) == 1024) {
            z = true;
        }
        int systemUiVisibility = window.getDecorView().getSystemUiVisibility();
        if ((systemUiVisibility & 4) == 4 && (systemUiVisibility & 1024) == 1024) {
            return true;
        }
        return z;
    }

    public static Activity i(View view) {
        if (view == null) {
            return null;
        }
        do {
            for (Context context = view.getContext(); context instanceof ContextWrapper; context = ((ContextWrapper) context).getBaseContext()) {
                if (context instanceof Activity) {
                    return (Activity) context;
                }
            }
            ViewParent parent = view.getParent();
            if (!(parent instanceof View)) {
                break;
            }
            view = (View) parent;
        } while (view != null);
        g.e("failed to find activity for view");
        return null;
    }

    public static int a(View view) {
        DisplayCutout displayCutout;
        if (view == null) {
            return 0;
        }
        Context context = view.getContext();
        if (context.getResources().getConfiguration().orientation != 1) {
            return 0;
        }
        if (a("oppo")) {
            return i.a(context);
        }
        if (Build.VERSION.SDK_INT < 28 || !(context instanceof Activity) || !view.isAttachedToWindow() || (displayCutout = view.getRootWindowInsets().getDisplayCutout()) == null) {
            return i.a(context);
        }
        return displayCutout.getSafeInsetTop();
    }

    public static boolean b(View view) {
        Class<?> cls;
        if (Build.VERSION.SDK_INT >= 28 && view != null && view.isAttachedToWindow()) {
            return f(view);
        }
        if (view != null) {
            try {
                cls = view.getClass().getClassLoader().loadClass("com.huawei.android.util.HwNotchSizeUtil");
            } catch (ClassNotFoundException unused) {
                g.a();
                return false;
            } catch (NoSuchMethodException unused2) {
                g.a();
                return false;
            } catch (Exception unused3) {
                g.a();
                return false;
            }
        } else {
            cls = Class.forName("com.huawei.android.util.HwNotchSizeUtil");
        }
        if (cls == null) {
            return false;
        }
        return ((Boolean) cls.getMethod("hasNotchInScreen", new Class[0]).invoke(cls, new Object[0])).booleanValue();
    }

    public static boolean c(View view) {
        Class<?> cls;
        if (Build.VERSION.SDK_INT >= 28 && view != null && view.isAttachedToWindow()) {
            return f(view);
        }
        if (view != null) {
            try {
                cls = view.getClass().getClassLoader().loadClass("android.util.FtFeature");
            } catch (ClassNotFoundException unused) {
                g.a();
                return false;
            } catch (NoSuchMethodException unused2) {
                g.a();
                return false;
            } catch (IllegalAccessException unused3) {
                g.a();
                return false;
            } catch (InvocationTargetException unused4) {
                g.a();
                return false;
            } catch (Exception unused5) {
                g.a();
                return false;
            }
        } else {
            cls = Class.forName("android.util.FtFeature");
        }
        if (cls == null) {
            return false;
        }
        return ((Boolean) cls.getDeclaredMethod("isFeatureSupport", Integer.TYPE).invoke(cls, 32)).booleanValue();
    }

    public static boolean d(View view) {
        if (Build.VERSION.SDK_INT >= 28 && view != null && view.isAttachedToWindow()) {
            return f(view);
        }
        try {
            Class<?> cls = Class.forName("android.os.SystemProperties");
            Method declaredMethod = cls.getDeclaredMethod("getInt", String.class, Integer.TYPE);
            declaredMethod.setAccessible(true);
            if (((Integer) declaredMethod.invoke(cls, "ro.miui.notch", 0)).intValue() == 1) {
                return true;
            }
            return false;
        } catch (ClassNotFoundException e2) {
            e2.getMessage();
            g.a();
            return false;
        } catch (NoSuchMethodException e3) {
            e3.getMessage();
            g.a();
            return false;
        } catch (IllegalAccessException e4) {
            e4.getMessage();
            g.a();
            return false;
        } catch (InvocationTargetException e5) {
            e5.getMessage();
            g.a();
            return false;
        } catch (Throwable th) {
            th.getMessage();
            g.a();
            return false;
        }
    }

    public static boolean e(View view) {
        Class<?> cls;
        if (Build.VERSION.SDK_INT >= 28 && view != null && view.isAttachedToWindow()) {
            return f(view);
        }
        if (view != null) {
            try {
                cls = view.getClass().getClassLoader().loadClass("flyme.config.FlymeFeature");
            } catch (IllegalAccessException unused) {
                g.a();
                return false;
            } catch (NoSuchFieldException unused2) {
                g.a();
                return false;
            } catch (ClassNotFoundException unused3) {
                g.a();
                return false;
            } catch (Exception unused4) {
                g.a();
                return false;
            }
        } else {
            cls = Class.forName("flyme.config.FlymeFeature");
        }
        if (cls == null) {
            return false;
        }
        return ((Boolean) cls.getDeclaredField("IS_FRINGE_DEVICE").get(false)).booleanValue();
    }

    public static boolean h(View view) {
        Activity i2;
        if (view == null || (i2 = i(view)) == null) {
            return false;
        }
        if (Build.VERSION.SDK_INT >= 21) {
            int systemUiVisibility = i2.getWindow().getDecorView().getSystemUiVisibility();
            int i3 = i2.getWindow().getAttributes().flags;
            if (!((systemUiVisibility & 1024) != 0 && (systemUiVisibility & 4) == 0 && (i3 & 1024) == 0)) {
                return false;
            }
        } else {
            int i4 = Build.VERSION.SDK_INT;
            int i5 = i2.getWindow().getAttributes().flags;
            if ((67108864 & i5) == 0 || (i5 & 1024) != 0) {
                return false;
            }
        }
        return true;
    }
}
