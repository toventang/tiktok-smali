package com.ss.android.medialib.model;

import com.bytedance.covode.number.Covode;

public class CoverInfo {
    int[] data;
    int height;
    int width;

    static {
        Covode.recordClassIndex(36898);
    }

    public int[] getData() {
        return this.data;
    }

    public int getHeight() {
        return this.height;
    }

    public int getWidth() {
        return this.width;
    }

    public void setData(int[] iArr) {
        this.data = iArr;
    }

    public void setHeight(int i2) {
        this.height = i2;
    }

    public void setWidth(int i2) {
        this.width = i2;
    }

    public CoverInfo(int i2, int i3, int[] iArr) {
        this.width = i2;
        this.height = i3;
        this.data = iArr;
    }
}
