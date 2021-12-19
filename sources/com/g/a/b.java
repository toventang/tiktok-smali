package com.g.a;

import com.bytedance.covode.number.Covode;

public final class b {
    static {
        Covode.recordClassIndex(30822);
    }

    public static boolean a(String str) {
        try {
            Object[] a2 = a.f49252a.a("checkPermission", str);
            if (a2.length > 0) {
                return ((Boolean) a2[0]).booleanValue();
            }
            return false;
        } catch (Exception unused) {
            return false;
        }
    }

    public static Object a(int i2, int i3, int i4) {
        try {
            Object[] a2 = a.f49252a.a("turbo", Integer.valueOf(i2), Integer.valueOf(i3), Integer.valueOf(i4), null);
            if (a2.length > 0) {
                return a2[0];
            }
            return 1;
        } catch (Exception unused) {
            return 1;
        }
    }
}
