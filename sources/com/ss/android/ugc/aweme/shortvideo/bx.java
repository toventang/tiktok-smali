package com.ss.android.ugc.aweme.shortvideo;

import com.bytedance.covode.number.Covode;
import h.f.b.l;

public final class bx {

    /* renamed from: a  reason: collision with root package name */
    private final ShortVideoContext f125062a;

    static {
        Covode.recordClassIndex(82159);
    }

    public bx(ShortVideoContext shortVideoContext) {
        l.d(shortVideoContext, "");
        this.f125062a = shortVideoContext;
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
