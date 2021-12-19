package com.ss.android.ugc.aweme.canvas;

import com.bytedance.covode.number.Covode;
import java.io.Serializable;

public final class PhotoCanvasTransformFilterParam implements Serializable {
    private int borderColor = -1;
    private int borderWidthPx;
    private int clipIndex = -1;
    private int degree;
    private float scaleFactor = 1.0f;
    private float transX;
    private float transY;

    static {
        Covode.recordClassIndex(42948);
    }

    public final int getBorderColor() {
        return this.borderColor;
    }

    public final int getBorderWidthPx() {
        return this.borderWidthPx;
    }

    public final int getClipIndex() {
        return this.clipIndex;
    }

    public final int getDegree() {
        return this.degree;
    }

    public final float getScaleFactor() {
        return this.scaleFactor;
    }

    public final float getTransX() {
        return this.transX;
    }

    public final float getTransY() {
        return this.transY;
    }

    public final boolean isValid() {
        if (this.clipIndex != -1) {
            return true;
        }
        return false;
    }

    public final void setBorderColor(int i2) {
        this.borderColor = i2;
    }

    public final void setBorderWidthPx(int i2) {
        this.borderWidthPx = i2;
    }

    public final void setClipIndex(int i2) {
        this.clipIndex = i2;
    }

    public final void setDegree(int i2) {
        this.degree = i2;
    }

    public final void setScaleFactor(float f2) {
        this.scaleFactor = f2;
    }

    public final void setTransX(float f2) {
        this.transX = f2;
    }

    public final void setTransY(float f2) {
        this.transY = f2;
    }
}
