package com.bef.effectsdk.algorithm;

import com.bytedance.covode.number.Covode;

public class RectDocDetRatio {
    private int heightVal;
    private float ratio;
    private int widthVal;

    static {
        Covode.recordClassIndex(2866);
    }

    public int getHeightVal() {
        return this.heightVal;
    }

    public float getRatio() {
        return this.ratio;
    }

    public int getWidthVal() {
        return this.widthVal;
    }

    public RectDocDetRatio(float f2, int i2, int i3) {
        this.ratio = f2;
        this.widthVal = i2;
        this.heightVal = i3;
    }
}
