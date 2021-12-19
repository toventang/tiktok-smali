package com.google.android.gms.common.util;

import android.os.Build;
import com.bytedance.covode.number.Covode;

public final class k {
    static {
        Covode.recordClassIndex(31473);
    }

    public static boolean a() {
        int i2 = Build.VERSION.SDK_INT;
        return true;
    }

    public static boolean b() {
        if (Build.VERSION.SDK_INT >= 20) {
            return true;
        }
        return false;
    }

    public static boolean c() {
        if (Build.VERSION.SDK_INT >= 21) {
            return true;
        }
        return false;
    }

    public static boolean d() {
        if (Build.VERSION.SDK_INT >= 24) {
            return true;
        }
        return false;
    }

    public static boolean e() {
        if (Build.VERSION.SDK_INT >= 26) {
            return true;
        }
        return false;
    }

    public static boolean f() {
        if (Build.VERSION.SDK_INT >= 28) {
            return true;
        }
        return false;
    }
}
