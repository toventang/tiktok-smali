package com.samsung.sdk.sperf;

import com.bytedance.covode.number.Covode;

public interface SPerfListener {
    static {
        Covode.recordClassIndex(35506);
    }

    void onHighTempWarning(int i2);

    void onReleasedByTimeout();
}
