package com.ss.android.ugc.aweme.notice.repo.list.bean;

import com.bytedance.covode.number.Covode;

public enum h {
    NOTICE_ACTION_UNKNOWN(0),
    NOTICE_ACTION_CLICK(1);
    
    private final int value;

    public final int getValue() {
        return this.value;
    }

    static {
        Covode.recordClassIndex(72552);
    }

    private h(int i2) {
        this.value = i2;
    }
}
