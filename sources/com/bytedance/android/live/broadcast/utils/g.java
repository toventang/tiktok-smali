package com.bytedance.android.live.broadcast.utils;

import com.bytedance.covode.number.Covode;

public final class g {

    /* renamed from: a  reason: collision with root package name */
    public static final g f8643a = new g();

    private g() {
    }

    static {
        Covode.recordClassIndex(4420);
    }

    public static int a(int i2, int i3) {
        if (i2 == 0 || i3 == 0) {
            return 1;
        }
        while (true) {
            int i4 = i2 % i3;
            if (i4 == 0) {
                return i3;
            }
            i3 = i4;
            i2 = i3;
        }
    }
}
