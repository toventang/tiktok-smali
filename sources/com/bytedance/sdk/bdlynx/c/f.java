package com.bytedance.sdk.bdlynx.c;

import android.os.Build;
import com.bytedance.covode.number.Covode;
import h.f.b.l;
import h.m.d;
import java.util.Random;
import java.util.concurrent.ThreadLocalRandom;

public final class f {

    /* renamed from: a  reason: collision with root package name */
    public static final f f43682a = new f();

    /* renamed from: b  reason: collision with root package name */
    private static final byte[] f43683b = {48, 49, 50, 51, 52, 53, 54, 55, 56, 57, 97, 98, 99, 100, 101, 102, 103, 104, 105, 106, 107, 108, 109, 110, 111, 112, 113, 114, 115, 116, 117, 118, 119, 120, 121, 122, 65, 66, 67, 68, 69, 70, 71, 72, 73, 74, 75, 76, 77, 78, 79, 80, 81, 82, 83, 84, 85, 86, 87, 88, 89, 90};

    private f() {
    }

    static {
        Covode.recordClassIndex(26734);
    }

    public static String a() {
        Random random;
        if (Build.VERSION.SDK_INT >= 21) {
            random = ThreadLocalRandom.current();
            l.a((Object) random, "");
        } else {
            random = new Random(System.nanoTime());
        }
        long nextLong = random.nextLong();
        long nextLong2 = random.nextLong();
        byte[] bArr = new byte[32];
        a(nextLong, bArr, 20, 12);
        a(nextLong >>> 48, bArr, 16, 4);
        a(nextLong2, bArr, 12, 4);
        a(nextLong2 >>> 16, bArr, 8, 4);
        a(nextLong2 >>> 32, bArr, 0, 8);
        return new String(bArr, d.f158808a);
    }

    private static void a(long j2, byte[] bArr, int i2, int i3) {
        int i4 = i3 + i2;
        do {
            i4--;
            bArr[i4] = f43683b[((int) j2) & 15];
            j2 >>>= 4;
        } while (i4 > i2);
    }
}
