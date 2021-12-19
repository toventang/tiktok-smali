package com.ss.android.ugc.aweme.shortvideo.mvtemplate.gesturelayout.b;

import android.graphics.Matrix;
import com.bytedance.covode.number.Covode;
import h.f.b.l;

public final class e {

    /* renamed from: a  reason: collision with root package name */
    public static final e f129280a = new e();

    private e() {
    }

    static {
        Covode.recordClassIndex(84854);
    }

    public static float a(Matrix matrix) {
        l.d(matrix, "");
        float[] fArr = new float[9];
        matrix.getValues(fArr);
        return fArr[0];
    }
}
