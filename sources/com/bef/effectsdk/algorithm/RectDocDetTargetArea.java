package com.bef.effectsdk.algorithm;

import com.bytedance.covode.number.Covode;

public class RectDocDetTargetArea {
    private float bottomLeftX;
    private float bottomLeftY;
    private float bottomRightX;
    private float bottomRightY;
    private float topLeftX;
    private float topLeftY;
    private float topRightX;
    private float topRightY;

    static {
        Covode.recordClassIndex(2868);
    }

    public float getBottomLeftX() {
        return this.bottomLeftX;
    }

    public float getBottomLeftY() {
        return this.bottomLeftY;
    }

    public float getBottomRightX() {
        return this.bottomRightX;
    }

    public float getBottomRightY() {
        return this.bottomRightY;
    }

    public float getTopLeftX() {
        return this.topLeftX;
    }

    public float getTopLeftY() {
        return this.topLeftY;
    }

    public float getTopRightX() {
        return this.topRightX;
    }

    public float getTopRightY() {
        return this.topRightY;
    }

    public RectDocDetTargetArea(float f2, float f3, float f4, float f5, float f6, float f7, float f8, float f9) {
        this.topLeftX = f2;
        this.topLeftY = f3;
        this.topRightX = f4;
        this.topRightY = f5;
        this.bottomLeftX = f6;
        this.bottomLeftY = f7;
        this.bottomRightX = f8;
        this.bottomRightY = f9;
    }
}
