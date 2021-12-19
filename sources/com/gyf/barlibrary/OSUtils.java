package com.gyf.barlibrary;

import android.text.TextUtils;
import com.bytedance.covode.number.Covode;

public class OSUtils {
    static {
        Covode.recordClassIndex(34169);
    }

    public static String getEMUIVersion() {
        if (isEMUI()) {
            return getSystemProperty("ro.build.version.emui", "");
        }
        return "";
    }

    private static String getFlymeOSFlag() {
        return getSystemProperty("ro.build.display.id", "");
    }

    public static String getFlymeOSVersion() {
        if (isFlymeOS()) {
            return getSystemProperty("ro.build.display.id", "");
        }
        return "";
    }

    public static String getMIUIVersion() {
        if (isMIUI()) {
            return getSystemProperty("ro.miui.ui.version.name", "");
        }
        return "";
    }

    public static boolean isEMUI3_0() {
        if (getEMUIVersion().contains("EmotionUI_3.0")) {
            return true;
        }
        return false;
    }

    public static boolean isEMUI3_x() {
        if (isEMUI3_0() || isEMUI3_1()) {
            return true;
        }
        return false;
    }

    public static boolean isFlymeOS() {
        return getFlymeOSFlag().toLowerCase().contains("flyme");
    }

    public static boolean isEMUI() {
        if (!TextUtils.isEmpty(getSystemProperty("ro.build.version.emui", ""))) {
            return true;
        }
        return false;
    }

    public static boolean isEMUI3_1() {
        String eMUIVersion = getEMUIVersion();
        if ("EmotionUI 3".equals(eMUIVersion) || eMUIVersion.contains("EmotionUI_3.1")) {
            return true;
        }
        return false;
    }

    public static boolean isMIUI() {
        if (!TextUtils.isEmpty(getSystemProperty("ro.miui.ui.version.name", ""))) {
            return true;
        }
        return false;
    }

    public static boolean isMIUI6Later() {
        String mIUIVersion = getMIUIVersion();
        if (!mIUIVersion.isEmpty()) {
            try {
                if (Integer.valueOf(mIUIVersion.substring(1)).intValue() >= 6) {
                    return true;
                }
            } catch (NumberFormatException unused) {
            }
        }
        return false;
    }

    public static boolean isFlymeOS4Later() {
        int i2;
        String flymeOSVersion = getFlymeOSVersion();
        if (!flymeOSVersion.isEmpty()) {
            try {
                if (flymeOSVersion.toLowerCase().contains("os")) {
                    i2 = Integer.valueOf(flymeOSVersion.substring(9, 10)).intValue();
                } else {
                    i2 = Integer.valueOf(flymeOSVersion.substring(6, 7)).intValue();
                }
                if (i2 >= 4) {
                    return true;
                }
            } catch (NumberFormatException unused) {
            }
        }
        return false;
    }

    public static boolean isFlymeOS5() {
        int i2;
        String flymeOSVersion = getFlymeOSVersion();
        if (!flymeOSVersion.isEmpty()) {
            try {
                if (flymeOSVersion.toLowerCase().contains("os")) {
                    i2 = Integer.valueOf(flymeOSVersion.substring(9, 10)).intValue();
                } else {
                    i2 = Integer.valueOf(flymeOSVersion.substring(6, 7)).intValue();
                }
                if (i2 == 5) {
                    return true;
                }
            } catch (NumberFormatException unused) {
            }
        }
        return false;
    }

    private static String getSystemProperty(String str, String str2) {
        try {
            Class<?> cls = Class.forName("android.os.SystemProperties");
            return (String) cls.getMethod("get", String.class, String.class).invoke(cls, str, str2);
        } catch (Exception e2) {
            e2.printStackTrace();
            return str2;
        }
    }
}
