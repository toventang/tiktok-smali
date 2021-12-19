package com.bytedance.android.live.core.performance.a;

import com.bytedance.covode.number.Covode;
import java.io.Closeable;

public final class c {
    static {
        Covode.recordClassIndex(4727);
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
