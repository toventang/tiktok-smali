package com.bytedance.lottie;

import androidx.core.d.g;
import com.bytedance.covode.number.Covode;
import java.util.HashSet;
import java.util.Set;

public final class e {

    /* renamed from: a  reason: collision with root package name */
    private static final Set<String> f40666a = new HashSet();

    /* renamed from: b  reason: collision with root package name */
    private static boolean f40667b = false;

    /* renamed from: c  reason: collision with root package name */
    private static String[] f40668c;

    /* renamed from: d  reason: collision with root package name */
    private static long[] f40669d;

    /* renamed from: e  reason: collision with root package name */
    private static int f40670e = 0;

    /* renamed from: f  reason: collision with root package name */
    private static int f40671f = 0;

    static {
        Covode.recordClassIndex(24941);
    }

    public static void a(String str) {
        Set<String> set = f40666a;
        if (!set.contains(str)) {
            set.add(str);
        }
    }

    public static void b(String str) {
        if (f40667b) {
            int i2 = f40670e;
            if (i2 == 20) {
                f40671f++;
                return;
            }
            f40668c[i2] = str;
            f40669d[i2] = System.nanoTime();
            g.a(str);
            f40670e++;
        }
    }

    public static float c(String str) {
        int i2 = f40671f;
        if (i2 > 0) {
            f40671f = i2 - 1;
            return 0.0f;
        } else if (!f40667b) {
            return 0.0f;
        } else {
            int i3 = f40670e - 1;
            f40670e = i3;
            if (i3 == -1) {
                throw new IllegalStateException("Can't end trace section. There are none.");
            } else if (str.equals(f40668c[i3])) {
                g.a();
                return ((float) (System.nanoTime() - f40669d[f40670e])) / 1000000.0f;
            } else {
                throw new IllegalStateException("Unbalanced trace call " + str + ". Expected " + f40668c[f40670e] + ".");
            }
        }
    }
}
