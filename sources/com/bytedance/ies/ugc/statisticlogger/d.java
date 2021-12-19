package com.bytedance.ies.ugc.statisticlogger;

import com.bytedance.covode.number.Covode;

public enum d {
    Start,
    End,
    LogSessionBatch;

    static {
        Covode.recordClassIndex(21163);
    }
}
