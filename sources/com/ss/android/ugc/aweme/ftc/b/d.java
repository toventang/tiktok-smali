package com.ss.android.ugc.aweme.ftc.b;

import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.aweme.shortvideo.bw;

public final class d {
    static {
        Covode.recordClassIndex(61927);
    }

    public static bw b(long j2, long j3) {
        return a(j2, j3);
    }

    public static bw a(long j2, long j3) {
        if (j3 == 0) {
            return bw.NONE;
        }
        long min = Math.min(j2, j3);
        if (min != j3 || min >= j2) {
            return bw.NONE;
        }
        return bw.MUSIC;
    }
}
