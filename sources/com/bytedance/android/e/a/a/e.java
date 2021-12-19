package com.bytedance.android.e.a.a;

import com.bytedance.covode.number.Covode;
import java.util.List;

public final class e {
    static {
        Covode.recordClassIndex(3331);
    }

    public static int[] a(List<Integer> list) {
        int[] iArr = new int[list.size()];
        for (int i2 = 0; i2 < list.size(); i2++) {
            iArr[i2] = list.get(i2).intValue();
        }
        return iArr;
    }
}
