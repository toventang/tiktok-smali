package f.a.e.j;

import com.bytedance.covode.number.Covode;
import f.a.h.a;
import java.util.concurrent.atomic.AtomicLong;

public final class d {
    static {
        Covode.recordClassIndex(104863);
    }

    public static long a(long j2, long j3) {
        long j4 = j2 + j3;
        if (j4 < 0) {
            return Long.MAX_VALUE;
        }
        return j4;
    }

    public static long a(AtomicLong atomicLong) {
        long j2;
        long j3;
        do {
            j2 = atomicLong.get();
            if (j2 == Long.MIN_VALUE) {
                return Long.MIN_VALUE;
            }
            if (j2 == Long.MAX_VALUE) {
                return Long.MAX_VALUE;
            }
            j3 = j2 - 1;
            if (j3 < 0) {
                a.a(new IllegalStateException("More produced than requested: ".concat(String.valueOf(j3))));
                j3 = 0;
            }
        } while (!atomicLong.compareAndSet(j2, j3));
        return j3;
    }

    public static long a(AtomicLong atomicLong, long j2) {
        long j3;
        do {
            j3 = atomicLong.get();
            if (j3 == Long.MAX_VALUE) {
                return Long.MAX_VALUE;
            }
        } while (!atomicLong.compareAndSet(j3, a(j3, j2)));
        return j3;
    }

    public static long b(AtomicLong atomicLong, long j2) {
        long j3;
        long j4;
        do {
            j3 = atomicLong.get();
            if (j3 == Long.MAX_VALUE) {
                return Long.MAX_VALUE;
            }
            j4 = j3 - j2;
            if (j4 < 0) {
                a.a(new IllegalStateException("More produced than requested: ".concat(String.valueOf(j4))));
                j4 = 0;
            }
        } while (!atomicLong.compareAndSet(j3, j4));
        return j4;
    }
}
