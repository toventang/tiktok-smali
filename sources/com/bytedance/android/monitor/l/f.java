package com.bytedance.android.monitor.l;

import com.bytedance.covode.number.Covode;
import java.util.UUID;

public final class f {
    static {
        Covode.recordClassIndex(13981);
    }

    public static String a() {
        return System.currentTimeMillis() + "-" + UUID.randomUUID().toString();
    }
}
