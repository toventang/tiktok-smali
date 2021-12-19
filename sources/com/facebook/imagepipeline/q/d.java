package com.facebook.imagepipeline.q;

import com.bytedance.covode.number.Covode;
import com.facebook.common.d.e;

public final class d {

    /* renamed from: a  reason: collision with root package name */
    public static final e<Integer> f48460a = e.of(2, 7, 4, 5);

    static {
        Covode.recordClassIndex(29221);
    }

    private static int a(com.facebook.imagepipeline.j.e eVar) {
        int d2 = eVar.d();
        if (d2 == 90 || d2 == 180 || d2 == 270) {
            return eVar.d();
        }
        return 0;
    }

    public static int a(com.facebook.imagepipeline.common.e eVar, com.facebook.imagepipeline.j.e eVar2) {
        if (!eVar.b()) {
            return 0;
        }
        int a2 = a(eVar2);
        if (eVar.a()) {
            return a2;
        }
        return (a2 + eVar.c()) % 360;
    }

    public static int b(com.facebook.imagepipeline.common.e eVar, com.facebook.imagepipeline.j.e eVar2) {
        int e2 = eVar2.e();
        e<Integer> eVar3 = f48460a;
        int indexOf = eVar3.indexOf(Integer.valueOf(e2));
        if (indexOf >= 0) {
            int i2 = 0;
            if (!eVar.a()) {
                i2 = eVar.c();
            }
            return eVar3.get((indexOf + (i2 / 90)) % eVar3.size()).intValue();
        }
        throw new IllegalArgumentException("Only accepts inverted exif orientations");
    }

    private static float a(com.facebook.imagepipeline.common.d dVar, int i2, int i3) {
        if (dVar == null) {
            return 1.0f;
        }
        float f2 = (float) i2;
        float f3 = (float) i3;
        float max = Math.max(((float) dVar.f47747a) / f2, ((float) dVar.f47748b) / f3);
        if (f2 * max > dVar.f47749c) {
            max = dVar.f47749c / f2;
        }
        if (f3 * max > dVar.f47749c) {
            return dVar.f47749c / f3;
        }
        return max;
    }

    public static int a(com.facebook.imagepipeline.common.e eVar, com.facebook.imagepipeline.common.d dVar, com.facebook.imagepipeline.j.e eVar2, boolean z) {
        int i2;
        int i3;
        int i4;
        if (!z || dVar == null) {
            return 8;
        }
        int a2 = a(eVar, eVar2);
        if (f48460a.contains(Integer.valueOf(eVar2.e()))) {
            i2 = b(eVar, eVar2);
        } else {
            i2 = 0;
        }
        if (a2 == 90 || a2 == 270 || i2 == 5 || i2 == 7) {
            i3 = eVar2.g();
            i4 = eVar2.f();
        } else {
            i3 = eVar2.f();
            i4 = eVar2.g();
        }
        int a3 = (int) (dVar.f47750d + (a(dVar, i3, i4) * 8.0f));
        if (a3 > 8) {
            return 8;
        }
        if (a3 <= 0) {
            return 1;
        }
        return a3;
    }
}
