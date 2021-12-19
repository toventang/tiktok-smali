package com.ss.bduploader;

import com.bytedance.covode.number.Covode;

public interface BDImageXUploaderListener {
    static {
        Covode.recordClassIndex(100644);
    }

    int imageXUploadCheckNetState(int i2, int i3);

    void onLog(int i2, int i3, String str);

    void onNotify(int i2, long j2, BDImageXInfo bDImageXInfo);
}
