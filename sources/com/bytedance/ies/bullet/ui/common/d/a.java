package com.bytedance.ies.bullet.ui.common.d;

import android.app.Activity;
import android.content.Context;
import android.content.res.Resources;
import android.os.Build;
import android.text.TextUtils;
import android.view.View;
import com.bytedance.covode.number.Covode;
import java.lang.reflect.InvocationTargetException;
import java.util.List;

public final class a {
    static {
        Covode.recordClassIndex(19760);
    }

    private static boolean a() {
        if (!TextUtils.equals("vivo", Build.BRAND.toLowerCase())) {
            return false;
        }
        try {
            Class<?> cls = Class.forName("android.util.FtFeature");
            return ((Boolean) cls.getDeclaredMethod("isFeatureSupport", Integer.TYPE).invoke(cls, 32)).booleanValue();
        } catch (Exception e2) {
            e2.printStackTrace();
            return false;
        }
    }

    private static boolean b(Context context) {
        String lowerCase = Build.BRAND.toLowerCase();
        if (!TextUtils.equals("huawei", lowerCase) && !TextUtils.equals("honor", lowerCase)) {
            return false;
        }
        try {
            Class<?> loadClass = context.getClassLoader().loadClass("com.huawei.android.util.HwNotchSizeUtil");
            return ((Boolean) loadClass.getMethod("hasNotchInScreen", new Class[0]).invoke(loadClass, new Object[0])).booleanValue();
        } catch (ClassNotFoundException | Exception | NoSuchMethodException unused) {
            return false;
        }
    }

    private static boolean d(Context context) {
        String string;
        if (context != null && Build.VERSION.SDK_INT >= 27) {
            try {
                Resources resources = context.getResources();
                int identifier = resources.getIdentifier("config_mainBuiltInDisplayCutout", "string", "android");
                if (identifier <= 0 || (string = resources.getString(identifier)) == null || TextUtils.isEmpty(string)) {
                    return false;
                }
                return true;
            } catch (Exception unused) {
            }
        }
        return false;
    }

    private static boolean c(Context context) {
        if ((context instanceof Activity) && Build.VERSION.SDK_INT >= 28) {
            View decorView = ((Activity) context).getWindow().getDecorView();
            try {
                Object invoke = decorView.getClass().getMethod("getRootWindowInsets", new Class[0]).invoke(decorView, new Object[0]);
                Object invoke2 = invoke.getClass().getDeclaredMethod("getDisplayCutout", new Class[0]).invoke(invoke, new Object[0]);
                List list = (List) invoke2.getClass().getMethod("getBoundingRects", new Class[0]).invoke(invoke2, new Object[0]);
                if (list == null || list.size() <= 0) {
                    return false;
                }
                return true;
            } catch (Exception e2) {
                e2.printStackTrace();
            }
        }
        return false;
    }

    public static boolean a(Context context) {
        boolean z;
        if (TextUtils.equals("oppo", Build.BRAND.toLowerCase())) {
            z = context.getPackageManager().hasSystemFeature("com.oppo.feature.screen.heteromorphism");
        } else {
            z = false;
        }
        if (z || a() || b(context) || a("ro.miui.notch", context) == 1 || c(context) || d(context)) {
            return true;
        }
        return false;
    }

    private static int a(String str, Context context) {
        int i2 = 0;
        if (!"Xiaomi".equals(Build.MANUFACTURER)) {
            return 0;
        }
        try {
            Class<?> loadClass = context.getClassLoader().loadClass("android.os.SystemProperties");
            i2 = ((Integer) loadClass.getMethod("getInt", String.class, Integer.TYPE).invoke(loadClass, new String(str), new Integer(0))).intValue();
            return i2;
        } catch (ClassNotFoundException e2) {
            e2.printStackTrace();
            return i2;
        } catch (NoSuchMethodException e3) {
            e3.printStackTrace();
            return i2;
        } catch (IllegalAccessException e4) {
            e4.printStackTrace();
            return i2;
        } catch (IllegalArgumentException e5) {
            e5.printStackTrace();
            return i2;
        } catch (InvocationTargetException e6) {
            e6.printStackTrace();
            return i2;
        }
    }
}
