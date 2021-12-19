package com.bytedance.vcloud.abrmodule;

import com.bytedance.covode.number.Covode;

public interface IABRInfoListener {
    static {
        Covode.recordClassIndex(28008);
    }

    void onInfo(int i2, int i3);
}
