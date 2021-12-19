package com.gyf.barlibrary;

import android.app.Activity;
import android.content.Context;
import android.os.Build;
import android.view.DisplayCutout;
import android.view.View;
import android.view.Window;
import android.view.WindowInsets;
import com.bytedance.covode.number.Covode;
import java.lang.reflect.InvocationTargetException;

public class NotchUtils {
    static {
        Covode.recordClassIndex(34168);
    }

    private static boolean hasNotchAtAndroidP(Activity activity) {
        if (getDisplayCutout(activity) != null) {
            return true;
        }
        return false;
    }

    private static boolean hasNotchAtOPPO(Context context) {
        try {
            return context.getPackageManager().hasSystemFeature("com.oppo.feature.screen.heteromorphism");
        } catch (Exception unused) {
            return false;
        }
    }

    private static DisplayCutout getDisplayCutout(Activity activity) {
        Window window;
        WindowInsets rootWindowInsets;
        if (Build.VERSION.SDK_INT < 28 || activity == null || (window = activity.getWindow()) == null || (rootWindowInsets = window.getDecorView().getRootWindowInsets()) == null) {
            return null;
        }
        return rootWindowInsets.getDisplayCutout();
    }

    private static boolean hasNotchAtAndroidP(View view) {
        if (getDisplayCutout(view) != null) {
            return true;
        }
        return false;
    }

    private static boolean hasNotchAtHuaWei(Context context) {
        try {
            Class<?> loadClass = context.getClassLoader().loadClass("com.huawei.android.util.HwNotchSizeUtil");
            return ((Boolean) loadClass.getMethod("hasNotchInScreen", new Class[0]).invoke(loadClass, new Object[0])).booleanValue();
        } catch (ClassNotFoundException | Exception | NoSuchMethodException unused) {
            return false;
        }
    }

    private static DisplayCutout getDisplayCutout(View view) {
        WindowInsets rootWindowInsets;
        if (Build.VERSION.SDK_INT < 28 || view == null || (rootWindowInsets = view.getRootWindowInsets()) == null) {
            return null;
        }
        return rootWindowInsets.getDisplayCutout();
    }

    private static boolean hasNotchAtVIVO(Context context) {
        try {
            Class<?> loadClass = context.getClassLoader().loadClass("android.util.FtFeature");
            return ((Boolean) loadClass.getMethod("isFeatureSupport", Integer.TYPE).invoke(loadClass, 32)).booleanValue();
        } catch (ClassNotFoundException | Exception | NoSuchMethodException unused) {
            return false;
        }
    }

    public static boolean hasNotchScreen(Activity activity) {
        if (activity == null) {
            return false;
        }
        if (hasNotchAtXiaoMi(activity) || hasNotchAtHuaWei(activity) || hasNotchAtOPPO(activity) || hasNotchAtVIVO(activity) || hasNotchAtAndroidP(activity)) {
            return true;
        }
        return false;
    }

    private static boolean hasNotchAtXiaoMi(Context context) {
        if ("Xiaomi".equals(Build.MANUFACTURER)) {
            try {
                Class<?> loadClass = context.getClassLoader().loadClass("android.os.SystemProperties");
                if (((Integer) loadClass.getMethod("getInt", String.class, Integer.TYPE).invoke(loadClass, "ro.miui.notch", 0)).intValue() == 1) {
                    return true;
                }
            } catch (ClassNotFoundException | IllegalAccessException | NoSuchMethodException | InvocationTargetException unused) {
            }
        }
        return false;
    }

    public static boolean hasNotchScreen(View view) {
        if (view == null) {
            return false;
        }
        if (hasNotchAtXiaoMi(view.getContext()) || hasNotchAtHuaWei(view.getContext()) || hasNotchAtOPPO(view.getContext()) || hasNotchAtVIVO(view.getContext()) || hasNotchAtAndroidP(view)) {
            return true;
        }
        return false;
    }
}
