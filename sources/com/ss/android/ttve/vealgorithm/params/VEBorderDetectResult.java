package com.ss.android.ttve.vealgorithm.params;

import com.bytedance.covode.number.Covode;

public class VEBorderDetectResult extends VEAlgorithmResult {
    public int frameHeight;
    public int frameWidth;
    public int x1;
    public int x2;
    public int y1;
    public int y2;

    static {
        Covode.recordClassIndex(37788);
    }

    public String toString() {
        return "VEBorderDetectResult{x1=" + this.x1 + ", y1=" + this.y1 + ", x2=" + this.x2 + ", y2=" + this.y2 + ", frameWidth=" + this.frameWidth + ", frameHeight=" + this.frameHeight + '}';
    }

    public VEBorderDetectResult(int i2, int i3, int i4, int i5, int i6, int i7) {
        this.type = VEAlgorithmType.VE_ALGORITHM_TYPE_BORDER_DETECT;
        this.x1 = i2;
        this.y1 = i3;
        this.x2 = i4;
        this.y2 = i5;
        this.frameWidth = i6;
        this.frameHeight = i7;
    }
}
