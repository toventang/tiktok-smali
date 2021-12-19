package com.bytedance.android.live.core.f.c;

import android.os.Build;
import android.view.View;
import android.view.Window;
import android.view.WindowManager;
import com.bytedance.covode.number.Covode;
import java.lang.reflect.Field;
import java.lang.reflect.Method;

public final class a {
    static {
        Covode.recordClassIndex(4635);
    }

    public static void c(Window window, boolean z) {
        int i2;
        if (window != null) {
            window.clearFlags(67108864);
            window.addFlags(Integer.MIN_VALUE);
            View decorView = window.getDecorView();
            int systemUiVisibility = decorView.getSystemUiVisibility();
            if (z) {
                i2 = systemUiVisibility | 8192;
            } else {
                i2 = systemUiVisibility & -8193;
            }
            decorView.setSystemUiVisibility(i2);
        }
    }

    public static boolean a(Window window, boolean z) {
        int i2;
        if (window != null) {
            try {
                WindowManager.LayoutParams attributes = window.getAttributes();
                Field declaredField = WindowManager.LayoutParams.class.getDeclaredField("MEIZU_FLAG_DARK_STATUS_BAR_ICON");
                Field declaredField2 = WindowManager.LayoutParams.class.getDeclaredField("meizuFlags");
                declaredField.setAccessible(true);
                declaredField2.setAccessible(true);
                int i3 = declaredField.getInt(null);
                int i4 = declaredField2.getInt(attributes);
                if (z) {
                    i2 = i4 | i3;
                } else {
                    i2 = i4 & (i3 ^ -1);
                }
                declaredField2.setInt(attributes, i2);
                window.setAttributes(attributes);
                return true;
            } catch (Exception unused) {
            }
        }
        return false;
    }

    public static boolean b(Window window, boolean z) {
        if (window != null) {
            Class<?> cls = window.getClass();
            try {
                Class<?> cls2 = Class.forName("android.view.MiuiWindowManager$LayoutParams");
                int i2 = cls2.getField("EXTRA_FLAG_STATUS_BAR_DARK_MODE").getInt(cls2);
                Method method = cls.getMethod("setExtraFlags", Integer.TYPE, Integer.TYPE);
                if (z) {
                    method.invoke(window, Integer.valueOf(i2), Integer.valueOf(i2));
                } else {
                    method.invoke(window, 0, Integer.valueOf(i2));
                }
                if (Build.VERSION.SDK_INT < 23) {
                    return true;
                }
                if (z) {
                    window.getDecorView().setSystemUiVisibility(8192);
                    return true;
                }
                window.getDecorView().setSystemUiVisibility(0);
                return true;
            } catch (Exception unused) {
            }
        }
        return false;
    }
}
