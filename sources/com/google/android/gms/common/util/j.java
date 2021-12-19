package com.google.android.gms.common.util;

import com.bytedance.covode.number.Covode;
import java.io.Closeable;
import java.io.IOException;

public final class j {
    static {
        Covode.recordClassIndex(31472);
    }

    public static void a(Closeable closeable) {
        if (closeable != null) {
            try {
                closeable.close();
            } catch (IOException unused) {
            }
        }
    }
}
