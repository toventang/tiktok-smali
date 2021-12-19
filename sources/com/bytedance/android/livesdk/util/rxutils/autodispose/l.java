package com.bytedance.android.livesdk.util.rxutils.autodispose;

import com.bytedance.covode.number.Covode;
import java.util.concurrent.atomic.AtomicLong;

final class l {
    static {
        Covode.recordClassIndex(13073);
    }

    static long a(AtomicLong atomicLong, long j2) {
        long j3;
        long j4;
        do {
            j3 = atomicLong.get();
            j4 = Long.MAX_VALUE;
            if (j3 == Long.MAX_VALUE) {
                return Long.MAX_VALUE;
            }
            long j5 = j3 + j2;
            if (j5 >= 0) {
                j4 = j5;
            }
        } while (!atomicLong.compareAndSet(j3, j4));
        return j3;
    }
}
