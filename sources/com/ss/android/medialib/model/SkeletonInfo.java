package com.ss.android.medialib.model;

import com.bytedance.covode.number.Covode;

public class SkeletonInfo {
    private Skeleton[] info;

    static {
        Covode.recordClassIndex(36914);
    }

    public Skeleton[] getInfo() {
        return this.info;
    }

    public void setInfo(Skeleton[] skeletonArr) {
        this.info = skeletonArr;
    }
}
