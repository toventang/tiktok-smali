package com.bytedance.ttnet;

import android.text.TextUtils;
import com.bytedance.covode.number.Covode;

public final class b {
    static {
        Covode.recordClassIndex(27244);
    }

    public static String a() {
        String c2 = TTNetInit.getTTNetDepend().c();
        if (!TextUtils.isEmpty(c2)) {
            return c2;
        }
        throw new IllegalArgumentException("hostSuffix is not init !!!");
    }
}
