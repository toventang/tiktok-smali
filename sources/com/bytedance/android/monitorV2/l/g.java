package com.bytedance.android.monitorV2.l;

import com.bytedance.covode.number.Covode;
import java.util.UUID;

public final class g {
    static {
        Covode.recordClassIndex(14163);
    }

    public static String a() {
        return System.currentTimeMillis() + "-" + UUID.randomUUID().toString();
    }
}
