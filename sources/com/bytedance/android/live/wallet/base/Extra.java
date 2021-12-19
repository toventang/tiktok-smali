package com.bytedance.android.live.wallet.base;

import com.bytedance.covode.number.Covode;
import com.google.gson.a.c;

public class Extra {
    @c(a = "has_more")
    public boolean hasMore;
    @c(a = "now")
    public long now;

    static {
        Covode.recordClassIndex(7251);
    }
}
