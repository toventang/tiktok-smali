package com.bytedance.android.livesdk.b.a;

import com.bytedance.covode.number.Covode;

/* access modifiers changed from: package-private */
public final class c {

    /* renamed from: a  reason: collision with root package name */
    static final boolean[] f14176a = new boolean[0];

    /* renamed from: b  reason: collision with root package name */
    static final int[] f14177b = new int[0];

    /* renamed from: c  reason: collision with root package name */
    static final long[] f14178c = new long[0];

    /* renamed from: d  reason: collision with root package name */
    static final Object[] f14179d = new Object[0];

    static {
        Covode.recordClassIndex(7858);
    }

    static int a(long[] jArr, int i2, long j2) {
        int i3 = i2 - 1;
        int i4 = 0;
        while (i4 <= i3) {
            int i5 = (i4 + i3) >>> 1;
            long j3 = jArr[i5];
            if (j3 < j2) {
                i4 = i5 + 1;
            } else if (j3 <= j2) {
                return i5;
            } else {
                i3 = i5 - 1;
            }
        }
        return i4 ^ -1;
    }
}
