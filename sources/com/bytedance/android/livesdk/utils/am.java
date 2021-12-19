package com.bytedance.android.livesdk.utils;

import android.content.Context;
import android.content.res.Resources;
import com.bytedance.covode.number.Covode;

public final class am {
    static {
        Covode.recordClassIndex(13135);
    }

    public static boolean a(Context context) {
        try {
            Class<?> cls = Class.forName("android.os.SystemProperties");
            String str = (String) cls.getMethod("get", String.class).invoke(cls, "qemu.hw.mainkeys");
            if ("1".equals(str)) {
                return false;
            }
            if ("0".equals(str)) {
                return true;
            }
            Resources resources = context.getResources();
            int identifier = resources.getIdentifier("config_showNavigationBar", "bool", "android");
            if (identifier > 0) {
                return resources.getBoolean(identifier);
            }
            return false;
        } catch (Exception unused) {
        }
    }
}
