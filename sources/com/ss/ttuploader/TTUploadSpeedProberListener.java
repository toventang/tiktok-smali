package com.ss.ttuploader;

import com.bytedance.covode.number.Covode;

public interface TTUploadSpeedProberListener {
    static {
        Covode.recordClassIndex(101404);
    }

    void onNotify(int i2, long j2);
}
