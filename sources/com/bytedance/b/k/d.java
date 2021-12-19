package com.bytedance.b.k;

import com.bytedance.covode.number.Covode;
import java.io.Closeable;

public final class d {
    static {
        Covode.recordClassIndex(15287);
    }

    public static void a(Closeable closeable) {
        if (closeable != null) {
            try {
                closeable.close();
            } catch (Throwable unused) {
            }
        }
    }

    public static void b(Closeable closeable) {
        if (closeable != null) {
            try {
                closeable.close();
            } catch (Throwable unused) {
            }
        }
    }
}
