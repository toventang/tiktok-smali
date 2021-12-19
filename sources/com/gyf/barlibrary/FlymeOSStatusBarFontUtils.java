package com.gyf.barlibrary;

import android.app.Activity;
import android.os.Build;
import android.util.Pair;
import android.view.View;
import android.view.Window;
import android.view.WindowManager;
import com.bytedance.covode.number.Covode;
import com.bytedance.helios.sdk.a;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

public class FlymeOSStatusBarFontUtils {
    private static int SYSTEM_UI_FLAG_LIGHT_STATUS_BAR;
    private static Method mSetStatusBarColorIcon;
    private static Method mSetStatusBarDarkIcon;
    private static Field mStatusBarColorFiled;

    private static Object com_gyf_barlibrary_FlymeOSStatusBarFontUtils_java_lang_reflect_Method_invoke(Method method, Object obj, Object[] objArr) {
        Pair<Boolean, Object> a2 = a.a(method, new Object[]{obj, objArr}, 110000, "java.lang.Object", true, "com_gyf_barlibrary_FlymeOSStatusBarFontUtils_java_lang_reflect_Method_invoke(Ljava/lang/reflect/Method;Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;");
        if (((Boolean) a2.first).booleanValue()) {
            return a2.second;
        }
        Object invoke = method.invoke(obj, objArr);
        a.a(invoke, method, new Object[]{obj, objArr}, "com_gyf_barlibrary_FlymeOSStatusBarFontUtils_java_lang_reflect_Method_invoke(Ljava/lang/reflect/Method;Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;");
        return invoke;
    }

    public static int toGrey(int i2) {
        return (((((i2 & 16711680) >> 16) * 38) + (((65280 & i2) >> 8) * 75)) + ((i2 & 255) * 15)) >> 7;
    }

    static {
        Covode.recordClassIndex(34160);
        try {
            mSetStatusBarColorIcon = Activity.class.getMethod("setStatusBarDarkIcon", Integer.TYPE);
        } catch (NoSuchMethodException unused) {
        }
        try {
            mSetStatusBarDarkIcon = Activity.class.getMethod("setStatusBarDarkIcon", Boolean.TYPE);
        } catch (NoSuchMethodException unused2) {
        }
        try {
            mStatusBarColorFiled = WindowManager.LayoutParams.class.getField("statusBarColor");
        } catch (NoSuchFieldException unused3) {
        }
        try {
            SYSTEM_UI_FLAG_LIGHT_STATUS_BAR = View.class.getField("SYSTEM_UI_FLAG_LIGHT_STATUS_BAR").getInt(null);
        } catch (IllegalAccessException | NoSuchFieldException unused4) {
        }
    }

    public static void setStatusBarDarkIcon(Activity activity, boolean z) {
        setStatusBarDarkIcon(activity, z, true);
    }

    public static boolean isBlackColor(int i2, int i3) {
        if (toGrey(i2) < i3) {
            return true;
        }
        return false;
    }

    private static void setStatusBarColor(Window window, int i2) {
        WindowManager.LayoutParams attributes = window.getAttributes();
        Field field = mStatusBarColorFiled;
        if (field != null) {
            try {
                if (field.getInt(attributes) != i2) {
                    mStatusBarColorFiled.set(attributes, Integer.valueOf(i2));
                    window.setAttributes(attributes);
                }
            } catch (IllegalAccessException e2) {
                e2.printStackTrace();
            }
        }
    }

    private static void setStatusBarDarkIcon(View view, boolean z) {
        int i2;
        int systemUiVisibility = view.getSystemUiVisibility();
        if (z) {
            i2 = SYSTEM_UI_FLAG_LIGHT_STATUS_BAR | systemUiVisibility;
        } else {
            i2 = (SYSTEM_UI_FLAG_LIGHT_STATUS_BAR ^ -1) & systemUiVisibility;
        }
        if (i2 != systemUiVisibility) {
            view.setSystemUiVisibility(i2);
        }
    }

    public static void setStatusBarDarkIcon(Activity activity, int i2) {
        Method method = mSetStatusBarColorIcon;
        if (method != null) {
            try {
                com_gyf_barlibrary_FlymeOSStatusBarFontUtils_java_lang_reflect_Method_invoke(method, activity, new Object[]{Integer.valueOf(i2)});
            } catch (IllegalAccessException e2) {
                e2.printStackTrace();
            } catch (InvocationTargetException e3) {
                e3.printStackTrace();
            }
        } else {
            boolean isBlackColor = isBlackColor(i2, 50);
            if (mStatusBarColorFiled != null) {
                setStatusBarDarkIcon(activity, isBlackColor, isBlackColor);
                setStatusBarDarkIcon(activity.getWindow(), i2);
                return;
            }
            setStatusBarDarkIcon(activity, isBlackColor);
        }
    }

    public static void setStatusBarDarkIcon(Window window, int i2) {
        try {
            setStatusBarColor(window, i2);
            if (Build.VERSION.SDK_INT > 22) {
                setStatusBarDarkIcon(window.getDecorView(), true);
            }
        } catch (Exception e2) {
            e2.printStackTrace();
        }
    }

    public static void setStatusBarDarkIcon(Window window, boolean z) {
        if (Build.VERSION.SDK_INT < 23) {
            changeMeizuFlag(window.getAttributes(), "MEIZU_FLAG_DARK_STATUS_BAR_ICON", z);
            return;
        }
        setStatusBarDarkIcon(window.getDecorView(), z);
        setStatusBarColor(window, 0);
    }

    private static boolean changeMeizuFlag(WindowManager.LayoutParams layoutParams, String str, boolean z) {
        int i2;
        try {
            Field declaredField = layoutParams.getClass().getDeclaredField(str);
            declaredField.setAccessible(true);
            int i3 = declaredField.getInt(layoutParams);
            Field declaredField2 = layoutParams.getClass().getDeclaredField("meizuFlags");
            declaredField2.setAccessible(true);
            int i4 = declaredField2.getInt(layoutParams);
            if (z) {
                i2 = i3 | i4;
            } else {
                i2 = (i3 ^ -1) & i4;
            }
            if (i4 == i2) {
                return false;
            }
            declaredField2.setInt(layoutParams, i2);
            return true;
        } catch (NoSuchFieldException e2) {
            e2.printStackTrace();
            return false;
        } catch (IllegalAccessException e3) {
            e3.printStackTrace();
            return false;
        } catch (IllegalArgumentException e4) {
            e4.printStackTrace();
            return false;
        } catch (Throwable unused) {
            return false;
        }
    }

    private static void setStatusBarDarkIcon(Activity activity, boolean z, boolean z2) {
        Method method = mSetStatusBarDarkIcon;
        if (method != null) {
            try {
                com_gyf_barlibrary_FlymeOSStatusBarFontUtils_java_lang_reflect_Method_invoke(method, activity, new Object[]{Boolean.valueOf(z)});
            } catch (IllegalAccessException e2) {
                e2.printStackTrace();
            } catch (InvocationTargetException e3) {
                e3.printStackTrace();
            }
        } else if (z2) {
            setStatusBarDarkIcon(activity.getWindow(), z);
        }
    }
}
