package com.facebook.imagepipeline.n;

import com.bytedance.covode.number.Covode;
import com.facebook.common.d.i;
import com.facebook.common.e.a;
import com.facebook.h.b;
import com.facebook.imagepipeline.common.d;
import com.facebook.imagepipeline.common.e;

public final class q {
    static {
        Covode.recordClassIndex(29174);
    }

    private static int a(float f2) {
        if (f2 > 0.6666667f) {
            return 1;
        }
        int i2 = 2;
        while (true) {
            double d2 = (double) i2;
            double pow = Math.pow(d2, 2.0d);
            Double.isNaN(d2);
            Double.isNaN(d2);
            if ((1.0d / d2) + ((1.0d / (pow - d2)) * 0.3333333432674408d) <= ((double) f2)) {
                return i2 - 1;
            }
            i2++;
        }
    }

    private static int b(float f2) {
        if (f2 > 0.6666667f) {
            return 1;
        }
        int i2 = 2;
        while (true) {
            int i3 = i2 * 2;
            double d2 = (double) i3;
            Double.isNaN(d2);
            double d3 = 1.0d / d2;
            if (d3 + (0.3333333432674408d * d3) <= ((double) f2)) {
                return i2;
            }
            i2 = i3;
        }
    }

    private static int a(e eVar, com.facebook.imagepipeline.j.e eVar2) {
        boolean a2 = eVar.a();
        boolean z = false;
        if (!a2) {
            return 0;
        }
        int d2 = eVar2.d();
        if (d2 == 0 || d2 == 90 || d2 == 180 || d2 == 270) {
            z = true;
        }
        i.a(z);
        return d2;
    }

    private static float a(e eVar, d dVar, com.facebook.imagepipeline.j.e eVar2) {
        int i2;
        int i3;
        i.a(com.facebook.imagepipeline.j.e.c(eVar2));
        if (dVar == null || dVar.f47748b <= 0 || dVar.f47747a <= 0 || eVar2.f() == 0 || eVar2.g() == 0) {
            return 1.0f;
        }
        int a2 = a(eVar, eVar2);
        if (a2 == 90 || a2 == 270) {
            i2 = eVar2.g();
            i3 = eVar2.f();
        } else {
            i2 = eVar2.f();
            i3 = eVar2.g();
        }
        float f2 = ((float) dVar.f47747a) / ((float) i2);
        float f3 = ((float) dVar.f47748b) / ((float) i3);
        float max = Math.max(f2, f3);
        a.a("DownsampleUtil", "Downsample - Specified size: %dx%d, image size: %dx%d ratio: %.1f x %.1f, ratio: %.3f", Integer.valueOf(dVar.f47747a), Integer.valueOf(dVar.f47748b), Integer.valueOf(i2), Integer.valueOf(i3), Float.valueOf(f2), Float.valueOf(f3), Float.valueOf(max));
        return max;
    }

    public static int a(e eVar, d dVar, com.facebook.imagepipeline.j.e eVar2, int i2) {
        int a2;
        float f2;
        if (!com.facebook.imagepipeline.j.e.c(eVar2)) {
            return 1;
        }
        float a3 = a(eVar, dVar, eVar2);
        if (eVar2.c() == b.f47621a) {
            a2 = b(a3);
        } else {
            a2 = a(a3);
        }
        int max = Math.max(eVar2.g(), eVar2.f());
        if (dVar != null) {
            f2 = dVar.f47749c;
        } else {
            f2 = (float) i2;
        }
        while (((float) (max / a2)) > f2) {
            if (eVar2.c() == b.f47621a) {
                a2 *= 2;
            } else {
                a2++;
            }
        }
        return a2;
    }
}
