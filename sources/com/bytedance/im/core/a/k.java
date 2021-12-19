package com.bytedance.im.core.a;

import com.bytedance.covode.number.Covode;
import com.google.gson.a.c;
import java.io.Serializable;

public class k implements Serializable {
    public static int FALLBACK_CLEAR = 1;
    public static int FALLBACK_NORMAL;
    @c(a = "index_v2_base")
    public long baseIndexV2 = 1;
    @c(a = "enable")
    public int enable;
    @c(a = "fallback_strategy")
    public int fallbackStrategy = FALLBACK_NORMAL;

    static {
        Covode.recordClassIndex(22622);
    }

    public String toString() {
        return "RecentLinkConfig{enable=" + this.enable + ", baseIndexV2=" + this.baseIndexV2 + ", fallbackStrategy=" + this.fallbackStrategy + "}";
    }
}
