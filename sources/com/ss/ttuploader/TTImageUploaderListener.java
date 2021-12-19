package com.ss.ttuploader;

import com.bytedance.covode.number.Covode;

public interface TTImageUploaderListener {
    static {
        Covode.recordClassIndex(101389);
    }

    void onNotify(int i2, long j2, TTImageInfo tTImageInfo);
}
