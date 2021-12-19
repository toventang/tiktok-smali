package com.ss.android.ugc.aweme.shortvideo.publish;

import com.bytedance.covode.number.Covode;

public enum m {
    PRIVACY_DIALOG(2),
    POST_FREQUENCY_LIMIT_DIALOG(2),
    SENSITIVE_TITLE_DIALOG(1);
    
    private final int priority;

    public final int getPriority() {
        return this.priority;
    }

    static {
        Covode.recordClassIndex(85211);
    }

    private m(int i2) {
        this.priority = i2;
    }
}
