package com.ss.android.medialib.model;

import com.bytedance.covode.number.Covode;

public class FaceAttributeInfo {
    FaceAttribute[] info;

    static {
        Covode.recordClassIndex(36904);
    }

    public FaceAttribute[] getInfo() {
        return this.info;
    }

    public void setInfo(FaceAttribute[] faceAttributeArr) {
        this.info = faceAttributeArr;
    }
}
