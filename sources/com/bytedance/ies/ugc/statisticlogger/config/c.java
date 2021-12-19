package com.bytedance.ies.ugc.statisticlogger.config;

import com.bytedance.covode.number.Covode;

public enum c {
    Local,
    Remote;

    static {
        Covode.recordClassIndex(21160);
    }
}
