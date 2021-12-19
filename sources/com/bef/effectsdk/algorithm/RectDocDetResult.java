package com.bef.effectsdk.algorithm;

import com.bytedance.covode.number.Covode;

public class RectDocDetResult {
    private RectDocDetRatio rectDocDetRatio;
    private RectDocDetTargetArea rectDocDetTargetArea;
    private int resultStatus;

    static {
        Covode.recordClassIndex(2867);
    }

    public RectDocDetRatio getRectDocDetRatio() {
        return this.rectDocDetRatio;
    }

    public RectDocDetTargetArea getRectDocDetTargetArea() {
        return this.rectDocDetTargetArea;
    }

    public int getResultStatus() {
        return this.resultStatus;
    }

    public RectDocDetResult() {
        this.resultStatus = -1;
    }

    public RectDocDetResult(RectDocDetTargetArea rectDocDetTargetArea2, RectDocDetRatio rectDocDetRatio2) {
        this.rectDocDetTargetArea = rectDocDetTargetArea2;
        this.rectDocDetRatio = rectDocDetRatio2;
    }
}
