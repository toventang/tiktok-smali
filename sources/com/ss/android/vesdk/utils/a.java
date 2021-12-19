package com.ss.android.vesdk.utils;

import com.bytedance.covode.number.Covode;
import java.util.List;

public final class a {
    static {
        Covode.recordClassIndex(99609);
    }

    public static float[] a(List<Float> list) {
        if (list == null || list.isEmpty()) {
            return new float[0];
        }
        float[] fArr = new float[list.size()];
        for (int i2 = 0; i2 < list.size(); i2++) {
            fArr[i2] = list.get(i2).floatValue();
        }
        return fArr;
    }
}
