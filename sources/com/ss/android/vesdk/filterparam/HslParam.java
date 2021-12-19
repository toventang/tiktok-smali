package com.ss.android.vesdk.filterparam;

import com.bytedance.covode.number.Covode;

public class HslParam {
    public int colorType;
    public int[] hslValue = {0, 0, 0};

    static {
        Covode.recordClassIndex(99447);
    }

    public int getColorType() {
        return this.colorType;
    }

    public int[] getHslValue() {
        return this.hslValue;
    }

    public void setColorType(int i2) {
        this.colorType = i2;
    }

    public void setHsl(int[] iArr) {
        this.hslValue = iArr;
    }
}
