package com.ss.android.ugc.aweme.shortvideo.util;

import com.bytedance.covode.number.Covode;
import h.p;

public final class aj {

    /* renamed from: a  reason: collision with root package name */
    public static final aj f132202a = new aj();

    private aj() {
    }

    static {
        Covode.recordClassIndex(86581);
    }

    public static final p<Integer, Integer> a(int i2, int i3, int i4) {
        if (i2 >= i4) {
            return new p<>(0, 0);
        }
        return new p<>(Integer.valueOf(i2), Integer.valueOf(Math.min(i3, i4)));
    }
}
