package com.facebook.imageutils;

import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import java.io.IOException;
import java.io.InputStream;

/* access modifiers changed from: package-private */
public final class f {
    static {
        Covode.recordClassIndex(29235);
    }

    public static int a(InputStream inputStream, int i2, boolean z) {
        int i3;
        MethodCollector.i(2132);
        int i4 = 0;
        for (int i5 = 0; i5 < i2; i5++) {
            int read = inputStream.read();
            if (read != -1) {
                if (z) {
                    i3 = (read & 255) << (i5 * 8);
                } else {
                    i4 <<= 8;
                    i3 = read & 255;
                }
                i4 |= i3;
            } else {
                IOException iOException = new IOException("no more bytes");
                MethodCollector.o(2132);
                throw iOException;
            }
        }
        MethodCollector.o(2132);
        return i4;
    }
}
