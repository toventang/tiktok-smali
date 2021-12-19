package com.ss.android.vesdk;

import com.bytedance.covode.number.Covode;

public enum af {
    TAP,
    SWIPE,
    PINCH,
    LONG_TAP,
    DRAG,
    DROP,
    DOUBLE_CLICK,
    ANY_SUPPORTED;

    static {
        Covode.recordClassIndex(99265);
    }
}
