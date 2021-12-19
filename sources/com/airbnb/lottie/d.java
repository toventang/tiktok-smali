package com.airbnb.lottie;

import androidx.core.d.g;
import com.bytedance.covode.number.Covode;
import java.util.HashSet;
import java.util.Set;

public final class d {

    /* renamed from: a  reason: collision with root package name */
    private static final Set<String> f5313a = new HashSet();

    /* renamed from: b  reason: collision with root package name */
    private static boolean f5314b = false;

    /* renamed from: c  reason: collision with root package name */
    private static String[] f5315c;

    /* renamed from: d  reason: collision with root package name */
    private static long[] f5316d;

    /* renamed from: e  reason: collision with root package name */
    private static int f5317e = 0;

    /* renamed from: f  reason: collision with root package name */
    private static int f5318f = 0;

    static {
        Covode.recordClassIndex(2236);
    }

    public static void a(String str) {
        Set<String> set = f5313a;
        if (!set.contains(str)) {
            set.add(str);
        }
    }

    public static void b(String str) {
        if (f5314b) {
            int i2 = f5317e;
            if (i2 == 20) {
                f5318f++;
                return;
            }
            f5315c[i2] = str;
            f5316d[i2] = System.nanoTime();
            g.a(str);
            f5317e++;
        }
    }

    public static float c(String str) {
        int i2 = f5318f;
        if (i2 > 0) {
            f5318f = i2 - 1;
            return 0.0f;
        } else if (!f5314b) {
            return 0.0f;
        } else {
            int i3 = f5317e - 1;
            f5317e = i3;
            if (i3 == -1) {
                throw new IllegalStateException("Can't end trace section. There are none.");
            } else if (str.equals(f5315c[i3])) {
                g.a();
                return ((float) (System.nanoTime() - f5316d[f5317e])) / 1000000.0f;
            } else {
                throw new IllegalStateException("Unbalanced trace call " + str + ". Expected " + f5315c[f5317e] + ".");
            }
        }
    }
}
