package org.greenrobot.eventbus;

import com.bytedance.covode.number.Covode;

public enum ThreadMode {
    POSTING,
    MAIN,
    MAIN_ORDERED,
    BACKGROUND,
    ASYNC;

    static {
        Covode.recordClassIndex(106466);
    }
}
