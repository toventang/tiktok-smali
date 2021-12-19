package com.bytedance.android.live.broadcast.api.blockword.model;

import com.bytedance.android.livesdk.model.Extra;
import com.bytedance.covode.number.Covode;
import com.google.gson.a.c;

public class BlockWordGetExtra extends Extra {
    @c(a = "max_count")
    public long maxCount = 50;
    @c(a = "max_length")
    public long maxLength = 30;

    static {
        Covode.recordClassIndex(3696);
    }
}
