package com.bytedance.common.utility.collection;

import com.bytedance.covode.number.Covode;
import java.util.List;

public final class a {
    static {
        Covode.recordClassIndex(15891);
    }

    public static long[] a(List<Long> list) {
        long[] jArr = new long[list.size()];
        for (int i2 = 0; i2 < list.size(); i2++) {
            jArr[i2] = list.get(i2).longValue();
        }
        return jArr;
    }
}
