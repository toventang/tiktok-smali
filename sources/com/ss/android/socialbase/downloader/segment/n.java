package com.ss.android.socialbase.downloader.segment;

import com.bytedance.covode.number.Covode;
import java.util.Iterator;
import java.util.List;

public final class n {
    static {
        Covode.recordClassIndex(37571);
    }

    public static long a(List<i> list) {
        long j2;
        long j3;
        Iterator<i> it = list.iterator();
        long j4 = 0;
        loop0:
        while (true) {
            j2 = -1;
            j3 = -1;
            while (true) {
                if (!it.hasNext()) {
                    break loop0;
                }
                i next = it.next();
                if (j2 == -1) {
                    if (next.a() > 0) {
                        j2 = next.f60927a;
                        j3 = next.c();
                    }
                } else if (next.f60927a > j3) {
                    j4 += j3 - j2;
                    if (next.a() > 0) {
                        j2 = next.f60927a;
                        j3 = next.c();
                    }
                } else if (next.c() > j3) {
                    j3 = next.c();
                }
            }
        }
        if (j2 < 0 || j3 <= j2) {
            return j4;
        }
        return j4 + (j3 - j2);
    }
}
