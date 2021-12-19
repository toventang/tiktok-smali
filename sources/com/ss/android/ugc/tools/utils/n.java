package com.ss.android.ugc.tools.utils;

import android.content.Context;
import android.os.Build;
import android.text.TextUtils;
import com.bytedance.covode.number.Covode;
import java.lang.reflect.Field;

public final class n {
    static {
        Covode.recordClassIndex(98756);
    }

    public static void a() {
        if (TextUtils.equals(Build.BRAND, "Xiaomi") && !a("android.content.res.MiuiResourcesImpl", "sMiuiThemeEnabled")) {
            a("android.content.res.MiuiResources", "sMiuiThemeEnabled");
        }
    }

    private static boolean a(String str, String str2) {
        if (TextUtils.isEmpty(str) || TextUtils.isEmpty(str2)) {
            return false;
        }
        try {
            Field declaredField = Class.forName(str).getDeclaredField(str2);
            if (declaredField == null) {
                return false;
            }
            declaredField.setAccessible(true);
            declaredField.setBoolean(null, false);
            return true;
        } catch (NoSuchFieldException e2) {
            e2.getMessage();
            return false;
        } catch (ClassNotFoundException e3) {
            e3.getMessage();
            return false;
        } catch (IllegalAccessException e4) {
            e4.getMessage();
            return false;
        }
    }

    public static void a(Context context, int[] iArr, String str) {
        a();
        for (int i2 : iArr) {
            u.a(context, i2, str);
        }
    }
}
