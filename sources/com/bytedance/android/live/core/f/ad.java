package com.bytedance.android.live.core.f;

import com.bytedance.android.live.core.c.a;
import com.bytedance.covode.number.Covode;

public final class ad {
    static {
        Covode.recordClassIndex(4610);
    }

    public static int b(String str) {
        try {
            return Integer.parseInt(a(str).trim());
        } catch (NumberFormatException unused) {
            return 0;
        }
    }

    public static String a(String str) {
        Exception e2;
        String str2 = "";
        try {
            Class<?> cls = Class.forName("android.os.SystemProperties");
            String str3 = (String) cls.getDeclaredMethod("get", String.class).invoke(cls, str);
            try {
                a.a(3, "SystemPropertiesUtil", "key is:" + str + " prop is: " + str3);
                return str3;
            } catch (Exception e3) {
                e2 = e3;
                str2 = str3;
            }
        } catch (Exception e4) {
            e2 = e4;
            a.b("SystemPropertiesUtil", "read the content of build.prop exception.", e2);
            return str2;
        }
    }
}
