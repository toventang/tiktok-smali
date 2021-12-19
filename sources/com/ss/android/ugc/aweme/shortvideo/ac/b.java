package com.ss.android.ugc.aweme.shortvideo.ac;

import com.bytedance.covode.number.Covode;
import com.bytedance.ugc.glue.monitor.UGCMonitor;

public final class b {
    static {
        Covode.recordClassIndex(82045);
    }

    public static final String a(int i2, int i3) {
        if (i2 != 0) {
            if (i2 == 1) {
                if (i3 == 0) {
                    return "none";
                }
            } else if (i2 != 0) {
                if (i2 > 1 && i3 == 0) {
                    return "video";
                }
                if (i2 <= 0) {
                    return "";
                }
            }
            return i3 > 0 ? "mix" : "";
        } else if (i3 == 1) {
            return "none";
        }
        return i3 > 1 ? UGCMonitor.TYPE_PHOTO : "";
    }
}
