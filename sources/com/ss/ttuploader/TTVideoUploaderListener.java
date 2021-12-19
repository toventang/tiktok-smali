package com.ss.ttuploader;

import com.bytedance.covode.number.Covode;

public interface TTVideoUploaderListener {
    static {
        Covode.recordClassIndex(101411);
    }

    String getStringFromExtern(int i2);

    void onLog(int i2, int i3, String str);

    void onNotify(int i2, long j2, TTVideoInfo tTVideoInfo);

    void onUploadVideoStage(int i2, long j2);

    int videoUploadCheckNetState(int i2, int i3);
}
