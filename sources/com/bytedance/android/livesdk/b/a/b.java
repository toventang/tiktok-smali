package com.bytedance.android.livesdk.b.a;

import com.bytedance.covode.number.Covode;

public final class b {

    /* renamed from: a  reason: collision with root package name */
    private static Object[] f14174a = new Object[0];

    /* renamed from: b  reason: collision with root package name */
    private static Object[] f14175b = new Object[73];

    static {
        Covode.recordClassIndex(7857);
    }

    public static int a(int i2) {
        int i3 = i2 * 8;
        int i4 = 4;
        while (true) {
            int i5 = (1 << i4) - 12;
            if (i3 > i5) {
                i4++;
                if (i4 >= 32) {
                    break;
                }
            } else {
                i3 = i5;
                break;
            }
        }
        return i3 / 8;
    }
}
