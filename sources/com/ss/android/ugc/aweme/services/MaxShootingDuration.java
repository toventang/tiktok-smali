package com.ss.android.ugc.aweme.services;

import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.aweme.property.ck;
import com.ss.android.ugc.aweme.shortvideo.db;

public final class MaxShootingDuration {
    public static final MaxShootingDuration INSTANCE = new MaxShootingDuration();

    private MaxShootingDuration() {
    }

    static {
        Covode.recordClassIndex(79529);
    }

    public final long getLength() {
        if (db.a() != 0) {
            return 180000;
        }
        return ck.a();
    }
}
