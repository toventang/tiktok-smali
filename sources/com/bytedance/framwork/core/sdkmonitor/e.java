package com.bytedance.framwork.core.sdkmonitor;

import com.bytedance.covode.number.Covode;
import java.io.Closeable;

public final class e {
    static {
        Covode.recordClassIndex(17190);
    }

    public static void a(Closeable closeable) {
        if (closeable != null) {
            try {
                closeable.close();
            } catch (Throwable unused) {
            }
        }
    }
}
