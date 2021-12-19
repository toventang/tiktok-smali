package com.ss.android.medialib.model;

import com.bytedance.covode.number.Covode;

public class SceneDetectItem {
    float prob;
    boolean satisfied;

    static {
        Covode.recordClassIndex(36911);
    }

    public float getProb() {
        return this.prob;
    }

    public boolean isSatisfied() {
        return this.satisfied;
    }

    public void setProb(float f2) {
        this.prob = f2;
    }

    public void setSatisfied(boolean z) {
        this.satisfied = z;
    }
}
