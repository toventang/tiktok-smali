package com.ss.android.ugc.aweme.comment.i;

import com.bytedance.covode.number.Covode;
import com.bytedance.ugc.glue.monitor.UGCMonitor;

public abstract /* synthetic */ class e {
    static {
        Covode.recordClassIndex(44240);
    }

    public static String a(int i2) {
        return (i2 == 1 || i2 == 2) ? "like" : i2 != 3 ? UGCMonitor.EVENT_COMMENT : "view";
    }
}
