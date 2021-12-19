package com.ss.bduploader;

import com.bytedance.covode.number.Covode;

public interface BDNetworkSpeedTestListener {
    static {
        Covode.recordClassIndex(100653);
    }

    void onSpeedTestContext(int i2, int i3, String str);

    int speedTestCheckNetState(int i2, int i3);
}
