package com.bytedance.immersionbar;

import android.os.Build;
import android.text.TextUtils;
import com.bytedance.covode.number.Covode;

public final class f {

    /* renamed from: a  reason: collision with root package name */
    public static int f38913a = Build.VERSION.SDK_INT;

    static {
        Covode.recordClassIndex(23845);
    }

    public static boolean b() {
        if (f() || e()) {
            return true;
        }
        return false;
    }

    private static boolean f() {
        if (d().contains("EmotionUI_3.0")) {
            return true;
        }
        return false;
    }

    private static String d() {
        if (!TextUtils.isEmpty(a("ro.build.version.emui", ""))) {
            return a("ro.build.version.emui", "");
        }
        return "";
    }

    private static boolean e() {
        String d2 = d();
        if ("EmotionUI 3".equals(d2) || d2.contains("EmotionUI_3.1")) {
            return true;
        }
        return false;
    }

    public static boolean a() {
        String str = "";
        if (!TextUtils.isEmpty(a("ro.miui.ui.version.name", str))) {
            str = a("ro.miui.ui.version.name", str);
        }
        if (!str.isEmpty()) {
            try {
                if (Integer.valueOf(str.substring(1)).intValue() >= 6) {
                    return true;
                }
            } catch (NumberFormatException unused) {
            }
        }
        return false;
    }

    public static boolean c() {
        int i2;
        String str = "";
        if (a("ro.build.display.id", str).toLowerCase().contains("flyme")) {
            str = a("ro.build.display.id", str);
        }
        if (!str.isEmpty()) {
            try {
                if (str.toLowerCase().contains("os")) {
                    i2 = Integer.valueOf(str.substring(9, 10)).intValue();
                } else {
                    i2 = Integer.valueOf(str.substring(6, 7)).intValue();
                }
                if (i2 >= 4) {
                    return true;
                }
            } catch (NumberFormatException unused) {
            }
        }
        return false;
    }

    private static String a(String str, String str2) {
        try {
            Class<?> cls = Class.forName("android.os.SystemProperties");
            return (String) cls.getMethod("get", String.class, String.class).invoke(cls, str, str2);
        } catch (Exception e2) {
            e2.printStackTrace();
            return str2;
        }
    }
}
