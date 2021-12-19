package com.ss.android.ugc.aweme.download.component_api;

import com.bytedance.covode.number.Covode;

public enum c {
    IMAGE,
    VIDEO,
    ZIP,
    DEFAULT;

    static {
        Covode.recordClassIndex(51800);
    }
}
