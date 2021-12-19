package com.ss.ttuploader;

import com.bytedance.covode.number.Covode;

public interface TTImageXUploaderListener {
    static {
        Covode.recordClassIndex(101393);
    }

    void onNotify(int i2, long j2, TTImageXInfo tTImageXInfo);
}
