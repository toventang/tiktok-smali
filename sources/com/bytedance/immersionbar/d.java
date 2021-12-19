package com.bytedance.immersionbar;

import android.app.Activity;
import android.util.Pair;
import android.view.View;
import android.view.Window;
import android.view.WindowManager;
import com.bytedance.covode.number.Covode;
import com.bytedance.helios.sdk.a;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

public final class d {

    /* renamed from: a  reason: collision with root package name */
    private static Method f38895a;

    /* renamed from: b  reason: collision with root package name */
    private static Method f38896b;

    /* renamed from: c  reason: collision with root package name */
    private static Field f38897c;

    /* renamed from: d  reason: collision with root package name */
    private static int f38898d;

    private static Object a(Method method, Object obj, Object[] objArr) {
        Pair<Boolean, Object> a2 = a.a(method, new Object[]{obj, objArr}, 110000, "java.lang.Object", true, "com_bytedance_immersionbar_FlymeOSStatusBarFontUtils_java_lang_reflect_Method_invoke(Ljava/lang/reflect/Method;Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;");
        if (((Boolean) a2.first).booleanValue()) {
            return a2.second;
        }
        Object invoke = method.invoke(obj, objArr);
        a.a(invoke, method, new Object[]{obj, objArr}, "com_bytedance_immersionbar_FlymeOSStatusBarFontUtils_java_lang_reflect_Method_invoke(Ljava/lang/reflect/Method;Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;");
        return invoke;
    }

    static {
        Covode.recordClassIndex(23842);
        try {
            f38895a = Activity.class.getMethod("setStatusBarDarkIcon", Integer.TYPE);
        } catch (NoSuchMethodException unused) {
        }
        try {
            f38896b = Activity.class.getMethod("setStatusBarDarkIcon", Boolean.TYPE);
        } catch (NoSuchMethodException unused2) {
        }
        try {
            f38897c = WindowManager.LayoutParams.class.getField("statusBarColor");
        } catch (NoSuchFieldException unused3) {
        }
        try {
            f38898d = View.class.getField("SYSTEM_UI_FLAG_LIGHT_STATUS_BAR").getInt(null);
        } catch (IllegalAccessException | NoSuchFieldException unused4) {
        }
    }

    private static void a(View view, boolean z) {
        int i2;
        int systemUiVisibility = view.getSystemUiVisibility();
        if (z) {
            i2 = f38898d | systemUiVisibility;
        } else {
            i2 = (f38898d ^ -1) & systemUiVisibility;
        }
        if (i2 != systemUiVisibility) {
            view.setSystemUiVisibility(i2);
        }
    }

    public static void a(Activity activity, int i2) {
        Method method = f38895a;
        boolean z = false;
        if (method != null) {
            try {
                a(method, activity, new Object[]{Integer.valueOf(i2)});
            } catch (IllegalAccessException e2) {
                e2.printStackTrace();
            } catch (InvocationTargetException e3) {
                e3.printStackTrace();
            }
        } else {
            if (((((((16711680 & i2) >> 16) * 38) + (((65280 & i2) >> 8) * 75)) + ((i2 & 255) * 15)) >> 7) < 50) {
                z = true;
            }
            if (f38897c != null) {
                a(activity, z, z);
                Window window = activity.getWindow();
                try {
                    a(window, i2);
                    if (f.f38913a > 22) {
                        a(window.getDecorView(), true);
                    }
                } catch (Exception e4) {
                    e4.printStackTrace();
                }
            } else {
                a(activity, z, true);
            }
        }
    }

    private static void a(Window window, int i2) {
        WindowManager.LayoutParams attributes = window.getAttributes();
        Field field = f38897c;
        if (field != null) {
            try {
                if (field.getInt(attributes) != i2) {
                    f38897c.set(attributes, Integer.valueOf(i2));
                    window.setAttributes(attributes);
                }
            } catch (IllegalAccessException e2) {
                e2.printStackTrace();
            }
        }
    }

    private static void a(Window window, boolean z) {
        if (f.f38913a < 23) {
            a(window.getAttributes(), "MEIZU_FLAG_DARK_STATUS_BAR_ICON", z);
            return;
        }
        a(window.getDecorView(), z);
        a(window, 0);
    }

    static void a(Activity activity, boolean z, boolean z2) {
        Method method = f38896b;
        if (method != null) {
            try {
                a(method, activity, new Object[]{Boolean.valueOf(z)});
            } catch (IllegalAccessException e2) {
                e2.printStackTrace();
            } catch (InvocationTargetException e3) {
                e3.printStackTrace();
            }
        } else if (z2) {
            a(activity.getWindow(), z);
        }
    }

    private static boolean a(WindowManager.LayoutParams layoutParams, String str, boolean z) {
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
}
