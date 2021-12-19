package com.ss.android.ugc.aweme.bo;

import com.bytedance.covode.number.Covode;

public final class a {

    /* renamed from: a  reason: collision with root package name */
    public static final a f68737a = new a();

    public static int b(float f2, int i2) {
        return (int) ((f2 * ((float) i2)) / 100.0f);
    }

    private a() {
    }

    static {
        Covode.recordClassIndex(42326);
    }

    public static int a(int i2) {
        if (i2 <= 0) {
            return 0;
        }
        return i2 / 1000;
    }

    private static String b(int i2) {
        if (i2 < 10) {
            return "0".concat(String.valueOf(i2));
        }
        return String.valueOf(i2);
    }

    public final CharSequence a(float f2, int i2) {
        boolean z;
        int b2 = b(f2, i2);
        if (i2 >= 3600) {
            z = true;
        } else {
            z = false;
        }
        return a(b2, z);
    }

    public final String a(int i2, boolean z) {
        if (i2 >= 3600) {
            return b(i2 / 3600) + ':' + a(i2 % 3600, false);
        } else if (z) {
            return "00:" + b(i2 / 60) + ':' + b(i2 % 60);
        } else {
            return b(i2 / 60) + ':' + b(i2 % 60);
        }
    }
}
