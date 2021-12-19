package com.bytedance.ies.xbridge.base.runtime.depend;

import com.bytedance.covode.number.Covode;

public interface ShowActionSheetListener {
    static {
        Covode.recordClassIndex(21437);
    }

    void onDismiss();

    void onSelect(int i2);
}
