package com.bytedance.common.a.d;

import android.os.Build;
import com.bytedance.covode.number.Covode;

public final class d {
    static {
        Covode.recordClassIndex(15766);
    }

    public static boolean a() {
        if (Build.VERSION.SDK_INT == 28) {
            return true;
        }
        return false;
    }

    public static boolean b() {
        if (Build.VERSION.SDK_INT == 29) {
            return true;
        }
        return false;
    }

    public static boolean c() {
        if (Build.VERSION.SDK_INT == 30) {
            return true;
        }
        return false;
    }
}
