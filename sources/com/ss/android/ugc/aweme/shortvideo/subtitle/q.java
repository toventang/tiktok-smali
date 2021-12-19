package com.ss.android.ugc.aweme.shortvideo.subtitle;

import com.bytedance.covode.number.Covode;

public final class q extends RuntimeException {
    private final int errorCode;
    private final int step;

    static {
        Covode.recordClassIndex(85865);
    }

    public final int getErrorCode() {
        return this.errorCode;
    }

    public final int getStep() {
        return this.step;
    }

    public q(int i2, int i3) {
        this.step = i2;
        this.errorCode = i3;
    }
}
