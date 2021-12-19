package com.facebook.imagepipeline.n;

import com.bytedance.covode.number.Covode;
import com.facebook.imagepipeline.common.d;
import com.facebook.imagepipeline.j.e;

public final class bd {
    static {
        Covode.recordClassIndex(29145);
    }

    public static boolean a(e eVar, d dVar) {
        if (eVar == null) {
            return false;
        }
        int d2 = eVar.d();
        if (d2 == 90 || d2 == 270) {
            return a(eVar.g(), eVar.f(), dVar);
        }
        return a(eVar.f(), eVar.g(), dVar);
    }

    public static boolean a(int i2, int i3, d dVar) {
        if (dVar == null) {
            if (((float) ((int) (((float) i2) * 1.3333334f))) < 2048.0f || ((int) (((float) i3) * 1.3333334f)) < 2048) {
                return false;
            }
            return true;
        } else if (((int) (((float) i2) * 1.3333334f)) < dVar.f47747a || ((int) (((float) i3) * 1.3333334f)) < dVar.f47748b) {
            return false;
        } else {
            return true;
        }
    }
}
