package com.facebook.common.k;

import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.facebook.common.d.i;
import java.io.InputStream;

public final class e {
    static {
        Covode.recordClassIndex(28679);
    }

    public static long a(InputStream inputStream, long j2) {
        boolean z;
        MethodCollector.i(4285);
        i.a(inputStream);
        if (j2 >= 0) {
            z = true;
        } else {
            z = false;
        }
        i.a(z);
        long j3 = j2;
        while (j3 > 0) {
            long skip = inputStream.skip(j3);
            if (skip <= 0) {
                if (inputStream.read() != -1) {
                    skip = 1;
                } else {
                    long j4 = j2 - j3;
                    MethodCollector.o(4285);
                    return j4;
                }
            }
            j3 -= skip;
        }
        MethodCollector.o(4285);
        return j2;
    }
}
