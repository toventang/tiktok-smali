package com.ss.android.vesdk.audio;

import com.bytedance.covode.number.Covode;

public interface h {
    static {
        Covode.recordClassIndex(99298);
    }

    void onError(int i2, int i3, String str);

    void onInfo(int i2, int i3, double d2, Object obj);

    void onReceive(j jVar);
}
