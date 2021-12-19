package com.ss.android.medialib.model;

import com.bytedance.covode.number.Covode;

public class FaceDetectInfo {
    FaceDetect[] info;

    static {
        Covode.recordClassIndex(36908);
    }

    public FaceDetect[] getInfo() {
        return this.info;
    }

    public void setInfo(FaceDetect[] faceDetectArr) {
        this.info = faceDetectArr;
    }
}
