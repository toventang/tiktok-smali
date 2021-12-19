package com.bytedance.android.live.liveinteract.api;

import com.bytedance.covode.number.Covode;

public enum ao {
    RTC_OFFLINE,
    RTC_ONLINE,
    RTC_STREAMING;

    static {
        Covode.recordClassIndex(5154);
    }
}
