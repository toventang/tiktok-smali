package com.ss.bduploader;

import com.bytedance.covode.number.Covode;

public interface BDVideoUploaderListener {
    static {
        Covode.recordClassIndex(100668);
    }

    String getStringFromExtern(int i2);

    void onLog(int i2, int i3, String str);

    void onNotify(int i2, long j2, BDVideoInfo bDVideoInfo);

    void onUploadVideoStage(int i2, long j2);

    int videoUploadCheckNetState(int i2, int i3);
}
