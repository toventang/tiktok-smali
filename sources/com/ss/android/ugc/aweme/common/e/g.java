package com.ss.android.ugc.aweme.common.e;

import com.bytedance.covode.number.Covode;

public final class g extends RuntimeException {
    public final int insertPosition;
    public final int listSize;

    static {
        Covode.recordClassIndex(47169);
    }

    public g(int i2, int i3) {
        super("decide to insert position:" + i2 + ",but listSize limit:" + i3 + ".");
        this.insertPosition = i2;
        this.listSize = i3;
    }
}
