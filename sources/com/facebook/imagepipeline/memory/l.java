package com.facebook.imagepipeline.memory;

import android.util.SparseIntArray;
import com.bytedance.covode.number.Covode;

public final class l {

    /* renamed from: a  reason: collision with root package name */
    public static final int f48095a = Runtime.getRuntime().availableProcessors();

    static {
        Covode.recordClassIndex(29058);
    }

    public static SparseIntArray a(int i2) {
        SparseIntArray sparseIntArray = new SparseIntArray();
        int i3 = 131072;
        do {
            sparseIntArray.put(i3, i2);
            i3 *= 2;
        } while (i3 <= 4194304);
        return sparseIntArray;
    }
}
