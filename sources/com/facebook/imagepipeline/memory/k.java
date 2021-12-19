package com.facebook.imagepipeline.memory;

import android.util.SparseIntArray;
import com.bytedance.covode.number.Covode;

public final class k {

    /* renamed from: a  reason: collision with root package name */
    private static final SparseIntArray f48094a = new SparseIntArray(0);

    static {
        Covode.recordClassIndex(29057);
    }

    public static ad a() {
        int i2;
        int min = (int) Math.min(Runtime.getRuntime().maxMemory(), 2147483647L);
        if (min > 16777216) {
            i2 = (min / 4) * 3;
        } else {
            i2 = min / 2;
        }
        return new ad(0, i2, f48094a);
    }
}
