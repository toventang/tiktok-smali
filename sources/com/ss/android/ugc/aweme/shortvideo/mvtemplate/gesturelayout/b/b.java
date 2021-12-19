package com.ss.android.ugc.aweme.shortvideo.mvtemplate.gesturelayout.b;

import com.bytedance.covode.number.Covode;

public final class b {

    /* renamed from: a  reason: collision with root package name */
    public static final b f129274a = new b();

    private b() {
    }

    static {
        Covode.recordClassIndex(84849);
    }

    public static boolean a(float f2, float f3) {
        if (Math.abs(f2 - f3) < 1.0f) {
            return true;
        }
        return false;
    }

    public static boolean b(float f2, float f3) {
        if (f2 <= f3 || a(f2, f3)) {
            return false;
        }
        return true;
    }

    public static boolean c(float f2, float f3) {
        if (f2 > f3 || a(f2, f3)) {
            return true;
        }
        return false;
    }

    public static boolean d(float f2, float f3) {
        if (f2 >= f3 || a(f2, f3)) {
            return false;
        }
        return true;
    }

    public static boolean e(float f2, float f3) {
        if (f2 < f3 || a(f2, f3)) {
            return true;
        }
        return false;
    }
}
